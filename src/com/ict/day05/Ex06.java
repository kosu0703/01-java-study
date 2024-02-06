package com.ict.day05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 키보드로 받는 값을 반복해서
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String res = "";
			
			if (su % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println(su + "는 " + res + "입니다.");	
			
			System.out.print("계속할까요? (1.yes 2.no >> ");			
			int res2 = scan.nextInt();			
			if (res2 == 2) 	break ;			
		}

		// 횟수가 정해져 있으면 for 문
		// 횟수가 정해지지 않으면 while 문	>	무한루프 돌려놓고 빠져나갈거를 설정해놓기
		
		
	}
}
