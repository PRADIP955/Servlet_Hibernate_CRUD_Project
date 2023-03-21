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

@WebServlet("/fatchbyid")
public class FatchById extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		PersonService ps = new PersonService();
		Person person=ps.getById(id);
		
		if(person != null) {
			req.setAttribute("per", person);
			RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("update_id.jsp");
			dispatcher.include(req, resp);
		}
	}

}
