package com.mhealth.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhealth.model.Doctor;

//@Repository - Access the database directly 
// 				Does all the operations related to database 
@Repository
public interface DoctorJPARepository extends JpaRepository<Doctor, Integer>{

	public List<Doctor> getBySpeciality(String speciality);


}