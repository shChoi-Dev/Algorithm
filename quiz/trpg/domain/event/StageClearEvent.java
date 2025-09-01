package com.mc.trpg.domain.event;

import java.util.List;

import com.mc.trpg.domain.character.Player;
import com.mc.trpg.domain.event.code.EventStatus;

public class StageClearEvent extends Event{

	private List<Event> evnets;
	
	public StageClearEvent(Player player, List<Event> evnets) {
		super(player);
		this.evnets = evnets;
	}

	@Override
	public void proceed() {
		for (Event event : evnets) {
			System.out.println("=========================");
			event.proceed();
		}
		
		status = EventStatus.PASS;
	}

	@Override
	public String desc() {
		return "스테이지 클리어 보상 이벤트 입니다.";
	}

}
