package com.hibernate.mappingproject.Fetch_Types_Using_Jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int employeeId;
	private String employeeName;
	
	@OneToOne
	private Passport passort;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", passort=" + passort + "]";
	}

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

	public Passport getPassort() {
		return passort;
	}

	public void setPassort(Passport passort) {
		this.passort = passort;
	}
	
	

}
