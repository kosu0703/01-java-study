package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		
		//	Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		
		//	특징)	중복불가, 특정기준으로 정렬이 안됨
		//		(단, TreeSet 은 항상 오름차순을 유지한다.)
		//		주머니 구조라고 생각하면 된다.
		
		//	형식)	HashSet<제네릭=객체타입=클래스> 참조변수 = new HashSet<[제네릭]>();
		//		TreeSet<제네릭=객체타입=클래스> 참조변수 = new TreeSet<[제네릭]>();
		
		//	1. 컬렉션 생성
		//HashSet<int> h1 = new HashSet<int>();			//	기본자료형은 들어갈 수 없다.
		HashSet<Integer> h1 = new HashSet<Integer>();	//	클래스가 들어간다.(참조자료형)
		HashSet<Double> h2 = new HashSet<>();			//	뒤에 제네릭은 생략가능
		
		TreeSet<String> h3 = new TreeSet<String>();		//	String 클래스로 만든 객체가 들어간다.
		TreeSet<Character> h4 = new TreeSet<>();		
		
		//	2. 컬렉션에 객체 넣기 ( add(E e) 사용 )
		Integer k1 = new Integer(10);		//	Deprecated 더 이상 지원안하니, 사용하지 마세요.
		Integer k2 = new Integer("20");		//	향후 버전에서는 지원하지 않는다.
		
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));	//	30 이라는 int 를 Integer 로 만들어서 넣음
		h1.add(new Integer("40"));	//	40 이라는 String 을 Integer 로 만들어서 넣음
		
		h1.add(50);		//	int 가 Integer 로 자동으로 바뀐다 >> 오토박싱 : 기본자료형을 객체로 변경
		//h1.add("60");	//	바로 String 을 사용할 수 없다.
		
		h1.add(10);						//	중복불가
		System.out.println(h1.add(10));	// 	기존에 10 이 있어서 못들어가기 떄문에 false 							
		
		System.out.println(h1);		//	들어간 순서가 아닌 무작위로 배열처럼 보여준다.
									//	하지만 배열이 아니기 떄문에 일반 for 문 사용 불가
		
//		for (int i = 0; i < h1.size(); i++) {	//	컬렉션 안에 있는 객체의 수 
//			System.out.println(h1[i]);
//		}
		
		//	하나씩 꺼내는 방법
		
		//	1.
		//	**개선된 for 문 사용 가능 ( foreach )
		//	i 를 쓸 수 없을떄
		//	for ( 제네릭=객체타입=클래스 변수 : 컬렉션 ) { }
		
		for (Integer k : h1) {	//	: 의미 **처음부터 끝까지 하나씩 꺼내서 넘긴다
			System.out.println(k+1000);	//	Integer k 가 int k 로 오토 언박싱되서 1000 을 더한 후 출력 
		}
		
		//	2.
		//	iterator() : Iterator<인터페이스> 
		//	순서대로 접근하는 애
		
		Iterator<Integer> it = h1.iterator();
		
		while (it.hasNext()) {
			//Integer integer = (Integer) it.next();	
			int s = it.next();		//	Integer 가 int 로 오토언박싱 되기 때문에
			System.out.println(s + 5000);
		}
		
		
		//	HashSet<Double> h2 = new HashSet<>(); 
		h2.add(10.0);
		h2.add(21.5);
		
		//h2.add(10);	//	Double 은 객체이기 때문에 크다작다가 없다. double 만 오토박싱, 오토언박싱 될 수 있다.
		
		
		
		
		
		
		
	}
}
