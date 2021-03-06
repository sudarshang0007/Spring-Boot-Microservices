package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.*")
///@EnableJpaRepositories(basePackages = "demo.*")
@ComponentScan("com.*")
@EntityScan("com.*")
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableFeignClients 
public class ClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientDemoApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
