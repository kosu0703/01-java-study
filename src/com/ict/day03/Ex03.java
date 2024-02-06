package com.ict.day03;

public class Ex03 {
	public static void main(String[] args) {
		// 논리 연산자 : 	&& (AND, 논리곱, 교집합)		조건이 붙을수록 범위가 줄어든다
		// 				|| ( OR, 논리합, 합집합)		조건이 붙을수록 범위가 커진다
		// 				!  (NOT, 논리부정)

		// 논리연산자 대상은 boolean 논리형이다.
		// 논리연산자의 결과도 논리형 boolean 이다.
		// boolean 논리형에는 비교연산, 논리연산자, 논리형이 들어갈 수 있다.

		// && (AND, 논리곱, 교집합)
		// 주어진 조건들이 모두 true 일 때 결과는 true
		// 즉, 조건들 중에 false 가 있으면 결과는 false
		// **false 이후에 연산은 하지 않는다.
		
		// AND 조건을 이용하면 범위를 지정할 수 있다.
		// a>=10 && a<=20 (변수가 같아야 함)
		// a 는 10부터 20까지의 범위를 의미한다.

		int su1 = 10;
		int su2 = 7;
		boolean res;

		// 			true && true
		res = (su1 >= 7) && (su2 >= 5); // true > true > true
		System.out.println(res);

		// 			true && false
		res = (su1 >= 7) && (su2 <= 5); // true > false > false
		System.out.println(res);

		// 			false && true
		res = (su1 <= 7) && (su2 >= 5); // false > false
		System.out.println(res);

		// 			false && false
		res = (su1 <= 7) && (su2 <= 5); // false > false
		System.out.println(res);

		// AND 연산자는 false 가 나오는 순간 뒤에 조건과 상관없이 결과는 false 이다.

		System.out.println();

		// int su1 = 10 , int su2 = 7

		res = ((su1 = su1 + 2) > su2) && (su1 == (su2 = su2 + 5));
		// 		12 = 10 + 2 > 7 			12 == 12 = 7 + 5
		// 			true 						true

		System.out.println("결과 : " + res);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println();
		
		su1 = 10 ;
		su2 = 7 ;
		
		res = ((su1 = su1 + 2) < su2) && (su1 == (su2 = su2 + 5));
		//					false  > 뒤에거 계산 안함  
		
		System.out.println("결과 : " + res);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2); // 계산 안했으므로 su2 는 그대로 7 
		System.out.println();
		
		int su3 = 34 ;
		// 	su3 값은 20~30 사이의 값이다.
		
		res = su3 >= 20 && su3 <= 30 ;
		System.out.println(res);
		System.out.println();
			
		res = su3 >= 30 && su3 <= 40 ;
		System.out.println(res);
		System.out.println();
		
		// char c1 이 소문자 이냐?
		char c1 = 'G';
		res = c1 >= 'a' && c1 <= 'z' ; 
		System.out.println(res);
		System.out.println();

		
		c1 = 'm' ;
		res = c1 >= 'a' && c1 <= 'z' ; 
		System.out.println(res);
		System.out.println();
		
		
		
		
	}
}






