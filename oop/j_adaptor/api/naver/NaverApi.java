package b_designpattern.com.mc.oop.j_adaptor.api.naver;

public class NaverApi {

	public NaverProfile getProfile(String token) {
		return new NaverProfile("안녕_naver","bb@naver.com");
	}
	
}
