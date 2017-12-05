FROM java:8
ADD target/fnudocker.jar fnudocker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "fnudocker.jar"]