package com.crud.crudemployee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeid;
	private String name;
	private int salary;
	private String  email;
	
	
	public Employee() {}


	public Employee(Long employeid, String name, int salary, String email) {
		super();
		this.employeid = employeid;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}


	public Long getEmployeid() {
		return employeid;
	}


	public void setEmployeid(Long employeid) {
		this.employeid = employeid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
