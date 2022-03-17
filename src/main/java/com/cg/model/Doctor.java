package com.cg.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String disease;
	private Date st;
	private Date et;

	public Doctor() {

	}

	public Doctor(int id, String name, String disease, Date st, Date et) {
		super();
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.st = st;
		this.et = et;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Date getSt() {
		return st;
	}

	public void setSt(Date st) {
		this.st = st;
	}

	public Date getEt() {
		return et;
	}

	public void setEt(Date et) {
		this.et = et;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", disease=" + disease + ", st=" + st + ", et=" + et + "]";
	}

}
