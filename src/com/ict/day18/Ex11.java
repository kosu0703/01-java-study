package com.ict.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex11 {
	public static void main(String[] args) {
		
		//	collect : 스트림을 컬렉션으로 변환하자 (Stream 의 반대)
		//	toCollection 이용하여 HashSet 으로
		Stream<String> s = Stream.of("a","b","c","b","z");		//	인자가 없으면 () 생략불가!!
		HashSet<String> set = s.collect(Collectors.toCollection( () -> new HashSet<String>() ));
		set.add("w");	//	HashSet - 순서 무작위로 
		set.add("h");
		System.out.println(set);	//	Set 인터페이스 - 중복불가 ( b 하나만 ) 	
		System.out.println();		//	a b c z w h
		
		//	Map<K,V>
		//	groupingBy 이용하여 Map 으로 
		Stream<String> str = Stream.of("나","우리","너","모두","노래해요");		
		Map<Integer, String> map = 				//	길이가 같은 것끼리 연결해서 만든다.
				str.collect(Collectors.groupingBy( i -> i.length(), Collectors.joining() ) );
		System.out.println(map);
		System.out.println();
		
		//	key 는 숫자 , value 는 문자열
		int[] index = {1};
		Stream<String> str2 = Stream.of("나","우리","너","모두","노래해요");		
		Map<Integer, String> map2 = 				
				str2.collect(Collectors.toMap(i -> index[0]++ , j -> j) );
		System.out.println(map2);
		System.out.println();				
		
		//	**Map 은 중복되면 기존 key 값 제거됨
		Stream<String> str3 = Stream.of("나","우리","너","모두","노래해요");		
		Map<Object, Object> map3 = str3.collect(Collectors.toMap(i -> i, j ->j));
		System.out.println(map3);
		System.out.println();
		
		//	홀수와 짝수 묶어서 합계구하기
		List<Integer> list = Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,11,13,24,18,22});
		Map<String, Integer> map4 = list.stream()
				.collect(Collectors.groupingBy(i -> (i%2==0)?"even":"odd" // key (홀수 짝수 그룹화)
						, Collectors.reducing(0, (i1,i2) -> i1+i2 ) ));	// value (누적합 reduce)
		System.out.println(map4);
		
		
	}
}
