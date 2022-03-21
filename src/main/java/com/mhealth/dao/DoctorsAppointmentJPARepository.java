package com.mhealth.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhealth.model.DoctorsAppointment;

//@Repository - Access the database directly 
//	Does all the operations related to database 
@Repository
public interface DoctorsAppointmentJPARepository extends JpaRepository<DoctorsAppointment, Integer> {

	List<DoctorsAppointment> getByName(String name);

}