package com.finzly.CafeCofee.doa;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.CafeCofee.entity.Employee;

@Repository
public class Employeedoa {

	@Autowired
	SessionFactory sessionfactory;

	public List<Employee> getEmployeeInfo() {
		// TODO Auto-generated method stub
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

	public String insertEnployee(Employee employee) {
		Session session = sessionfactory.openSession();
		session.save(employee);
		session.beginTransaction().commit();
		return "Employee Inserted in to table";
	}

	public List<Employee> getByFirstName(String firstName) {

		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("firstName", firstName));
		return criteria.list();
	}

	public List<Employee> getByID(String id) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public List<Employee> getByDob(String dob) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("dob", dob));
		return criteria.list();
	}

	public List<Employee> getByContactNo(String contactNo) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("contactNo", contactNo));
		return criteria.list();
	}

	public List<Employee> getByDate(String date) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("joinDate", date));
		return criteria.list();
	}

	public List<Employee> getByLastName(String LastName) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("lastName", LastName));
		return criteria.list();

	}

	public List<Employee> getByUsername(String username) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("username", username));
		return criteria.list();
	}

	public List<Employee> getByJoinDate(String joinDate) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("joinDate", joinDate));
		return criteria.list();
	}

	public List<Employee> getByAddress(String address) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("address", address));
		return criteria.list();
	}

	public List<Employee> getBySalary(String salary) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("salary", salary));
		return criteria.list();
	}

	public List<Employee> getByAdharNo(String adharNo) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("adharNo", adharNo));
		return criteria.list();
	}

	public List<Employee> getByEmail(String email) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("email", email));
		return criteria.list();
	}

	public List<Employee> getByGender(String gender) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("gender", gender));
		return criteria.list();
	}

	public List<Employee> getByStatus(String status) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("status", status));
		return criteria.list();
	}

	public List<Employee> getByType(String type) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("type", type));
		return criteria.list();
	}

	public List<Employee> getByShift(String shift) {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("shift", shift));
		return criteria.list();
	}

	public List<Employee> getSalaryMoreThan30000() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("salary", "30000"));
		return criteria.list();
	}

	public String deleteEmpByEmail(String id) {
		Session session = sessionfactory.openSession();
		// Load the entity by its phoneNo
		Employee entityToDelete = session.get(Employee.class, id);

		if (entityToDelete != null) {
			// Delete the entity
			session.delete(entityToDelete);
			session.beginTransaction().commit();
			return "Deleted.";
		}
		return "Not Found.";
	}

	public String updateEmployee(Employee employee) {

		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		session.update(employee);
		session.beginTransaction().commit();
		return "Employee Updated Successfully";

	}

	public List<Employee> getAllFirstName() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setProjection(Projections.property("firstName"));
		return criteria.list();
	}

	public List<Employee> getAllEmail() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setProjection(Projections.property("email"));
		return criteria.list();
	}

	public List<Employee> getAllUsername() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setProjection(Projections.property("username"));
		return criteria.list();
	}

	public List<Employee> getSpecificRecord() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

	public List<Employee> getspecificShifAndSalary() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

	public List<Employee> getEmployeeInfoExceptPassword() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

	public List<Employee> getEmployeeShiftTypeSalary() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

	public List<Employee> getEmployeeEmailNameContactNo() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

	public List<Employee> getEmployeeAddressAddNODob() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

	public List<Employee> getConditionalEmp() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("status", "Single"));
		return criteria.list();
	}

	public List<Employee> getEmployeeNameJoinDate() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

	public List<Employee> getDobAndshiftIsEqualToDay() {
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("dob", "12-04-2002"));
		return criteria.list();
	}
}
