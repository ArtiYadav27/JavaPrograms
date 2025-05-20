package com.resuming.hibernateRelationship;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App 
{
    public static void main( String[] args )
    {
		
		
		/*
		 * Laptop laptop = new Laptop(); laptop.setLid(107); laptop.setlName("Acer");
		 * 
		 * 
		 * Student student=new Student(); student.setRoll_no(2);
		 * student.setName("Arti"); student.setMarks(98);
		 * student.getLaptop().add(laptop); laptop.setStudent(student);
		 */
			 
		 

		  //laptop.getStudent().add(student);
		 
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        
        //ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).getBootstrapServiceRegistry();
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
		
		  //session.save(student); 
		  //session.save(laptop);
		 
        
        Student student=session.get(Student.class,1);
        System.out.println(student.getName());
        Collection<Laptop> laps=student.getLaptop();
//        for(Laptop l:laps) {
//        	System.out.println(l);
//        }
        
        tx.commit();
        //System.out.println(student);
    }
}
