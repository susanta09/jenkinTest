FROM adoptopenjdk/openjdk11:latest
ADD target/Test-0.0.1-SNAPSHOT.jar Test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Test-0.0.1-SNAPSHOT.jar"]
