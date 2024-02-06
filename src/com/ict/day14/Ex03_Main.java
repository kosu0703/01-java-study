package com.ict.day14;

public class Ex03_Main {
	public static void main(String[] args) {
		//	별로로 내부클래스 생성 불가
		//Inner02 t1 = new Inner02();
		
		//	멤버내부클래스 처럼 생성할 수 없다
		//Ex03 t1 = new Ex03();
		//Ex03.Inner02 t2 = t1.new Inner02();
		
		//	메서드 안에 존재 하기때문에 먼저 메서드를 실행해야 된다.
		Ex03 t1 = new Ex03();
		t1.play();	
		//	메서드가 실행되면 내부클래스를 객체 생성할 수 있는 조건이 만들어진다.
		
		//	객체 생성은 내부클래스 끝 과 외부메서드 끝 사이에 만들어야 한다.
		//	그리고 객체생성 후에 실행할 내용을 적는다.
		
		
		
		
		
		
	}
}
