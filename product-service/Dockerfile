FROM maven:3.9-amazoncorretto-21 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM azul/zulu-openjdk-alpine:21-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8526

ENTRYPOINT ["java", "-jar", "app.jar"]
