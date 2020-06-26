package com.balu.hibernate.DemoHibe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienFullName aname= new AlienFullName();
    	aname.setFirstName("Balu");
    	aname.setMiddleName("reddy");
    	aname.setLastName("Mopuru");
    	Alien balu = new Alien();
    	balu.setAid(108);
    	balu.setAname(aname);
    	balu.setColor("Blue");
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
    	
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	
    	SessionFactory sf=config.buildSessionFactory(reg);
    	
    	Session session= sf.openSession();
    	
    	Transaction tx =session.beginTransaction();
    	
        session.save(balu);
        
        tx.commit();
    	
    	
    }
}
