package com.mc.oop.j_adaptor.auth;

import com.mc.oop.j_adaptor.api.google.GoogleApi;
import com.mc.oop.j_adaptor.api.google.GoogleProfile;
import com.mc.oop.j_adaptor.api.naver.NaverApi;
import com.mc.oop.j_adaptor.api.naver.NaverProfile;
import com.mc.oop.j_adaptor.auth.adaptor.GoogleAdaptor;
import com.mc.oop.j_adaptor.auth.adaptor.NaverAdaptor;
import com.mc.oop.j_adaptor.user.UserProfile;

public class AuthService {

	public void socialLogin(SocialLoginProvider provider, String token) {
		SocialLogin socialLogin = switch (provider) {
		case NAVER -> new NaverAdaptor();
		case GOOGLE -> new GoogleAdaptor();
		default -> throw new IllegalArgumentException("Unexpected value: " + provider);
		};
		
		UserProfile userProfile = socialLogin.login(token);
		System.out.println(userProfile.username() + " 로그인 로직 시작");
	}

}
