package com.ict.day14;

import com.ict.day14.Ex02.Inner01;

public class Ex02_Main {
	public static void main(String[] args) {
		
		//	내부클래스는 별도로 객체 생성 불가
		//Inner01 t1 = new Inner01();
	
		//	외부클래스를 통해서 내부클래스 객체를 생성
		
		//	외부클래스의 객체를 먼저생성하고
		Ex02 t1 = new Ex02();
		//	외부클래스 객체의 참조변수를 통해서 내부클래스의 객체를 생성한다.
		Ex02.Inner01 t2 = t1.new Inner01();	
		//	객체의 주소가 다르다 (new 는 무조건 새로운 영역)
		
		System.out.println();
		t2.play();
	
	}
}
