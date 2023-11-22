FROM adoptopenjdk/openjdk11:latest
COPY target/Test-0.0.1-SNAPSHOT.jar  /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","/Test-0.0.1-SNAPSHOT.jar"]
