FROM openjdk:17-slim AS build

WORKDIR /app

COPY . /app

RUN ./mvnw clean package -Dmaven.test.skip=true

FROM openjdk:17-alpine

COPY --from=build /app/target/spring-demo.jar spring-demo.jar

ENTRYPOINT ["java", "-jar", "/spring-demo.jar"]

EXPOSE 8080
