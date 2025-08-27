package com.mc.coffeemanager.domain.discount.condition;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import com.mc.coffeemanager.domain.order.Order;

public class PeriodCondition implements DiscountCondition{

	private DayOfWeek dayOfWeek;
	private int startTime;
	private int endTime;
	
	public PeriodCondition(DayOfWeek dayOfWeek, int startTime, int endTime) {
		super();
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public boolean isSatisfied(Order order) {
		OffsetDateTime orderTime = order.getOrderTime();
		return orderTime.getDayOfWeek().equals(dayOfWeek)
				&& startTime <= orderTime.getHour()
				&& endTime >= orderTime.getHour();
	}

}
