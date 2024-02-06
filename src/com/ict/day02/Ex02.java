package com.ict.day02;

public class Ex02 {
	public static void main(String[] args) {
		// 무언가 시작할 수 있는 단계
		// main 메서드는 항상 class 안에
		
		//	문자형 : char , 숫자로 저장된다. > 연산이 가능하다.
		//		그러나 우리는 숫자 대신에 ' 홑따옴표를 사용 ('a', 'A', '가' ...)
		//		한 글자만 저장할 수 있다.
		//		'10' 은 '1' 과 '0' 두 글자이다 
		//		한글자일 때 문자 , 두글자 이상일 때 문자열
		
		// 선언
		// char 변수이름 ; (선언)
		// 변수이름 = 데이터 ( 한글자만 가능 , 'a', 'A', '가' ....)
		char ch1; // 선언
		ch1 = 'a'; // 데이터 저장 , 실제로 숫자로 저장됨 , 그래서 연산이 가능하다.
		System.out.println(ch1); // 출력
		// system.out 모니터에 println() 출력하고 줄바꿈
		
		ch1 = 'A';
		System.out.println(ch1);
		// 가장 최신값만 기억
		
		ch1 = 100;
		System.out.println(ch1);
		// 숫자로 저장 가능 , 문자에 해당하는 숫자
		
		ch1 = 23456;
		System.out.println(ch1);
		
		char ch2 = 'b';
		System.out.println(ch2);
		
		ch2 = 200;
		System.out.println(ch2);
		
		ch2 = 'c';
		System.out.println(ch2);
		
		ch1 = 100-32;
		System.out.println(ch1); // ch1 변수에 계산된 숫자가 저장되었으므로 문자 D 출력
		System.out.println(ch1+32); // 변수에 저장하지 않았으므로 문자가 아니라 숫자 100 출력
		//	계산 후 변수에 저장해야지만 문자형으로 출력됨
		//	즉, 저장안하고 계산값을 출력하면 숫자 출력됨
		//	왜냐면 char 변수는 항상 숫자로 저장되기 때문에
		
		System.out.println(ch1+ch2);
		
		// char ch3 = ch1 + ch2 ; 
		char ch3 = (char)(ch1+ch2) ; // ch1 , ch2 는 숫자로 저장되서 int 형이기 때문에 char 형으로 변환시 오류가 난다.
									// 따라서 강제 형 변환을 통해 저장해야한다.
		System.out.println(ch3) ;
		
	}
}
