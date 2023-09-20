package com.BBC.Dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BBC.Entiity.Tranction;

import antlr.collections.List;
@Repository
public class TranctionDao {
	@Autowired
	SessionFactory sessionFactory;

	public java.util.List getAlltranction() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Tranction.class);
		return criteria.list();
		
	}

	public java.util.List<Tranction> getAllTransaction() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Tranction.class);
		return criteria.list();
	}
	
	public String setAllTransactionUpdate(Tranction tranction) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Tranction.class);
		session.update(tranction);
		session.beginTransaction().commit();
		return "Transaction Done";
	}

	public String getAlltranctionPaymentUpdate(Tranction tranction) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Tranction.class);
		session.update(tranction);
		session.beginTransaction().commit();
		return "Payment done sucessfully";
	}
}
