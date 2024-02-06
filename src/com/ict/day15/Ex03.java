package com.ict.day15;

public class Ex03 {
	
	private String name;
	private int age;
	
	public Ex03() {
		
	}

	//	메뉴탭 > Source > 인자 있는 생성자 생성 
	public Ex03(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//	메뉴탭 > Source > getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
