 package com.hibernate.hibernateonetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Company company=new Company();
		company.setCompanyId(1);
		company.setCompanyName("IBM");
		company.setCompanyLocation("Bangalore");

		Company company2=new Company();
		company2.setCompanyId(2);
		company2.setCompanyName("Accenture");
		company2.setCompanyLocation("Hyderabad");

		
		
		Employee employee1=new Employee();
		employee1.setEmployeeId(101);
		employee1.setEmployeeName("Jhon Wick");
		employee1.setEmployeeEmail("j@gmail.com");
		employee1.setEmpployeeSalary(200000);

		Employee employee2=new Employee();
		employee2.setEmployeeId(102);
		employee2.setEmployeeName("Walter White");
		employee2.setEmployeeEmail("W@gmail.com");
		employee2.setEmpployeeSalary(200000);

		Employee employee3=new Employee();
		employee3.setEmployeeId(103);
		employee3.setEmployeeName("Jesse");
		employee3.setEmployeeEmail("je@gmail.com");
		employee3.setEmpployeeSalary(400000);
		
		Employee employee4=new Employee();
		employee4.setEmployeeId(104);
		employee4.setEmployeeName("Skylar");
		employee4.setEmployeeEmail("se@gmail.com");
		employee4.setEmpployeeSalary(100000);
		
		Employee employee5=new Employee();
		employee5.setEmployeeId(105);
		employee5.setEmployeeName("Hank");
		employee5.setEmployeeEmail("He@gmail.com");
		employee5.setEmpployeeSalary(700000);
		
		

		
//	Automatic mapping is done we don't need to get or add employees
//		company.getEmployees().add(employee1);
//		company.getEmployees().add(employee2);
//		company.getEmployees().add(employee3);
//		
	
		employee1.setCompany(company);
		employee2.setCompany(company);
		employee3.setCompany(company);
		
//		For company 2
		
		employee4.setCompany(company2);
		employee5.setCompany(company2);


		Configuration configuration=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Company.class);

		SessionFactory sessionFactory=configuration.buildSessionFactory();

		Session session=sessionFactory.openSession();

		Transaction transaction=session.beginTransaction();

		session.save(company);
		session.save(company2);
		
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		session.save(employee4);
		session.save(employee5);

		transaction.commit();
		session.close();



	}
}
