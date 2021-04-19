# BiPRO-Standard-Adapter - norm426 - Installationsanleitung

Herzlichen Glückwunsch zum Erwerb des BiPRO-Standard-Adapters für die Norm 426 und vielen Dank für das in FINCON gesetzte Vertrauen!
Diese kurze Anleitung beschreibt, wie Sie die Maven-Module des Standard-Adapters installieren und den BiPRO-Standard-Adapter lokal starten können.


Für die Installation wird ein *.sh* Skript ausgeführt.
Aus diesem Grund empfehlen wir **MinGW** oder **Git Bash** zu installieren, sofern nicht bereits vorhanden.

Zusätzlich müssen folgende Programme installiert sein:

- Maven
- Docker-Compose
- SoapUI (Optional)


Das Installationsskipt **install-fincon-modules.sh** kann folgendermaßen ausgeführt werden:

```
cd /path/to/fincon-norm426-standard-adapter
sh ./install-fincon-modules.sh
```

Damit nicht jeder Entwickler auf seinem Rechner das Installationsskript ausführen muss, sollten die Module des BiPRO-Standard-Adapters in ein Artefakt Repository deployed werden.


Nach der erfolgreichen Installation, können Sie den BiPRO-Adapter mit docker-compose starten:

```
cd /path/to/fincon-norm426-standard-adapter/template-modules/docker-compose/development
docker-compose up --build --force-recreate
```


Unter *fincon-norm426-standard-adapter/template-modules/SoapUI-Tests/* befindet sich ein vorgefertigtes SoapUI Projekt, welches leicht im SoapUI eingebunden werden kann.
Nachdem der BiPRO-Standard-Adapter erfolgreich gestartet wurde, können die SoapUI-Testfälle die Funktionalität überprüfen.



Weitere Informationen finden Sie im Entwicklerhandbuch und im Betriebshandbuch.

