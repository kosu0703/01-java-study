package com.ict.day11;

public class Ex10 {
	public static void main(String[] args) {
		//	기본생성자
		//	초기값을 변경할 의사가 없다.
		Ex09 ex09 = new Ex09();
		System.out.println("이름 : " + ex09.getName());
		System.out.println("나이 : " + ex09.getAge());
		System.out.println("주소 : " + ex09.getAddr());
		System.out.println();
		
		//	이름만 변경하는 생성자를 사용
		Ex09 ex092 = new Ex09("땡구");
		System.out.println("이름 : " + ex092.getName());
		System.out.println("나이 : " + ex092.getAge());
		System.out.println("주소 : " + ex092.getAddr());
		System.out.println();
		
		//	생성자에서 다른 생성자 호출
		//	이름,나이 변경하는 생성자에서 기본생성자 호출
		Ex09 ex093 = new Ex09("짱구", 5);
		System.out.println("이름 : " + ex093.getName());
		System.out.println("나이 : " + ex093.getAge());
		System.out.println("주소 : " + ex093.getAddr());
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
