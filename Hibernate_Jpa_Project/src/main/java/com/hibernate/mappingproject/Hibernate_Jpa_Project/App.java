package com.hibernate.mappingproject.Hibernate_Jpa_Project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
	public static void main( String[] args )
	{
		//    	Actor actor=new Actor();
		//    	actor.setActorId(101);
		//    	actor.setActorName("Prabhas");
		//    	actor.setActorMovie("Salaar");

		//    	Actor actor1=new Actor();
		//    	actor1.setActorId(102);
		//    	actor1.setActorName("TomHolland");
		//    	actor1.setActorMovie("Spiderman");
		//    	
		//    	


		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("udayMySql");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		entityTransaction.begin();

		//        entityManager.persist(actor1);

		Actor actor1=entityManager.find(Actor.class, 101);
		//        entityManager.remove(actor1);
		actor1.setActorName("prabhas");        
		entityManager.merge(actor1);      

		entityTransaction.commit();
		entityManager.close();

	}
}
