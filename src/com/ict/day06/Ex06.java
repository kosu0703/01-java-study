package com.ict.day06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//	숫자를 받아서 홀수인지 짝수인지 
		esc: while (true) {			
			
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String res = "";		
			if (su % 2 == 1) {
				res= "홀수";
			} else {
				res= "짝수";
			}
			System.out.println(su + " : " + res);
			
			while (true) {
				System.out.println("계속할까요? (1.yes 2.no) >> ");
				int su2 = scan.nextInt();
				if (su2 == 1) continue esc ;
				if (su2 == 2) break esc ;
				
				System.out.println("제대로 입력하세요.");
			} // 안쪽 while
		} // 바깥쪽 while
		System.out.println("수고하셨습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
