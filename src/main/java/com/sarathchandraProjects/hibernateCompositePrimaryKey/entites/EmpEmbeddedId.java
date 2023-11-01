package com.sarathchandraProjects.hibernateCompositePrimaryKey.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EmpEmbeddedId {
	
	@Column(name = "emp_id")
	private long empId;
	
	@Column(name = "emp_companyName")
	private String compnanyName;
	
	@Column(name = "emp_city")
	private String city;
	
	
	public EmpEmbeddedId() {
		// TODO Auto-generated constructor stub
	}

	public EmpEmbeddedId(long empId, String compnanyName, String city) {
		this.empId = empId;
		this.compnanyName = compnanyName;
		this.city = city;
	}
	
	

}
