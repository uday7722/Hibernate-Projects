package com.hibernate.hibernateonetomany;

import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private int empployeeSalary;
	
	@ManyToOne
	private Company company;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public int getEmpployeeSalary() {
		return empployeeSalary;
	}
	public void setEmpployeeSalary(int empployeeSalary) {
		this.empployeeSalary = empployeeSalary;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", empployeeSalary=" + empployeeSalary + ", company=" + company + "]";
	}
	
	

}
