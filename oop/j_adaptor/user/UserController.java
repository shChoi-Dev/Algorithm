package b_designpattern.com.mc.oop.j_adaptor.user;

import b_designpattern.com.mc.oop.j_adaptor.auth.AuthService;
import b_designpattern.com.mc.oop.j_adaptor.auth.SocialLoginProvider;

public class UserController {
	private final AuthService authService;
	
	public UserController(AuthService userService) {
		super();
		this.authService = userService;
	}
	
	public String googlelogin() {
		authService.socialLogin(SocialLoginProvider.GOOGLE, "abc");
		return "200 OK";
	}
	
	public String naverlogin() {
		authService.socialLogin(SocialLoginProvider.NAVER, "abc");
		return "200 OK";
	}
}
