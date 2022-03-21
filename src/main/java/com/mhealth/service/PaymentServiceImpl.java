package com.mhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.PaymentJPARepository;
import com.mhealth.model.Payment;
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentJPARepository payRepo;

	@Override
	public List<Payment> findByName(String name) {
		return payRepo.getByName(name);
	}

}
