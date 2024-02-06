package com.ict.day04;

public class Ex03 {
	public static void main(String[] args) {
		//	중첩 삼항 연산자 : 삼항연산자 안에 삼항연산자가 존재
		//	형식 ) 자료형 변수 = (조건식1) ? ((조건식2) ? 참일때 : 거짓일때) : 거짓일때 ;
		//	**형식 ) 자료형 변수 = (조건식1) ? 참일때 : ((조건식2) ? 참일때 : 거짓일때) ;
		
		
		//	int k1 이 90 이상이면 A학점 , 80 이상이면 B학점 , 나머지는 F학점
		//	조건식1 : 90 이상이면 A학점이고 나머지는 다음 조건식으로, 조건식2 : 80이상이면 B학점이고 나머지는 F학점 
		
		int k1 = 88 ;
		
		String res = (k1 >= 90) ? "A학점" : ((k1 >= 80) ? "B학점" : "F학점" ) ;
		System.out.println(k1 + " : " + res);
		System.out.println();
	
		
		//	char k2 가 대문자인지, 소문자인지, 기타문자인지 판별하자
		
		char k2 = '$' ;
		
		String res2 = (k2 >= 'A' && k2 <= 'Z') ? "대문자" : 
			((k2 >= 'a' && k2 <= 'z') ? "소문자" : "기타문자") ;
		System.out.println(k2 + " : " + res2);
		System.out.println();
		
		
		//	int k3 가 1 또는 3 이면 남자, 나머지 여자
		
		int k3 = 3 ; 
		
		String res3 = (k3 == 1 || k3 == 3) ? "남자" : "여자" ;
		System.out.println("성별 : " + res3);
		System.out.println();
		
		
		//	int k4 가	1 이면 1900년대 태어난 남자, 3 이면 2000년대 태어난 남자
		//				2 이면 1900년대 태어난 여자, 4 이면 2000년대 태어난 여자
		
		int k4 = 7 ;
		
		String res4 = (k4 == 1 || k4 == 3) ? "남자" : ((k4 == 2 || k4 == 4 ) ? "여자" : "외계인") ;
		System.out.println("결과 : " + res4);
		System.out.println();
		
		int k5 = 3 ;
		
		String res5 = (k5 == 1 || k5 == 3) ? (k5 == 1 ? "1900년대 태어난 남자" : "2000년대 태어난 남자") : 
			((k5 == 2 || k5 == 4 ) ? (k5 == 2 ? "1900년대 태어난 여자" : "2000년대 태어난 여자") : "외계인") ;
		System.out.println("결과 : " + res5);
		System.out.println();
		
		
		//	두 숫자 중 큰 숫자를 구하자
		
		int su1 = 24 ;
		int su2 = 19 ;

		int big = (su1 > su2) ? su1 : su2 ;
		System.out.println("큰 숫자 : " + big);
		
		int big2 = Math.max(su1, su2);			// Math 클래스 참조자료형 API
		System.out.println("큰 숫자 : " + big2);
		
	}
}









