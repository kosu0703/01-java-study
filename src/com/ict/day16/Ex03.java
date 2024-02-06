package com.ict.day16;

import java.util.Iterator;
import java.util.LinkedList;

/*	Queue 인터페이스 : FIFO(first in - first out)
					먼저 들어온 정보가 먼저 나감
					
		구현한 클래스 : 	LinkedList(멀티 스레드 동기화 X)							
*/
public class Ex03 {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//	추가 삽입 : add, addFirst, addLast, offer, offerFist, offerLast
		linkedList.add("고길동");
		linkedList.offer("도우너");
		System.out.println(linkedList);
		
		//	첫번째로 삽입
		linkedList.addFirst("둘리");
		linkedList.offerFirst("공실이");
		System.out.println(linkedList);
		
		//	둘리와 공실이 사이에 삽입
		linkedList.add(2, "마이콜");
		System.out.println(linkedList);
		
		//	검색
		if (linkedList.contains("마이콜")) {									//	검색
			System.out.println(linkedList.indexOf("마이콜"));					//	인덱스값
			System.out.println(linkedList.get(linkedList.indexOf("마이콜")));	//	인덱스값에 있는거 가져오기
		}
		
		//	처음, 마지막거 가져오기
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		//	치환
		//	고길동을 도우너로 변경
		if (linkedList.contains("고길동")) {
			linkedList.set(linkedList.indexOf("고길동"), "도우너");		
		}
		System.out.println(linkedList);
		
		//	출력
		
		//	개선된 for 문
		for (String k : linkedList) {
			System.out.println(k + " 개선된 for 문");
		}
		System.out.println();
		//	iterator , while
		Iterator<String> it = linkedList.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k + " iterator 와 while 문");
		}
		
		
	}
}
