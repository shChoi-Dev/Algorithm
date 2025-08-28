package com.mc.oop.j_adaptor.auth;

import com.mc.oop.j_adaptor.user.UserProfile;

public interface SocialLogin {
	UserProfile login(String token);
}
