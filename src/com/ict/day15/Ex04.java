package com.ict.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		
		//	배열을 컬렉션으로 변경
		String[] str = {"java","Java","JAVA","자바"};
		
		//List<String> list = Arrays.asList(str);
		//System.out.println(list);
		
		
		//	1. 컬렉션을 만든다.
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		//	2. 배열의 요소를 하나씩 꺼내서 컬렉션에 넣는다.
		
		//	일반적인 for
		for (int i = 0; i < str.length; i++) {
			set1.add(str[i]);
		}
		System.out.println(set1);	//	순서가 무작위로
		
		set2.add("태권브이");
		set2.add("마징가제트");
		System.out.println(set2);
		System.out.println();
		
		//	컬렉션 메서드
		
		//	set2 에서 set1 모든 내용 받기 (addAll) 
		//	단, 같은 자료형이어야함 (같은 클래스로 만든 객체여야함)
		set2.addAll(set1);
		System.out.println(set2);
		
		
		//	삭제 : clear(), remove(Object o)
		
		//	remove(Object o) : 하나만 삭제
		set2.remove("태권브이");
		System.out.println(set2);
		
		//	clear() : 전체 삭제
		set2.clear();
		System.out.println(set2);
		
		//	isEmpty() : 비었는지 아닌지 
		System.out.println(set2.isEmpty());	//	비었으면 true
		
		
		
	}
}
