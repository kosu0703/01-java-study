package com.ict.day11;

public class Ex04 {
	public static void main(String[] args) {
		
		//	Ex03 클래스를 이용하여 나이가 3살, 이름이 큰뿔소이며 살아있는 객체를 생성하자
		//	즉, 객체를 생성할 때 나이와 이름, 생존여부의 초기값을 지정하자.
		
		Ex03 ex03 = new Ex03();
		
		System.out.println("이름 : " + ex03.getName());
		System.out.println("나이 : " + ex03.getAge());
		if (ex03.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어있음");			
		}
		System.out.println();	
		
		
		
		
		
		
		
		
		
		
		
	}
}
