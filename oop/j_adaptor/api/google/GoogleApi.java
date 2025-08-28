package b_designpattern.com.mc.oop.j_adaptor.api.google;

public class GoogleApi {
	
	public GoogleProfile getProfile(String token) {
		return new GoogleProfile("안녕도", "aa@google.com");
	}
	
}
