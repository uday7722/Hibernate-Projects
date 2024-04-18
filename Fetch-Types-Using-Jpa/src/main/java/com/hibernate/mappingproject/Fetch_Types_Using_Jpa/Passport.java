package com.hibernate.mappingproject.Fetch_Types_Using_Jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {
	@Id
	private int passportId;
	private String passportType;
	
	
	
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportType=" + passportType + "]";
	}
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportType() {
		return passportType;
	}
	public void setPassportType(String passportType) {
		this.passportType = passportType;
	}

}
