FROM openjdk:8
EXPOSE 8080
ADD target/awsems.jar awsems.jar
ENTRYPOINT ["java","-jar","/awsems.jar"] 