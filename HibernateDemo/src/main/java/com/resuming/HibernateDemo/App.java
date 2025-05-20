package com.resuming.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
	public static void main(String args[]) {
		/*//to add the data inside database values to be passed;
		 * Alien a=new Alien(); a.setAid(105); a.setAname("Nikki");
		 * a.setColor("Royal Blue");
		 */
		//to fetch the data from database;
		//Alien a=null; 
		
		
		
		//to create embeddable table
		AlienName an=new AlienName();
		an.setFname("Arti");
		an.setLname("yadav");
		an.setMname("Pandey");
		
		
		Alien a=new Alien();
		a.setAid(106);
		a.setAname(an);
		a.setColor("Green");
		
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
		//ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		//session.save(a);//to save the data inside database
		//a=(Alien) session.get(Alien.class,101);
		
		session.save(a);
		tx.commit();
		//System.out.println(a);
	}
    
}
