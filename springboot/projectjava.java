package com.example.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empdetails")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int employee_id;
	@Column(name = "employee_name")
	private String employee_name;
	@Column(name = "employee_age")
	private int employee_age;
	@Column(name = "employee_place")
	private String employee_place;
	@Column(name = "employee_salary")
	private int employee_salary;

// getter and setter
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public int getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(int employee_age) {
		this.employee_age = employee_age;
	}

	public String getEmployee_place() {
		return employee_place;
	}

	public void setEmployee_place(String employee_place) {
		this.employee_place = employee_place;
	}

	public int getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}
}
