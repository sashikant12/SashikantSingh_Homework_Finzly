package com.finzly.CafeCofee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.CafeCofee.entity.Employee;
import com.finzly.CafeCofee.entity.OrderDetails;
import com.finzly.CafeCofee.service.OrderDetailsServices;

@RestController
public class OrderDetailsController {
	@Autowired
	OrderDetailsServices orderDetailsServices;

	@RequestMapping("Order")
	public String anme() {
		return "ho gyaya";
	}

	@GetMapping("OrderInfo")
	public List<OrderDetails> getOrderInfo() {
		return orderDetailsServices.getOrderInfo();
	}

	@PostMapping("insertOrder")
	public String insertEnployee(@RequestBody OrderDetails orderDetails) {
		return orderDetailsServices.insertOrder(orderDetails);
	}

//Cname,Employee
	@GetMapping("OrderInfo1")
	public List<OrderDetails> getInfo() {
		return orderDetailsServices.getInfo();
	}

//Cname,Employee(E,A)
	@GetMapping("OrderInfo2")
	public List<OrderDetails> getInfo2() {
		return orderDetailsServices.getInfo2();
	}

//Cname,Menu(C,P)
	@GetMapping("OrderInfo3")
	public List<OrderDetails> getInfo3() {
		return orderDetailsServices.getInfo3();
	}

//Employee,Menu
	@GetMapping("OrderInfo4")
	public List<OrderDetails> getInfo4() {
		return orderDetailsServices.getInfo4();
	}

//50
//id
	@GetMapping("OrderInfo5")
	public List<OrderDetails> getInfo5() {
		return orderDetailsServices.getInfo5();
	}

//cname,empname,price
	@GetMapping("OrderInfo6")
	public List<OrderDetails> getInfo6() {
		return orderDetailsServices.getInfo6();
	}

//cname,empname,price
	@GetMapping("OrderInfo7")
	public List<OrderDetails> getInfo7() {
		return orderDetailsServices.getInfo7();
	}

//oid,empUsername,menu
	@GetMapping("OrderInfo8")
	public List<OrderDetails> getInfo8() {
		return orderDetailsServices.getInfo8();
	}

//order,menu
	@GetMapping("OrderInfo9")
	public List<OrderDetails> getInfo9() {
		return orderDetailsServices.getInfo9();
	}

//cname,cnumber,full name,menu name,menu category
	@GetMapping("OrderInfo10")
	public List<OrderDetails> getInfo10() {
		return orderDetailsServices.getInfo10();
	}

//oid,menu
	@GetMapping("OrderInfo11")
	public List<OrderDetails> getInfo11() {
		return orderDetailsServices.getInfo11();
	}

//Emp
	@GetMapping("OrderInfo12")
	public List<OrderDetails> getInfo12() {
		return orderDetailsServices.getInfo12();
	}

//Order
	@GetMapping("OrderInfo13")
	public List<OrderDetails> getInfo13() {
		return orderDetailsServices.getInfo13();
	}

//Menu
	@GetMapping("OrderInfo14")
	public List<OrderDetails> getInfo14() {
		return orderDetailsServices.getInfo14();
	}

//Orderid,empShift,menuPrice
	@GetMapping("OrderInfo15")
	public List<OrderDetails> getInfo15() {
		return orderDetailsServices.getInfo15();
	}

//Orderid,empEmail,empType
	@GetMapping("OrderInfo16")
	public List<OrderDetails> getInfo16() {
		return orderDetailsServices.getInfo16();
	}

//Orderid,empUserane,empShift,menuCategory
	@GetMapping("OrderInfo17")
	public List<OrderDetails> getInfo17() {
		return orderDetailsServices.getInfo17();
	}

//Orderid,empContactNo,empType,menuName
	@GetMapping("OrderInfo18")
	public List<OrderDetails> getInfo18() {
		return orderDetailsServices.getInfo18();
	}

//64
//Orderid,OrderCName,empContactNo,empGender,menuName
	@GetMapping("OrderInfo19")
	public List<OrderDetails> getInfo19() {
		return orderDetailsServices.getInfo19();
	}

//Orderid,priceGreaterThan30
	@GetMapping("OrderInfo20")
	public List<OrderDetails> getInfo20() {
		return orderDetailsServices.getInfo20();
	}

//Orderid,OrderName,priceGreaterThan60
	@GetMapping("OrderInfo21")
	public List<OrderDetails> getInfo21() {
		return orderDetailsServices.getInfo21();
	}

//Orderid,OrderName,priceGreaterThan100
	@GetMapping("OrderInfo22")
	public List<OrderDetails> getInfo22() {
		return orderDetailsServices.getInfo22();
	}

//Orderid,OrderName,priceGreaterThan200
	@GetMapping("OrderInfo23")
	public List<OrderDetails> getInfo23() {
		return orderDetailsServices.getInfo23();
	}

//OrderCName,empSalaryGreater70000
	@GetMapping("OrderInfo24")
	public List<OrderDetails> getInfo24() {
		return orderDetailsServices.getInfo24();
	}

//OrderCName,empSalaryGreater70000&type= manager
	@GetMapping("OrderInfo25")
	public List<OrderDetails> getInfo25() {
		return orderDetailsServices.getInfo25();
	}

//OrderId,empGender=Female&type= manager
	@GetMapping("OrderInfo26")
	public List<OrderDetails> getInfo26() {
		return orderDetailsServices.getInfo26();
	}

//OrderId,empShift=Day&type= manager
	@GetMapping("OrderInfo27")
	public List<OrderDetails> getInfo27() {
		return orderDetailsServices.getInfo27();
	}

//OrderId,empShift=Day&type= manager&&salaryGreater>60000
	@GetMapping("OrderInfo28")
	public List<OrderDetails> getInfo28() {
		return orderDetailsServices.getInfo28();
	}

//OrderId,empShift=Day&type= manager&&salaryGreater>60000&&Gender=male
	@GetMapping("OrderInfo29")
	public List<OrderDetails> getInfo29() {
		return orderDetailsServices.getInfo29();
	}

//OrderId,OrderCustomNo,empShift=Day||type= manager||salaryGreater>60000||Gender=male
	@GetMapping("OrderInfo30")
	public List<OrderDetails> getInfo30() {
		return orderDetailsServices.getInfo30();
	}

//OrderId,OrderCustomNo,priceGreaterThan40,type= manager
	@GetMapping("OrderInfo31")
	public List<OrderDetails> getInfo31() {
		return orderDetailsServices.getInfo31();
	}

//OrderId,OrderCustomNo,priceGreaterThan100,type != manager
	@GetMapping("OrderInfo32")
	public List<OrderDetails> getInfo32() {
		return orderDetailsServices.getInfo32();
	}

//OrderId,OrderCustomNo,Menu category = drinks,Emp Shift day
	@GetMapping("OrderInfo33")
	public List<OrderDetails> getInfo33() {
		return orderDetailsServices.getInfo33();
	}

//OrderId,OrderCustomNo,OrderCName,Menu category != drinks,Emp Shift!= day
	@GetMapping("OrderInfo34")
	public List<OrderDetails> getInfo34() {
		return orderDetailsServices.getInfo34();
	}

//OrderId,OrderCustomNo,OrderCName,Menu price>40,Emp type=manager || Gender==male
	@GetMapping("OrderInfo35")
	public List<OrderDetails> getInfo35() {
		return orderDetailsServices.getInfo35();
	}

