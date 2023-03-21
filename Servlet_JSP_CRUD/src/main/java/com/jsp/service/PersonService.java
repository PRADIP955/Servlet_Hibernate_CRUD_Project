package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDAO;
import com.jsp.dto.Person;

public class PersonService {
	PersonDAO personDAO = new PersonDAO();
	public Person savePerson(Person person) {
		return personDAO.savePerson(person);
	}
	public List<Person> getAll(int id , String pass){
		return personDAO.getAll(id,pass);
	}
	public Person getById(int id) {
		return personDAO.getById(id);
	}
	public Person delete(int id) {
		return personDAO.delete(id);
	}
	public Person update(Person person) {
		return personDAO.update(person);
	}
}
