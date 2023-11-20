FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY /build/libs/app.jar build/

WORKDIR /app/build
EXPOSE 8181
ENTRYPOINT java -jar app.jar
