FROM openjdk:8-jdk-alpine
ADD target/springboot-docker-name-microservice-0.0.1-SNAPSHOT.jar /springboot-docker-name-microservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-name-microservice-0.0.1-SNAPSHOT.jar","--server.port=8085","--spring.profiles.active=local"]