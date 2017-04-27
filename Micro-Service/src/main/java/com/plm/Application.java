package com.plm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



/*@ComponentScan("com.plm.*")
@SpringBootApplication
@EnableDiscoveryClient*/

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("{com.*}")
@EnableJpaRepositories(basePackages = "com.plm.*")
@ComponentScan("com.*")
@EntityScan("com.*")
@EnableDiscoveryClient
@EnableAutoConfiguration
public class Application {
	public static void main(String[] args) {
/*		System.setProperty("spring.config.name", "accounts-server");*/
		SpringApplication.run(Application.class, args);
	}

}

