package com.finzly.CafeCofee.service;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.CafeCofee.doa.OrderDetailsDoa;
import com.finzly.CafeCofee.entity.Employee;
import com.finzly.CafeCofee.entity.Menu;
import com.finzly.CafeCofee.entity.OrderDetails;

@Service
public class OrderDetailsServices {
	@Autowired
	OrderDetailsDoa orderDetailsDoa;

	public List<OrderDetails> getOrderInfo() {
		return orderDetailsDoa.getOrderInfo();

	}

	public String insertOrder(OrderDetails orderDetails) {
		return orderDetailsDoa.insertOrder(orderDetails);
	}

	public List<OrderDetails> getInfo() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			Employee fname = book.getEmployee();
			String lname = book.getCustomerName();
			String joinDate = book.getCustomerName();
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(fname);
			orderDetails.setCustomerName(lname);
			orderDetails.setCustomerName(joinDate);
			al.add(orderDetails);
		}
		return al;

	}

	public List<OrderDetails> getInfo2() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			Employee emp = book.getEmployee();
			String address = emp.getAddress();
			String email = emp.getEmail();
			Employee empl = new Employee();
			empl.setAddress(address);
			empl.setEmail(email);
			String lname = book.getCustomerName();
			String joinDate = book.getCustomerName();
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(empl);
			orderDetails.setCustomerName(lname);
			orderDetails.setCustomerName(joinDate);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo3() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			Menu emp = book.getMenu();
			String category = emp.getCategory();
			double price = emp.getPrice();
			Menu menu = new Menu();
			menu.setCategory(category);
			menu.setPrice(price);
			String lname = book.getCustomerName();
			String joinDate = book.getCustomerName();
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(menu);
			orderDetails.setCustomerName(lname);
			orderDetails.setCustomerName(joinDate);
			al.add(orderDetails);
		}
		return al;

	}

	public List<OrderDetails> getInfo4() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			Menu menu = book.getMenu();
			Employee emp = book.getEmployee();
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(menu);
			orderDetails.setEmployee(emp);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo5() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int OrderId = book.getOrderId();
			Menu menu = book.getMenu();
			int menuId = menu.getId();
			Employee emp = book.getEmployee();
			String empId = emp.getId();
			Menu mainMenu = new Menu();
			Employee employee = new Employee();
			mainMenu.setId(menuId);
			employee.setId(empId);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(OrderId);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo6() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			String CustomerName = book.getCustomerName();
			Menu menu = book.getMenu();
			double menuPrice = menu.getPrice();
			Employee emp = book.getEmployee();
			String empName = emp.getFirstName();
			Menu mainMenu = new Menu();
			Employee employee = new Employee();
			mainMenu.setPrice(menuPrice);
			employee.setFirstName(empName);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setEmployee(employee);
			orderDetails.setCustomerName(CustomerName);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo7() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			String CustomerName = book.getCustomerName();
			String CustomerNumber = book.getContactNo();
			Menu menu = book.getMenu();
			String category = menu.getCategory();
			Employee emp = book.getEmployee();
			String empName = emp.getFirstName();
			Menu mainMenu = new Menu();
			Employee employee = new Employee();
			mainMenu.setCategory(category);
			employee.setFirstName(empName);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setEmployee(employee);
			orderDetails.setCustomerName(CustomerName);
			orderDetails.setContactNo(CustomerNumber);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo8() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			Menu menu = book.getMenu();
			Employee emp = book.getEmployee();
			String empUser = emp.getUsername();
			Employee employee = new Employee();
			employee.setUsername(empUser);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(menu);
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo9() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String CustomerName = book.getCustomerName();
			String CustomerNumber = book.getContactNo();
			Menu menu = book.getMenu();
			String category = menu.getCategory();
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(menu);
			orderDetails.setCustomerName(CustomerName);
			orderDetails.setContactNo(CustomerNumber);
			orderDetails.setOrderId(id);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo10() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			String CustomerName = book.getCustomerName();
			String CustomerNumber = book.getContactNo();
			Menu menu = book.getMenu();
			String category = menu.getCategory();
			String name = menu.getName();
			Employee emp = book.getEmployee();
			String empName = emp.getFirstName();
			String lname = emp.getLastName();
			Menu mainMenu = new Menu();
			mainMenu.setCategory(category);
			mainMenu.setName(name);
			Employee employee = new Employee();
			employee.setFirstName(empName);
			employee.setLastName(lname);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setEmployee(employee);
			orderDetails.setCustomerName(CustomerName);
			orderDetails.setContactNo(CustomerNumber);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo11() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			Menu menu = book.getMenu();
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(menu);
			orderDetails.setOrderId(id);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo12() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			Employee emp = book.getEmployee();
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(emp);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo13() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			Menu menu = book.getMenu();
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(menu);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo14() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String contact = book.getContactNo();
			String customerName = book.getCustomerName();
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setContactNo(contact);
			orderDetails.setCustomerName(customerName);
			orderDetails.setOrderId(id);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo15() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int oId = book.getOrderId();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			Menu mainMenu = new Menu();
			mainMenu.setPrice(price);
			Employee employee = new Employee();
			employee.setShift(shift);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(oId);
			al.add(orderDetails);
		}
		return al;
	}

