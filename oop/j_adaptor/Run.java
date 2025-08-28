package b_designpattern.com.mc.oop.j_adaptor;

import b_designpattern.com.mc.oop.j_adaptor.auth.AuthService;
import b_designpattern.com.mc.oop.j_adaptor.user.UserController;

public class Run {
	public static void main(String[] args) {
		UserController userController = new UserController(new AuthService());
		String response = userController.naverlogin();
		System.out.println(response);
	}
}
