package com.ict.day03;

import java.util.Scanner;
	
	//	패키지가 java.lang 에 존재하는 클래스는 import 를 할 필요가 없다.
	//	java.lang 이외에 존재하는 클래스를 사용하기 위해서는 import 를 해야한다.
	//	import 란 해당 클래스의 위치를 표시하므로 해당 클래스를 사용할 수 있게 한다.

public class Ex10 {
	public static void main(String[] args) {
		
		//	키보드에 입력한 정보를 받아서 변수에 저장
		Scanner scan = new Scanner(System.in); 	// 	키보드에 입력된 데이터가 scan 이라는 변수에 저장된다.
		
		System.out.print("이름 : ");
		String name = scan.next(); // .next() : 입력한 내용을 String 으로 처리하는 메서드
		System.out.println("당신의 이름 : " + name);
		
		
		System.out.print("나이 : ");
		String age = scan.next(); 	
		System.out.println("당신의 나이 : " + (age+1)); // 문자열에 1을 더하면 문자열 나열됨
		
		
		System.out.print("나이2 : ");
		int age2 = scan.nextInt();	//	.nextInt() : 입력한 내용을 int 형으로 처리하는 메서드
		System.out.println("당신의 나이2 : " + (age2+1)); // 문자를 넣으면 오류남
		
		
		System.out.print("키 : ");
		double height = scan.nextDouble(); 	//	.nextDouble() : 입력한 내용을 double 형으로 처리하는 메서드
		System.out.println("당신의 키 : " + height + " 입니다."); 
		
		
		
	}
}
