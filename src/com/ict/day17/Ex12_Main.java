package com.ict.day17;

public class Ex12_Main {
	public static void main(String[] args) {	
	//	Ex12 t = s -> System.out.println(s + "님 환영");	
		
		Ex12 t = returnString();	//	1. 메서드의 반환형이 Ex12여서 Ex12로 받았다.
		t.showString("hello");
		
		showMyString(t);			//	2. 메서드를 호출하고 인자에 Ex12 인터페이스
		
		Ex12 t2 = returnString2();	//	3. 메서드의 반환형이 Ex12 인터페이스
		t2.showString("lamda");
		
	}

	public static Ex12 returnString() {			// 1.	//	반환형이 Ex12 함수형 인터페이스
		return s -> System.out.println(s + "님 환영");		//	반환값으로 사용하는 람다식
	}
	
	public static void showMyString(Ex12 k) {	// 2.	//	메서드 인자의 자료형이 Ex12 인터페이스형
		k.showString("world");							//	매개변수로 전달하는 람다식
	}
	
	
	public static Ex12 returnString2() {		// 3.	//	1 과 비슷한데 
		return new Ex12() {								//	반환값으로 Ex12 인터페이스를 
														//	오버라이드해서 사용
			@Override
			public void showString(String str) {
				System.out.println(str + "님 화이팅");
			}
		};
	}

}
