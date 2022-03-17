package com.cg;

import java.util.Scanner;

import org.springframework.http.ResponseEntity;

import com.cg.model.Doctor;

public class UserClient {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Login/Profile
		System.out.println("------------Welcome to M-Health-------------- ");
		
		System.out.println("Login(press 1) / Create Profile(press 2) ");
		int f = sc.nextInt();
		int s = sc.nextInt();
		
		
		ResponseEntity<Doctor> responseEntity = restTemplate.getForEntity("localhost:8085/Mhealth/ap/v1/doctor/getdoctors", Doctor.class);
		Doctor doctor = responseEntity.getBody();
		
		System.out.println(doctor.toString());
		
		
	}

}
