package b_designpattern.com.mc.oop.e_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import b_designpattern.com.mc.oop.e_game.character.Player;
import b_designpattern.com.mc.oop.e_game.event.CombatEvent;
import b_designpattern.com.mc.oop.e_game.event.Event;
import b_designpattern.com.mc.oop.e_game.event.FoodEvent;
import b_designpattern.com.mc.oop.e_game.event.TreasureEvent;

public class RunGame {

	private static Scanner sc = new Scanner(System.in);
	private static Random random = new Random();
	private static Player player;

	private static List<Event> events = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.print("모험을 떠날 용사의 이름을 입력해주세요: ");
		String playerName = sc.nextLine();
		
		if (playerName.isBlank()) {
			playerName = "용사";
		}
		
		player = new Player(playerName, 200, 30, 10);
		
		initializeEvents();
		
		System.out.println("=========================================");
		System.out.println(player.getName() + "(이)가 8일간의 모험을 떠납니다.  Enter 키를 눌러 진행하세요.");
		sc.nextLine();

		// 8일간의 모험 시작
		for (int day = 1; day <= 8; day++) {
			System.out.println("\n==================[ " + day + "일차 ]==================");

			Event todayEvent;
			// 마지막 날에는 반드시 전투 이벤트 발생
			if (day == 8) {
				System.out.println("마지막 날입니다. 최종 전투가 시작됩니다!");
				todayEvent = new CombatEvent();
			} else {
				todayEvent = events.get(random.nextInt(events.size()));
			}

			todayEvent.occur(player);
			
			// 용사의 HP가 0이 되면 모험 실패로 종료
			if (player.isDead()) {
				System.out.println("\n=========================================");
				System.out.println("GAME OVER... \n모험에 실패했습니다.");
				return;
			}

			if (day < 8) {
				System.out.println("\n하루가 저물었습니다. Enter를 눌러 다음 날로 이동합니다.");
				sc.nextLine();
			}
		}

		// 모든 이벤트를 완료하면 모험이 성공으로 종료
		System.out.println("\n=========================================");
		System.out.println("CONGRATULATIONS! 8일간의 모험을 무사히 마쳤습니다!");
	}

	private static void initializeEvents() {
		events.add(new CombatEvent());
		events.add(new TreasureEvent());
		events.add(new FoodEvent());
	}
}