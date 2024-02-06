package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		//	if ~ else 문
		//	삼항연산자와 비슷하게 처리
		//	즉, 조건식이 참일 때와 거짓일 때 실행 각각 나눠서 처리한다.
		//	주의사항) 한줄은 {} 블록 생략가능
		//	형식) if (조건식) {
		//			조건식이 참일 때 실행 ;
		//			조건식이 참일 때 실행 ;
		//			조건식이 참일 때 실행 ;
		//		} else {
		//			조건식이 거짓일 때 실행 ;
		//			조건식이 거짓일 때 실행 ;
		//			조건식이 거짓일 때 실행 ;
		//		}
		
		
		//	int k1 이 홀수인지 짝수인지 판별하자
		
		int k1 = 7 ;
		String res = "";	//	홀수 라는 문자열 저장 > String
		if (k1 % 2 == 0) {
			res = "짝수";
		} else {
			res = "홀수";	
		}
		System.out.println("k1은 " + res + "입니다.");
		
		
		//	int k2 가 60 이상이면 합격, 아니면 불합격
		
		int k2 = 77 ;
		String res2 = "";	// 합격 이라는 문자열 저장 > String
		if (k2 >= 60) {
			res2 = "합격";
		} else {
			res2 = "불합격";
		}
		System.out.println();
		System.out.println("k2는 " + res2 + "입니다.");
		
		
		//	k3 가 1 이면 가격에 0.1 할인한다.
		
		int k3 = 1 ;
		int price = 1000 ;
		int res3 = 0 ;	//	가격은 숫자 저장 > int
		if (k3 == 1) {
			res3 = price - (int)(price*0.1) ;	//	기존 가격에서 할인 가격을 빼준다.
		} else {
			res3 = price ;
		}
		System.out.println();
		System.out.println("가격은 " + res3 + "원입니다.");
		
		
		//	char k4 가 대문자인지 아닌지 판별하자
		
		char k4 = 'A';
		String res4 = "";	//	대문자 라는 문자열 저장 > String
		if (k4 >= 'A' && k4 <= 'Z') {
			res4 = "대문자입니다.";
		} else {
			res4 = "대문자가 아닙니다.";
		}
		System.out.println();
		System.out.println(k4 + "는 " + res4);
		
		
		//	근무시간이 8시간 까지는 시간당 9860원이고
		//	8시간 초과한 시간 만큼은 1.5배 지급한다.
		//	현재 근무한 시간이 10시간 일때 얼마를 받아야 하는가?
		
		
		int time = 10 ;
		int dan = 9860 ;
		int limit = 8 ;	// 	변할 수 있는 수는 변수로 만들어서 공식에 넣자
		int res5 = 0 ;	//	급여는 숫자 저장 > int
		if (time > limit) {
			res5 = (dan*limit) + (int)(dan*1.5*(time-limit)) ;
		} else {
			res5 = dan*time ;
		}
		System.out.println();
		System.out.println("급여는 " + res5 + "원이다.");
		
		
		
	}
}







