package com.ict.day12;

public class Ex03_Main {
	public static void main(String[] args) {
		
		//	자식클래스 객체 생성을 하면, 먼저 부모클래스 객체가 생성되고 그 다음에 자식클래스 객체가 생성된다.
		
		Ex03_Sub t1 = new Ex03_Sub();
		
		Ex03_Sup t2 = new Ex03_Sub();		//	is a 관계
											//	자식 is a 부모 (O)
		
		//Ex03_Sub t3 = new Ex03_Sup();		//	부모 is a 자식 (X)
											//	부모의 범위가 더 크다 
	}
}
