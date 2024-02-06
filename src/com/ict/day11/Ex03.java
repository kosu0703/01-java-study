package com.ict.day11;

public class Ex03 {
	
	//	초기값이 없는 상태로 시작
	private String name ; 		//	String 초기값 null 
	private int age ;			//	int 초기값 0
	private boolean live ;		//	boolean 초기값 false
	
	//	생성자를 만들어서 초기값 부여
	//	객체 생성할 때 큰뿔소, 3살, 살아있음을 지정하자
	public Ex03() {
		name = "큰뿔소";
		age = 3;
		live = true;
	}



	public boolean isLive() {		
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
