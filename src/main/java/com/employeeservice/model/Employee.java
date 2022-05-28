package com.employeeservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue	
	private Integer empid;	
	
	@NotBlank(message = "First Name is mandatory")
	private String firstname;
	private String middlename;
	private String lastname;
	private String emailid;
	private String phone;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	//@NotBlank(message = "Postal Code is mandatory")
	private String postalcode;
	private String designation;
	private Integer experience;
	private String grade;
	private String description;
	
	public Employee() {
		
	}
	
	public Employee(Integer empid, String firstname, String middlename, String lastname, String emailid, String phone,
			String address1, String address2, String city, String state, String country, String postalcode,
			String designation, Integer experience, String grade, String description) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.emailid = emailid;
		this.phone = phone;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalcode = postalcode;
		this.designation = designation;
		this.experience = experience;
		this.grade = grade;
		this.description = description;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1; 
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}
