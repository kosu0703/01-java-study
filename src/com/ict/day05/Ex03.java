package com.ict.day05;

import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		//	중첩 for 문 : for 문 안에 또 다른 for 문이 존재하는 것
		for (int i = 0; i < 4; i++) {
			System.out.println("명령문1");
			for (int j = 0; j < 6; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println("명령문2");
			System.out.println();
		}

		
		//	구구단 2단부터 9단까지 세로로
		System.out.println();
		
		for (int i = 2; i < 10 ; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
		
		//	구구단 가로로

		for (int i = 2; i < 10 ; i++) {
			for (int j = 1; j < 10; j++) {
				if (i*j<10) {
					System.out.print(i + "*" + j + "=" + (i*j) + "  ");
				} else {
					System.out.print(i + "*" + j + "=" + (i*j) + " ");
				}
			}
			System.out.println();
		}
		
		
		//	구구단 세로를 가로로
		System.out.println();
		
		for (int i = 1; i < 10 ; i++) {
			for (int j = 2; j < 10; j++) {
				if (j*i<10) {
					System.out.print(j + "*" + i + "=" + (j*i) + "  ");					
				} else {
					System.out.print(j + "*" + i + "=" + (j*i) + " ");
				}
			}
			System.out.println();
		}
		
		
		//	풀이
		
		System.out.println("구구단-1");
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i*j );
			}
			System.out.println();
		}
				
		System.out.println("구구단-2");
		for (int i = 2; i < 10; i++) {
			System.out.print(i + "단");
			for (int j = 1; j < 10; j++) {
					System.out.print(i + "*" + j + "=" + i*j + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("구구단-3");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
					System.out.print(j + "*" + i + "=" + i*j + "  ");
			}
			System.out.println();
		}
		
		//	for 문의 중첩에서는 먼저 바뀌는 것이 안쪽, 나중에 바뀌는 것이 바깥쪽
		//	뭐가 고정이고(천천히 변하고) 뭐가 계속 변하는지 알면
		//		바깥쪽 for 문			안쪽 for 문
		
		System.out.println();
		
		//	0 0 0 0		안쪽 for 문 0 이 4번
		//	0 0 0 0		바깥쪽 for 문 줄바꿈 이 4번
		//	0 0 0 0
		//	0 0 0 0		이중 for 문으로
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("0 ");		//	안쪽 for 문은 0 이 옆으로 4번
			}								//	옆으로니까 print
			System.out.println();			//	안쪽 for 문 끝나면 줄바꿈 println
		}
		
		System.out.println();
		
		//	1 0 0 0 	i 와 j 가 같으면 1 아니면 0
		//	0 1 0 0 
		//	0 0 1 0 
		//	0 0 0 1		for 문의 규칙을 찾자
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		//	if else 가 아니라 if 만 쓰면, if 를 실행하고 for 문 안에있는 0을 또 실행하기 때문에 
		//	조건을 만족하면 1 0 이 출력된다.
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1 ");
				} 
				System.out.print("0 ");
			}
			System.out.println();
		}
		
		//	1 0 0 0 0
		//	0 1 0 0 0
		//	0 0 1 0 0
		//	0 0 0 1 0
		
		
	}
}






