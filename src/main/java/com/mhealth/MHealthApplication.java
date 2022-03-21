package com.mhealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication it is a combination of @ComponentScan, @EnableAutoConfiguration and @Configuration
//@ComponentScan scan a package for beans 
//@EnableAutoConfiguration enables the autoconfiguration
//@Configuration used by spring containers as a source of bean definitions 

@SpringBootApplication
public class MHealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MHealthApplication.class, args);
		System.out.println(" Welcome to MHealth ");
	}
}
