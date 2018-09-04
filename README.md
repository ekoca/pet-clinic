# pet-clinic

Pet Clinic is a based on the [spring-projects/spring-petclinic](https://github.com/spring-projects/spring-petclinic).
It allows the Spring community to maintain a Petclinic version with a plain old **Spring Framework configuration**
and with a **3-layer architecture** (i.e. presentation --> service --> repository).
The "canonical" implementation is now based on Spring Boot, Thymeleaf and [aggregate-oriented domain]([https://github.com/spring-projects/spring-petclinic/pull/200). 

## Understanding original the Spring Petclinic application with a few diagrams
[See the presentation here](http://fr.slideshare.net/AntoineRey/spring-framework-petclinic-sample-application) (2017 update)

## Running petclinic locally
```
	git clone https://github.com/ekoca/pet-clinic.git
	cd pet-clinic
	./mvnw tomcat7:run-war
```

You can then access petclinic here: http://localhost:8080/
