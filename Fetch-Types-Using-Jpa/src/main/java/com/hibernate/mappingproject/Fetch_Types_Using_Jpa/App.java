package com.hibernate.mappingproject.Fetch_Types_Using_Jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;



public class App 
{
    public static void main( String[] args )
    {
    	Employee employee1=new Employee();
    	employee1.setEmployeeId(101);
    	employee1.setEmployeeName("Uday");
    	
    	Employee employee2=new Employee();
    	employee2.setEmployeeId(102);
    	employee2.setEmployeeName("HHHHH");
    	
    	Employee employee3=new Employee();
    	employee3.setEmployeeId(103);
    	employee3.setEmployeeName("gggggg");
    	
    	
    	Passport passport1=new Passport();
    	passport1.setPassportId(111111111);
    	passport1.setPassportType("International");
    	
    	Passport passport2=new Passport();
    	passport2.setPassportId(222222222);
    	passport2.setPassportType("Visa");
    	
    	Passport passport3=new Passport();
    	passport3.setPassportId(3333333);
    	passport3.setPassportType("Domestic");
    	
    	employee1.setPassort(passport3);
    	employee2.setPassort(passport2);
    	employee3.setPassort(passport1);
    	
    	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("employeeMySql");
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction=entityManager.getTransaction();
    	entityTransaction.begin();
    	
    	
    	entityManager.persist(passport1);
    	entityManager.persist(passport2);
    	entityManager.persist(passport3);
    	
    	entityManager.persist(employee1);
    	entityManager.persist(employee2);
    	entityManager.persist(employee3);
    	
    	
    	entityTransaction.commit();
    	entityManager.close();   	
    	
    }
}
