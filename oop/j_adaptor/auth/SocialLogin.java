package b_designpattern.com.mc.oop.j_adaptor.auth;

import b_designpattern.com.mc.oop.j_adaptor.user.UserProfile;

public interface SocialLogin {
	UserProfile login(String token);
	
}
