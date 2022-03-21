package com.mhealth.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "payments")
public class Payment {

	@Id
	@NotBlank(message = "name is mandatory")
	private String name;
	private int fees;
	private String message;

	public Payment() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Payment [name=" + name + ", fees=" + fees + ", message=" + message + "]";
	}

}
