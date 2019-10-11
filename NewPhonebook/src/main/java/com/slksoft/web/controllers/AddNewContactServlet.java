package com.slksoft.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.Contacts;
import com.slksoft.service.ContactsService;

@WebServlet("/add-new-contact")
public class AddNewContactServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/contact-form.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Contacts contact=new Contacts();
		contact.setFirstname(req.getParameter("firstname"));
		contact.setLastname(req.getParameter("lastname"));
		contact.setGender(req.getParameter("gender"));
		contact.setEmail(req.getParameter("email"));
		contact.setPhone(req.getParameter("phone"));
		contact.setCity(req.getParameter("city"));
		contact.setState(req.getParameter("state"));
		contact.setCountry(req.getParameter("country"));
		contact.setPicture(req.getParameter("picture"));
		
		ContactsService service=new ContactsService();
		service.addNewContact(contact);
		
		req.setAttribute("contact", contact);
		
		req.getRequestDispatcher("/WEB-INF/views/new-contact-details.jsp").forward(req, resp);
		
		
		

	}
	

}
