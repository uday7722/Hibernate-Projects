package com.hibernate.mappingproject.Hibernate_ProjectCriteriaApi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Fruit {
	@Id
	private int fruitId;
	private String fruitName;
	private int fruitCost;
	
	@ManyToMany(mappedBy = "fruit")
	private List<Customer> customer=new ArrayList<Customer>();

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	

	public int getFruitId() {
		return fruitId;
	}

	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
	}

	public String getFruitName() {
		return fruitName;
	}

	@Override
	public String toString() {
		return "Fruit [fruitId=" + fruitId + ", fruitName=" + fruitName + ", fruitCost=" + fruitCost + "]";
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getFruitCost() {
		return fruitCost;
	}

	public void setFruitCost(int fruitCost) {
		this.fruitCost = fruitCost;
	}

	
	
	

}
