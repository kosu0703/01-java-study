package com.ict.day12;

//	상속관계 (is a 관계) 
//	: 자식클래스가 부모 클래스의 멤버필드와 멤버메서드를 마음대로 사용할 수 있는 클래스들 간의 관계
//	부모클래스(super), 자식클래스(sub, child)

//	형식) 자식클래스 extends 부모클래스

//	특징) 모든 클래스는 하나의 부모클래스를 갖는다. (없으면 Object 가 부모클래스)
//		즉, 모든 클래스는 Object 를 부모클래스로 가지고 있다.
//		다중 상속을 지원하지 않는다. (부모클래스가 하나만 존재)
//		부모클래스(super), 자식클래스(sub, child)

//			자식클래스	extends 부모클래스
public class Ex01_Sub extends Ex01_Sup{
	String name = "홍반장";
	int age = 13 ;
	double weight = 81.9;
	
	public Ex01_Sub() {
		System.out.println("자식 생성자 : " + this);
		
	}
	
	public void play() {				//	변수 우선 순위
										//	지역변수 > 전역변수(this) > 부모변수(super)	
		String name = "홍두께";				
		System.out.println(name);		//	메소드 안 지역변수 홍두께
		System.out.println(this.name);	//	속한 클래스의 전역변수 홍반장	
		System.out.println(super.name);	//	부모 클래스의 멤버필드 홍길동
		
		System.out.println(age);		//	메소드 안에 age 가 없으므로 전역변수를 가져다 씀
		System.out.println(this.age);	//	this 써도 안써도 무방
		
		System.out.println(addr);		//	자식클래스 내에 addr 이 없으므로 부모클래스 멤버필드 가져다 씀
		System.out.println(this.addr);	//	this , super 써도 안써도 무방
		System.out.println(super.addr);	//	super 쓰는 것이 정석
		
		//System.out.println(dog);		//	부모의 private 은 접근불가	(부모는 외부)		
		System.out.println(weight);		//	같은 private 이지만 자기꺼는 사용 가능 (자신은 내부)
		
		
	}
	
	
	
}
