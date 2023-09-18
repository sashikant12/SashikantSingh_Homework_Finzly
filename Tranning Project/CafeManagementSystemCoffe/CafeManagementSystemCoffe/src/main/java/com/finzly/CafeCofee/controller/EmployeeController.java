package com.finzly.CafeCofee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.CafeCofee.entity.Employee;

import com.finzly.CafeCofee.service.EmployeeServices;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServices employeeServices;

	@RequestMapping("Employee")
	public String anme() {
		return "ho gyaya";
	}

	@GetMapping("EmployeeInfo")
	public List<Employee> getEmployeeInfo() {
		return employeeServices.getEmployeeInfo();
	}

	@PostMapping("insertEmployee")
	public String insertEnployee(@RequestBody Employee employee) {
		return employeeServices.insertEnployee(employee);
	}

	@GetMapping("EmpFirstName/{firstName}")
	public List<Employee> getByFirstName(@PathVariable String firstName) {
		return employeeServices.getByFirstName(firstName);
	}

	@GetMapping("EmpId/{id}")
	public List<Employee> getById(@PathVariable String id) {
		return employeeServices.getById(id);
	}

	@GetMapping("EmpDob/{dob}")
	public List<Employee> getByDob(@PathVariable String dob) {
		return employeeServices.getByDob(dob);
	}

	@GetMapping("EmpContactNo/{contactNo}")
	public List<Employee> getByContactNo(@PathVariable String contact_no) {
		return employeeServices.getByContactNo(contact_no);
	}

	@GetMapping("EmpLastName/{LastName}")
	public List<Employee> getByLastName(@PathVariable String LastName) {
		return employeeServices.getByLastName(LastName);
	}

	@GetMapping("EmpUsername/{username}")
	public List<Employee> getByUsername(@PathVariable String username) {
		return employeeServices.getByUsername(username);
	}

	@GetMapping("EmpJoinDate/{joinDate}")
	public List<Employee> getByJoinDatee(@PathVariable String joinDate) {
		return employeeServices.getByJoinDate(joinDate);
	}

	// address
	@GetMapping("EmpAddress/{address}")
	public List<Employee> getByAddress(@PathVariable String address) {
		return employeeServices.getByAddress(address);
	}

	// Salary
	@GetMapping("EmpSalary/{Salary}")
	public List<Employee> getBySalary(@PathVariable String Salary) {
		return employeeServices.getBySalary(Salary);
	}

	// adharNo
	@GetMapping("EmpAdharNo/{adharNo}")
	public List<Employee> getByAdharNo(@PathVariable String adharNo) {
		return employeeServices.getByAdharNo(adharNo);
	}

	// email
	@GetMapping("EmpEmail/{email}")
	public List<Employee> getByEmail(@PathVariable String email) {
		return employeeServices.getByEmail(email);
	}

	// gender
	@GetMapping("EmpGender/{gender}")
	public List<Employee> getByGender(@PathVariable String gender) {
		return employeeServices.getByGender(gender);
	}

	// status
	@GetMapping("EmpStatus/{status}")
	public List<Employee> getByStatus(@PathVariable String status) {
		return employeeServices.getByStatus(status);
	}

	// type
	@GetMapping("EmpType/{type}")
	public List<Employee> getByType(@PathVariable String type) {
		return employeeServices.getByType(type);
	}

	// shift
	@GetMapping("EmpShift/{shift}")
	public List<Employee> getByShift(@PathVariable String shift) {
		return employeeServices.getByShift(shift);
	}

	@GetMapping("salarymorethan30000")
	public List<Employee> getSalaryMoreThan30000() {
		return employeeServices.getSalaryMoreThan30000();
	}

	@DeleteMapping("/Empdelete/{id}")
	public String deleteEmpByEmail(@PathVariable String id) {
		return employeeServices.deleteEmpByEmail(id);
	}

	@PutMapping("updateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeServices.updateEmployee(employee);
	}

	@GetMapping("getAllFirstName")
	public List<Employee> getFirstAllName() {
		return employeeServices.getAllFirstName();
	}

	// 32
	@GetMapping("getAllEmail")
	public List<Employee> getAllEmail() {
		return employeeServices.getAllEmail();
	}

	@GetMapping("getAllUsername")
	public List<Employee> getAllUsername() {
		return employeeServices.getAllUsername();
	}

	@GetMapping("specificName")
	public List<Employee> getSpecificRecord() {
		return employeeServices.getSpecificRecord();
	}

	@GetMapping("specificShifAndSalary")
	public List<Employee> getspecificShifAndSalary() {
		return employeeServices.getspecificShifAndSalary();
	}

	@GetMapping("EmployeeInfoExceptPassword")
	public List<Employee> getEmployeeInfoExceptPassword() {
		return employeeServices.getEmployeeInfoExceptPassword();
	}

	@GetMapping("EmployeeShiftTypeSalary")
	public List<Employee> getEmployeeShiftTypeSalary() {
		return employeeServices.getEmployeeShiftTypeSalary();
	}

	@GetMapping("EmployeeEmailNameContactNo")
	public List<Employee> getEmployeeEmailNameContactNo() {
		return employeeServices.getEmployeeEmailNameContactNo();
	}

	@GetMapping("EmployeeAddressAddNODob")
	public List<Employee> getEmployeeAddressAddNODob() {
		return employeeServices.getEmployeeAddressAddNODob();
	}

	@GetMapping("EmployeestatusGender")
	public List<Employee> getConditionalEmp() {
		return employeeServices.getConditionalEmp();
	}

	@GetMapping("EmployeeNameJoinDate")
	public List<Employee> getEmployeeNameJoinDate() {
		return employeeServices.getEmployeeNameJoinDate();
	}

	// getDobGreaterThan2002AndshiftIsEqualToDay()
	@GetMapping("getDobAndshiftIsEqualToDay")
	public List<Employee> getDobAndshiftIsEqualToDay() {
		return employeeServices.getDobAndshiftIsEqualToDay();
	}

}
