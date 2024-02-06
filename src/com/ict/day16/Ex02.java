package com.ict.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

//	Vector : 멀티 스레드에서 동기화 지원
//	**ArrayList : 멀티 스레드에서 동기화 지원 X

public class Ex02 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		Vector<String> vector = new Vector<String>();
		
		//	추가
		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");	
		
		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민재");
		
		System.out.println(list);
		System.out.println(vector);
		
		//	삽입
		list.add(1, "둘리");
		vector.add(2, "둘리");
		//list.add(list.indexOf("손흥민")+1, "둘리");
		//vector.add(vector.indexOf("이강인")+1, "둘리");
		System.out.println(list);
		System.out.println(vector);
		
		//	중복가능
		list.add("손흥민");
		list.add("이강인");
		vector.add("손흥민");
		vector.add("이강인");
		System.out.println(list);
		System.out.println(vector);
		
		//	list 검색
		if (list.contains("이강인")) {								//	이강인 있니 물어보고
			System.out.println(list.indexOf("이강인"));			//	이강인 위치값 가져오고
			System.out.println(list.get(list.indexOf("이강인")));	//	위치값을 이용하여 이강인을 가져옴	
		}
		
		//	list 치환
		//	둘리를 박지성으로 변경
		list.set(list.indexOf("둘리"), "박지성");
		System.out.println(list);
		
		//	vector 검색
		if (vector.contains("손흥민")) {
			System.out.println(vector.indexOf("손흥민"));
			System.out.println(vector.get(vector.indexOf("손흥민")));
		}
		
		//	vector 치환
		//	둘리를 차두리로 변경
		vector.set(vector.indexOf("둘리"), "차두리");
		System.out.println(vector);
		//	손흥민을 손웅정으로
		vector.setElementAt("손웅정", vector.indexOf("손흥민"));
		
		
		//	하나씩 꺼내기
		
		//	list 는 개선된 for 문
		for (String k : list) {
			System.out.println(k + " 골~~~~~");
		}
		System.out.println();
		
		//	vector 는 iterator , while
		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str + " 어시스트!");
		}
		
		
		
		
		
		
	}
}
