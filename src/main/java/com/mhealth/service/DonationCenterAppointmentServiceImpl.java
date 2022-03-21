package com.mhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.DonationCenterAppointmentJPARepository;
import com.mhealth.exception.NoDonationCenterNameFoundException;
import com.mhealth.model.DonationCenterAppointment;

@Service
public class DonationCenterAppointmentServiceImpl implements DonationCenterAppointmentService {

	@Autowired
	private DonationCenterAppointmentJPARepository bloodRepo;

	@Override
	public List<DonationCenterAppointment> findByName(String name) throws NoDonationCenterNameFoundException {
		List<DonationCenterAppointment> center = bloodRepo.getByName(name);
		return center;
	}

}