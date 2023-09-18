package com.finzly.CafeCofee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.CafeCofee.doa.Employeedoa;
import com.finzly.CafeCofee.entity.Employee;

@Service
public class EmployeeServices {
	@Autowired
	Employeedoa employeedoa;

	public List<Employee> getEmployeeInfo() {
		// TODO Auto-generated method stub
		return employeedoa.getEmployeeInfo();
	}

	public String insertEnployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeedoa.insertEnployee(employee);
	}

	public List<Employee> getByFirstName(String firstName) {

		return employeedoa.getByFirstName(firstName);
	}

	public List<Employee> getById(String id) {
		return employeedoa.getByID(id);
	}

	public List<Employee> getByDob(String dob) {

		return employeedoa.getByDob(dob);
	}

	public List<Employee> getByContactNo(String contact_no) {
		return employeedoa.getByContactNo(contact_no);
	}

	public List<Employee> getByDate(String date) {
		return employeedoa.getByDate(date);
	}

	public List<Employee> getByLastName(String LastName) {

		return employeedoa.getByLastName(LastName);
	}

	public List<Employee> getByUsername(String username) {
		return employeedoa.getByUsername(username);
	}

	public List<Employee> getByJoinDate(String joinDate) {
		return employeedoa.getByJoinDate(joinDate);
	}

	public List<Employee> getByAddress(String address) {
		return employeedoa.getByAddress(address);
	}

	public List<Employee> getBySalary(String Salary) {
		return employeedoa.getBySalary(Salary);
	}

	public List<Employee> getByAdharNo(String adharNo) {
		return employeedoa.getByAdharNo(adharNo);
	}

	public List<Employee> getByEmail(String email) {
		return employeedoa.getByEmail(email);
	}

	public List<Employee> getByGender(String gender) {
		return employeedoa.getByGender(gender);
	}

	public List<Employee> getByStatus(String status) {
		return employeedoa.getByStatus(status);
	}

	public List<Employee> getByType(String type) {
		return employeedoa.getByType(type);
	}

	public List<Employee> getByShift(String shift) {
		return employeedoa.getByShift(shift);
	}

	public List<Employee> getSalaryMoreThan30000() {
		return employeedoa.getSalaryMoreThan30000();
	}

	public String deleteEmpByEmail(String id) {
		return employeedoa.deleteEmpByEmail(id);
	}

	public String updateEmployee(Employee employee) {
		return employeedoa.updateEmployee(employee);
	}

	public List<Employee> getAllFirstName() {
		return employeedoa.getAllFirstName();

	}

	public List<Employee> getAllEmail() {
		return employeedoa.getAllEmail();
	}

	public List<Employee> getAllUsername() {
		return employeedoa.getAllUsername();
	}

	public List<Employee> getSpecificRecord() {
		List<Employee> list = employeedoa.getSpecificRecord();
		List<Employee> al = new ArrayList<>();
		for (Employee book : list) {
			String fname = book.getFirstName();
			String lname = book.getLastName();
			String gender = book.getGender();
			Employee b = new Employee();
			b.setFirstName(fname);
			b.setLastName(lname);
			b.setGender(gender);

			al.add(b);
		}
		return al;
	}

	public List<Employee> getspecificShifAndSalary() {
		List<Employee> list = employeedoa.getspecificShifAndSalary();
		List<Employee> al = new ArrayList<>();
		for (Employee book : list) {
			String shift = book.getShift();
			String salary = book.getSalary();
			Employee b = new Employee();
			b.setSalary(salary);
			b.setShift(shift);

			al.add(b);
		}
		return al;
	}

	public List<Employee> getEmployeeInfoExceptPassword() {
		List<Employee> list = employeedoa.getspecificShifAndSalary();
		List<Employee> al = new ArrayList<>();
		for (Employee book : list) {
			String fname = book.getFirstName();
			String lname = book.getLastName();
			String gender = book.getGender();
			String shift = book.getShift();
			String salary = book.getSalary();
			String id = book.getId();
			String username = book.getUsername();
			String dob = book.getDob();
			String contactNo = book.getContactNo();
			String joinDate = book.getJoinDate();
			String address = book.getAddress();
			String adharNo = book.getAdharNo();
			String email = book.getEmail();
			String status = book.getStatus();
			String type = book.getType();
			Employee b = new Employee();
			b.setFirstName(fname);
			b.setLastName(lname);
			b.setGender(gender);
			b.setSalary(salary);
			b.setShift(shift);
			b.setId(id);
			b.setUsername(username);
			b.setDob(dob);
			b.setContactNo(contactNo);
			b.setJoinDate(joinDate);
			b.setAddress(address);
			b.setAdharNo(adharNo);
			b.setEmail(email);
			b.setStatus(status);
			b.setType(type);

			al.add(b);
		}
		return al;
	}

	public List<Employee> getEmployeeShiftTypeSalary() {
		List<Employee> list = employeedoa.getEmployeeShiftTypeSalary();
		List<Employee> al = new ArrayList<>();
		for (Employee book : list) {
			String shift = book.getShift();
			String salary = book.getSalary();
			String status = book.getStatus();
			Employee b = new Employee();
			b.setSalary(salary);
			b.setShift(shift);
			b.setStatus(status);
			al.add(b);
		}
		return al;

	}

	public List<Employee> getEmployeeEmailNameContactNo() {
		List<Employee> list = employeedoa.getEmployeeEmailNameContactNo();
		List<Employee> al = new ArrayList<>();
		for (Employee book : list) {
			String firstName = book.getFirstName();
			String email = book.getEmail();
			String contactNo = book.getContactNo();
			Employee b = new Employee();
			b.setFirstName(firstName);
			b.setEmail(email);
			b.setContactNo(contactNo);
			al.add(b);
		}
		return al;
	}

	public List<Employee> getEmployeeAddressAddNODob() {
		List<Employee> list = employeedoa.getEmployeeAddressAddNODob();
		List<Employee> al = new ArrayList<>();
		for (Employee book : list) {
			String address = book.getAddress();
			String adharNo = book.getAdharNo();
			String Dob = book.getDob();
			Employee b = new Employee();
			b.setAddress(address);
			b.setAdharNo(adharNo);
			b.setDob(Dob);
			al.add(b);
		}
		return al;
	}

	public List<Employee> getConditionalEmp() {

		List<Employee> list = employeedoa.getConditionalEmp();
		List<Employee> al = new ArrayList<>();
		for (Employee book : list) {
			if (book.getGender() != "Female") {
				al.add(book);
			}
		}
		return al;
	}

	public List<Employee> getEmployeeNameJoinDate() {
		List<Employee> list = employeedoa.getEmployeeNameJoinDate();
		List<Employee> al = new ArrayList<>();
		for (Employee book : list) {
			String fname = book.getFirstName();
			String lname = book.getLastName();
			String joinDate = book.getJoinDate();
			Employee b = new Employee();
			b.setFirstName(fname);
			b.setLastName(lname);
			b.setJoinDate(joinDate);

			al.add(b);
		}
		return al;
	}

	public List<Employee> getDobAndshiftIsEqualToDay() {
		List<Employee> list = employeedoa.getDobAndshiftIsEqualToDay();
		List<Employee> al = new ArrayList<>();
		for (Employee book : list) {
			if (book.getShift() == "Day") {
				al.add(book);
			}
		}
		return al;
	}
}