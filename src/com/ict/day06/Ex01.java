package com.ict.day06;

public class Ex01 {
	public static void main(String[] args) {
		//	while 문 : 선 비교 후 처리
		//	do ~ while 문 : 선 처리 후 비교 (즉, 무조건 1번은 실행한다) 
		
		//	형식)	초기식 ;
		//		do {
		//			참일때 실행할 문장 ;
		//			참일때 실행할 문장 ;
		//			참일때 실행할 문장 ;
		//			증감식 ;
		//		} while ( 조건식 ) ;
		
		
		//	0 ~ 10 까지 출력
		
		int k1 = 0 ;
		
		do { 
			System.out.println(k1);
			k1++;
		} while (k1 < 11);	// 11이 되면 false 가 되어 빠져나감
		
		System.out.println();
		
		//	0 ~ 10 까지 짝수만 출력
		
		int k2 = 0 ;
		
		do {
			if (k2 % 2 == 0) {
				System.out.println(k2);
			}
			k2++;
		} while (k2 < 11);
		
		
		
	}
}







