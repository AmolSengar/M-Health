package com.cg.model;

import java.util.Date;

public class Nurse {
	private int id;
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
		super();
		this.id = id;
		this.name = name;
		this.st = st;
		this.et = et;
	}
	
	@Override
	public String toString() {
		return "Nurse[id=" + id+", name="+name+",st="+st+",et="+et+"]";
	}
	

}
