package b_designpattern.com.mc.oop.e_game.event;

import java.util.Random;
import java.util.Scanner;

import b_designpattern.com.mc.oop.e_game.character.Player;

public class FoodEvent implements Event {
	private Random random = new Random();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void occur(Player player) {
		System.out.println("🍲 먹거리 발견 이벤트: HP를 회복시켜줄 음식을 발견했습니다!");

		System.out.print("드시겠습니까? (yes 또는 true로 동의): ");
		String answer = sc.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("true")) {
			int healAmount = random.nextInt(20, 51);
			player.heal(healAmount);
		} else {
			System.out.println("음식을 먹지 않고 앞으로 나아갔습니다.");
		}
	}
}
