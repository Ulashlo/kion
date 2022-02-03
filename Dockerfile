FROM openjdk
COPY build/libs/*.jar kion.jar
WORKDIR .
ENTRYPOINT ["java", "-jar", "kion.jar"]
EXPOSE 8080


