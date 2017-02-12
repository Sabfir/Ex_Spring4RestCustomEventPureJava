# Custom Event with Spring 4 REST Pure Java Configuration (NO XML).
Template example for Spring 4 REST with logging to DB using CUSTOM EVENT with pure Java Configuration (no XML).

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
$ cd Ex_Spring4RestCustomEventPureJava
$ mvn jetty:run
```

###3. To Use this project
Access ```http://localhost:8080/customers``` to save log to the db<br/>
Access ```http://localhost:8080/syslogs``` to see logs from the db

###4. Description of Custom Event Implementation
All functionality is situated in the packages:
* event - SysLog event
* publisher - SysLog publisher using it you can fire logging to the db
* listener - SysLog listener that caches fired SysLog events and saves them in the DB
* model, dao, service - implement the interaction with the DB
