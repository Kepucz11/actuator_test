# actuator_test
Simple Spring boot app with Spring Actuator

#Configuration
For basic application configuration look into application.properties.
Dont forget to define server port.

Project uses basic h2 in-memory database, available under http://<your_ip>:<server.port>/h2-console
username: sa
password: theres no password :)

#Building
Just execute mvn clean install on main folder. You will get actuator.test-X.X.X-SNAPSHOT.jar under
/target folder.

#Documentation
YOu can find swagger api documentation under http://<your_ip>:<server.port>/swagger-ui.html

