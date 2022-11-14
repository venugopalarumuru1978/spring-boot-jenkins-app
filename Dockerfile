FROM openjdk:11
ADD target/spring-boot-jenkins-app.jar spring-boot-jenkins-app.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-jenkins-app.jar"]
