package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		
		//	스트림 생성 : 컬렉션이나 배열을 Stream 으로 반환
		
		//	배열로 스트림 생성
			//	1. Stream.of(T... values) : Stream<T>
			//	2. Stream.of(T[]) : Stream<T>
			//	3. Arrays.stream(T[]) : Stream<T>
			//	4. Arrays.stream(T[], 시작 index, 끝 index(포함X)) : Stream<T>	
		
		//	배열
		String[] arr = {"홍길동","고길동","이길동","박길동","나길동"};	
		
		//	배열으로 스트림 생성
		Stream<String> stream01 = Stream.of("홍자바","고자바","이자바","박자바","나자바");
		
		Stream<String> stream02 = Stream.of(arr);
		
		Stream<String> stream03 = Arrays.stream(arr);
		
		Stream<String> stream04 = Arrays.stream(arr, 1, 4);	//	위치값 1 부터 4 까지 (4 포함 안함)
															//	4-1=3 개수
		//	출력
		stream01.forEach(i -> System.out.print(i + " "));
		System.out.println();
		stream02.forEach(i -> System.out.print(i + " "));
		System.out.println();
		stream03.forEach(i -> System.out.print(i + " "));
		System.out.println();
		stream04.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		
		//	컬렉션으로 스트림 생성
		//	컬렉션.stream() : Stream<T>
		
		//	컬렉션(List)
		List<String> list = Arrays.asList("둘리","도우너","희동이","고길동","마이콜");
		
		//	컬렉션으로 스트림 생성
		Stream<String> stream05 = list.stream();
		
		//	출력
		stream05.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
	}
}
