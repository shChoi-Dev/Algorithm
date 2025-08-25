package b_designpattern.com.mc.oop.a_encapsualtion.method;

public class Player {
	private String instrument;

	public Player(String instrument) {
		super();
		this.instrument = instrument;
	}
	
	public void main() {
		prepare();
		playing();
		stop();
		leave();
		curtainCall();
	}
	
	private void prepare() {
		System.out.println(instrument + " 연주를 준비합니다.");
	}
	
	private void playing() {
		System.out.println(instrument + " 연주를 준비합니다.");
	}
	
	private void stop() {
		System.out.println("연주를 중단합니다.");
	}
	
	private void leave() {
		System.out.println("공연장을 떠납니다.");
	}
	
	private void curtainCall() {
		System.out.println("커튼콜을 진행합니다.");
	}
}
