package com.ict.day12;

//public class Ex06_Cat extends Ex06_Animal{		//	final 이 붙으면 상속 불가
public class Ex06_Cat extends Ex06_Animal{		
	
	public void play() {
		age = age + 10;
		System.out.println(age);
	}
		
	public void play2() {
		//month = month + 10;	//	상수는 값변경 불가		, **상수는 대문자!
		age = month + 2;		//	가져다가 사용하는 것은 가능
	}							
	
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	
//	@Override
//	public final void sleep() {						//	final 이 붙으면 오버라이딩 불가
//		System.out.println("15시간 이상 잠을 잔다.");		
//	}
	
	
	
	
	
}
