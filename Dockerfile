FROM maven:latest AS MAVEN_BUILD

WORKDIR /app

COPY . /app

RUN mvn clean package -Dmaven.test.skip=true

FROM openjdk:17-alpine

COPY --from=MAVEN_BUILD /app/target/spring-demo.jar spring-demo.jar

ENTRYPOINT ["java", "-jar", "/spring-demo.jar"]

EXPOSE 8080
