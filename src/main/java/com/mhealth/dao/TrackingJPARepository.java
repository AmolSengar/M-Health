package com.mhealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mhealth.model.Tracking;

@Repository
public interface TrackingJPARepository extends JpaRepository<Tracking, Integer> {

}
