package com.finzly.CafeCofee.doa;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.CafeCofee.entity.Employee;
import com.finzly.CafeCofee.entity.Menu;

@Repository
public class CafeDoa {

	@Autowired
	SessionFactory sessionfactory;

	public List<Menu> getInfo() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		return criteria.list();
	}

	public List<Menu> getByName(String name) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		criteria.add(Restrictions.eq("name", name));
		return criteria.list();

	}

	public List<Menu> getByCategory(String category) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		criteria.add(Restrictions.eq("category", category));
		return criteria.list();
	}

	public List<Menu> getByCategory(int id) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();

	}

	public List<Menu> getByDrinks() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		criteria.add(Restrictions.eq("category", "Drinks"));
		return criteria.list();
	}

	public List<Menu> getpriceMoreThan30() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		criteria.add(Restrictions.gt("price", 30.00));
		return criteria.list();
	}

	public String insertMenu(Menu menu) {
		Session session = sessionfactory.openSession();
		session.save(menu);
		session.beginTransaction().commit();
		return "Menu Inserted in to table";
	}

	public List<Menu> getByCategory(double price) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		criteria.add(Restrictions.eq("price", price));
		return criteria.list();
	}

	public String deleteEmpByEmail(int id) {
		Session session = sessionfactory.openSession();
		// Load the entity by its phoneNo
		Menu entityToDelete = session.get(Menu.class, id);

		if (entityToDelete != null) {
			// Delete the entity
			session.delete(entityToDelete);
			session.beginTransaction().commit();
			return "Deleted.";
		}
		return "Not Found.";
	}

	public String updateMenu(Menu menu) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		session.update(menu);
		session.beginTransaction().commit();
		return "Menu Updated Successfully";
	}

	public List<Menu> getpricemorethan30AndDrinkNotEqualSprite() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		criteria.add(Restrictions.ge("price", 30.00));
		return criteria.list();
	}

}
