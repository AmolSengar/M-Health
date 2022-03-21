package com.mhealth.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mhealth.model.Payment;
import com.mhealth.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	private PaymentService service;

	@SuppressWarnings({ "rawtypes", "unchecked" })

	// [Get] http://localhost:8085/mhealth/payments/payTo/Dr. Sharad Dixit
	@GetMapping("/payTo/{name}")
	public ResponseEntity<List<Payment>> findByName(@PathVariable("name") String name) {
		List<Payment> pay = service.findByName(name);
		if (pay.isEmpty()) {
			return new ResponseEntity("Sorry! Recipients not available!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Payment>>(pay, HttpStatus.OK);
	}

}
