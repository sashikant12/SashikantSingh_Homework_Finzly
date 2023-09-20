package com.BBC.Entiity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PaymentMode {
	@Id
	private long id;
	private String paymentType;
	private double discount;
	private  double rate;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getRate() {
		return rate;
	}
	
	

}
