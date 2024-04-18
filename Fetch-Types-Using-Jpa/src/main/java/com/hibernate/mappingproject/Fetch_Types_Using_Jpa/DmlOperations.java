package com.hibernate.mappingproject.Fetch_Types_Using_Jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DmlOperations {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("employeeMySql");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
//		Fetch
		
		Employee employee=entityManager.find(Employee.class, 101);
		System.out.println(employee);
		
//		Employee employee=entityManager.find(Employee.class, 101);
//		employee.setEmployeeName("Hareesh");
//		entityManager.merge(employee);
		
		
		
		
		entityTransaction.commit();
		entityManager.close();
		
		
		
		
		
		
		
	}

}
