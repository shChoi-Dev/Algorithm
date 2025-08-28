package b_designpattern.com.mc.oop.i_proxy;

public class DeveloperProxy implements Developer {

	private Developer developer;
	
	public DeveloperProxy(Developer developer) {
		super();
		this.developer = developer;
	}

	@Override
	public void develop() {
		System.out.println("[system] 출근카드를 찍는다.");
		
		try {
			//핵심 로직
			developer.develop();
		} catch (Exception e) {
			System.out.println("앗 쉬는날이었다.");
		} finally {
			System.out.println("집에 간다.");
		}
		
	}
	
}
