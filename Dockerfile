FROM openjdk:17-alpine

WORKDIR /app

ARG JAR_FILE=target/*.jar

ENV PORT 8082

EXPOSE $PORT

COPY ${JAR_FILE} application.jar

ENTRYPOINT ["java", "-jar", "application.jar"]