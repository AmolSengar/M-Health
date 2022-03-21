package com.mhealth.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mhealth.model.NurseAppointment;

@Repository
public interface NurseAppointmentJPARepository extends JpaRepository<NurseAppointment, Integer> {

	public List<NurseAppointment> getByName(String name);

}
