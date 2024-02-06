package com.ict.day06;

public class Ex05 {
	public static void main(String[] args) {
		//	continue 와 continue label
		//	continue : continue 이하 수행문을 포기하고 해당 for 문의 증감식으로 이동
		//	continue label : continue 이하 수행문은 포기하고, 레이블이 있는 반복문의 증감식으로 이동
		
		
		//	1 ~ 10 출력
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//	continue
		
		for (int i = 1; i < 11; i++) {
			if(i == 6) continue ;
			System.out.print(i + " ");
		}
		System.out.println();
		
		//	continue label
		
		esc: for (int i = 1; i < 11; i++) {
			if(i == 6) continue esc ;
			System.out.print(i + " ");
		}
		System.out.println();
		
		//	단순 for 문일때 label 을 사용할 필요가 없다.
		
		System.out.println("\n다중 for 문에서 continue label 사용하기\n");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		
		System.out.println("\ncontinue\n");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	continue ;
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		
		System.out.println("\ncontinue label\n");
		
		esc: for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	continue esc ;
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		
		//	결과같은 같지만 continue 일때는 i 가 2 일때 j 는 1부터 5까지 증가한 후 끝나고 i 가 3으로 증가한다.
		//	그러나 continue label 일때는 i 가 2 일때 j 는 1만 찍히고 바로 i 가 3 으로 증가한다.
		//	즉, continue label 보다 continue 의 실행 횟수가 5번 더 돌아간다
		
		
		
		
		
	}
}
