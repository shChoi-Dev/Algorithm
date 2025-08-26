package com.mc.coffeemanager.domain.order;

import java.time.OffsetDateTime;

import com.mc.coffeemanager.domain.account.Account;
import com.mc.coffeemanager.domain.coffee.Coffee;
import com.mc.coffeemanager.domain.purchase.Purchase;

public class Order {
	
	private String name;
	private Coffee coffee;
	private int orderCnt;
	private int orderPrice;
	private OffsetDateTime orderTime;
	private OrderStatus status;
	
	public static Order createOrder(Coffee coffee, int orderCnt, Account account) {
		
		Order order = new Order(coffee, orderCnt);
		
		if(orderCnt > coffee.getStock()) {
			Purchase purchase = new Purchase(coffee, orderCnt);
			if(!purchase.proceed()) {
				order.status = OrderStatus.FAIL_SOLD_OUT;
				return order;
			}
		}
		
		order.status = OrderStatus.OK;
		return order;
	}
	
	private Order(Coffee coffee, int orderCnt) {
		this.name = coffee.getName() + "[" + orderCnt + "]";
		this.coffee = coffee;
		this.orderCnt = orderCnt;
		this.orderPrice = coffee.getPrice() * orderCnt;
		this.orderTime = OffsetDateTime.now();
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public String getName() {
		return name;
	}
	public Coffee getCoffee() {
		return coffee;
	}
	public int getOrderCnt() {
		return orderCnt;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public OffsetDateTime getOrderTime() {
		return orderTime;
	}

	public void proceed() {
		coffee.provide(orderCnt);
	}
	
	

}
