FROM openjdk:12
ADD target/spring-mongo-docker.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]