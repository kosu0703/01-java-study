package com.ict.day03;

public class Ex02 {
	public static void main(String[] args) {
		//	비교 연산자 : > , < , >= , <= , ==(같다) , !=(다르다, 같지않다)
		//	비교연산자를 사용할 수 있는 자료형 : 문자형, 정수형, 실수형
		//	비교연산 결과는 무조건 true 또는 false 인 논리형이다.
		//	논리형(boolean)은 기본적으로 조건식에 사용된다.
		
		int su1 = 90 ;
		int su2 = 80 ; 
		
		// su1 > su2 ; 오류 , 비교했으면 논리형으로 저장해라!
		boolean result = su1 > su2 ;
		System.out.println(result);
		
		double su3 = 97.4 ;
		double su4 = 89.0 ;
		
		result = su3 > su4 ;
		System.out.println(result);
		
		result = su1 > su4 ;
		System.out.println(result);
		// 정수와 실수도 비교 가능하다.
		
		char su5 = 'a' ;
		char su6 = 'A' ;
		result = su5 > su6 ;
		System.out.println(result);
	
		result = su1 > su5 ;
		System.out.println(result);
		// 정수와 문자도 비교 가능
		
		
		
		
		
		
		
	}
}
