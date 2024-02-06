package com.ict.day07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		esc:while (true) {
			System.out.print("숫자 입력 : ");
			String su = scan.next();
			//	숫자가 아닌 것을 넣으면 오류 발생 (나중에 try ~ catch 처리)
			int su2 = Integer.parseInt(su);
			//	문자열을 숫자로 변경
			String res = "";
			
			if (su2 % 2 == 0) {
				res = "짝수";
			}else {
				res = "홀수";
			}
			System.out.println(su2 + " : " + res + "입니다.");
			
			
			while (true) {
				System.out.print("계속할까요?(y/n) >> ");
				String msg = scan.next();
				//	String 에서는 같다를 == 사용하면 안된다.
				//	equals() 대소문자 구분 가능
				//	equalsIgnoreCase() 대소문자 구분 불가능
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}
				if(msg.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로 입력하세요.");				
			}
		}
		System.out.println("수고하셨습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
