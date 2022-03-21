package com.mhealth.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/*
 * Class Doctor is the entity representing doctor table in database
 */

@Entity
@Table(name = "doctor")
public class Doctor {

	// @Id sets id as the primary key
	@Id
	private int id;
	@NotBlank(message = "name is mandatory")
	private String name;
	@NotBlank(message = "speciality is mandatory")
	private String speciality;
	private Date st;
	private Date et;

	// default doctor constructor
	public Doctor() {

	}

	public Doctor(int id, String name, String speciality, Date st, Date et) {
		this.id = id;
		this.name = name;
		this.speciality = speciality;
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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
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
		return "Doctor [id=" + id + ", name=" + name + ", speciality=" + speciality + ", st=" + st + ", et=" + et + "]";
	}

}
