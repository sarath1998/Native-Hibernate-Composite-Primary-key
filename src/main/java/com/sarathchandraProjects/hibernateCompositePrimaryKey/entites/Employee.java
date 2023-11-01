package com.sarathchandraProjects.hibernateCompositePrimaryKey.entites;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "emp_home_location")
	private String homeLocation;
	
	@EmbeddedId
	private EmpEmbeddedId empEmbeddedId;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String homeLocation, EmpEmbeddedId empEmbeddedId) {
		this.name = name;
		this.homeLocation = homeLocation;
		this.empEmbeddedId = empEmbeddedId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeLocation() {
		return homeLocation;
	}

	public void setHomeLocation(String homeLocation) {
		this.homeLocation = homeLocation;
	}
	
	
}
