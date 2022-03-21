package com.mhealth.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.DoctorsAppointmentJPARepository;
import com.mhealth.exception.NoDoctorNameFoundException;
import com.mhealth.model.DoctorsAppointment;

@Service
public class DoctorsAppointmentServiceImpl implements DoctorsAppointmentService {

	@Autowired
	private DoctorsAppointmentJPARepository appointRepo;

	@Override
	public List<DoctorsAppointment> findByName(String name)  throws NoDoctorNameFoundException {
		List<DoctorsAppointment> appoint = appointRepo.getByName(name);
		return appoint;
	}

}