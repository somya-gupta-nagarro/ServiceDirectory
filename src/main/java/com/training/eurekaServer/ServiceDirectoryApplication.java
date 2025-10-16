package com.training.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDirectoryApplication {

	public static void main(String[] args) {
		//testing for jenkins part 2 poll scm
		SpringApplication.run(ServiceDirectoryApplication.class, args);
	}

}
