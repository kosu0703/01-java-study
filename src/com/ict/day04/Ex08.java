package com.ict.day04;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>> 메뉴 >>>>>>>>>");
		System.out.println(">>>	1. 카페모카 (3500원) >>>");
		System.out.println(">>>	2. 카페라떼 (4000원) >>>");
		System.out.println(">>>	3. 아메리카노 (3000원) >>>");
		System.out.println(">>>	4. 과일쥬스 (3500원) >>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		
		System.out.print("메뉴를 선택하세요 >>>");
		int menu = scan.nextInt();
		
		System.out.print("주문 수량 >>>");
	    int su = scan.nextInt();
		
	    System.out.print("입금할 금액 >>>");
	    int input = scan.nextInt();
	    
	    int dan = 0 ;
		int output = 0 ;
	    
	    if (menu == 1) {
			dan = 3500 ;
		} else if (menu == 2) {
			dan = 4000 ;
		} else if (menu == 3) {
			dan = 3000 ;
		} else if (menu == 4) {	
			dan = 3500 ;
		}
		
		output = input - (int)(dan*su*1.1);
	    
	    System.out.print("잔돈은 " + output + "원 입니다.");
	    
	    
	}
}
