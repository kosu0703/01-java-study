package com.ict.day06;

import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		//	break 와 break label
		//	break : 현재 위치의 블록 (자기가 속한 블록) 을 탈출
		//	break label : 레이블이 지정한 블록을 탈출
		
		//	레이블 : 반복문 앞에 '레이블 이름' 을 붙이면 된다.
		
		
		// 	1 ~ 10 출력
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		//	break 사용
		
		for (int i = 1; i < 11; i++) {
			if(i == 6)	break ;
			System.out.print(i + " ");
		}
		
		System.out.println();

		
		//	break label 사용
		//	반복문 앞에 label 이름 뒤에 : 세미클론을 붙인다.
		//	단순 for 문에는 break label 을 붙일 이유가 없다.
		
		exit: for (int i = 1; i < 11; i++) {
			if(i == 6)	break exit ;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("\n다중 for문에서 break label 사용하기\n");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		
		System.out.println("break\n");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	break ;
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		
		System.out.println("break label\n");
		
		exit: for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	break exit;
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
