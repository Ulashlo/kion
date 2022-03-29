FROM openjdk:17
COPY kion.jar .
WORKDIR .
ENTRYPOINT ["java", "-jar", "kion.jar"]
EXPOSE 8080


