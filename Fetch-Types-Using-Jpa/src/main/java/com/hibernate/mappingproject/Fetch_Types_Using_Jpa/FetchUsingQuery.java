package com.hibernate.mappingproject.Fetch_Types_Using_Jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class FetchUsingQuery {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeeMySql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Query<String> query=(Query<String>) entityManager.createQuery("Select e.employeeName from Employee e where e.employeeId=:employeeId");
		query.setParameter("employeeId", 101);
		
				String employee=query.uniqueResult();
				System.out.println(employee);

				// Query<Employee> query=(Query<Employee>) entityManager.createQuery("select s
				// from Employee s");
				// List<Employee> employees=query.list();
				// for(Employee employee:employees) {
				// System.out.println(employee);

				// @SuppressWarnings("unchecked")
				// NativeQuery<Employee> nativeQuery= (NativeQuery<Employee>)
				// entityManager.createNativeQuery("Select * from Employee");
				// nativeQuery.addEntity(Employee.class);

				// List<Employee> employees=nativeQuery.list();
				// for(Employee employee:employees) {
				// System.out.println(employee);
				// }


				entityTransaction.commit();
				entityManager.close();

	}

}
