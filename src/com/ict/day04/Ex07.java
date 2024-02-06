package com.ict.day04;

public class Ex07 {
	public static void main(String[] args) {
		
		char k2 = '3';
		String res =  "";
		if (k2>='A' && k2<='Z') {
			res = "대문자";
		}else if (k2>='a' && k2<='z') {
			res = "소문자";	
		}else if (k2>='0' && k2<='9') {
			res = "숫자";
		}else {
			res = "기타문자";
		};
		System.out.println(k2 + " : " + res);
		System.out.println();
		
		
		char k3 = 'C' ;
		if (k3 == 'A' || k3 == 'a') {
			res = "아프리카";
		}else if (k3 == 'B' || k3 == 'b') {
			res = "브라질";
		}else if (k3 == 'C' || k3 == 'c') {
			res = "캐나다";
		}else {
			res = "한국";
		}
		System.out.println("국가 : " + res);
		System.out.println();
		
		//	menu 가 1 이면 카페모카 3500, 2 이면 카페라떼 4000, 3 이면 아메리카노 3000, 4 이면 과일쥬스 3500 이다.
		//	친구와 2잔을 10000 내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10& 포함, 친구와 같은 음료만 선택 가능)
			
		int menu = 2 ;
		int input = 10000 ;
		int su = 2 ;
		
		String coff = "";
		int dan = 0 ;
		int total = 0 ;
		int vat = 0 ;
		int output = 0 ;
		
		if (menu == 1) {
			coff = "카페모카";
			dan = 3500 ;
		}else if (menu == 2) {
			coff = "카페라떼";
			dan = 4000 ;
		}else if (menu == 3) {
			coff = "아메리카노";
			dan = 3000 ;
		}else if (menu == 4) {
			coff = "과일쥬스";
			dan = 3500 ;
		}
		
		total = dan * su ;
		vat = (int)(total * 0.1) ;
		output = input - (total + vat) ;
		
		System.out.println("선택 메뉴 : " + coff);
		System.out.println("지불 금액 : " + input);
		System.out.println("음료 가격 : " + dan);
		System.out.println("음료 개수 : " + su);
		System.out.println("총 금액 : " + (total + vat));
		System.out.println("잔돈 : " + output);
		
		
		
		
	}
}








