package com.ict.day09;

public class Ex07 {
	public static void main(String[] args) {
		
		//	static 은 객체 생성과 상관없이 호출 가능
		//	호출방법 : 클래스이름.멤버필드 , 클래스이름.멤버메서드()
		
		System.out.println(Ex06.kor);	
		System.out.println(Ex06.eng);	
		System.out.println(Ex06.math);	
		
		Ex06.play01();
		//System.out.println(Ex06.play01());	void 여서 아무런 값도 안오기 때문에 출력할게 없다.
		
		int k = Ex06.play02();
		System.out.println(k);	//	반환형 int 형인 sum 이 return 되서 출력됨
		
		
		
		
		
		
	}
}
