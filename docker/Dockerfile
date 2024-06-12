## Old base image
#FROM openjdk:17-jdk-slim
## New base image (smaller and more secure)
## Note: the newest version (3.14) is not yet supported by trivy
FROM openjdk:17-jdk-alpine3.13
WORKDIR /app
## Only works for previous image OS 
#RUN useradd -ms /bin/bash v2xuser
## Works for Alpine distributions (create system account)
RUN adduser -S v2xuser
USER v2xuser
ARG JAR_FILE=target/v2x-consumer-template-project-*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]