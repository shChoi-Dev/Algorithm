package com.mc.oop.d_strategy;

import java.util.Scanner;

import com.mc.oop.d_strategy.character.Monster;
import com.mc.oop.d_strategy.character.Player;
import com.mc.oop.d_strategy.item.Equipment;
import com.mc.oop.d_strategy.item.Slot;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Player player = new Player("지존짱짱맨", 200, 30, 10);
		Monster monster = new Monster("슬라임", 200, 30, 10);
		
		System.out.println("[전투이벤트] " + monster.getName() + " 등장!");
		boolean eventFlg = true;
		while(true) {
			
			if(player.isDead()) {
				System.out.println("\n======================================");
				System.out.println("[결과] LOSE");
				break;
			}
			
			if(monster.isDead()) {
				System.out.println("\n======================================");
				System.out.println("[결과] WIN");
				break;
			}
			
			System.out.println("\n======================================");
			sc.nextLine();
			
			if(player.getCurrentHp() < 150) {
				if(eventFlg) {
					Equipment equipment = new Equipment("목검", 10, 1, Slot.WEAPON, "목검을 휘두릅니다.");
					player.equip(equipment);
					eventFlg = false;
				}
			}
			
			player.attack(monster);
			monster.attack(player);
			System.out.println("------------------------------------");
			System.out.println("[" + player.getName() + " HP ] : " + player.getCurrentHp());
			System.out.println("[" + monster.getName() + " HP ] : " + monster.getCurrentHp());
		}
	}

}
