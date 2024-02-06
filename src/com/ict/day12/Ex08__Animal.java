package com.ict.day12;

//	추상클래스 : 하나 이상의 추상메서드를 가지고 있는 클래스
//			 일반적인 변수와 상수, 메서드도 가질 수 있다.
//			 반드시 abstract 가 붙는다.
//			 추상클래스는 new 예약어를 사용해서 인스턴스 객체를 만들 수 없다.(? 익명의 내부 클래스 타입으로는 만들어진다.) 			
//			 보통 구체화되지 않은 클래스를 객체로 생성하지 않는다.

public abstract class Ex08__Animal {
//public class Ex08__Animal {			//	추상메서드가 하나라도 있으면 추상클래스로 만들어야 함

	int leg = 4;
	boolean live = true;
	
	//	일반메서드
	public void play() {
		System.out.println("열심히 달린다.");
	}
	
	//	추상메서드 : body 를 가지고 있지 않는 메서드 (블록이 없다.) 
	//			즉, 구체적으로 실행하는 실체가 없다.(실행하는 수행문이 없다.)
	public abstract void sound();
	
	
	
	
}
