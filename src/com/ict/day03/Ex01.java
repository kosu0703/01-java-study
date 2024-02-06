package com.ict.day03;

public class Ex01 {
	public static void main(String[] args) {
		//	증감 연산자 : 1 증가 또는 1 감소 하는 연산자
		//	++(--) 변수 : 현재 변수가 가지고 있는 값에 1을 증가(감소) 하고 나머지를 실행
		//	변수 ++(--) : 현재 변수를 가지고 실행을 한 후 그 명령 구문이 끝날때 ; 1을 증가(감소)한다.
		// 	변수 앞에 있으면 우선순위 1순위 , 뒤에 있으면 막순위
		
		int su1 = 10 ; 
		int su2 = 10 ;
		
		System.out.println(++su1); // 먼저 su2는 11이 되고 11이 출력된다.
		System.out.println(su2++); // 먼저 10이 찍히고 su2는 11이 된다.
		System.out.println(su2); 
		
		System.out.println(++su1 +4); // 11 > 12 > 16 > 출력
		System.out.println(su2++ +4); // 11 > 15 > 출력 > 16
		
		
		
		
		
		
		
	}
}
