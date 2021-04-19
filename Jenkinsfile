  
pipeline {
  agent {
    kubernetes {
      label "jenkins-build-${UUID.randomUUID().toString()}"
      defaultContainer 'builder'
      yaml agentSpecs.assembleYaml([
        agentSpecs.defaultJavaContainerspec(name: "builder"),
        agentSpecs.defaultHelmContainerspec(name: "helm"),
        agentSpecs.whitesourceAgent(name: "wss-scanner")

      ])
    }
  }
  environment {
    TARGET_IMAGE_NAME = "bipro-adapter"
//ARTIFACTORY_URL = "https://artifactory.syncier.cloud/artifactory/analytics-maven-snapshot-local/"
  }

  stages {
    stage('Test branch') {
      steps {
        container('builder') {
          script {
            // helper that starts dockerd and configures the correct DockerServer for jenkins
            withDockerd {
              sh """
                mvn test
              """
            }
          }
        }
      }
    }

    stage('Specify Version') {
      steps {
        container('builder') {
          script {
            // Create the versioning object from thelib, using the current environment and step context
            v = new grnry.Versioning(env, steps)
            // Use the Git Tag/stable-* branchname as imageTag in a "release" build,
            // Otherwise the featurebranch name
            imageTag = v.isRelease()? v.releaseName() : v.commitRefSlug()
            // Pring some output in jenkins
            output = v.isRelease()? "This is a Release build." : "This is a Snapshot build."
            output += "\nWill tag chart with '${imageTag}'"
            echo output

            // Specify docker buildarguments early on
            IMG_REV_BUILDARG=v.revision()
            IMG_CREATED_BUILDARG=buildTime()
            IMG_SRC_BUILDARG="${GIT_URL}"
          }
        }
      }
    }

    stage('Build branch') {
      steps {
        container('builder') {
          script {
            withDockerd {
            sh """
             // ./gradlew clean assemble dockerPrepare
             // cp allianz_ca.der build/docker
             
             sh './fnstall-fincon-modules.sh'
             mvn clean install build
             cd /docker-compose/development
             docker-compose up --build --force-recreate
             
             
            """
            }
          }
        }
      }
    }

    stage('Build docker image') {
      steps {
        container('builder') {
          script {
            // (LIB) Automatically log in to the correct registry (release/snapshot), depending on the target version of this build
            // Return the chosen registry as "dockerRegistry"
            withRegistry.dockerAuto(v) { dockerRegistry ->
              // Explicity log in to the release docker registry to be able to pull the base image
              withRegistry.dockerDevUsecases {
                harvesterImage = docker.build("${dockerRegistry}/${TARGET_IMAGE_NAME}",
                // Use the singleLine helper to condense the additional arguments argument into one singleLine
                    singleLine("""-f build/docker/Dockerfile build/docker
                                  --build-arg IMG_SRC=${IMG_SRC_BUILDARG}
                                  --build-arg IMG_CREATED="${IMG_CREATED_BUILDARG}"
                                  --build-arg IMG_REV="${IMG_REV_BUILDARG}"
                                  """))
              }
            }
          }
          sh """
            docker images
          """
        }
      }
    }

    stage ('Push docker image') {
      steps {
        container('builder') {
          script {
            withRegistry.dockerAuto(v) {
              harvesterImage.push("${imageTag}")
              if (! v.isRelease()) {
                // Also push with commithash in a non release build
                harvesterImage.push(v.revision())
              }
              if (v.isMaster()) {
                // Also push latest in master builds
                harvesterImage.push('latest')
              }
            }
          }
        }
      }
    }

    stage('Validate & push helm chart') {
      steps {
        container('helm') {
          script{
            helm()
          }
        }
      }
    }

  
  }
}