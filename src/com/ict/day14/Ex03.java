package com.ict.day14;

//	Local 내부클래스

public class Ex03 {
	String name = "둘리";
	private int age = 3 ;
	
	public Ex03() {
		System.out.println("외부 : " + this);
	}
	
	public void sound() {
		String str = "호이~ 호이~";
		System.out.println(str);
	}
	
	//	내부클래스를 가지고 있는 메서드
	public void play() {
		int age = 147;
		int cnt = 10;
		
		class Inner02{
			String addr = "서울";
			
			
			public Inner02() {
				System.out.println("내부 : " + this);
			}
			
			public void like() {
				System.out.println(name);
				System.out.println(age);
				//System.out.println(this.age);	//	내부클래스 안이기 때문에 this 는 내부클래스를 지칭한다.
												//	즉, 외부클래스의 this 와 내부클래스의 this 가 다르다.
				sound();	// 메서드 내에서는 사용 가능	
			
			} // 내부메서드 끝
			
			public void setA(int k) {
				System.out.println(k);
			}
			//	외부클래스의 메서드 사용불가
			//sound();
		
		} // 내부클래스 끝
		
		Inner02 inner02 = new Inner02();
//		System.out.println(name);		//	둘리
//		System.out.println(age);		//	147
		System.out.println(this.age);	//	내부클래스가 끝나기 때문에 this 를 사용하면 외부클래스를 지칭한다.
		inner02.like();					//	like , 호이호이
		System.out.println("================");
		inner02.setA(this.age);
		
	} // 외부메서드 끝
	
} // 외부클래스 끝
