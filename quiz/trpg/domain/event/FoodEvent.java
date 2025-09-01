package com.mc.trpg.domain.event;

import com.mc.trpg.domain.character.Player;
import com.mc.trpg.domain.event.code.EventStatus;

public class FoodEvent extends Event{
	
	public FoodEvent(Player player) {
		super(player);
	}

	@Override
	public void proceed() {
		System.out.println("체력을 모두 회복합니다.");
		player.restore();
		status = EventStatus.PASS;
	}

	@Override
	public String desc() {
		return "플레이어의 모든 체력을 회복합니다.";
	}

}