//Orderid,empEmail,empType
	public List<OrderDetails> getInfo16() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int oId = book.getOrderId();
			Employee emp = book.getEmployee();
			String type = emp.getType();
			String email = emp.getEmail();
			Employee employee = new Employee();
			employee.setType(type);
			employee.setEmail(email);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(oId);
			al.add(orderDetails);
		}
		return al;
	}

//Orderid,empUserane,empShift,menuCategory
	public List<OrderDetails> getInfo17() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int oId = book.getOrderId();
			Menu menu = book.getMenu();
			String category = menu.getCategory();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			String username = emp.getUsername();
			Menu mainMenu = new Menu();
			mainMenu.setCategory(category);
			Employee employee = new Employee();
			employee.setShift(shift);
			employee.setUsername(username);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(oId);
			al.add(orderDetails);
		}
		return al;
	}

//Orderid,empContactNo,empType,menuName
	public List<OrderDetails> getInfo18() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int oId = book.getOrderId();
			Menu menu = book.getMenu();
			String name = menu.getName();
			Employee emp = book.getEmployee();
			String contact = emp.getContactNo();
			String type = emp.getType();
			Menu mainMenu = new Menu();
			mainMenu.setName(name);
			Employee employee = new Employee();
			employee.setType(type);
			employee.setContactNo(contact);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(oId);
			al.add(orderDetails);
		}
		return al;
	}

//Orderid,OrderCName,empContactNo,empGender,menuName
	public List<OrderDetails> getInfo19() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int oId = book.getOrderId();
			String name = book.getCustomerName();
			Menu menu = book.getMenu();
			String MenuName = menu.getName();
			Employee emp = book.getEmployee();
			String contact = emp.getContactNo();
			String gender = emp.getGender();
			Menu mainMenu = new Menu();
			mainMenu.setName(MenuName);
			Employee employee = new Employee();
			employee.setGender(gender);
			employee.setContactNo(contact);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(oId);
			al.add(orderDetails);
		}
		return al;
	}
