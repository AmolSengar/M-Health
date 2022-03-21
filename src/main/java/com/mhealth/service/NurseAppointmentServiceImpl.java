package com.mhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhealth.dao.NurseAppointmentJPARepository;
import com.mhealth.exception.NoNurseNameFoundException;
import com.mhealth.model.NurseAppointment;

@Service
public class NurseAppointmentServiceImpl implements NurseAppointmentService {
	@Autowired
	private NurseAppointmentJPARepository nurrepo;

	public List<NurseAppointment> findByName(String name) throws NoNurseNameFoundException {
		List<NurseAppointment> doct = nurrepo.getByName(name);
		return doct;
	}

}
