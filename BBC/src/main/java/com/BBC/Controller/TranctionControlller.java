package com.BBC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BBC.Entiity.Tranction;
import com.BBC.Services.TranctionServices;

@RestController
public class TranctionControlller {
	@Autowired
	TranctionServices tranctionServices;

	@RequestMapping("memo")
	public String minu() {
		return "Olle Olle Olle";
	}

	@GetMapping("getAlltranction")
	public List<Tranction> getAlltranction() {
		return tranctionServices.getAlltranction();
	}

	@GetMapping("getAlltranctionByIdForPending/{id}")
	public List<Tranction> getAlltranctionByIdForPending(@PathVariable long id) {
		return tranctionServices.getAlltranctionByIdForPending(id);
	}

	@GetMapping("setAlltranctionByIdAndPaymentId/{id}/{tId}/{pId}")
	public String setAlltranctionByIdAndPaymentId(@PathVariable long id, @PathVariable long tId,
			@PathVariable long pId) {
		return tranctionServices.setAlltranctionByIdAndPaymentId(id, tId, pId);
	}

	@GetMapping("getAlltranctionBill/{id}/{tId}")
	public List<Tranction> getAlltranctionById(@PathVariable long id, @PathVariable long tId) {
		return tranctionServices.getAlltranctionBill(id, tId);
	}

	@GetMapping("getAlltranctionPaymentUpdate/{id}/{tId}")
	public String getAlltranctionPaymentUpdate(@PathVariable long id, @PathVariable long tId) {
		return tranctionServices.getAlltranctionPaymentUpdate(id, tId);
	}
}
