package com.finzly.CafeCofee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.CafeCofee.doa.CafeDoa;
import com.finzly.CafeCofee.entity.Menu;

@Service
public class CafeService {
	@Autowired
	CafeDoa cafeDoa;

	public List<Menu> cafeInfo() {
		return cafeDoa.getInfo();
	}

	public List<Menu> getByName(String name) {
		return cafeDoa.getByName(name);
	}

	public List<Menu> getByCategory(String Category) {
		return cafeDoa.getByCategory(Category);
	}

	public List<Menu> getById(int id) {
		return cafeDoa.getByCategory(id);
	}

	public List<Menu> getByDrinks() {
		return cafeDoa.getByDrinks();
	}

	public List<Menu> getpriceMoreThan30() {
		return cafeDoa.getpriceMoreThan30();

	}

	public String insertMenu(Menu menu) {
		return cafeDoa.insertMenu(menu);
	}

	public List<Menu> getByPrice(double price) {
		return cafeDoa.getByCategory(price);
	}

	public String deleteEmpByEmail(int id) {
		return cafeDoa.deleteEmpByEmail(id);
	}

	public String updateMenu(Menu menu) {
		return cafeDoa.updateMenu(menu);
	}

	public List<Menu> getpricemorethan30AndDrinkNotEqualSprite() {
		List<Menu> menu = cafeDoa.getpricemorethan30AndDrinkNotEqualSprite();
		List<Menu> al = new ArrayList<>();
		for (Menu m : menu) {
			if (m.getCategory() != "Drinks") {
				al.add(m);
			}

		}
		return al;
	}

}
