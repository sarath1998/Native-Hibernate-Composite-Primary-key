package com.sarathchandraProjects.hibernateCompositePrimaryKey.entites;

import java.io.Serializable;

public class StudentIdClass implements Serializable {
	
	private String name;
	
	private String city;
	
	private String fatherName;
	
	private String motherName;
	
	public StudentIdClass() {
		
	}
	
	public StudentIdClass(String name, String city, String fatherName, String motherName) 
	{
		this.name = name;
		this.city = city;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
}
