package com.ict.day12;

public class Ex01_Main {
	public static void main(String[] args) {
		
		//	보통 자식클래스를 객체생성하고 부모클래스도 가져다 쓴다.
		//	자식클래스를 객체 생성하면 부모클래스의 객체가 먼저 생성되고, 그 다음에 자식 클래스의 객체가 생성된다.
		//	(자식이 호출되면 부모를 호출하고, 부모가 생성된 다음 자식이 생성된다)
		
		Ex01_Sub t = new Ex01_Sub();		
		System.out.println(t);		//	**부모 객체가 먼저 생성되고, 자식 객체가 생성된다.
		System.out.println();
		
		t.play();
		System.out.println();
		
		//	부모클래스의 멤버필드가 private 이 아니면 접근 가능
		System.out.println(t.addr);	//	자식에게 없으면 부모한테로 간다.
		System.out.println(t.age);	//	부모보다 자식이 우선순위가 높다.
		System.out.println();
		
		//	static 은 객체, 상속 등과 상관없이 그냥 호출 가능
		//	클래스이름.멤버필드 or 클래스이름.멤버메서드
		System.out.println(Ex01_Sup.car);
		System.out.println(Ex01_Sup.GENDER);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
