package b_designpattern.com.mc.oop.e_game.event;

import java.util.Random;
import java.util.Scanner;

import b_designpattern.com.mc.oop.e_game.character.Monster;
import b_designpattern.com.mc.oop.e_game.character.Player;
import b_designpattern.com.mc.oop.e_game.character.code.MonsterData;

public class CombatEvent implements Event {
	private Scanner sc = new Scanner(System.in);
	private Random random = new Random();

	@Override
	public void occur(Player player) {
		MonsterData[] monsters = MonsterData.values();
		MonsterData randomMonsterData = monsters[random.nextInt(monsters.length)];
		Monster monster = randomMonsterData.create();

		System.out.println("👹 전투 이벤트: " + monster.getName() + "(이)가 나타났다!");

		while (true) {
			System.out.println("\n--------------------------------------------");
			System.out.println("Enter를 눌러 몬스터를 공격하세요.");
			sc.nextLine();

			player.attack(monster);
			if (monster.isDead()) {
				System.out.println(monster.getName() + "을(를) 물리쳤습니다!");
				break;
			}

			monster.attack(player);
			if (player.isDead()) {
				break;
			}

			System.out.println("\n[현재 상태]");
			System.out.println(player.getName() + " HP: " + player.getCurrentHp());
			System.out.println(monster.getName() + " HP: " + monster.getCurrentHp());
		}
	}
}
