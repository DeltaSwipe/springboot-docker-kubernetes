FROM openjdk:17
EXPOSE 8080
COPY target/springboot-docker-k8s.jar springboot-docker-k8s.jar
ENTRYPOINT ["java","-jar","/springboot-docker-k8s.jar"]