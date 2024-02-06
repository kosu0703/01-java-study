package com.ict.day04;

public class Ex06 {
	public static void main(String[] args) {
		//	다중 if 문
		//	형식) if (조건식1) {
		//			조건식1이 참일 때 실행 ;
		//			조건식1이 참일 때 실행 ;
		//		} else if (조건식2) {
		//			조건식1 에는 거짓이면서 조건식2 에는 참일 때 실행 ;		
		//			조건식1 에는 거짓이면서 조건식2 에는 참일 때 실행 ;		
		//		} else if (조건식3) {
		//			조건식1,2 에는 거짓이면서 조건식3 에는 참일 때 실행 ;		
		//			조건식1,2 에는 거짓이면서 조건식3 에는 참일 때 실행 ;		
		//		} else {
		//			조건식1,2,3 에서 모두 거짓일 때 실행 ;
		//			즉, 나머지 다
		//		}
		
		
		//	int k1 의 점수가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 나머지 F
		
		int k1 = 89 ;
		String res = "" ;
		if (k1 >= 90) {
			res = "A";
		} else if (k1 >= 80) {
			res = "B";
		} else if (k1 >= 70) {	
			res = "C";	
		} else {
			res = "F";
		}
		System.out.println("학점 결과 : " + res + "학점입니다.");
		System.out.println();
		
		
		//	char k2 가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		
		char k2 = 'g';
		String res2 = "";
		if (k2 >= 'A' && k2 <= 'Z') {
			res2 = "대문자";
		} else if (k2 >= 'a' && k2 <= 'z') {
			res2 = "소문자";
		} else if (k2 >= '0' && k2 <= '9') {
			res2 = "숫자";
		} else {
			res2 = "기타문자";
		}
		System.out.println(k2 + " : " + res2);
		System.out.println();
		
		
		//	char k3 가 A, a 이면 아프리카, B, b 이면 브라질, C, c 이면 캐나다, 나머지 한국
		
		char k3 = 'g';
		String res3 = "";
		if (k3 == 'A' || k3 == 'a') {
			res3 = "아프리카";
		} else if (k3 == 'B' || k3 == 'b') {
			res3 = "브라질";
		} else if (k3 == 'C' || k3 == 'c') {
			res3 = "캐나다";
		} else {
			res3 = "한국";
		}
		System.out.println("결과 : " + res3);
		System.out.println();
		
		
		//	menu 가 1 이면 카페모카 3500, 2 이면 카페라떼 4000, 3 이면 아메리카노 3000, 4 이면 과일쥬스 3500 이다.
		//	친구와 2잔을 10000 내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10& 포함, 친구와 같은 음료만 선택 가능)
		
		int menu = 3 ;	
		int su = 2 ;
		int input = 10000 ;	//	주어진 변수끼리
				
		String coff = "";	//	초기값이 필요한 변수끼리
		int dan = 0 ;
		int output = 0 ;
		
		if (menu == 1) {
			coff = "카페모카";
			dan = 3500 ;
			//output = input - (int)(dan*su*1.1);
		} else if (menu == 2) {
			coff = "카페라떼";
			dan = 4000 ;
			//output = input - (int)(dan*su*1.1);
		} else if (menu == 3) {
			coff = "아메리카노";
			dan = 3000 ;
			//output = input - (int)(dan*su*1.1);
		} else if (menu == 4) {
			coff = "과일쥬스";
			dan = 3500 ;
			//output = input - (int)(dan*su*1.1);
		}
		
		output = input - (int)(dan*su*1.1); // 동일한 것은 밖으로 빼자
		
		System.out.println(input + "원을 내고 " + coff + " " + su + "잔을 구매하면");
		System.out.println("잔돈은 " + output + "원이다.");
		
		
	}
}
