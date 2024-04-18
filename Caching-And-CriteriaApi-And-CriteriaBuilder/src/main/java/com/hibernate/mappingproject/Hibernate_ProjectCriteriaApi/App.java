package com.hibernate.mappingproject.Hibernate_ProjectCriteriaApi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javassist.compiler.ast.ASTList;

public class App 
{
	public static void main( String[] args )
	{

		//    	Fruit fruit1=new Fruit();
		//    	fruit1.setFruitId(201);
		//    	fruit1.setFruitName("Apple");
		//    	fruit1.setFruitCost(80);
		//    	
		//    	Fruit fruit4=new Fruit();
		//    	fruit4.setFruitId(204);
		//    	fruit4.setFruitName("Grape");
		//    	fruit4.setFruitCost(80);
		//    	
		//    	Fruit fruit2=new Fruit();
		//    	fruit2.setFruitId(202);
		//    	fruit2.setFruitName("Melon");
		//    	fruit2.setFruitCost(60);
		//    	
		//    	Fruit fruit3=new Fruit();
		//    	fruit3.setFruitId(203);
		//    	fruit3.setFruitName("Avacado");
		//    	fruit3.setFruitCost(60);
		//    	
		//    	Customer customer1=new Customer();
		//    	customer1.setCustomerId(101);
		//    	customer1.setCustomerName("Uday");
		//    	
		//    	Customer customer2=new Customer();
		//    	customer2.setCustomerId(102);
		//    	customer2.setCustomerName("Kiran");
		//    	
		//    	Customer customer3=new Customer();
		//    	customer3.setCustomerId(103);
		//    	customer3.setCustomerName("Rakesh");
		////    	
		//    	Customer customer4=new Customer();
		//    	customer4.setCustomerId(104);
		//    	customer4.setCustomerName("Vinod");
		//    	
		//    	customer1.getFruit().add(fruit1);
		//    	customer1.getFruit().add(fruit3);
		//    	customer2.getFruit().add(fruit4);
		//    	customer3.getFruit().add(fruit2);
		//    	customer4.getFruit().add(fruit1);
		//    	
		//    	fruit1.getCustomer().add(customer4);
		//    	fruit2.getCustomer().add(customer1);
		//    	fruit3.getCustomer().add(customer2);
		//    	fruit4.getCustomer().add(customer3);


		Configuration configuration=new Configuration().configure().addAnnotatedClass(Fruit.class).addAnnotatedClass(Customer.class);

		SessionFactory sessionFactory=configuration.buildSessionFactory();

		Session session1=sessionFactory.openSession();
		Transaction transaction=session1.beginTransaction();

		Fruit fruit=session1.get(Fruit.class, 201);
		Fruit fruit1=session1.get(Fruit.class, 201);
		Fruit fruit2=session1.get(Fruit.class, 202);

		System.out.println(fruit);
		System.out.println(fruit1);
		System.out.println(fruit2);

		transaction.commit();
		session1.close();

		Session session2=sessionFactory.openSession();

		Transaction transaction2=session2.beginTransaction();

		Fruit fruit3=session2.get(Fruit.class, 204);
		System.out.println(fruit3);

		transaction2.commit();
		session2.close();

		//    	session.save(fruit1);
		//    	session.save(fruit2);
		//    	session.save(fruit3);
		//    	session.save(fruit4);
		//    	
		//    	session.save(customer1);
		//    	session.save(customer2);
		//    	session.save(customer3);
		//    	session.save(customer4);

	}
}
