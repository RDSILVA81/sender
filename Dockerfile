FROM adoptopenjdk/openjdk11:ubi

COPY target/sender-0.0.1.jar message-server-0.0.1.jar

ENTRYPOINT ["java","-jar","message-server-0.0.1.jar"]

EXPOSE 8084