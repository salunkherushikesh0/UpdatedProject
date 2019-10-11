package com.slksoft.web.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.slksoft.entity.Contacts;
import com.slksoft.service.ContactsService;


@WebServlet("/contact-list")
public class ContactListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. read the inputs
		

		// 2.get model data using model methods
		ContactsService service=new ContactsService();
		
		List<Contacts> list = null;

		
			list=service.getAllContacts();
		

		// 3.store model data in a scope
		req.setAttribute("contacts", list);
		

		// 4.forward to view
		req.getRequestDispatcher("/WEB-INF/views/contact-list.jsp").forward(req, resp);

	}

}
