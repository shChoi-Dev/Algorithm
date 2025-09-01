package com.mc.trpg.domain.event;

import java.util.Scanner;

import com.mc.trpg.domain.character.Player;
import com.mc.trpg.domain.event.code.EventStatus;
import com.mc.trpg.domain.item.Equipment;

public class EquipmentEvent extends Event{
	
	private Equipment equipment;

	public EquipmentEvent(Player player, Equipment equipment) {
		super(player);
		this.equipment = equipment;
	}

	@Override
	public void proceed() {
		Scanner sc = new Scanner(System.in);
		System.out.println("[" + equipment.getName() + "] 장착하시겠습니까?");
		System.out.print("[아무 키 / n] :");
		
		if(sc.next().equalsIgnoreCase("n")) {
			status = EventStatus.PASS;
			System.out.println("[" + equipment.getName() + "] 를 내버려두고 떠납니다.");
			return;
		}
		
		player.equip(equipment);
		status = EventStatus.PASS;
		System.out.println("[" + equipment.getName() + "] 장착했습니다.");
	}

	@Override
	public String desc() {
		return "모험에 필요한 장비를 획득하는 이벤트 입니다.";
	}

	public String getEquipmentName() {
		return this.equipment.getName();
	}

}
