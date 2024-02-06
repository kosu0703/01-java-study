package com.ict.day12;

public class Ex05_Dog extends Ex05_Animal{
	
	int tail = 3;
	
	//	오버라이딩
	//	: 부모 메서드를 가져와서 자식 클래스가 마음대로 변경할 수 있다.
	
	//	@Override **어노테이션
	//	: 부모클래스의 메서드를 자식클래스가 가져와서 재정의한다.
	
	@Override
	public void sound() {
		System.out.println("멍~ 멍~");
	}
	
	public void hobby() {
		System.out.println("수영하기");
	}

	
}
