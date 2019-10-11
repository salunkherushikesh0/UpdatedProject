package com.slksoft.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.slksoft.dao.ContactsDao;
import com.slksoft.entity.Contacts;

public class ContactsService {

	SqlSessionFactory sqlSessionFactory;

	public ContactsService() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public Contacts addNewContact(Contacts contact) {
		try (SqlSession sqlSession = sqlSessionFactory.openSession(true);) {
			ContactsDao dao = sqlSession.getMapper(ContactsDao.class);
			dao.addNewContact(contact);
			return contact;
		}
	}

	public List<Contacts> getAllContacts() {
		try (SqlSession sqlSession = sqlSessionFactory.openSession();) {
			ContactsDao dao = sqlSession.getMapper(ContactsDao.class);
			return dao.getAllContacts();
		}
	}

	public Contacts getContactById(Integer id) {
		try (SqlSession sqlSession = sqlSessionFactory.openSession();) {
			ContactsDao dao = sqlSession.getMapper(ContactsDao.class);
			return dao.getContactById(id);
		}
	}
}
