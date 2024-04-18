package com.hibernate.mappingproject.Hibernate_ProjectCriteriaApi;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class FetchUsingCriteriaApi {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Session session = new Configuration().configure()
				.addAnnotatedClass(Fruit.class)
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory()
				.openSession();

		Transaction transaction=session.beginTransaction();

		Criteria criteria=session.createCriteria(Fruit.class).add(Restrictions.eq("fruitName",("Avacado")));	
		Fruit fruit= (Fruit) criteria.uniqueResult();
		System.out.println(fruit);
	
		//	Query<Fruit> query = session.createQuery("from Fruit where fruitName not like 'Melon'", Fruit.class);
		//	List<Fruit> fruits = query.getResultList();
		//	fruits.forEach(System.out::println);


		//	1.	Write a hibernate program to find list of consumers who has not Bought dragonfriut

		//			Criteria criteria = session.createCriteria(Fruit.class).add(Restrictions.not(Restrictions.like("fruitName", "Melon")));
		//			List<Fruit> fruits = criteria.list();
		//			for(Fruit fruit:fruits) {
		//				System.out.println(fruit);
		//			}

		//	2.Write a hibernate program to find List of fruits which does not contain the character N in the fruit Name

		//		Criteria criteria=session.createCriteria(Fruit.class).add(Restrictions.not(Restrictions.like("fruitName", "%n%")));		
		//		List<Fruit> fruits= criteria.list();
		//		for(Fruit fruit:fruits) {
		//			System.out.println(fruit);
		//		}

		transaction.commit();
		session.close();

	}

}
