package b_designpattern.com.mc.oop.a_encapsualtion.method;

public class SpringConcert {
	public void start() {
		System.out.println("Spring concert 시작합니다. ^^ ********");
		Player player = new Player("바이올린");
		player.main();
		System.out.println("====================================");
	}
}
