# SpringNative OpenApi JPA

Spring native open api service

## Description

service development with spring boot, spring native, springdoc, that expose a REST api by swagger-ui.

## Getting Started

### Dependencies

* Requires java 17 or superior.
* Graalvm 22.X or superior
* Docker Desktop
* Spring STS or IntelliJ

### Installing

* Download the code from https://github.com/cadb-craftsman/springnative-openapi-jpa.git

### Executing program

* For generate package execute:
```
mvn -X clean package
```
* For generate documentation execute:
```
mvn -X clean package -Pdocument
```
*  For generate native image execute:
```
mvn -X clean spring-boot:native -Pnative
```

## Help

For more information about the service execute next maven command with document profile
```
mvn -X clean package -Pdocument
```
After that run the app and open http://localhost:8080/index.html

## Authors

Contact info

Email: [Carlos Diaz](cadb.craftman@gmail.com)

Web: [cadb-craftsman](http://cadb-craftsman.com/) 


## Version History

* 1.0.0
    * First commit of source code

## License

This project is licensed under the [Apache License 2.0] License - see the LICENSE.md file for details

