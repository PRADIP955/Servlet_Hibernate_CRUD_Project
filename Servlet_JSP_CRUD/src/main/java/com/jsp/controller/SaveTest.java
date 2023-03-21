package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;


public class SaveTest extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name =req.getParameter("name");
		String age1 =req.getParameter("age");
		String email =req.getParameter("email");
		String pass =req.getParameter("password");
		
		int age = Integer.valueOf(age1);
		
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		p.setEmail(email);
		p.setPasswrod(pass);
		
		PersonService ps = new PersonService();
		Person person=ps.savePerson(p);
		if(person != null) {
			RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("save.jsp");
			rd.include(req, resp);
		}
	}

}
