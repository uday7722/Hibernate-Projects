package hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;

@Entity
public class Customer {
	
	@Id	
	private int customerId;
	private String customername;
	private int customerItems;
	
	@ManyToMany
	private List<Products> products=new ArrayList<Products>();
	
	
	
	
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCustomerItems() {
		return customerItems;
	}
	public void setCustomerItems(int customerItems) {
		this.customerItems = customerItems;
	}
	
	

}
