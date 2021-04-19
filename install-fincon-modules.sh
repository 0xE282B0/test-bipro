#!/usr/bin/env bash

deliveryDirectory="$(dirname "$BASH_SOURCE")"

# Install FINCON modules

cd ${deliveryDirectory}
echo -e $"hello\nworld" 
echo -e ${deliveryDirectory}

mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/bipro-adapter-parent-3.4.3.1-SNAPSHOT.pom"          -DpomFile="./fincon-libs/bipro-adapter-parent-3.4.3.1-SNAPSHOT.pom"
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/generic-api-3.4.3.1-SNAPSHOT.jar"                   -DpomFile="./fincon-libs/generic-api-3.4.3.1-SNAPSHOT.pom"                     -Djavadoc="./fincon-libs/generic-api-3.4.3.1-SNAPSHOT-javadoc.jar"
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/generic-standard-adapter-3.4.3.1-SNAPSHOT.jar"      -DpomFile="./fincon-libs/generic-standard-adapter-3.4.3.1-SNAPSHOT.pom"
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/norm426-mapping-api-3.4.3.1-SNAPSHOT.jar"           -DpomFile="./fincon-libs/norm426-mapping-api-3.4.3.1-SNAPSHOT.pom"             -Djavadoc="./fincon-libs/norm426-mapping-api-3.4.3.1-SNAPSHOT-javadoc.jar"
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/norm426-standard-adapter-3.4.3.1-SNAPSHOT.jar"      -DpomFile="./fincon-libs/norm426-standard-adapter-3.4.3.1-SNAPSHOT.pom"
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/namespace-mapper-plugin-3.4.3.1-SNAPSHOT.jar"       -DpomFile="./fincon-libs/namespace-mapper-plugin-3.4.3.1-SNAPSHOT.pom"
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/norm420-api-3.4.3.1-SNAPSHOT.jar"                   -DpomFile="./fincon-libs/norm420-api-3.4.3.1-SNAPSHOT.pom"                     -Djavadoc="./fincon-libs/norm420-api-3.4.3.1-SNAPSHOT-javadoc.jar"
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/norm420-standard-adapter-3.4.3.1-SNAPSHOT.jar"      -DpomFile="./fincon-libs/norm420-standard-adapter-3.4.3.1-SNAPSHOT.pom"
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/bv-rest-3.2.4.pom"                                   -DpomFile="./fincon-libs/bv-rest-3.2.4.pom"
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile="./fincon-libs/bv-rest-client-openapi-feign-3.2.4.jar"              -DpomFile="./fincon-libs/bv-rest-client-openapi-feign-3.2.4.pom"

# Build BiPRO-Standard-Adapter
cd ${deliveryDirectory}/norm426-aggregator-template
mvn package
