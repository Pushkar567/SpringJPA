FROM openjdk:8
EXPOSE 8080
ADD target/SpringJPA-0.0.1-SNAPSHOT.jar SpringJPA-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/SpringJPA-0.0.1-SNAPSHOT.jar"]
