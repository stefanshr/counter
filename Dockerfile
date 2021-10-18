FROM openjdk:8-jdk-alpine
MAINTAINER StefanHohl
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8585

ENTRYPOINT ["java","-jar","/app.jar"]