package com.ict.day17;

//	두 개의 문자열을 받아서 하나의 문자열로 만들자.
interface Ex10 {
	public void makeString(String s1, String s2);
	
}

//	일반적인 방법
//		1. 일반 클래스가 인터페이스를 상속받고, 오바라이딩 한다.

class Ex10_1 implements Ex10{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1.concat(s2));	//	concat 두 문자열 합치기
		System.out.println(s1 + s2);
	}
	
}

