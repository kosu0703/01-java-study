package com.ict.day04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//	조건 연산자 : 변수 = 조건식 ? 참값 : 거짓값
		//	변수, 참값, 거짓값 셋 모두는 같은 자료형이여야 한다.			
		//	조건식에는 논리형, 비교연산, 논리연산이 들어가고 boolean 형으로 저장되어야 한다.
			
		//	삼항 연산자
		//	형식 ) 자료형 변수 = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장 ;
		
		
		//	int k1 이 홀수인지 짝수인지 판별하자
		//	힌트) 어떤 수를 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		
		int k1 = 16 ;
		int res = k1 % 2 ;  // 조건식
		
		//	자료형 변수 = (res == 1) ? "홀수" : "짝수" ; // 	res 가 1과 같으면 홀수, 나머지는 짝수
													//	res 가 1이면 홀수, 1이 아니면 짝수
		String result = (res == 0) ? "짝수" : "홀수" ;	//	res 가 0과 같으면 짝수, 나머지는 홀수
														//	res 가 0이면 짝수, 0이 아니면 홀수
		
		System.out.println(k1 + " : " + result);
		System.out.println();
		
		// 	줄이 길면 싫어함 > 현업에서는 아래와 같이
		
		result = (k1 % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println(k1 + " : " + result);
		System.out.println();
		
		
		// int k2 가 60이상이면 합격 아니면 불합격
		
		int k2 = 73 ;
		result = (k2 >= 60) ? "합격" : "불합격" ;
		System.out.println(result);
		System.out.println();
		
		//Scanner scan = new Scanner(System.in);
		//System.out.print("점수 : ");
		//int k3 = scan.nextInt();
		//result = (k3 >= 60) ? "합격" : "불합격" ;
		//System.out.println(result);
		//System.out.println();
		
		
		// 	k4 가 1이면 가격에 10% 할인 한다.
		
		int k4 = 1 ;
		int price = 1000 ;
																		
		int res2 = (k4 == 1) ? (int)(price * 0.9) : price ;  		
		int res3 = (k4 == 1) ? price - (int)(price * 0.1) : price ;
		int res4 = (k4 == 1) ? price - (price / 10) : price ;
		
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println();
		
		//	char k5 = 대문자인지, 대문자가 아닌지 판별하자.
		
		char k5 = 'C' ;
		result = (k5 >= 'A' && k5 <= 'Z') ? "대문자" : "대문자가 아니다" ;
		System.out.println(result);
		System.out.println();
		
		char k6 = 'a' ;
		result = (k6 >= 'A' && k6 <= 'Z') ? "대문자" : "대문자가 아니다" ;
		System.out.println(k6 +"는 " + result);
		System.out.println();
		
		
		//	근무시간이 8시간 까지는 시간당 9860원이고
		//	8시간 초과한 시간 만큼은 1.5배 지급한다.
		//	현재 근무한 시간이 10시간 일때 얼마를 받아야 하는가?
		
		int time = 10 ;
		int dan = 9860 ;
		
		int pay = (time > 8) ? (int)(dan*1.5*(time-8)) + (dan*8)  : dan*time ;
		System.out.println("급여 : " + pay);
		
		
	}
}

