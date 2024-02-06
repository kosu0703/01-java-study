package com.ict.day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 	Map 인터페이스 : Key 와 Value 를 1:1 매핑하는 구조
 				Key 는 중복 될수 없다. (기본 Value 삭제)
 				Value 는 중복이 가능
 				Key 를 호출하면 Value 가 나온다
 				Key 를 별도로 관리한다 ( keySet() )
 				add() 로 추가 못함
 				put(Key, Value) 로 추가
 		
 		구현한 클래스 : HashMap
 */
public class Ex04 {
	public static void main(String[] args) {
	
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		//	삽입 put
		map1.put(0, "한국");
		map1.put(1, "중국");
		map1.put(2, "미국");
		map1.put(3, "태국");
		map1.put(10, "영국");
		map1.put(13, "일본");
		//	Key 중복(덮어쓰기)	즉, 원래있던 Value 삭제됨
		map1.put(1, "호주");
		//	Value 중복(상관없음)
		map1.put(16, "한국");
		System.out.println(map1);
		System.out.println();
		
		//	꺼내기
		//	무조건 keySet() 을 사용해야 된다.
		
		//	Key 만 구해짐 
		//	개선된 for  
		for (Integer k : map1.keySet()) {	//	keySet() 의 반환형(자료형) : Integer
				// k 는 Key 값				//	즉, Key 의 자료형
			
			System.out.println(map1.get(k));//	Key 를 호출하면 Value 가 나온다.
		}
		System.out.println();
		
		//	iterator 
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			//	k 는 Key 값
			Integer k = it.next();
			System.out.println(map1.get(k));
		}
		System.out.println();
		
		
		//	value 만 구하기	
		//	values()	
		//	단순히 뭐가 들어있는지 검사는 가능
		//	(하지만, Key 값을 모르면 불러올 수 없다.)
		Collection<String> var = map1.values();
		System.out.println(var);
		System.out.println();
		
		
		//	Key 와 Value 모두 필요한 경우
		//	entrySet() 메서드
		Set<Entry<Integer, String>> set1 =	map1.entrySet();
		Iterator<Entry<Integer, String>> it2 = set1.iterator();
		while (it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();		//	메서드 먼저 치고 반환형을 알자
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
		
		
	}
}
