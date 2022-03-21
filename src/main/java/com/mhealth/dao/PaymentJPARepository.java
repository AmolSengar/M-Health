package com.mhealth.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mhealth.model.Payment;

@Repository
public interface PaymentJPARepository extends JpaRepository<Payment, Integer> {

	public List<Payment> getByName(String name);

}
