FROM openjdk:8

RUN mkdir -p /data

COPY $PWD/target/ApiLogin-0.0.1-SNAPSHOT.jar /data/ApiLogin-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["/docker-java-home/bin/java","-jar","/data/ApiLogin-0.0.1-SNAPSHOT.jar"]
