package b_designpattern.com.mc.oop.a_encapsualtion.method;

public class AutumnConcert {
	public void start() {
		System.out.println("AutumnConcert 시작합니다. ^^ ********");
		Player player = new Player("바이올린");
		player.main();
		System.out.println("====================================");
	}
}
