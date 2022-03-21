package com.mhealth.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mhealth.exception.DuplicateReceiverFoundException;
import com.mhealth.exception.ReceiverNotFoundException;
import com.mhealth.model.Receiver;
import com.mhealth.service.ReceiverService;

@RestController
@RequestMapping("/receiver")
public class ReceiverController {

	@Autowired
	private ReceiverService service;

	@SuppressWarnings({ "unchecked", "rawtypes" })

	// [GET] http://localhost:8085/mhealth/receiver/getAllReceiver
	@GetMapping("/getAllReceiver")
	public ResponseEntity<List<Receiver>> getAllReceivers() {
		List<Receiver> rec1 = service.getAllReceivers();
		if (rec1.isEmpty()) {
			return new ResponseEntity("Sorry! Rceivers not available!", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<List<Receiver>>(rec1, HttpStatus.OK);
	}

	// [POST] http://localhost:8085/mhealth/receiver/login
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/login")
	public ResponseEntity<List<Receiver>> findByNameAndPassword(@Valid @RequestBody Receiver receiver) {
		ResponseEntity<List<Receiver>> response = null;
		List<Receiver> receiverlist = service.getAllReceivers();
		for (Receiver r : receiverlist) {
			if (r.getName().equals(receiver.getName()) && r.getPassword().equals(receiver.getPassword())) {
				response = new ResponseEntity("Login Successful!!", HttpStatus.ACCEPTED);
			} else {
				response = new ResponseEntity("Invalid credentials. Please check details or SignUp!",
						HttpStatus.ACCEPTED);
			}
		}
		return response;
	}

	// [POST] http://localhost:8085/mhealth/receiver/profileCreation
	@PostMapping("/profileCreation")
	public ResponseEntity<List<Receiver>> addReceiver(@Valid @RequestBody Receiver receiver)
			throws DuplicateReceiverFoundException {
		List<Receiver> existingReceivers = service.getAllReceivers();
		for (Receiver r : existingReceivers) {
			if (r.getBloodgroup().equalsIgnoreCase(receiver.getName())) {
				throw new DuplicateReceiverFoundException();
			}
		}

		List<Receiver> rec2 = service.saveReceiver(receiver);

		return new ResponseEntity<List<Receiver>>(rec2, HttpStatus.OK);
	}

	// [GET] http://localhost:8085/mhealth/receiver/receiverByBloodgroup/B+
	@GetMapping("/findReceiverByBloodgroup/{bloodgroup}")
	public ResponseEntity<List<Receiver>> getReceiversByBloodgroup(@PathVariable("bloodgroup") String bloodgroup)
			throws ReceiverNotFoundException {
		List<Receiver> rec3 = service.findReceiverByBloodGroup(bloodgroup);
		if (rec3.isEmpty()) {
			throw new ReceiverNotFoundException();
		}

		return new ResponseEntity<List<Receiver>>(rec3, HttpStatus.OK);
	}

}
