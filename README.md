Integration Testing With Maven
===

### Profiles

* *dev* - executes **only** unit tests 
* *it* - executes **only** integration tests

### Project structure

```
src
|---integration-tests
| |---java
| |---resources
|   |---application.properties
|    
|---main 
| |---java
| |---resources
|   |---application.properties
|    
|---test 
| |--java
| |---resources
|   |---application.properties
```

### Commands

Build the project:

    mvn clean install -P dev

Run unit tests:

    mvn clean test -P dev

Run integration tests: 

    mvn clean verify -P it
