FROM openjdk:8-jdk-alpine

WORKDIR /shorten-app

COPY . /shorten-app/

ENTRYPOINT ["java","-jar","/shorten-app/target/UrlShortner-0.0.1-SNAPSHOT.jar"]