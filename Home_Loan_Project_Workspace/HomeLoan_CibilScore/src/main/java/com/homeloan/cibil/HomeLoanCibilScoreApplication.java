package com.homeloan.cibil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HomeLoanCibilScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanCibilScoreApplication.class, args);
		System.out.println("Started");
	}
		

}
