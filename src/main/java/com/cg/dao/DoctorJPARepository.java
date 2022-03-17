package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Doctor;
import com.cg.model.Users;

@Repository
public interface DoctorJPARepository extends JpaRepository<Doctor, Integer> {

}
