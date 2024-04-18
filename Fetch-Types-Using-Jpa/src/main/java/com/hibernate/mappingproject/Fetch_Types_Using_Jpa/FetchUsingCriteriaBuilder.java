package com.hibernate.mappingproject.Fetch_Types_Using_Jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;

public class FetchUsingCriteriaBuilder {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("employeeMySql");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		CriteriaBuilder builder=entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery=builder.createQuery(Employee.class);
		Root<Employee> root=criteriaQuery.from(Employee.class);
		
//		criteriaQuery.where(builder.equal(root.get("employeeId"), 102));
//		Query<Employee> query=(Query<Employee>) entityManager.createQuery(criteriaQuery);
//		Employee employee=query.uniqueResult();
//		System.out.println(employee);
		
		criteriaQuery.select(root);
		Query<Employee> query=(Query<Employee>)entityManager.createQuery(criteriaQuery);
		List<Employee> employees=query.list();
		for(Employee employee:employees) {
			System.out.println(employee);
		}
				
		
		entityTransaction.commit();
		entityManager.close();	
		
	}

}
