package com.sarathchandraProjects.hibernateCompositePrimaryKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarathchandraProjects.hibernateCompositePrimaryKey.entites.EmpEmbeddedId;
import com.sarathchandraProjects.hibernateCompositePrimaryKey.entites.Employee;
import com.sarathchandraProjects.hibernateCompositePrimaryKey.entites.Student;

public class EmpCreateApp {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        EmpEmbeddedId empEmbeddedId = new EmpEmbeddedId(1600248, "TCS", "Chennai");
        
        Employee emp1 = new Employee("Sarath Chandra Grandhi", "Ongole" , empEmbeddedId);
        
        
        Transaction transaction = session.beginTransaction();
        
        session.persist(emp1);
        
        transaction.commit();
	}
}
        