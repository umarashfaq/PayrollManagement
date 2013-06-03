package com.umar.payroll.domain;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="persons")
public class Person extends BaseEntity {
	
	@NotBlank
	@Size(max=45)
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank
	@Size(max=45)
	@Column(name="last_name")	
	private String lastName;
	
	private Timestamp dob;
	
	private String phone;
	
	@NotBlank
	@Email
	private String email;
	private String address;
	
	@OneToMany(mappedBy="person")
	private List<Salary> salaries;
	
	public List<Salary> getSalaries() {
		return salaries;
	}
	public void setSalaries(List<Salary> salaries) {
		this.salaries = salaries;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Timestamp getDob() {
		return dob;
	}
	public void setDob(Timestamp dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
