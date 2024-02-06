package com.ict.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		
		//	ArrayList 를 스트림으로 활용하기
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//	중간처리
		
		//	sorted() : 오름차순 정렬
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//	sorted(Comparator.reverseOrder()) : 내림차순 정렬
		Stream<String> stream3 = sList.stream();
		stream3.sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		
		//	바로 배열을 넣기
		Stream<String> stream4 = Stream.of(new String[]{"bb","a","CC","dd","BB","aaa"});
		
		System.out.println("오름차순");	
		stream4.sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		System.out.println("내림차순");
		stream4 = Stream.of(new String[]{"bb","a","CC","dd","BB","aaa"});
		stream4.sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
		System.out.println();		
				
		//	**오름차순 정렬은 코드값에 의해서 ( 숫자 > 대문자 > 소문자 > 한글 )
		//	유니코드값 ( 숫자 > 대문자 > 소문자 )
		
		//	알파벳순으로 보고싶다
		//	sorted(String.CASE_INSENSITIVE_ORDER)
		System.out.println("알파벳순");
		stream4 = Stream.of(new String[]{"bb","a","CC","dd","BB","aaa"});
		stream4.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		System.out.println("알파벳순의 역순");	//	같은 알파벳 대소문자는 순서가 안바뀌고 배열의 순서대로
		stream4 = Stream.of(new String[]{"bb","a","CC","dd","BB","aaa"});
		stream4.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(i -> System.out.print(i + " "));
		
		
		
	}
}
