package com.mhealth.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhealth.model.Donor;

//@Repository - Access the database directly 
//	Does all the operations related to database 
@Repository
public interface DonorJPARepository extends JpaRepository<Donor, Integer> {

	public List<Donor> getBybloodgroup(String bloodgroup);

	public String getByNameAndPassword(String name, String password);

}
