# Wiremock Standalone Service
Wiremock standalone service starter project for a head start!

## Getting started
This project contains the files, settings and configuration of a Spring-Boot Microservice in combination with Wiremock

## Command to execute
When you checkout the code, please make sure you're using Eclipse JDK 17 - Temurin and the JAVA_HOME environment variable is set.
You can check this by opening a terminal and enter the command `java -version`, it should print that it's using java version 17.

Check if the project is setup correctly by default by running the following command in a terminal/commandprompt from the root of the new project.

``` 
-- Linux / MacOS --
./mvnw clean package

-- Windows --
mvnw.cmd clean package

```
The project contains a maven wrapper which downloads maven if not present and run it afterwards. 

## Running Specific profiles
Wiremock-service is set to run on port 8001 in spring on both Dev en Prod environment.
The port of the stubbingConfiguration is configured as port 8000.

But in order to select a profile to work on, you must execute the following command:
./mvnw spring-boot:run -Dspring-boot.run.profiles={NAME OF PROFILE}.
For example :
``
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
``

Or you can add the profile through your Intellij, to start a specific Profile you Requested.
This can be added under: New application > Environment Variables in your Intellij 'Run Configurations'
For e.g.
```
Name    : spring.profiles.active
Value   : dev
```
