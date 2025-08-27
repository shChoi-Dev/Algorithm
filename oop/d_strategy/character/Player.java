package com.mc.oop.d_strategy.character;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.mc.oop.d_strategy.item.Equipment;
import com.mc.oop.d_strategy.item.Slot;

public class Player extends Character{
	
	private Random random = new Random();
	private Map<Slot, Equipment> equipments = new HashMap<Slot, Equipment>();

	public Player(String name, int hp, int atk, int def) {
		super(name, hp, atk, def);
	}

	@Override
	public void attack(Character target) {
		int damage = random.nextInt(atk, atk * 3);
		
		System.out.println("[" + name + "] 공격!");
		for(Equipment e : equipments.values()) {
			damage = e.calAttackWeight(damage);
		}
		
		if(equipments.containsKey(Slot.WEAPON)) {
			System.out.println(equipments.get(Slot.WEAPON).getEffect()); 
		}
		target.takeDamage(damage);
	}

	@Override
	public void takeDamage(int damage) {
		// 피해량 연산
		for(Equipment e : equipments.values()) {
			damage = e.calDefenceWeight(damage);
		}
		System.out.println("[ Damage ] :" + damage);
		
		this.currentHp -= damage;
		this.currentHp = Math.max(currentHp, 0);
	}

	public void equip(Equipment equipment) {
		equipments.put(equipment.getSlot(), equipment);
	}
	
	

}
