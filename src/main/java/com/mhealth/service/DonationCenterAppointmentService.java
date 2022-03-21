package com.mhealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhealth.exception.NoDonationCenterNameFoundException;
import com.mhealth.model.DonationCenterAppointment;

@Service
public interface DonationCenterAppointmentService {
	public List<DonationCenterAppointment> findByName(String name) throws NoDonationCenterNameFoundException;
}