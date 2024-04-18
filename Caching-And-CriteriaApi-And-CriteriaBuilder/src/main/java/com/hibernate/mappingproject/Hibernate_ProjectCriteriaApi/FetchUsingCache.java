package com.hibernate.mappingproject.Hibernate_ProjectCriteriaApi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchUsingCache {
	public static void main(String[] args) {

		Configuration configuration=new Configuration().configure().addAnnotatedClass(Fruit.class).addAnnotatedClass(Customer.class);

		SessionFactory sessionFactory=configuration.buildSessionFactory();

		Session session1=sessionFactory.openSession();
		Transaction transaction1=session1.beginTransaction();

		Fruit fruit1=session1.get(Fruit.class, 201);
		System.out.println(fruit1);

		transaction1.commit();
		session1.close();	
		
		Session session2=sessionFactory.openSession();
		Transaction transaction2=session2.beginTransaction();

		Fruit fruit2=session2.get(Fruit.class, 201);
		System.out.println(fruit2);

		transaction2.commit();
		session2.close();	
		
		
	}

}
