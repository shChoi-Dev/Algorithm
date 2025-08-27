package b_designpattern.com.mc.oop.e_game.event;

import java.util.Random;
import java.util.Scanner;

import b_designpattern.com.mc.oop.e_game.item.code.EquipmentData;
import b_designpattern.com.mc.oop.e_game.character.Player;
import b_designpattern.com.mc.oop.e_game.item.Equipment;

public class TreasureEvent implements Event {
	private Random random = new Random();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void occur(Player player) {
		EquipmentData foundItemData = EquipmentData.getRandomFindableItem();
		
		 if (foundItemData == null) {
	            System.out.println("💎 보물상자를 열었지만 아무것도 없었습니다...");
	            return;
	        }
		 
		Equipment newEquipment = foundItemData.create();

		System.out.println("💎 보물상자 발견 이벤트: 상자 안에서 " + newEquipment.getName() + "을(를) 발견했습니다!");
		
		System.out.print("장착하시겠습니까? (yes 또는 true로 동의): ");
		String answer = sc.nextLine();
		
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("true")) {
			player.equip(newEquipment);			
		} else {
			System.out.println("아이템을 장착하지 않았습니다.");
		}
	}

}
