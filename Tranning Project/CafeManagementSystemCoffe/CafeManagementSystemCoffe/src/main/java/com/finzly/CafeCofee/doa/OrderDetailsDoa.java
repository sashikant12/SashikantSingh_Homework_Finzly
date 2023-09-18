package com.finzly.CafeCofee.doa;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.CafeCofee.entity.Employee;
import com.finzly.CafeCofee.entity.OrderDetails;
import com.finzly.CafeCofee.service.OrderDetailsServices;

@Repository
public class OrderDetailsDoa {
	@Autowired
	SessionFactory sessionfactory;

	public List<OrderDetails> getOrderInfo() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(OrderDetails.class);
		return criteria.list();
	}

	public String insertOrder(OrderDetails orderDetails) {
		Session session = sessionfactory.openSession();
		session.save(orderDetails);
		session.beginTransaction().commit();
		return "Employee Inserted in to table";
	}

	public List<OrderDetails> getInfo() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(OrderDetails.class);
		return criteria.list();
	}

	public String deleteEmpByEmail(int id) {
		Session session = sessionfactory.openSession();
		// Load the entity by its phoneNo
		OrderDetails entityToDelete = session.get(OrderDetails.class, id);

		if (entityToDelete != null) {
			// Delete the entity
			session.delete(entityToDelete);
			session.beginTransaction().commit();
			return "Deleted.";
		}
		return "Not Found.";
	}

	public List<OrderDetails> getByID(int id) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(OrderDetails.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public List<OrderDetails> getBycustomerName(String customerName) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(OrderDetails.class);
		criteria.add(Restrictions.eq("customerName", customerName));
		return criteria.list();
	}

	public List<OrderDetails> getBycontactNo(String contactNo) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(OrderDetails.class);
		criteria.add(Restrictions.eq("contactNo", contactNo));
		return criteria.list();
	}

}
