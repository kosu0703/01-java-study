package com.ict.day07;

public class Ex04 {
	public static void main(String[] args) {
		//	선언	char[] ch;
		//	생성	ch = new char[4];
		
		//	선언, 생성 한번에
		char[] ch = new char[4];
		
		//	초기값
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 65; // 원래는 char 안에 int 안들어가지만
					// 0~65535 까지는 가능
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		//	for 문을 생성하면 자동으로 바로 위에 있는 배열의 길이가 설정된다.
		
		System.out.println();
		
		
		//	선언, 생성, 초기값 한번에
		char [] ch2 = {'j','a','v',97};
		
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		
		int[] k2 = {100,200,300,400};
		for (int i = 0; i < k2.length; i++) {
			System.out.println(k2[i]);
		}
		System.out.println();
		
		double[] d2 = {7.45,5.5,4.55,8.75};
		for (int i = 0; i < d2.length; i++) {
			System.out.println(d2[i]);
		}
		System.out.println();
				
		//	자료형이 클래스면 객체형 배열 (참조 자료형 배열)
		String[] s2 = {"나의","이름은","고예찬","입니다"};
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}
