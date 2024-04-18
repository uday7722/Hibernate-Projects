package com.hibernate.hibernateonetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.model.source.internal.hbm.AbstractEntitySourceImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Fetch {

	public static void main(String[] args) {



		Configuration configuration=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Company.class);

		SessionFactory sessionFactory=configuration.buildSessionFactory();

		Session session=sessionFactory.openSession();

		Transaction transaction=session.beginTransaction();



//		Company company=session.get(Company.class,2);	
//		System.out.println(company);
//
//		List<Employee> employees=company.getEmployees();
//
//		for(Employee employee:employees) {
//			System.out.println(employee);
//
//		} 
		
		Employee employee=(Employee) session.get(Employee.class, 1);
		System.out.println(employee);
		
		
//		NativeQuery<Employee> nativeQuery=session.createNativeQuery("Delete from Employee  where company_companyId is null");
//		int result=nativeQuery.executeUpdate();
//		if(result>0) {
//			System.out.println("deleted");
//		}
//	
		
		
		
		
		transaction.commit();
		session.close();

	}

}
