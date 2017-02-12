# Spring 4 REST Custom Event Pure Java.
Template example for Spring 4 REST with logging to DB using custom event with pure Java Configuration (no XML), using Maven build tool.

###1. Technologies
* Java 1.8
* Spring 4.3.0.RELEASE
* Maven 3.3.3
* HSQLDB 2.3.2
* Hibernate 4.3.5.Final
* Jetty


###2. To Run this project locally
```shell
$ git clone https://github.com/Sabfir/Ex_Spring4RestCustomEventPureJava.git
$ mvn jetty:run
```
Access ```http://localhost:8080/customers``` to save log to the db
Access ```http://localhost:8080/syslogs``` to see logs from the db
