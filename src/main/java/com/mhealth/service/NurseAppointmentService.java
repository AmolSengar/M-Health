package com.mhealth.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.mhealth.exception.NoNurseNameFoundException;
import com.mhealth.model.NurseAppointment;

@Service
public interface NurseAppointmentService {
	public List<NurseAppointment> findByName(String name) throws NoNurseNameFoundException ;

}
