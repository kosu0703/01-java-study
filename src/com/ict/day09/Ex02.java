package com.ict.day09;

public class Ex02 {
	public static void main(String[] args) {
		
		//	Ex01 클래스에 static 변수와 상수가 있다.
		//	객체 생성 없이 호출 할 수 있다.
		
		int k1 = Ex01.eng;
		int k2 = Ex01.COMPUTER;
		
		System.out.println("eng : " + k1);
		System.out.println("com : " + k2);
		System.out.println();
		
		
		//	Ex01 클래스를 객체로 만들자
		//	해당 클래스에 생성자가 없으면 무조건 기본생성자로 만든다.
		//	기본생성자 : 클래스이름() 
		//	즉, 인자가 없는 생성자를 기본생성자라고 한다.
		//	기본생성자 단축키 ctrl + space bar
		
		Ex01 t = new Ex01();	//	사용하기 위해서 클래스 Ex01 를 객체로 만든다.  
		
		System.out.println(t);	//	객체가 생성되면서 생긴 참조변수 t 의 주소가 나온다
		
		System.out.println(t.name);
		System.out.println(t.kor);
		System.out.println(t.MATH);
		
		System.out.println(t.eng);		//	오류는 안나지만 권장하지 않는다.
		System.out.println(t.COMPUTER);	// 	static 은 클래스. 으로 호출하자!
		System.out.println();
		
		
		//	변수와 상수
		
		t.kor = 90 ;	//	변수는 값 변경 가능
		System.out.println(t.kor);
		
		//t.MATH = 100 ;	상수는 값 변경 불가능
		
		
		
		
		
	}
}
