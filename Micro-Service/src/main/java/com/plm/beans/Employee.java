package com.plm.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String firstName;
	private String lastName;
	private String loginName;
	private String title;
	//Department
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	//Address
	@Embedded
	private Address address;
	//Role
	@OneToMany
	@JoinTable(	name = "EMP_ROLE", 
				joinColumns = @JoinColumn(name = "EMP_ID", referencedColumnName = "empId"), 
				inverseJoinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "roleId"))
	private Set<Role> empRole;

	public Employee() {
	}
	
	
	public Employee(String firstName, String lastName, String loginName, String title, Address address,
			Set<Role> empRole, Department department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginName = loginName;
		this.title = title;
		this.address = address;
		this.empRole = empRole;
		this.department = department;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
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


	public String getLoginName() {
		return loginName;
	}


	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Set<Role> getEmpRole() {
		return empRole;
	}


	public void setEmpRole(Set<Role> empRole) {
		this.empRole = empRole;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", loginName="
				+ loginName + ", title=" + title + ", department=" + department + ", address=" + address + ", empRole="
				+ empRole + "]";
	}
	
	
	
	
}
