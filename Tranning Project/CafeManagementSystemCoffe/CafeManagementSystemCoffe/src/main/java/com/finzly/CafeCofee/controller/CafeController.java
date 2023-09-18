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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.CafeCofee.entity.Employee;
import com.finzly.CafeCofee.entity.Menu;
import com.finzly.CafeCofee.service.CafeService;

@RestController
public class CafeController {
	@Autowired
	CafeService cafeService;

	@RequestMapping("name")
	public String checkApi() {
		return "ho gya";
	}

	@GetMapping("menuInfo")
	public List<Menu> cafeInfo() {
		return cafeService.cafeInfo();
	}

	@GetMapping("Menuae/{name}")
	public List<Menu> getByName(@PathVariable String name) {
		return cafeService.getByName(name);
	}

	@GetMapping("Menu/{category}")
	public List<Menu> getByCategory(@PathVariable String category) {
		return cafeService.getByCategory(category);
	}

	@GetMapping("Meniu/{id}")
	public List<Menu> getById(@PathVariable int id) {
		return cafeService.getById(id);
	}

	@GetMapping("Menie/{price}")
	public List<Menu> getByPrice(@PathVariable double price) {
		return cafeService.getByPrice(price);
	}

	@GetMapping("bydrinks")
	public List<Menu> getByDrinks() {
		return cafeService.getByDrinks();
	}

	@GetMapping("pricemorethan30")
	public List<Menu> getpriceMoreThan30() {
		return cafeService.getpriceMoreThan30();
	}

	@PostMapping("insertMenu")
	public String insertMenu(@RequestBody Menu menu) {
		return cafeService.insertMenu(menu);
	}

	@DeleteMapping("/menuDelete/{id}")
	public String deleteEmpById(@PathVariable int id) {
		return cafeService.deleteEmpByEmail(id);
	}

	@PutMapping("updateMenu")
	public String updateMenu(@RequestBody Menu menu) {
		return cafeService.updateMenu(menu);
	}

	@GetMapping("pricemorethan30AndDrinkNotEqualSprite")
	public List<Menu> getpricemorethan30AndDrinkNotEqualSprite() {
		return cafeService.getpricemorethan30AndDrinkNotEqualSprite();
	}
}
//12