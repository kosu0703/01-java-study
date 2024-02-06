package com.ict.day02;

public class Ex03 {
	public static void main(String[] args) {
		//	숫자는 정수형과 실수형으로 나눠진다.
		//	정수란 소수점이 없는 숫자 
		//	실수란 소수점이 있는 숫자
		//	정수 < 실수
		//	정수 : byte < short < int(기본) < long
		//	실수 : float < double(기본)
		
		//	byte : -128 ~ 127
		byte b1 = 100 ;
		System.out.println(b1);
		
		b1 = 127 ;
		System.out.println(b1);
		
		// b1 = 128 ; 오류
		
		b1 = -128 ;
		// b1 = -129 ; 오류
		
		// b1 = 120 + 9 ; 계산을 하고 저장이 되는데, 계산 결과가 -128~127 범위를 넘어가므로 오류 발생
		//	즉, 변수에 저장할 때는 결과값으로 저장 유무를 결정한다.
		
		// 	short : -32768 ~ 32767
		// 	byte 처럼 결과값이 범위를 넘으면 사용 불가
		
		// 	int : 기본적으로 정수를 사용할 때 호출하는 자료형
		//		즉, 일반적으로 사용
		int su = 35 ;
		System.out.println(su);
		
		// 	long : 정수 중에 가장 큰 범위를 가지고 있음
		//		즉, 큰 정수를 사용할 때 호출하는 자료형
		//		숫자 뒤에 대문자 L 또는 소문자 ㅣ 을 붙인다.(생략가능하지만 웬만하면 붙이자, 오류안나게끔)
		long num = 32L ;
		long num2 = 3414L ;
		long num3 = 34234l ;
		long num4 = 54213l ; // 숫자 1 은 살짝 사선 , 소문자 l 은 직선 
		// 웬만하면 대문자 L 붙이자 
		// 숫자만 있으면 int형 , 숫자 뒤에 L 있으면 long형
		System.out.println(num);
		
		
	}
}
