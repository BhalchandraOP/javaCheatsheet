package com.bhalchandra.springmvcboot.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bhalchandra.springmvcboot.model.Alien;

import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public class AlienDao {

	private SessionFactory sessionfactory;
	
	public AlienDao(SessionFactory sessionfactory) {
		this.sessionfactory=sessionfactory;
	}
	
	public void saveAlien(Alien alien) {
			
		Session session = sessionfactory.getCurrentSession();
		
		session.persist(alien); // to commit as well 
		
	}
	
	public Alien getAlien(int id) { // By Primary Key 
		
		Session session = sessionfactory.getCurrentSession();
		Alien alien =session.find(Alien.class, id);
		if(alien!=null) {
			return alien;
		}
		return null;	 			
	}
	
	public List<Alien> getAliens(){
		Session session = sessionfactory.getCurrentSession();
		return session.createQuery("from Alien", Alien.class).list();
	}
	
	public Alien updateAlien(int id,String aname) {
		Session session = sessionfactory.getCurrentSession();

	    Alien alien = session.find(Alien.class, id);

	    if (alien != null) {
	        alien.setAname(aname);
	    }

	    return alien;	
	    }
	
	public void deleteAlien(int id) {
		
		Session session = sessionfactory.getCurrentSession();
		Alien alien = session.find(Alien.class, id);
		if (alien != null) {
	        session.remove(alien);
		}
	}
}



/*
 * 
//	private SessionFactory sessionfactory; 
	
	 private final SessionFactory sessionFactory;

	AlienDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	    public void saveAlien(Alien alien){

	        Session session =
	                sessionFactory.getCurrentSession();

	        session.persist(alien);
	    }
	    
	    public Alien getAlien(int aid){

	        Session session =
	                sessionFactory.getCurrentSession();

	        return session.get(Alien.class, aid);

	    }
//	    public Alien getAllAlien(Alien alien) {
//	    	return alien;
//	    }
	    
	  public List<Alien> getAliens(){

	        Session session =
	                sessionFactory.getCurrentSession();

	        return session
	                .createQuery("from Alien",Alien.class)
	                .list();

	    }*/
