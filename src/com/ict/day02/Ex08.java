package com.ict.day02;

public class Ex08 {
	public static void main(String[] args) {
		//	산술연산자 : +, -, *, /
		//	대상 : char, int, long, float, double
		//			문자형, 정수형, 실수형
		
		int su1 = 9 ;
		int su2 = 4 ;
		int result = 0 ; // 결과를 저장하는 놈
		
		result = su1 + su2 ;
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + su1 +" + " + su2 + " = " + result);
		// 변수가 쌍따옴표 안에서는 문자가 되기때문에 변수는 끊어서 표시하고 + 연산자로 이어준다.
		// 값을 쓸 때 변수를 사용하면 계속 불러와서 사용할 수 있다.
		// 효율적으로 코딩을 쓸 수 있다.
		// 데이터를 직접 출력하거나 호출 하지 말고 변수를 사용하자.
		// 변수에 저장하고 그 변수를 가져다 쓸 수 있어야 언제든지 활용하기 쉽다.
		
		result = su1 - su2 ;
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + su1 +" - " + su2 + " = " + result);
		
		result = su1 * su2 ;
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + su1 +" * " + su2 + " = " + result);
		
		result = su1 / su2 ; // 정수끼리 나눈 값은 몫
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + su1 +" / " + su2 + " = " + result);
		
		double result2 = su1 / su2 ; 
		System.out.println("결과 : " + result2);
		// 정수와 정수가 산술연산을 하면 정수가 된다. 즉, 정수끼리 나눈 값이 저장되기때문에
		// 결과자체가 2 이기때문에 double 에 넣어도 2.0 이 나온다
		
		double result3 = su1 * 1.0 / su2 ;
		System.out.println("결과 : " + result3);
		// 정수와 실수가 산술연산을 하면 결과는 실수가 된다.
		// 정수를 실수로 만들면 된다.
		// 정수에 1.0을 곱하면 실수가 된다.
		// 실수로 만든 후 double 로 넘겨야 소수점이 있는 실수 결과값이 나온다.
		// 큰거와 작은거 계산하면 큰거로 된다.
		
		// 나머지
		result = su1 % su2 ; 
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + su1 +" % " + su2 + " = " + result);
		
		// 2로 나눈 나머지가 0 이면 짝수 , 1 이면 홀수
		// 가위 바위 보 > 3으로 나눔
		
			
		
		
	}
}
