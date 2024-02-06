package com.ict.day14;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		esc: while (true) {
			// 예외처리 (오류가 나면 무조건 처리해준다.)
			try {
				System.out.print("숫자 입력 : ");
				String su = scan.next();
				// 숫자가 아닌 것을 넣으면 오류 발생 (나중에 try ~ catch 처리)
				int su2 = Integer.parseInt(su); // 여기서 예외 발생 NumberFormatException

				// 문자열을 숫자로 변경
				String res = "";

				if (su2 % 2 == 0) {
					res = "짝수";
				} else {
					res = "홀수";
				}
				System.out.println(su2 + " : " + res + "입니다.");

				while (true) {
					System.out.print("계속할까요?(y/n) >> ");
					String msg = scan.next();
					// String 에서는 같다를 == 사용하면 안된다.
					// equals() 대소문자 구분 가능
					// equalsIgnoreCase() 대소문자 구분 불가능
					if (msg.equalsIgnoreCase("y")) {
						continue esc;
					}
					if (msg.equalsIgnoreCase("n")) {
						break esc;
					}
					System.out.println("제대로 입력하세요.");
					
				} // 안 while
				
			} catch (NumberFormatException e) {
				System.out.println("문자를 입력하면 안됩니다!!");
			}
			System.out.println("밖 while 전");
			
		} // 밖 while
		
		System.out.println("수고하셨습니다.");

	}
}
