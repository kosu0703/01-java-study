package com.ict.day02;

public class Ex07 {
	public static void main(String[] args) {
		//	String : 문자열을 처리하기 위한 클래스이다.
		//			기본 자료형은 아니다. 참조 자료형이다. 즉, 클래스를 자료형으로 사용
		//			기본 자료형과 사용법이 같다.
		//			데이터에는 반드시 쌍따옴표 "내용" 을 사용한다.
		//	String 이름 = "내용"
		
		//	+ 연산자를 사용할 수 있다.
		//	실제로 더하는 것이 아니라 문자열과 문자열을 연결하는 역할을 한다.
		//	+ 연산을 하면 무조건 결과는 문자열이다. 즉, String 이 된다.
		//	더하기만 사용가능 , 다른 사칙연산 - / * 는 사용불가 오류
		
		String s1 ="Hello" ;
		System.out.println(s1);
		
		//String s2 = 10 ; 쌍따옴표가 없으면 오류난다.
		//String s3 = 'a' ; 홑따옴표는 문자 , 문자는 char
		
		String s4 = "a" ; // 쌍따옴표는 문자열 , 문자열은 String
		System.out.println(s4);
		
		String k1 = "1000" ;
		System.out.println(k1);
		
		int k2 = 1000 ; 
		System.out.println(k2);
				
		//System.out.println(k1-100); 문자열에는 - 연산자 사용시 오류가 난다. 
		System.out.println(k1+100); // 1000 이 문자열이기 때문에 100 이 뒤에 붙는다.
		System.out.println(k2+100); // 1000 이 숫자이기 때문에 100 이 더해진다.
		
		//int k3 = 105 + "105" ; 숫자에 문자열을 더하면 문자열이다. 즉, String 형으로 됨
							//	문자열에 + 연산자를 사용하면 무조건 결과는 String 이다.
		String k4 = 105 + "105" ; // 문자열은 무조건 String 에 저장해야 한다.
		
		int su1 = 20 ;
		int su2 = 4 ;
		System.out.println(su1+su2); 
		System.out.println("합계 : " +su1+su2); // 문자열에 + 연산자를 사용하면 문자열이다. 
											// 문자가 나열된다. 즉, 합계 : 20 4
		System.out.println("합계 : " +(su1+su2)); // 숫자끼리 묶고 먼저 계산후 출력
		
		
	}
}
