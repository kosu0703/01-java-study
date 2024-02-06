package com.ict.day08;

public class Ex02 {
	public static void main(String[] args) {
		//	선언과 생성을 한번에
		//	자료형[][] 이름 = new 자료형[1차원 배열의 크기][1차원 배열이 참조하는 배열의 크기];
		
		
		//	고정길이 (**가변길이 일때 사용시 run time 오류)
		System.out.println("고정길이 일때만 사용");
		char[][] ch = new char[3][2];
		
		ch[0][0] = 'a';
		ch[0][1] = 'A';
		
		ch[1][0] = 'b';
		ch[1][1] = 'B';
		
		ch[2][0] = 'c';
		ch[2][1] = 'C';
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		System.out.println();
		
		
		//	아무때나 (고정길이 가변길이 모두)
		System.out.println("고정길이, 가변길이 모두 사용");
		int[][] su = new int[3][2];
		
		int[] k1 = {10,20};
		int[] k2 = {100,200};
		int[] k3 = {1000,2000};
		
		su[0] = k1;	//	su 배열의 첫번째 방에 k1 의 주소를 대입한다.
		su[1] = k2;	//	su 배열의 두번째 방에 k2 의 주소를 대입한다.
		su[2] = k3;	//	su 배열의 세번째 방에 k3 의 주소를 대입한다.
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		System.out.println();
		
		
		//	선언과 생성, 데이터 저장(초기화) 을 한번에
		//	자료형[][] 이름 = {{a,b},{c,d},{e,f}};
		
		int[][] num = {{1,2},{10,20},{100,200}};	//	int[3][2] num 과 같다
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
}
