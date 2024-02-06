package com.ict.day14;

import com.ict.day14.Ex04.Inner03;

public class Ex04_Main {
	public static void main(String[] args) {
		//	별도의 객체 생성 없이 사용가능 (static 이므로)
		System.out.println(Inner03.room);
		System.out.println();
		
		//	별도로 만들어진다.
		Inner03 test = new Inner03();
		test.prn();
		
		//	static 은 static 만 가져오고 사용할 수 있다.
		//	외부클래스의 영향을 받지 않는다.

		
		
	}
}
