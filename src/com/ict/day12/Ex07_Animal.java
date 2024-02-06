package com.ict.day12;

public class Ex07_Animal {

	String name = "동물";
	int age = 0;
	
//	public Ex07_Animal() {
//		System.out.println("부모생성자");
//	}
	
	public Ex07_Animal(String name, int age) {		 
		System.out.println("인자 있는 부모생성자");
		this.name = name;
		this.age = age;
		
	}
	
}
