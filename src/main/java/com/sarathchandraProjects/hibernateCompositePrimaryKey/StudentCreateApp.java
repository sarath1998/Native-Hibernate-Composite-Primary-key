package com.sarathchandraProjects.hibernateCompositePrimaryKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarathchandraProjects.hibernateCompositePrimaryKey.entites.Student;
import com.sarathchandraProjects.hibernateCompositePrimaryKey.entites.StudentIdClass;

/**
 * Hello world!
 *
 */
public class StudentCreateApp 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        Student std1 = new Student("Sarath", 25, 903234L, "Ongole", "Srinivasulu G", "Lakshmi Saraswathi G");
        Student std2 = new Student("Aiswarya", 23, 903568L, "Nellore", "Bhanu Prakash R", "Suneetha R");
        
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(std1);
            session.persist(std2);
            transaction.commit();
            
            Student sarathDetails = session.get(Student.class, new StudentIdClass("Sarath", "Ongole", "Srinivasulu G", "Lakshmi Saraswathi G"));
            System.out.println(sarathDetails);
		} 
        catch (Exception e) {
			System.out.println(e);
			System.out.println("Inside the catch block");
			transaction.rollback();
		}
    }
}
