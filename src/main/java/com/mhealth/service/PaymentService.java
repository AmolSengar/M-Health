package com.mhealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhealth.model.Payment;

@Service
public interface PaymentService {
	
	public List<Payment> findByName(String name);

}
