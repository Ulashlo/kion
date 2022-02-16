FROM openjdk
COPY build/libs/kion.jar .
WORKDIR .
ENTRYPOINT ["java", "-jar", "kion.jar"]
EXPOSE 8080


