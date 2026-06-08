package com.bhalchandra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		Alien a1 = new Alien();
		a1.setAid(104);
		a1.setAname("far");
		a1.setTech("CLOUD");

//		Configuration config = new Configuration();
//
//		config.addAnnotatedClass(com.bhalchandra.Alien.class); // we need to locate as jpa required
//
//		config.configure("hibernate.cfg.xml"); //
//
//		//SessionFactory factory = config.buildSessionFactory();

		SessionFactory factory = new Configuration().addAnnotatedClass(com.bhalchandra.Alien.class).configure()
				.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transcation = session.beginTransaction();
		// Transcation is needed when youre saving updating and deleting

		// session.merge(a1); // iN CASE WE USE MERGE WITH NEW DATA IT WILL ACT AS
		// INSERT

		// Alien a1 = session.find(Alien.class, 104);
//		session.remove(104);

		session.persist(a1); // jakarta persistant (JPA standard)
		// Alien a1 = session.find(Alien.class, "Rahul"); // FECTHING
		// -----------------------------------// USES EAGER FETCHING , GET()

		// Alien a2 = session.byID(Alien.class).getReference(104); USES LASY FETCHING

		transcation.commit();

		// System.out.println(a1);
		session.close();
		factory.close();

		System.out.println("Hello World!");
	}

}
