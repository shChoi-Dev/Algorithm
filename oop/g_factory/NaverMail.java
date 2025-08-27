package com.mc.oop.g_factory;

public class NaverMail implements SMTPConnector{
	
	private EmailConfig config;
	
	public NaverMail(EmailConfig config) {
		super();
		this.config = config;
	}

	@Override
	public void connect() {
		System.out.println("네이버 메일서버에 연결되었습니다.");
	}

}