	@DeleteMapping("OrderDetail/{id}")
	public String deleteEmpByEmail(@PathVariable int id) {
		return orderDetailsServices.deleteEmpByEmail(id);
	}

//OrderId,OrderCustomNo,OrderCName,Menu price>40,empaddress!=pune
	@GetMapping("OrderInfo36")
	public List<OrderDetails> getInfo36() {
		return orderDetailsServices.getInfo36();
	}

//OrderId,OrderCustomNo,OrderCName,Menu price>60&&emp address!=pune&&status=Married
	@GetMapping("OrderInfo37")
	public List<OrderDetails> getInfo37() {
		return orderDetailsServices.getInfo37();
	}

//OrderId,OrderCustomNo,OrderCName,Menu price>100||emp address!=pune||status=Married
	@GetMapping("OrderInfo38")
	public List<OrderDetails> getInfo38() {
		return orderDetailsServices.getInfo38();
	}

//OrderId,OrderCustomNo,OrderCName,Menu price>100||emp joindate=12-04-2003
	@GetMapping("OrderInfo39")
	public List<OrderDetails> getInfo39() {
		return orderDetailsServices.getInfo39();
	}

//OrderId,OrderCustomNo,OrderCName,Menu price<500,Shift==Night
	@GetMapping("OrderInfo40")
	public List<OrderDetails> getInfo40() {
		return orderDetailsServices.getInfo40();
	}

