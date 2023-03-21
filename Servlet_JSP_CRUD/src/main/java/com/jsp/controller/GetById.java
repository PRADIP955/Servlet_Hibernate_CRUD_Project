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

@WebServlet("/getbyid")
public class GetById extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.valueOf(req.getParameter("id"));
		
		PersonService ps = new PersonService();
		Person p=ps.getById(id);
		if(p != null) {
			req.setAttribute("person", p);
			RequestDispatcher rd=req.getRequestDispatcher("displayBy_Id.jsp");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("geting_id.jsp");
			rd.include(req, resp);
		}
	}

}
