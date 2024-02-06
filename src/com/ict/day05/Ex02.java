package com.ict.day05;

import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		//	for 문 : 정행진 규칙에 따라 실행문을 반복 처리한다.
		//			조건식이 참일 때 실행, 거짓이면 실행하지 않음
		
		//	형식)	for ( 초기식 ; 조건식 ; 증감식 ) {
		//			조건식이 참일때 실행할 문장 ;
		//			조건식이 참일때 실행할 문장 ;
		//		}
		
		//	1. for 문을 만나면 초기식에 간다.
		//	2. 초기식을 가지고 조건식으로 간다.
		//	3. 조건식이 참이면 실행, 거짓이면 실행하지 않음
		//	4. 참일 때 실행하다가 for 문의 끝을 만나면 다시 증감식으로 간다.
		//	5. 증감식에서 증가하거나 감소 후 다시 조건식에 간다.
		//	6. 조건식이 참이면 실행, 거짓이면 실행하지 않음
		
		//	**주의사항 : for 문 초기식에서 변수를 만들어 사용한다.
		//			초기식에서 만든 변수는 for 문을 벗어나면 사라진다.
		//			즉, for 문 밖에서는 사용 불가

		//	자바에서는 변수를 만들고 선언하면 해당 블록에서만 사용 가능
		//	해당 블록을 벗어나면 변수는 사라진다.
		
		//	메서드 안에서 만든 변수는 지역변수 (파란색이 아니다)
		//	클래스 밑에서 만든 변수는 전역변수 (파란색)
		
		
		for (int i = 0; i < 10; i++) { 	// 	처음 증감식에 갔을때 i=0 , 조건식으로 넘어갈때 i=1 
			System.out.println("hi");	//	i=9 까지 실행하고 증감식에 갔다가 조건식으로 넘어가면서 i=10 
			System.out.println("안녕");	//	조건식에서 거짓이므로 실행하지 않는다.
			System.out.println(i);		//	i 는 계속 변하고 내가 설정한 hi 와 안녕은 변하지 않는다.
		}
		//	for 문을 나오는 순간 i 는 사라진다.
		
		//System.out.println(i);	// for 문에서 만든 변수인 i 는 for 문 밖으로 나오면 사용 불가
		
		
		
		int k1 ;	// 변수 선언을 for 문 밖에서 하고 for 문에서 사용하면 for 문을 벗어나도 사용 가능
		for (k1 = 0; k1 < 10; k1++) {	
			System.out.println("hi");
		}
		System.out.println(k1);	// 	k1 이 9 일때까지 실행하고 증감식을 갔다가 조건식으로 넘어가면서 
								//	k1 은 10 이 되고 조건식에서 거짓이므로 실행하지않고 끝난다.
								//	따라서 for 문에서 나온 k1 은 마지막 값인 10 이다.
		System.out.println();
		
		
		//	10 ~ 20 출력
		
		for (int i = 10; i < 21 ; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		
		//	10 ~ 20 까지 짝수만 출력				//	**for 문과 if 문 결합
		
		System.out.println("10 ~ 20 까지 짝수");
		System.out.println();
		
		for (int i = 10; i<21 ; i++) {
			if (i%2==0) {					//	for 문 안에서 if 문으로 짝수 물어보기
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		
		//	10 ~ 20 까지 홀수만 출력
		
		System.out.println("10 ~ 20 까지 홀수");
		System.out.println();
		
		for (int i = 10; i<21 ; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		
		//	구구단 5단 출력 > 5의 배수
		
		System.out.println("구구단 5단");
		System.out.println();
		
		for (int i = 1; i < 10 ; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
		
		
		//	0 0 0 0 
		//	0 0 0 0 
		//	0 0 0 0 
		//	0 0 0 0 
		
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i%1 + " " + i%1 + " " + i%1 + " " + i%1); 
		}
		
		System.out.println();
		
		//	1. 0 0 0 0 이 4줄이 있다.
		
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		
		System.out.println();
		
		//	2. 4의 배수일 때 줄을 바꾸자.
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		//	0 ~ 10 의 누적합 (합계 구하기)
		
		int sum = 0 ;	// 	이전 값을 기억시키는 변수
		
		for (int i = 0; i < 11; i++) {
			sum = sum + i ;	// 	기억값 = 이전기억값 + 현재값		//	0 = 0 + 0  
		}												//	1 = 0 + 1
		System.out.println("누적합 : " + sum);				//	3 = 1 + 2 ( 3 = 0 + 1 + 2 )
														//	6 = 3 + 3 ( 7 = 0 + 1 + 2 + 3 )
														// 10 = 6 + 4 (10 = 0 + 1 + 2 + 3 + 4) 
		System.out.println();
		
		//	0 ~ 10 홀수의 합계, 짝수의 합계를 각각 구하자
		
		int sum2 = 0 ;
		int sum3 = 0 ;
		
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				sum2 = sum2 + i ;
			}
		}
		
		System.out.println("홀수의 합계 : " + sum2);
		System.out.println();
		
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				sum3 = sum3 + i ;
			}
		}
		System.out.println("짝수의 합계 : " + sum3);
		System.out.println();
		
		//	다른 방식	(홀수 아니면 짝수 이므로 if~else)
		
		int even = 0 ;
		int odd = 0 ;
		
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i ;
			} else {
				odd = odd + i ;	
			}
		}
		System.out.println("짝수의 합계 : " + even);
		System.out.println("홀수의 합계 : " + odd);
		System.out.println();
		
		
		//	7! ( 7 * 6 * 5 *4 * 3 * 2 * 1 )
		
		int mul = 1 ;
		
		for (int i = 1; i < 8; i++) {
			mul = mul * i ;				//	1 * 2 * 3 * 4 * 5 * 6 * 7
		}
		System.out.println("7! = " + mul);
		System.out.println();
		
		//	다른 방식 ( 7 부터 시작해서 1씩 감소하여 1까지 )		But, 대부분은 증가하는 방식
		
		int fac = 1 ; 
		
		for (int i = 7; i > 0; i--) {		
			fac = fac * i ;				//	7 * 6 * 5 * 4 * 3 * 2 * 1
		}
		System.out.println("7! = " + fac);
		System.out.println();
		
		//	더할 때는 초기값 0 
		//	곱할 때는 초기값 1
		//	누적값 = 이전값 + 현재값
		//	누적값 = 이전값 * 현재값
		//	더하기든 곱하기든 누적값이 되려면 for 문 밖에서 초기값을 지정하고 for 문 안으로 가져와서 사용한다
		
		

		
		
		
	}
}






