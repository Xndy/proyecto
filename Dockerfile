FROM adoptopenjdk/openjdk11:alpine-jre
COPY ./target/proyecto-0.0.1-SNAPSHOT.jar /opt/app/proyecto.jar
EXPOSE 8081
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","proyecto.jar"]