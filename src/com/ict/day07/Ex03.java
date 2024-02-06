package com.ict.day07;

public class Ex03 {
	public static void main(String[] args) {		
		//	배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		//		** 반드시 같은 자료형이어야 한다.
		//		생성할 때 크기를 지정해야 된다. (지정하지 않으면 생성 안됨)
		//		한번 지정한 크기는 변경이 안된다.
		//		배열 안에 데이터를 가져오기 위해서는 일반적으로 for 문을 사용한다.
		
		//	배열 생성 순서 : 선언 > 생성 > 초기화(데이터 저장)
		
		//	1. 선언
		//	: 자료형 이름[]; 또는 자료형[] 이름;
		
		int su[]; // int[] su;
		
		//	2. 생성
		//	: 이름 = new 자료형[배열크기];	
		//	new 예약어 
		//	: 메모리에 데이터를 저장할 공간을 만들어달라 ( 인스턴스, 객체생성 )
		
		su = new int[4];	// int 가 들어갈 수 있는 방을 만들고, 그 주소를 su 에 저장한다.
		
		//	3. 데이터 저장 (초기화)
		//	: 이름[index = 위치값(0부터 시작)]
		//	데이터는 같은 자료형이어야 한다. (프로모션 가능 : 작은 자료형이 큰 자료형으로 변경)
		
		su[0] = 100;
		su[1] = 'a'; 		// 프로모션 (char < int)
		//su[2] = 3.14; 	// 큰 자료형이라 안들어감  		
		su[2] = (int)(3.14);// 디모션 (int < double)		 		
		su[3] = 100;
		//su[4] = 500;		// run time 오류 발생 (문법적으로는 맞지만 배열의 크기를 벗어나면 오류 발생)
		
		su[2] = 107;		// 방 1개는 변수로 취급, 가장 최신의 값만 저장
		
		//	배열을 호출하면 주소(생성ID)가 출력
		System.out.println(su);	// 주소값 출력
		System.out.println(su[0]);	// su 주소의 0번방에 있는 데이터 출력
		System.out.println(su[1]);	// su 주소의 1번방에 있는 데이터 출력
		System.out.println(su[2]);	// su 주소의 2번방에 있는 데이터 출력
		System.out.println(su[3]);	// su 주소의 3번방에 있는 데이터 출력
		System.out.println();
		
		// 	반복하면서 변하는게 있을 때 for 문 사용
		for (int i = 0; i < 4; i++) {
			System.out.println(su[i]);
		}
		System.out.println();
		
		//	**배열의 전체를 출력할때는 보통 for 문 사용
		//	배열의 크기 = 배열이름.length	(사용시 괄호는 없다)
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
		
		
		
	}
}
