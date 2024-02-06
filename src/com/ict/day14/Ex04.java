package com.ict.day14;

//	static 내부클래스

public class Ex04 {
	String name = "홍길동";
	private int age = 24;
	static int cnt = 14;
	public void play() {
		int money = 10000;
		System.out.println("외부메서드 : " + money);
	}
	
	public static void like() {
		System.out.println("like");
	}
	
	public static class Inner03{
		String addr = "서울 마포구";
		//	내부클래스의 멤버 중에 static 이 있으면, 클래스에도 static 을 붙여야한다.
		static int room = 5;
		
		public void prn() {
			//System.out.println(name);	//	클래스에 static 을 붙이는 순간 외부클래스의 인스턴스 사용 불가
			//System.out.println(age);	//									스태틱은 사용 가능
			System.out.println(addr);
			System.out.println(room);
			System.out.println(cnt);
			//play();
			like();
		}
	}
	
	
}
