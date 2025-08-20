package com.mc.algorithm.d_datastructure.dto;

public class School implements Comparable<School> {
	
	private String name;
	private String address;
	private String level;
	
	public School(String name, String address, String level) {
		super();
		this.name = name;
		this.address = address;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getLevel() {
		return level;
	}
	
	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + ", level=" + level + "]";
	}

	@Override
	public int compareTo(School o) {
		// this.level.equals(o.level)
		if(this.level.compareTo(o.level) == 0) {
			return this.name.compareTo(o.name) * -1;
		}
		return this.level.compareTo(o.level);
	}
	
	
}
