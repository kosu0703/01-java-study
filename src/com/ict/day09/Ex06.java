package com.ict.day09;

public class Ex06 {
	String name = "홍길동";
	static int kor = 80 ;
	static int eng = 95 ;
	static int math = 95 ;
	int total = 0 ;
	
	//	static 메서드						 
	//	스태틱 메서드가 전역변수를 사용하기 위해서는 
	//	전역변수도 스태틱 이어야 한다.
	//	메서드 안에 있는 지역변수는 static 을 사용할 수 없다.
	
	public static void play01() {		//	스태틱은 미리 만들어져 있어야 되는데 국영수는 미리 만들어져 있지 않아서
		int sum = kor + eng + math ;	//	국영수를 스태틱으로 만들어야 한다.
		
		
		//System.out.println(name);
		System.out.println(kor);
		System.out.println(sum);
		System.out.println("play01 메서드 끝");
	}									
	
	
	public static int play02() {
		int sum = kor + eng + math;
		//static int sum = kor + eng + math; 	지역변수에는 static 을 사용할 수 없다.
		return sum;
	}

	
	
	
	
	
	
	
	
	
	
	
}
