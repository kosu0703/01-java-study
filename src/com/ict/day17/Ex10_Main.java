package com.ict.day17;

public class Ex10_Main {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Java !";
		
		Ex10_1 t = new Ex10_1();
		t.makeString(s1, s2);
		System.out.println();
		
		
//	람다식 방법
//		2. 함수형 인터페이스 Ex10 으로 변수를 선언하고 람다식을 사용해 익명으로 객체 구현
		
		//		매개변수(중간역할을 하는 변수)			실행문			
		Ex10 t2 = (k1, k2) -> System.out.println(k1.concat(k2));
		//			인자(들어가는 값)
		t2.makeString(s1, s2);
		System.out.println();
		
		Ex10 t3 = (k1, k2) -> System.out.println(k1 + k2);
		t3.makeString(s1, s2);
		
	}
}
