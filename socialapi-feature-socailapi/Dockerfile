FROM openjdk:8
EXPOSE 8080
ADD target/*.jar social
ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=container", "social"]