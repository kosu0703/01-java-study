package com.ict.day13;

public class Ex11_Main {
	public static void main(String[] args) {
	
		toPlay2("홍길동");
		
		//	인터페이스는 객체로 생성 못함
		//Ex11_IBehavior t = new Ex11_IBehavior();
		
		//	(기본) 상속받은 클래스로 객체 생성
		Ex11_Soccer soccer = new Ex11_Soccer();
		Ex11_BassGuitar bassGuitar = new Ex11_BassGuitar();
		
		toPlay(soccer);
		toPlay(bassGuitar);
		
		//	상속받는 부모가 같으면 부모로 선언가능 
		Ex11_IBehavior soccer2 = new Ex11_Soccer();
		Ex11_IBehavior bassGuitar2 = new Ex11_BassGuitar();
				
		toPlay(soccer2);
		toPlay(bassGuitar2);
		
		//	다른 방법 (참조변수 없이 바로 객체 생성해서 넣기)
		toPlay(new Ex11_Soccer());
		toPlay(new Ex11_BassGuitar());
		
		
	}
	
	public static void toPlay(Ex11_IBehavior ib) {
		ib.play();
	}
	
	public static void toPlay2(String str) {
		System.out.println(str + "님 성공");
	}
	
}
