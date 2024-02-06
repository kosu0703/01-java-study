package com.ict.day16;

import java.util.Iterator;
import java.util.Stack;

/*
 	List 인터페이스 : 배열과 비슷한 구조
 				삽입, 삭제, 추가 자유롭다.
 				크기를 미리 지정하지 않아도 된다.
 		
 		구현한 클래스 : Stack, Vector, ArrayList
 		
 		구조) LIFO (last in - first out)
 				마지막에 들어온 데이터가 먼저 나가는 형태
 		
 		메서드)
 		add , push , addElement : 추가 (무조건 뒤에 붙는다.)
 				
 		add(index, E) : 삽입 (원하는 위치에 넣을 수 있다.)
 
 		pop : 맨 위에 존재하는 객체 반환 후 삭제한다.	
 		peek : 맨 위에 존재하는 객체 반환 후 삭제를 하지 않는다.
 		
 		contains(Element e) : boolean 	해당 요소가 포함되어 있으면 true
 		
 		search : 검색 (오른쪽 1부터)	즉, 맨 마지막부터 (맨 위부터) 1시작
 		**indexOf : 검색 (왼쪽 0부터) 즉, 배열 형식처럼 0시작
 
 		elementAt(index) : 해당 위치값에 있는 요소 반환
 		**get(index) : 해당 요소 반환
 
 		firstElement() : 맨 처음 요소 반환
 		lastElement() : 맨 마지막 요소 반환
 		setElement(Element, index) : 해당 요소 치환
 
 */

//	Stack
public class Ex01 {
	public static void main(String[] args) {
	
		Stack<String> s1 = new Stack<String>();
		
		// 	추가 ( add , push , addElement )
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		System.out.println(s1);
		System.out.println();
		
		//	삽입 ( add(index, E) )
		s1.add(1, "고길동");
		s1.add(3, "희동이");
		System.out.println(s1);
		
		//	마지막 객체 보기 ( pop , peek , lastElement )
		String res = s1.peek();
		System.out.println("가지고온 객체 : " + res);	
		System.out.println(s1);					//	peek : 마지막 객체를 가져오고 끝남
		
		res = s1.pop();
		System.out.println("가지고온 객체 : " + res);	
		System.out.println(s1);					//	pop : 마지막 객체를 가져온 다음에 삭제
				
		res = s1.lastElement();
		System.out.println("마지막 객체 : " + res);	//	lastElement : 마지막 객체를 가져오고 끝남
		
		//	위치 검색
		if (s1.contains("둘리")) {
			System.out.println(s1.indexOf("둘리"));	//	왼쪽부터 0시작 (배열처럼)
			System.out.println(s1.search("둘리"));	//	오른쪽부터 1시작	
		}else {
			System.out.println("존재x");
		}
	
		//	위치값 이용해서 Element 구하기 ( 배열처럼 )
		System.out.println(s1.get(1));		
		System.out.println(s1.elementAt(1));
		
		//	처음, 마지막 요소 반환
		System.out.println(s1.firstElement());
		System.out.println(s1.lastElement());
		
		//	치환
		//	고길동을 도우너로 변경하는 방법
		if (s1.contains("고길동")) {
			s1.setElementAt("도우너", s1.indexOf("고길동"));	//	배열처럼 쓰기때문에 search 는 되도록 사용하지말자
		}
		System.out.println(s1);
		
		//	중복가능
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		System.out.println(s1);
		System.out.println(s1.size());	//	size() 는 인덱스가 아니라 객체의 갯수이다.
		
		//	하나씩 꺼내기
		//	1. 개선된 for 문
		for (String k : s1) {
			System.out.println(k + "님!!");
		}
		System.out.println();
		
		//	2. iterator
		Iterator<String> it = s1.iterator();	
		//	메서드를 치고 반환형을 알아야 자료형에 맞게 참조변수로 받아줘야 한다.
		
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str + "짱~~");
		}
		System.out.println();
		
		//	3. pop 을 이용해서 꺼낸다 ( 단점, 다 꺼내면 모두 삭제됨 )
		//		마지막부터 꺼내짐 (LIFO)
		while (!s1.isEmpty()) {		//	안비었을때 돌아가야하므로, 비었냐라고 물어보고 ! (NOT) 
			
			String k = s1.pop();	//	끄집어 내고 삭제함
			System.out.println(k + ", 크기는 " + s1.size() + "이다.");
		}
		
		
		
	}
}
