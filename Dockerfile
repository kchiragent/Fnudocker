FROM java:8
ADD target/fnudocker.jar fnudocker.jar
EXPOSE 9080
ENTRYPOINT ["java", "-jar", "fnudocker.jar"]