//Orderid,priceGreaterThan30

	public List<OrderDetails> getInfo20() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int oId = book.getOrderId();
			String name = book.getCustomerName();
			Menu menu = book.getMenu();
			double menuPrice = menu.getPrice();
			Menu mainMenu = new Menu();
			if (menuPrice > 30) {
				mainMenu.setPrice(menuPrice);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setOrderId(oId);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo21() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int oId = book.getOrderId();
			String name = book.getCustomerName();
			Menu menu = book.getMenu();
			double menuPrice = menu.getPrice();
			Menu mainMenu = new Menu();
			if (menuPrice > 50) {
				mainMenu.setPrice(menuPrice);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setOrderId(oId);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo22() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int oId = book.getOrderId();
			String name = book.getCustomerName();
			Menu menu = book.getMenu();
			double menuPrice = menu.getPrice();
			Menu mainMenu = new Menu();
			if (menuPrice > 100) {
				mainMenu.setPrice(menuPrice);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setOrderId(oId);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo23() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			String name = book.getCustomerName();
			Menu menu = book.getMenu();
			double menuPrice = menu.getPrice();
			Menu mainMenu = new Menu();
			if (menuPrice > 200) {
				mainMenu.setPrice(menuPrice);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo24() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			String name = book.getCustomerName();
			Menu menu = book.getMenu();
			Employee emp = book.getEmployee();
			String salary = emp.getSalary();
			Employee employee = new Employee();
			if (Integer.parseInt(salary) >= 70000) {
				employee.setSalary(salary);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo25() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String salary = emp.getSalary();
			String type = emp.getType();
			Employee employee = new Employee();
			if (Integer.parseInt(salary) >= 70000 && type == "Manager") {
				employee.setSalary(salary);
				employee.setType(type);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}
//OrderId,empGender=Female&type= manager

	public List<OrderDetails> getInfo26() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			Employee emp = book.getEmployee();
			String gender = emp.getGender();
			String type = emp.getType();
			Employee employee = new Employee();
			if (gender == "Male" && type == "Manager") {
				employee.setGender(gender);
				employee.setType(type);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			al.add(orderDetails);
		}
		return al;
	}

//OrderId,empShift=Day&type= manager
	public List<OrderDetails> getInfo27() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			String type = emp.getType();
			Employee employee = new Employee();
			if (shift == "Day" && type == "Manager") {
				employee.setSalary(shift);
				employee.setType(type);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo28() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			String type = emp.getType();
			String salary = emp.getSalary();
			Employee employee = new Employee();
			if (shift == "Day" && type == "Manager" && Integer.parseInt(salary) >= 70000) {
				employee.setSalary(shift);
				employee.setType(type);
				employee.setSalary(salary);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo29() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			String type = emp.getType();
			String salary = emp.getSalary();
			String gender = emp.getGender();
			Employee employee = new Employee();
			if (shift == "Day" && type == "Manager" && Integer.parseInt(salary) >= 70000 && gender == "Male") {
				employee.setSalary(shift);
				employee.setType(type);
				employee.setSalary(salary);
				employee.setGender(gender);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo30() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			String type = emp.getType();
			String salary = emp.getSalary();
			String gender = emp.getGender();
			Employee employee = new Employee();
			if (shift == "Day" || type == "Manager" || Integer.parseInt(salary) >= 70000 || gender == "Male") {
				employee.setSalary(shift);
				employee.setType(type);
				employee.setSalary(salary);
				employee.setGender(gender);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			al.add(orderDetails);
		}
		return al;
	}

//OrderId,OrderCustomNo,priceGreaterThan40,type= manager
	public List<OrderDetails> getInfo31() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			Employee emp = book.getEmployee();
			String type = emp.getType();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (type == "Manager" && price > 40) {
				employee.setType(type);
				menuMain.setPrice(price);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo32() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			Employee emp = book.getEmployee();
			String type = emp.getType();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (type != "Manager" && price > 100) {
				employee.setType(type);
				menuMain.setPrice(price);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo33() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			Menu menu = book.getMenu();
			String category = menu.getCategory();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (shift == "Day" && category == "Drinks") {
				employee.setShift(shift);
				menuMain.setCategory(category);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo34() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			Menu menu = book.getMenu();
			String category = menu.getCategory();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (shift != "Day" && category != "Drinks") {
				employee.setShift(shift);
				menuMain.setCategory(category);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

//OrderId,OrderCustomNo,OrderCName,Menu price>40,Emp type=Cheif  Gender=male
	public List<OrderDetails> getInfo35() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String type = emp.getType();
			String gender = emp.getAddress();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (type != "Cheif" && price > 40) {
				employee.setType(type);
				menuMain.setPrice(price);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public String deleteEmpByEmail(int id) {
		return deleteEmpByEmail(id);
	}

//OrderId,OrderCustomNo,OrderCName,Menu price>40,empaddress=pune
	public List<OrderDetails> getInfo36() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String address = emp.getAddress();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (address != "Pune" && price > 40) {
				employee.setAddress(address);
				menuMain.setPrice(price);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo37() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String address = emp.getAddress();
			String status = emp.getStatus();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (address != "Pune" && price > 60 && status == "Married") {
				employee.setAddress(address);
				employee.setStatus(status);
				menuMain.setPrice(price);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo38() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String address = emp.getAddress();
			String status = emp.getStatus();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (address != "Pune" || price > 100 || status == "Married") {
				employee.setAddress(address);
				employee.setStatus(status);
				menuMain.setPrice(price);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}
//OrderId,OrderCustomNo,OrderCName,Menu price>100||emp joindate=12-04-2003

	public List<OrderDetails> getInfo39() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String joinDate = emp.getJoinDate();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (joinDate == "12-04-2002" || price > 100) {
				employee.setJoinDate(joinDate);
				menuMain.setPrice(price);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo40() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (shift == "Night" && price < 500) {
				employee.setSalary(shift);
				menuMain.setPrice(price);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getById(int id) {
		return orderDetailsDoa.getByID(id);
	}

	public List<OrderDetails> getBycustomerName(String customerName) {
		return orderDetailsDoa.getBycustomerName(customerName);
	}

	public List<OrderDetails> getBycontactNo(String contactNo) {
		return orderDetailsDoa.getBycontactNo(contactNo);
	}

	public List<OrderDetails> getInfo41() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			String category = menu.getCategory();
			Employee employee = new Employee();
			Menu menuMain = new Menu();
			if (price < 500 && category != "Drinks") {
				menuMain.setPrice(price);
				menuMain.setCategory(category);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(menuMain);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo42() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String shift = emp.getShift();
			String email = emp.getEmail();
			Employee employee = new Employee();
			if (shift == "Night" && email != null) {
				employee.setSalary(shift);
				employee.setEmail(email);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo43() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int oId = book.getOrderId();
			String name = book.getCustomerName();
			Menu menu = book.getMenu();
			String MenuName = menu.getName();
			Employee emp = book.getEmployee();
			String contact = emp.getContactNo();
			Menu mainMenu = new Menu();
			mainMenu.setName(MenuName);
			Employee employee = new Employee();
			employee.setContactNo(contact);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(mainMenu);
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(oId);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo44() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String username = emp.getUsername();
			String email = emp.getEmail();
			String address = emp.getAddress();
			Employee employee = new Employee();
			employee.setEmail(email);
			employee.setAddress(address);
			employee.setUsername(username);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	// OrderId,OrderCustomNo,OrderCName,Emp email!=null,Username,address==Pune
	public List<OrderDetails> getInfo45() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String username = emp.getUsername();
			String email = emp.getEmail();
			String address = emp.getAddress();
			Employee employee = new Employee();
			if (email != null || address == "Pune") {
				employee.setEmail(email);
				employee.setAddress(address);
				employee.setUsername(username);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	// OrderId,OrderCustomNo,OrderCName,Menuid>=2
	public List<OrderDetails> getInfo46() {
		// TODO Auto-generated method stub
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Menu menu = book.getMenu();
			int idMenu = menu.getId();
			Menu maimMenu = new Menu();
			if (idMenu >= 2) {
				maimMenu.setId(idMenu);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setMenu(maimMenu);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	// OrderId,OrderCustomNo,OrderCName,Empid>1
	public List<OrderDetails> getInfo47() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String empId = emp.getId();
			Employee employee = new Employee();
			if (Integer.parseInt(empId) > 2) {
				employee.setId(empId);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo48() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String fname = emp.getFirstName();
			String lname = emp.getLastName();

			Employee employee = new Employee();
			employee.setFirstName(fname);
			employee.setLastName(lname);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo49() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String fname = emp.getFirstName();
			String lname = emp.getLastName();
			String username = emp.getUsername();
			String salary = emp.getSalary();
			Employee employee = new Employee();
			employee.setFirstName(fname);
			employee.setLastName(lname);
			employee.setUsername(username);
			employee.setSalary(salary);
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo50() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String fname = emp.getFirstName();
			String lname = emp.getLastName();
			String username = emp.getUsername();
			String salary = emp.getSalary();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			Employee employee = new Employee();
			Menu mainMenu = new Menu();
			if (price > 3000) {
				mainMenu.setPrice(price);
				employee.setFirstName(fname);
				employee.setLastName(lname);
				employee.setUsername(username);
				employee.setSalary(salary);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(mainMenu);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo51() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String fname = emp.getFirstName();
			String lname = emp.getLastName();
			String username = emp.getUsername();
			String salary = emp.getSalary();

			Employee employee = new Employee();
			if (Integer.parseInt(salary) < 200000) {
				employee.setSalary(salary);
				employee.setFirstName(fname);
				employee.setLastName(lname);
				employee.setUsername(username);

			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	public List<OrderDetails> getInfo52() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String fname = emp.getFirstName();
			String lname = emp.getLastName();
			String username = emp.getUsername();
			String salary = emp.getSalary();
			String shift = emp.getShift();
			Employee employee = new Employee();
			if (shift == "Day") {
				employee.setSalary(salary);
				employee.setFirstName(fname);
				employee.setLastName(lname);
				employee.setUsername(username);
				employee.setShift(shift);

			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

	// OrderId,OrderCustomNo,OrderCName,emp fname,emp lname,emp Username,
	// shift=Day,type!=null,Menu name and price>20
	public List<OrderDetails> getInfo53() {
		List<OrderDetails> list = orderDetailsDoa.getInfo();
		List<OrderDetails> al = new ArrayList<>();
		for (OrderDetails book : list) {
			int id = book.getOrderId();
			String customerNo = book.getContactNo();
			String name = book.getCustomerName();
			Employee emp = book.getEmployee();
			String fname = emp.getFirstName();
			String lname = emp.getLastName();
			String username = emp.getUsername();
			String salary = emp.getSalary();
			String shift = emp.getShift();
			String type = emp.getType();
			Menu menu = book.getMenu();
			double price = menu.getPrice();
			String menuName = menu.getName();
			Employee employee = new Employee();
			Menu mainMenu = new Menu();
			if (shift == "Day" || type != null || price > 200) {
				employee.setSalary(salary);
				employee.setFirstName(fname);
				employee.setLastName(lname);
				employee.setUsername(username);
				employee.setShift(shift);
				mainMenu.setPrice(price);
				mainMenu.setName(menuName);
			}
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setEmployee(employee);
			orderDetails.setMenu(mainMenu);
			orderDetails.setOrderId(id);
			orderDetails.setContactNo(customerNo);
			orderDetails.setCustomerName(name);
			al.add(orderDetails);
		}
		return al;
	}

}
