package com.hibernate.mappingproject.Hibernate_ProjectCriteriaApi;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchUsingCriteriaBuilder {

	public static void main(String[] args) {

		Configuration configuration=new Configuration().configure().addAnnotatedClass(Fruit.class).addAnnotatedClass(Customer.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();


		// CriteriaQuery--Fetching
		CriteriaBuilder builder=session.getCriteriaBuilder();	
		CriteriaQuery<Fruit> criteriaQuery=builder.createQuery(Fruit.class);	
		Root<Fruit> root=criteriaQuery.from(Fruit.class);
		//criteriaQuery.select(root).where(builder.gt(root.get("fruitCost"), 60));
		criteriaQuery.select(root).where(builder.between(root.get("fruitCost"), 70, 80));

		Query<Fruit> query=session.createQuery(criteriaQuery);	
		List<Fruit> fruits=query.list();
		for(Fruit fruit:fruits) {
			System.out.println(fruit);
		}	
		
		// CriteriaUpdate--For update
		
		CriteriaBuilder builder=session.getCriteriaBuilder();	
		CriteriaUpdate<Fruit> criteriaUpdate=builder.createCriteriaUpdate(Fruit.class);	
		Root<Fruit> root=criteriaUpdate.from(Fruit.class);
		criteriaUpdate.set("fruitCost", 120);
		criteriaUpdate.where(builder.between(root.get("fruitCost"), 60, 80));

		Query<Fruit> query=session.createQuery(criteriaUpdate);	
		int result=query.executeUpdate();
		System.out.println(result+" Data updated Successfully");

		 // CriteriaDelete--For Deleting
		
		CriteriaBuilder builder=session.getCriteriaBuilder();	
		CriteriaDelete<Fruit> criteriaDelete=builder.createCriteriaDelete(Fruit.class);	
		Root<Fruit> root=criteriaDelete.from(Fruit.class);
		criteriaDelete.where(builder.equal(root.get("fruitId"), 203));

		Query<Fruit> query=session.createQuery(criteriaDelete);	
		int result=query.executeUpdate();
		System.out.println(result+" Data Deleted Successfully");
		
		transaction.commit();
		session.close();

	}
}
