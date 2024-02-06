package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		//	전체 몇번 실행해서, 짝수가 몇번 나왔다
		//	전체횟수, 짝수횟수, 퍼센트(소수점 첫째자리)
		
		int sum = 0 ;
		int even = 0;
		
		esc: while (true) {
			
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String res = "";
			if (su % 2 == 1) {
				res = "홀수";
				
			} else {
				res = "짝수";
				even++ ;
			}
			System.out.println(su + " : " + res);
			sum++ ;
			
			while (true) {
				
				System.out.print("계속할까요? (1.yes 2.no) >> ");
				int su2 = scan.nextInt();
				if (su2 == 1) continue esc ;
				if (su2 == 2) break esc ;
				System.out.println("제대로 입력하세요.");
			}
		}		
		
		System.out.println("\n전체 횟수 : " + sum);
		System.out.println("짝수 횟수 : " + even);
		System.out.println("짝수가 나온 확률 : " + (int)((even*100.0/sum)*10)/10.0 + "%");
		System.out.println("\n수고하셨습니다.");
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
	}
}
