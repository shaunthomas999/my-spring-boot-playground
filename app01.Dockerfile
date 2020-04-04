# https://spring.io/guides/gs/spring-boot-docker/
# docker build -f app01.Dockerfile -t my-spring-boot-playground:local .
# docker run -it -p 8031:8031 -t my-spring-boot-playground:local

FROM openjdk:8-jdk-alpine
MAINTAINER Shaun Thomas <contact@shaunthomas999.com>

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
