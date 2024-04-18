package com.hibernate.mappingproject.Hibernate_Jpa_Project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;




public class UsingCriteriaBulider {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("udayMySql");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
//		CriteriaBuilder builder=entityManager.getCriteriaBuilder();
//		CriteriaQuery<Actor> criteriaQuery=builder.createQuery(Actor.class);
//		Root<Actor> root=criteriaQuery.from(Actor.class);
//		criteriaQuery.select(root).where(builder.equal(root.get("actorId"), 101));
//		
//		Query<Actor> query=(Query<Actor>) entityManager.createQuery(criteriaQuery);	
//	    Actor actor=query.uniqueResult();
//	    System.out.println(actor);
		
//		CriteriaBuilder builder=entityManager.getCriteriaBuilder();
//		CriteriaUpdate<Actor> criteriaUpdate=builder.createCriteriaUpdate(Actor.class);
//		Root<Actor> root=criteriaUpdate.from(Actor.class);
//		criteriaUpdate.set("actorName", "Southpaw");
//		
//		criteriaUpdate.where(builder.equal(root.get("actorId"), 101));
//		Query<Actor> query=(Query<Actor>) entityManager.createQuery(criteriaUpdate);
//		int result=query.executeUpdate();
//		System.out.println(result);
		
		CriteriaBuilder builder=entityManager.getCriteriaBuilder();
		CriteriaDelete<Actor> criteriaUpdate=builder.createCriteriaDelete(Actor.class);
		Root<Actor> root=criteriaUpdate.from(Actor.class);
		
		
		criteriaUpdate.where(builder.equal(root.get("actorId"), 101));
		Query<Actor> query=(Query<Actor>) entityManager.createQuery(criteriaUpdate);
		int result=query.executeUpdate();
		System.out.println(result);
		
		entityTransaction.commit();
		entityManager.close();
				
	}

}
