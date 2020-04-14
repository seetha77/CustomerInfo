package com.customer.springbootmain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCustomerRewardPointsApplication {

	private static final Logger LOGGER=LoggerFactory.getLogger(SpringBootCustomerRewardPointsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomerRewardPointsApplication.class, args);
	}

}
