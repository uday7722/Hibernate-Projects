package hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Products {
	@Id
	private int productId;
	private String productName;
	private int productCost;
	
	@ManyToMany()
	private List<Customer> coustomer=new ArrayList<Customer>();
	
	

	

	public List<Customer> getCoustomer() {
		return coustomer;
	}

	public void setCoustomer(List<Customer> coustomer) {
		this.coustomer = coustomer;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}

}
