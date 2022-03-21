package com.mhealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mhealth.exception.NoDoctorNameFoundException;
import com.mhealth.model.DoctorsAppointment;

@Service
public interface DoctorsAppointmentService {
	public List<DoctorsAppointment> findByName(String name) throws NoDoctorNameFoundException;
}