package com.Polyt.EmpDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Edemo {
	
	@Id
	private int id;
	private String name;
	private int phno;
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
	
	
	public int getPhno() {
		return phno;
	}
	
	public void setPhno(int phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Edemo [id=" + id + ", name=" + name + ", phno=" + phno + "]";
	}
	
	

}
