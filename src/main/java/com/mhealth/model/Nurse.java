package com.mhealth.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "nurse")
public class Nurse {

	@Id
	@GeneratedValue
	private int id;
	@NotBlank(message = "name is mandatory")
	private String name;
	private Date st;
	private Date et;

	public Nurse() {

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

	public Nurse(int id, String name, Date st, Date et) {
		this.id = id;
		this.name = name;
		this.st = st;
		this.et = et;
	}

	@Override
	public String toString() {
		return "Nurse[id=" + id + ", name=" + name + ",st=" + st + ",et=" + et + "]";
	}

}
