package com.ict.day06;

import java.util.Scanner;

//	Ex07 풀이
public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//	전체 몇번 실행해서, 짝수가 몇번 나왔다
		//	전체횟수, 짝수횟수, 퍼센트(소수점 둘째자리)
		
		int count = 0 ;
		int even = 0 ;
		
		esc:while (true) {
			count++;
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String res = "";
			if (su % 2 == 0) {
				even++;
				res = "짝수";
			} else {
				res = "홀수";
			}
			while (true) {
				System.out.print("계속할까요? (1.yes 2.no) >> ");
				int su2 = scan.nextInt();
				if (su2 == 1) continue esc ;
				if (su2 == 2) break esc ;
				System.out.println("제대로 입력하세요.");
			}
		}
		System.out.println("수고하셨습니다.");
		double per = (even/(count*1.0)) * 100 ; 	
		System.out.println("전체 횟수 : " + count);
		System.out.println("짝수 횟수 : " + even);
		System.out.println("퍼센트 : " + (int)(per*100)/100.0);
		
		
		
		
		
		
		
		
		
	}
}
