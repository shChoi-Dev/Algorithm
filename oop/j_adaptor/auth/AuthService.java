package b_designpattern.com.mc.oop.j_adaptor.auth;

import b_designpattern.com.mc.oop.j_adaptor.auth.adaptor.GoogleAdaptor;
import b_designpattern.com.mc.oop.j_adaptor.auth.adaptor.NaverAdaptor;
import b_designpattern.com.mc.oop.j_adaptor.api.google.GoogleApi;
import b_designpattern.com.mc.oop.j_adaptor.api.google.GoogleProfile;
import b_designpattern.com.mc.oop.j_adaptor.api.naver.NaverApi;
import b_designpattern.com.mc.oop.j_adaptor.api.naver.NaverProfile;
import b_designpattern.com.mc.oop.j_adaptor.user.UserProfile;

public class AuthService {

	public void socialLogin(SocialLoginProvider provider, String token) {
		GoogleProfile profile = new GoogleApi().getProfile(token);

		SocialLogin socialLogin = switch (provider) {
		case NAVER -> new NaverAdaptor();
		case GOOGLE -> new GoogleAdaptor();
		default -> throw new IllegalArgumentException("Unexpected value : " + provider);
		};
		
		UserProfile UserProfile = socialLogin.login(token);
		System.out.println(UserProfile.username() + " 로그인 로직 시작");
	}

}
