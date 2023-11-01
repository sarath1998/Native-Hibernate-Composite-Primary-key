package com.sarathchandraProjects.hibernateCompositePrimaryKey.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
@IdClass(value = StudentIdClass.class)
public class Student 
{
	
	@Id
	@Column(name = "student_name", length = 50, nullable = false)
	private String name;
	
	@Column(name="student_age", length = 3, nullable = false)
	private int age;
	
	@Column(name = "student_mobile", length = 10, nullable = true)
	private Long mobileNo;
	
	@Id
	@Column(name = "student_city", length = 50, nullable = false)
	private String city;
	
	@Id
	@Column(name = "father_name", length = 50, nullable = false)
	private String fatherName;
	
	@Id
	@Column(name = "mother_name", length = 50, nullable = false)
	private String motherName;
	
	/**
	 * Default constructor.
	 */
	public Student() 
	{
	}

	/**
	 * @param name
	 * @param age
	 * @param mobile
	 * @param city
	 * @param fatherName
	 * @param motherName
	 */
	public Student(String name, int age, long mobile, String city, String fatherName, String motherName) 
	{
		this.name = name;
		this.age = age;
		this.mobileNo = mobile;
		this.city = city;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + ", city=" + city + ", fatherName="
				+ fatherName + ", motherName=" + motherName + "]";
	}
	
	
	
	
}
