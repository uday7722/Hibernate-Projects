package hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {
	public static void main(String[] args) {

		Customer customer=new Customer();
		customer.setCustomerId(102);
		customer.setCustomername("Jayanth");
		customer.setCustomerItems(4);

		Products products=new Products();

		products.setProductId(2);
		products.setProductName("Bag");
		products.setProductCost(3000);

		customer.getProducts().add(products);
		
		products.getCoustomer().add(customer);
		
		Configuration configuration=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Products.class);

		SessionFactory factory=configuration.buildSessionFactory();

		Session session=factory.openSession();

		Transaction transaction=session.beginTransaction();

		session.save(products);
		session.save(customer);

		transaction.commit();
		session.close();

	}

}
