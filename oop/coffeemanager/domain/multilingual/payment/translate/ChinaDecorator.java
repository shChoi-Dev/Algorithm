package com.mc.coffeemanager.domain.multilingual.payment.translate;

import com.mc.coffeemanager.domain.payment.Payment;

public class ChinaDecorator extends PaymentDecorator {

	public ChinaDecorator(Translatable<Payment> target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String translate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment origin() {
		// TODO Auto-generated method stub
		return null;
	}

}
