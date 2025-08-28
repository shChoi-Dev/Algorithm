package com.mc.oop.j_adaptor.auth.adaptor;

import com.mc.oop.j_adaptor.api.naver.NaverApi;
import com.mc.oop.j_adaptor.api.naver.NaverProfile;
import com.mc.oop.j_adaptor.auth.SocialLogin;
import com.mc.oop.j_adaptor.user.UserProfile;

public class NaverAdaptor implements SocialLogin{

	private final NaverApi api = new NaverApi();
	
	@Override
	public UserProfile login(String token) {
		NaverProfile profile = api.getProfile(token);
		return new UserProfile(profile.name(), profile.mail());
	}

}
