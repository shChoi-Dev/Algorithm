package com.mc.trpg.domain.stage.data;

public enum Stages {

	DARK_FOREST("깊고 어두운 숲");
	
	private String desc;

	private Stages(String desc) {
		this.desc = desc;
	}
	
	public String desc() {
		return this.desc;
	}
	
}
