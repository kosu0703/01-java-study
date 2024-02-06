package com.ict.day02;

public class Ex01 {
	//main 치고 ctrl + space bar
	public static void main(String[] args) {
		// 	주석 : 컴파일러는 무시하고 사람에게는 보이는 줄
		//		(해당 코딩의 설명글을 표시하는 줄)
		
		//	변수는 데이터 하나를 저장하는 영역이다.
		//	가장 최신의 데이터만 남는다.
		//	변수에 10이 저장되어있다가 20을 저장하면 
		//	10을 지우고 20이 저장된다.
		//	변수 앞에 어떤 데이터를 저장할 수 있는지 맨처음에 표시한다.( 선언)
		// 	어떤 데이터를 담을지 맨처음 한번만 선언
		//	어떤 데이터 = 자료형
		
		//	논리형 : boolean 으로 사용, true 또는 false 를 말한다.
		// 	논리형을 변수에 기억시키는 방법
		
		//	1. boolean 변수이름 ; (선언)
		//	이 변수는 논리만 담을 수 있다.
		
		//	2. 변수이름 = 데이터 ; (저장=기억=대입)
		// 	데이터가 변수에 저장된다 라는 뜻
		//	데이터는 표현범위
		//	즉, boolean 형에서는 true 또는 false 만 사용할 수 있다.
		
		// bo 치고 ctrl + space bar
		boolean b1;
		// 	b1 은 논리형이다. 즉, true 또는 false
		b1 = true;
		// 	; 는 끝표시 ( 항상 한줄 끝날때마다 ; 쳐야한다 )
		//	자주색은 예약어
		//	true 가 b1에 저장된다.
		
		// sysout 치고 ctrl + space bar
		System.out.println(b1);
		//	변수를 호출하면 변수안에 있는 데이터가 나온다.
		b1 = false;
		System.out.println(b1);
		// 	변수는 최신 데이터만 저장된다.
		//	변수는 하나의 데이터만 가질 수 있기 때문이다.
		System.out.print("b1은 ");
		System.out.println(b1);
		System.out.println("b1은 값이 바뀌니까 변수다!");
		
		//	다른 변수 b2 만들기
		//	자료형(boolean) 변수이름 = 데이터 ;
		//	선언과 저장을 한번에
		boolean b2 = true;
		System.out.print("b2는 ");
		System.out.println(b2);
		
		b2 = false;
		System.out.println(b2);
		System.out.println("b2도 값이 바뀌므로 변수다.");
		
		//	boolean 은 true, false 이외에는 오류 발생한다.
		//	boolean b3 = 10;
		//	정확하지 않으면 안받아준다.
		
		
	}
}
