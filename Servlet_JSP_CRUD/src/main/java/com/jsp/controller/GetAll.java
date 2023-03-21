package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.PersonService;


public class GetAll extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.valueOf(req.getParameter("id"));
		String pass = req.getParameter("pass");
		
		PersonService ps = new PersonService();
		List list = ps.getAll(id, pass);
		
		if(list != null) {
			req.setAttribute("abc", list);
			RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("for_display_validate_id_pass.jsp");
			rd.include(req, resp);
		}
	}

}