	@GetMapping("OrderId/{id}")
	public List<OrderDetails> getById(@PathVariable int id) {
		return orderDetailsServices.getById(id);
	}

	@GetMapping("OrdercustomerName/{customerName}")
	public List<OrderDetails> getBycustomerName(@PathVariable String customerName) {
		return orderDetailsServices.getBycustomerName(customerName);
	}

	@GetMapping("OrdercontactNo/{contactNo}")
	public List<OrderDetails> getBycontactNo(@PathVariable String contactNo) {
		return orderDetailsServices.getBycontactNo(contactNo);
	}

//90
//OrderId,OrderCustomNo,OrderCName,Menu price<500,category=Drinks
	@GetMapping("OrderInfo41")
	public List<OrderDetails> getInfo41() {
		return orderDetailsServices.getInfo41();
	}

//OrderId,OrderCustomNo,OrderCName,Menu category=Drinks,Emp email!=null
	@GetMapping("OrderInfo42")
	public List<OrderDetails> getInfo42() {
		return orderDetailsServices.getInfo42();
	}

//Orderid,OrderCName,empContactNo,menuName
	@GetMapping("OrderInfo43")
	public List<OrderDetails> getInfo43() {
		return orderDetailsServices.getInfo43();
	}

//OrderId,OrderCustomNo,OrderCName,Emp email,Username,address
	@GetMapping("OrderInfo44")
	public List<OrderDetails> getInfo44() {
		return orderDetailsServices.getInfo44();
	}

//OrderId,OrderCustomNo,OrderCName,Emp email!=null,Username,address==Pune
	@GetMapping("OrderInfo45")
	public List<OrderDetails> getInfo45() {
		return orderDetailsServices.getInfo45();
	}

//OrderId,OrderCustomNo,OrderCName,Menuid>=2
	@GetMapping("OrderInfo46")
	public List<OrderDetails> getInfo46() {
		return orderDetailsServices.getInfo46();
	}

//OrderId,OrderCustomNo,OrderCName,Empid>1
	@GetMapping("OrderInfo47")
	public List<OrderDetails> getInfo47() {
		return orderDetailsServices.getInfo47();
	}

//OrderId,OrderCustomNo,OrderCName,emp fname,emp lname
	@GetMapping("OrderInfo48")
	public List<OrderDetails> getInfo48() {
		return orderDetailsServices.getInfo48();
	}

//OrderId,OrderCustomNo,OrderCName,emp fname,emp lname,emp Username,Salary
	@GetMapping("OrderInfo49")
	public List<OrderDetails> getInfo49() {
		return orderDetailsServices.getInfo49();
	}

//OrderId,OrderCustomNo,OrderCName,emp fname,emp lname,emp Username,Menu Price>300
	@GetMapping("OrderInfo50")
	public List<OrderDetails> getInfo50() {
		return orderDetailsServices.getInfo50();
	}

//OrderId,OrderCustomNo,OrderCName,emp fname,emp lname,emp Username, Salary<200000
	@GetMapping("OrderInfo51")
	public List<OrderDetails> getInfo51() {
		return orderDetailsServices.getInfo51();
	}

//OrderId,OrderCustomNo,OrderCName,emp fname,emp lname,emp Username, shift=Day
	@GetMapping("OrderInfo52")
	public List<OrderDetails> getInfo52() {
		return orderDetailsServices.getInfo52();
	}

//OrderId,OrderCustomNo,OrderCName,emp fname,emp lname,emp Username, shift=Day,type!=null,Menu name and price>20
	@GetMapping("OrderInfo53")
	public List<OrderDetails> getInfo53() {
		return orderDetailsServices.getInfo53();
	}
}
