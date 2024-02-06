package com.ict.day10;

public class Animal {
	
	private boolean live = true ;
	private int age = 3;
	private String name = "큰뿔소";
									//	is 는 무조건 boolean 형
	public boolean isLive() {		//	boolean 형은 get 대신에 is 로 만들어 준다. 
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
