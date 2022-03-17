package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MHealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MHealthApplication.class, args);
		System.out.println("Hello");
		System.out.println("Hello1");
	}

	/* 
	 * new user / existing one
	 * 
	 * sign up (name , ph no., age)
	 * 
	 * doctor or nurse ?
	 * 
	 * doctor - list of doctors 
	 *
	 * make payment - yes or no
	 * 
	 * if yes 
	 * "your appointment is fixed with doctor at this time "
	 * 
	 * if no 
	 * no appointed scheduled 
	 */
}
