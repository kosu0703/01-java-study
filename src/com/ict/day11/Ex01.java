package com.ict.day11;

public class Ex01 {
	
	//	생성자 : 클래스를 객체로 만들때 한번 호출된다.
	
	//	형식) 클래스이름 참조변수 = new 생성자([인자]);
	
	//	목적) 멤버필드(변수와 상수)의 초기값 지정
	
	//	특징) 클래스이름 = 저장이름 = 생성자이름
	//		반환형이 없는 메서드와 같다. (void 처럼 갔다가 기능을 하고 다시 온다.) 
	//		메서드처럼 기능, 동작을 할 수 있다.
	//		클래스의 생성자가 없으면 기본생성자로 객체를 생성한다.
	//		기본생성자란 인자가 없는 생성자를 말한다.
	//		생성자도 메서드와 같이 오버로딩이 가능하다. (즉, 여러개의 생성자를 만들 수 있다.)
	//		생성자는 다른 생성자를 호출할 수 있다.
	
	//	**자바에서 변수를 변경하는 방법
	//		1. 생성자에서 변수 변경
	//		2. setter 를 이용하여 변수 변경
	
	
	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";
	
	//	생성자를 만들어 보자	ctrl + space bar (constructor)
	/*
	public Ex01() {
		System.out.println("Ex01 생성자\n");
		name = "희동이";
		//	멤버필드의 값을 지정(초기값)
		//	메서드처럼 다른 기능을 만들 수도 있다.
		//	메서드처럼 다른 메서드를 호출할 수 있다.
		//	다른 생성자를 호출할 수 있다.
	}
	*/
	
	/*
	//	다른 방법	( 메뉴탭 > Source > Generate constructor using Fields ) 
	//	하지만 기본생성자는 무조건 만들어 놓자.
	public Ex01(String name) {
		this.name = name;
	}
	*/
	
	public Ex01(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
	
	
}
