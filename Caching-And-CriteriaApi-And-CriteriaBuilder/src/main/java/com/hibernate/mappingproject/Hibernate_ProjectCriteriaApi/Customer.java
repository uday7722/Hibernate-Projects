package com.hibernate.mappingproject.Hibernate_ProjectCriteriaApi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int customerId;
	private String customerName;
	
	@ManyToMany
	private List<Fruit> fruit=new ArrayList<Fruit>();

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Fruit> getFruit() {
		return fruit;
	}

	public void setFruit(List<Fruit> fruit) {
		this.fruit = fruit;
	}
	
	

}
