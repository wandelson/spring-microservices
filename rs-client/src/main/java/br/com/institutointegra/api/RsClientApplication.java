package br.com.institutointegra.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsClientApplication.class, args);
	}

}
