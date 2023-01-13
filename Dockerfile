FROM openjdk:17-slim AS build

WORKDIR /app

COPY . /app

RUN ./mvnw clean package

FROM openjdk:17-slim

COPY --from=build /app/target/spring-demo.jar spring-demo.jar

ENTRYPOINT ["java", "-jar", "/spring-demo.jar"]

EXPOSE 8080
