FROM openjdk:8-jdk-alpine
ADD target/springboot-docker-greet-microservice-0.0.1-SNAPSHOT.jar /springboot-docker-greet-microservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-greet-microservice-0.0.1-SNAPSHOT.jar","--server.port=8084","--spring.profiles.active=local"]