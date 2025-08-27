package b_designpattern.com.mc.oop.e_game.character.code;

import b_designpattern.com.mc.oop.e_game.character.Monster;

public enum MonsterData {
	SLIME("슬라임", 80, 15, 5), 
	GOBLIN("고블린", 120, 25, 10), 
	ORC("오크", 180, 35, 15), 
	SKELETON("스켈레톤", 150, 30, 20),
	GOLEM("골렘", 250, 20, 30);
	
	private final String name;
    private final int hp;
    private final int atk;
    private final int def;
    
    MonsterData(String name, int hp, int atk, int def) {
    	this.name = name;
    	this.hp = hp;
    	this.atk = atk;
    	this.def = def;
    }
    
    public Monster create() {
    	return new Monster(name, hp, atk, def);
    }
}
