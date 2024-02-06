package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Main {
	public static void main(String[] args) {
		
		Ex03 p1 = new Ex03();
		p1.setName("둘리");
		p1.setAge(24);
		
		Ex03 p2 = new Ex03("희동이", 3);
		Ex03 p3 = new Ex03("마이콜", 20);
		
		//	같은 클래스로 만든 여러개 객체들을 모으는 방법 : 배열, 컬렉션
		
		//	1. 배열
		Ex03[] arr = new Ex03[3];	//	배열의 크기가 정해짐
		arr[0] = p1;				//	추가 못함
		arr[1] = p2;
		arr[2] = p3;
		
		//	2. 컬렉션	: 크기가 정해지지 않아서 추가/삭제 용이
		HashSet<Ex03> set01 = new HashSet<Ex03>();	
		set01.add(p1);
		set01.add(p2);
		set01.add(p3);
		set01.add(new Ex03("공실이", 24));
		set01.add(new Ex03("도우너", 14));
		
		//	3. 이름 꺼내기 
		
		//	배열 (일반적인 for)		순서대로
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + "님");
		}
		System.out.println();
		
		//	배열 (개선된 foreach)		순서대로
		for (Ex03 k : arr) {
			System.out.println(k.getName() + "님께");
		}
		System.out.println();
		
		//	컬렉션 (개선된 foreach)		무작위로
		for (Ex03 k : set01) {
			System.out.println(k.getName() + "님에게");
		}
		System.out.println();
		
		//	컬렉션 (iterator() + while 두번째거) 	무작위로
		Iterator<Ex03> it = set01.iterator();
		while (it.hasNext()) {
			Ex03 ex03 = (Ex03) it.next();		//	원래는 Object 로 나와서 Ex03 으로 강제형변환 해줘야한다.
			System.out.println(ex03.getName() + "^^");
		}
		
		
		
		
	}
}
