package com.ict.day17;

public class Ex11_Main {
	public static void main(String[] args) {
		//	1. 일반적인 방법
		Ex11 t = x -> System.out.println(x);
		t.showString("hello lamda_1");
		
		//	2. 메서드 인자에 인터페이스 참조변수
		showMyString(t);
		
		//	3. 메서드의 인자가 인터페이스면 바로 만들 수 있다.
		showMyString(new Ex11() {	
			
			@Override
			public void showString(String str) {
				System.out.println("hello lamda_3");
			}
		});
	}
	
	//	2. static 메서드는 static 메서드만 호출할 수 있다.
	public static void showMyString(Ex11 k) {
		k.showString("hello lamda_3");
	}
	
		
	
	
}
