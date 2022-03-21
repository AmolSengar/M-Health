package com.mhealth.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhealth.model.Nurse;
import com.mhealth.service.NurseService;

@RestController
@RequestMapping("/nurse")
public class NurseController {

	@Autowired
	private NurseService service;

	// [GET] http://localhost:8085/mhealth/nurse/getAllNurse
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/getAllNurse")
	public ResponseEntity<List<Nurse>> getAllNurse() {
		List<Nurse> nurse = service.getAllNurse();
		if (nurse.isEmpty()) {
			return new ResponseEntity("Sorry! Nurse not available!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Nurse>>(nurse, HttpStatus.OK);
	}
}
