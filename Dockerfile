FROM openjdk:17
EXPOSE 8080
COPY target/springboot-docker-kubernetes.jar springboot-docker-kubernetes.jar
ENTRYPOINT ["java","-jar","/springboot-docker-kubernetes.jar"]