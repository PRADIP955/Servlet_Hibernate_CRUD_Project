package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.jsp.dto.Person;

public class PersonDAO {
	public Person savePerson(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		if(person != null) {
		em.persist(person);
		}
		et.commit();
		em.close();
		return person;	
	}
	public List<Person> getAll(int id , String pass){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		EntityManager em=emf.createEntityManager();
		Person p=em.find(Person.class, id);
		if(p != null) {
			Query query = em.createQuery("select a from Person a");
			List <Person> list = query.getResultList();
			return list;
		}
		return null;
	}
	public Person getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		EntityManager em=emf.createEntityManager();
		Person person=em.find(Person.class, id);
		return person;
	}
	public Person delete(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		EntityManager em=emf.createEntityManager();
		Person person = em.find(Person.class, id);
		if(person != null) {
			EntityTransaction et=em.getTransaction();
			et.begin();	
			em.remove(person);
			et.commit();
			em.close();
		}
		return person;
	}
	public Person update(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		EntityManager em=emf.createEntityManager();
		Person person2 = em.find(Person.class, person.getId());
		if(person2 != null) {
		EntityTransaction et=em.getTransaction();
		et.begin();
		Person person3=em.merge(person);
		et.commit();
		em.close();
		return person3;
		}
		return null;
	}
}
