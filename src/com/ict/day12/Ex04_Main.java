package com.ict.day12;

public class Ex04_Main {
	public static void main(String[] args) {
		//	자식 Game 객체 생성하면 
		//	부모 MP3 생성자 호출하여 MP3 객체 생성하면
		//	부모의 부모 Phone 생성자 호출하여 Phone 객체 생성	
		Ex04_Game t = new Ex04_Game();	
		System.out.println();
		
		t.play();	//	자기
		t.sound();	//	부모
		t.call();	//	부모의 부모
		t.sms();	//	부모의 부모
		System.out.println(t.number);	//	우선순위는 가까울수록
		
		
		
		
		
		
		
	}
}
