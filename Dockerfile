FROM openjdk
COPY build/libs/*.jar .
WORKDIR .
ENTRYPOINT ["java", "-jar", "kion.jar"]
EXPOSE 8080


