package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		
		Student sob=new Student();
		sob.setSid(13);
		sob.setSname("kalai");
		sob.setScource("python");
		Address aob=new Address();
		aob.setNo(23);
		aob.setStreet("southstreet");
		aob.setDistrict("karaikal");
		aob.setCity("karaikal");
		aob.setState("Pondicherry");

		Configuration conn=new Configuration().configure().addAnnotatedClass(Address.class).addAnnotatedClass(Student.class);	
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sf=conn.buildSessionFactory(reg);
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		sess.save(aob);
		sess.save(sob);
		
		tx.commit();


	}

}
