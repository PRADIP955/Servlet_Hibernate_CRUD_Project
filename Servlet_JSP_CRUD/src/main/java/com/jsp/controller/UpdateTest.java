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

@WebServlet("/updatetest")
public class UpdateTest extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonService ps = new PersonService();
		
		int id=Integer.valueOf(req.getParameter("id"));
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		Person p = new Person();
		p.setId(id);
		p.setName(name);
		p.setAge(age);
		p.setEmail(email);
		p.setPasswrod(pass);
		
		
		Person person=ps.update(p);
		if(person != null) {
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("update_id.jsp");
			rd.include(req, resp);
		}
		
	}

}
