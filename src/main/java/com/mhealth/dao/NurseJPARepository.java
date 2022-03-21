package com.mhealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhealth.model.Nurse;

@Repository
public interface NurseJPARepository extends JpaRepository<Nurse, Integer> {

}