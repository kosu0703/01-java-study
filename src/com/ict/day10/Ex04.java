package com.ict.day10;

public class Ex04 {
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		
		double k1 = ex03.plus(10, 12);
		System.out.println(k1);
		
		k1 = ex03.plus(10.4, 12.8);
		System.out.println(k1);
		
		k1 = ex03.plus("10.4", "12.8");
		System.out.println(k1);		
		
		//	입력된 값의 자료형에 따라 알아서 메서드를 찾아가 계산한다.
		
		
		
		
		
		
		
	}
}
