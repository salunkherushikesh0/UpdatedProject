package com.slksoft.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.Contacts;
import com.slksoft.service.ContactsService;

@WebServlet("/contact-details")
public class ContactDetailsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String input = req.getParameter("id");
		int id = Integer.parseInt(input);
		ContactsService service = new ContactsService();
		
		/*
		 * String name = req.getParameter("firstname"); String lastname =
		 * req.getParameter("lastname"); String gender = req.getParameter("gender");
		 * String email = req.getParameter("email"); String phone =
		 * req.getParameter("phone"); String city = req.getParameter("city"); String
		 * state = req.getParameter("state"); String country =
		 * req.getParameter("country"); String picture = req.getParameter("picture");
		 */
		
		List<Contacts> list = null;

		list = service.getAllContacts();

		req.setAttribute("contacts", list);
		req.setAttribute("id",service.getContactById(id));



		// 4. forward to view
		req.getRequestDispatcher("/WEB-INF/views/contacts-main-details.jsp").forward(req, resp);

	}
}