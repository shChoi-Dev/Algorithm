package com.mc.trpg.presentation;

import java.util.Scanner;

import com.mc.trpg.domain.character.Player;
import com.mc.trpg.domain.stage.Stage;
import com.mc.trpg.domain.stage.data.Stages;
import com.mc.trpg.domain.stage.data.StageEquipmentData;
import com.mc.trpg.domain.stage.data.StageMonsterData;

public class Menu {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임 : ");
		String nickname = sc.nextLine();
		
		System.out.println("===============================================");
		System.out.println(" * Stage 를 선택하세요.");
		
		Stages[] stages = Stages.values();
		
		for (int i = 0; i < stages.length; i++) {
			System.out.println(stages[i] + "[" + i + "]");
		}
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		String name = stages[input].name();
		
		System.out.println("===============================================");
		
		Stage stage = new Stage( 
				stages[input],
				new Player(nickname, 300, 100, 50),
				StageEquipmentData.valueOf(name), 
				StageMonsterData.valueOf(name));
		
		stage.start();
	}

}
