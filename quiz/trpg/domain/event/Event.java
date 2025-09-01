package com.mc.trpg.domain.event;

import com.mc.trpg.domain.character.Player;
import com.mc.trpg.domain.event.code.EventStatus;

public abstract class Event{

	protected EventStatus status = EventStatus.PENDING;
	protected Player player;
	
	public Event(Player player) {
		super();
		this.player = player;
	}

	public abstract void proceed();
	
	public EventStatus status() {
		return status;
	}
	
	public abstract String desc();
	
	
}
