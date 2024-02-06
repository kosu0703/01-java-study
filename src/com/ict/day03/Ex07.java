package com.ict.day03;

public class Ex07 {
	public static void main(String[] args) {
		//	2시간 40분 30초를 초로 환산 하여라. (즉, 몇초일까?)
		
		int h = 2 ; 	//	시간
		int m = 40 ;	//	분	
		int s = 30 ;	// 	초
		
		int res = (h * 3600) + (m * 60) + s ; // 초로 환산
		System.out.println( res + "초이다." );
		
		
		//	2시간 40분 30초를 초로 환산 하여라. (즉, 몇초일까?)
		//	입력정보
		int h1 = 2 * (60 * 60) ;	// 시간 저장
		int m1 = 40 * (60) ;		//	분 저장
		int s1 = 30 ;			//	초 저장
		
		//	요구사항 ( 처리 = 비지니스로직 )
		int total = h1 + m1 + s1 ; 
		System.out.println("2시간 40분 30초는 " + total + "초 입니다.");
		
		
	}
}
