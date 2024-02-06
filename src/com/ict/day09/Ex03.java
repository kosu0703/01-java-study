package com.ict.day09;

public class Ex03 {
	public static void main(String[] args) {
		//	Math 클래스 주요 메서드
		//	: 수학에서 자주 사용하는 상수들과 static 함수들을 미리 구현해 놓은 클래스
		
		//	E , PI
		System.out.println(Math.E);		//	자연로그 e 의 값		2.718...
		System.out.println(Math.PI);	//	원주율 pi 의 값		3.14...
		
		//	메서드 모두 static 이다. 
		//	생성자 없다. 즉, 객체 생성 할 수 없다.
		//	Math.메서드() 로 접근가능하다.
		
		
		//	1. 
		//	random() : 0.0 ~ 1.0 미만의 임의의 난수 발생
		
		System.out.println(Math.random());
		
		int k1 = (int)(Math.random());		//	무조건 0
		int k2 = (int)(Math.random()*10);	//	0 ~ 9 까지 10개 정수
		//	가위 바위 보 는 3개 > random *3
		System.out.println();
		//	로또
		for (int i = 0; i < 6; i++) {
			int k3 = (int)(Math.random()*45)+1;
			System.out.print(k3 + " ");
		}
		System.out.println();
		
		//	2.
		//	ceil() : 올림 , round() : 반올림 , floor() : 버림
		
		System.out.println("ceil : 가장 큰 정수로 이동 (음수일때 조심!)\n");
		System.out.println(Math.ceil(10.0));	//	10
		System.out.println(Math.ceil(10.1234));	//	11
		
		System.out.println(Math.ceil(-10.0));	//	-10
		System.out.println(Math.ceil(-10.1235));//	-10			
		System.out.println();
		
		System.out.println("floor : 가장 작은 정수로 이동 (음수일때 조심!)\n");
		System.out.println(Math.floor(10.0));	//	10
		System.out.println(Math.floor(10.985));	//	10	
		
		System.out.println(Math.floor(-10.0));	//	-10
		System.out.println(Math.floor(-10.9543));//	-11		
		System.out.println();
		
		System.out.println("round : 가장 가까운 정수로 이동\n");
		System.out.println(Math.round(10.0));	//	10
		System.out.println(Math.round(10.4));	//	10
		System.out.println(Math.round(10.5));	//	11
		
		System.out.println(Math.round(-10.4));	//	-10
		System.out.println(Math.round(-10.5));	//	-10
		System.out.println(Math.round(-10.6));	//	-11		
		System.out.println();
		
		
		//	3.
		//	abs() : 절대값 ( 양수 > 양수 , 음수 > 양수 )
		
		System.out.println("abs : 절대값");
		System.out.println(Math.abs(10));		//	10
		System.out.println(Math.abs(-10));		//	10
		System.out.println(Math.abs(-10.1531));	//	10.1531		
		System.out.println();
		
		
		//	4.
		//	max(수1, 수2) : 큰 값 , min(수1, 수2) : 작은 값
		
		System.out.println(Math.max(15, 14));	//	15.1234
		System.out.println(Math.min(15, 15.1234));	//	15.0	double 형을 사용해서 
				
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
