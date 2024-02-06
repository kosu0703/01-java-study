package com.ict.day10;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal t = new Animal();
		
		System.out.println("이름 : " + t.getName());
		System.out.println("나이 : " + t.getAge());
		if (t.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");			
		}
		System.out.println();
		
		//	이름을 펭귄으로 변경하자
		t.setName("펭귄");

		System.out.println("이름 : " + t.getName());
		System.out.println("나이 : " + t.getAge());
		if (t.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");			
		}
		System.out.println();
		
		
		Animal t2 = new Animal();	// 	새로운 객체 생성 (안에 구조는 같지만 내용은 다시 초기화)
									// 	위에 있는 객체와는 다르다.
		
		System.out.println("이름 : " + t2.getName());
		System.out.println("나이 : " + t2.getAge());
		if (t.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");			
		}
		System.out.println();
		
		//	이름을 펭귄으로 변경하자
		t2.setName("펭귄");
		
		System.out.println("이름 : " + t2.getName());
		System.out.println("나이 : " + t2.getAge());
		if (t.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");			
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
}
