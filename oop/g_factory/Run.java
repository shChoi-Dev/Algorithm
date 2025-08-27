package com.mc.oop.g_factory;

public class Run {
	
	public static void main(String[] args) {
		SMTPConnector connector = ConnectorFactory.create(EmailConfig.GOOGLE);
		connector.connect();
	}
}
