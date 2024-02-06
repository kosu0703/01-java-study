package com.ict.day13;

enum Type{
	WALKING , RUNNING , TRACKING , HIKING
}

public class Ex13 {
	
	String name;
	int size;
	Type type;		//	enum 이 자료형
	
	public static void main(String[] args) {
		
		//	static 만 부를 수 있지만 
		//	객체 생성하면 참조변수를 통해 가져다 쓸 수 있다.
		
		Ex13 shose = new Ex13();
		shose.name = "나이키";
		shose.size = 275;
		shose.type = Type.RUNNING;	//	enum 에서 끄집어내서 저장한다.
		
		System.out.println(shose.name);
		System.out.println(shose.size);
		System.out.println(shose.type);
		
	}
	
	
	
	
}
