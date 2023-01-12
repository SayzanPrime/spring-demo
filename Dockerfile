FROM openjdk:17-slim as build

COPY target/spring-demo.jar spring-demo.jar

ENTRYPOINT ["java", "-jar", "/spring-demo.jar"]

EXPOSE 8080
