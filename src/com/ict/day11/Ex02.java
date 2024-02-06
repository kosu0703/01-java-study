package com.ict.day11;

public class Ex02 {
	public static void main(String[] args) {
		
		//	Ex01 객체 생성
		//	생성자가 없으면 기본생성자 사용
		//	**생성자를 만들면 기본생성자는 쓸 수 없다.
		Ex01 ex01 = new Ex01("도우너", 11);
			
		
		//	이름, 나이, 주소 출력		정보를 가져올 때는 getter 사용
		System.out.println("이름 : " + ex01.getName());
		System.out.println("나이 : " + ex01.getAge());
		System.out.println("주소 : " + ex01.getAddr());
		System.out.println();
		
		//	이름을 임꺽정, 나이를 34	주소를 함경도 변경할 때는 언제 어디서나 setter 사용
		ex01.setName("임꺽정");
		ex01.setAge(34);
		ex01.setAddr("함경도");
		System.out.println("이름 : " + ex01.getName());
		System.out.println("나이 : " + ex01.getAge());
		System.out.println("주소 : " + ex01.getAddr());
		System.out.println();
		
		
		//	생성자가 없어서 기본생성자 사용
		//	Ex01 에 생성자를 만들어보자
				
		
		
		
		
		
		
		
		
		
		
		
	}
}
