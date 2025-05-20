package com.deltaswipe.springboot_docker_k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootDockerK8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerK8sApplication.class, args);
	}

}
