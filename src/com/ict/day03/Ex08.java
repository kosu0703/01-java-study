package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		//	3989초는 몇시간, 몇분, 몇초일까?
		
		int su = 3989 ; // 초
		
		int h = su / 3600 ; 	//	시간	
		int m = (su%3600)/60 ;	//	분
		int s = (su%3600)%60 ;	//	초
		
		System.out.println(su + "초는 " + h + "시간 " + m + "분 " + s + "초");
		System.out.println();
		
		
		//	3989초는 몇시간, 몇분, 몇초일까?
		
		//	입력정보
		int total = 3989 ;	// 전체 초 저장
		int h1 = 0 ; 		//	시간 저장
		int m1 = 0 ;		//	분 저장
		int s1 = 0 ;		//	초 저장
		int res = 0 ;		// 나머지 저장
		
		// 	시간을 구하자
		//	비지니스 로직
		h1 = total / (60*60) ;
		res = total % (60*60) ;
		
		m1 = res / 60 ;
		s1 = res % 60 ;
		
		System.out.println(h1);
		System.out.println(m1);
		System.out.println(s1);
		System.out.println("3989초는 " + h1 + "시간 " + m1 + "분 " + s1 + "초 입니다.");
		
		
		
	}
}
