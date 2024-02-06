package com.ict.day18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		
		//	스트림 생성 : 기본 자료형 배열로부터 스트림 생성하기
		//			IntStream , DoubleStream
		
		//	1. IntStream.of(int... values) : IntStream
		//	2. IntStream.of(int[]) : IntStream
		//	3. Arrays.stream(int[]) : IntStream
		//	4. Arrays.stream(int[], 시작 index, 끝 index(포함X)) : IntStream
		
		//	배열 생성
		Integer[] integerArr = {1,2,3,4,5};
		
		//	Stream<T> : count() O , sum() X , average() X
		//	Stream<T> 으로 스트림 생성
		Stream<Integer> integerStream = Arrays.stream(integerArr);
		
		//	출력
		integerStream.forEach(i -> System.out.print(i + "님 "));	//	최종처리는 한번만 실행 가능, 스트림이 닫힌다.
		System.out.println();						
		
		integerStream = Arrays.stream(integerArr);				//	다시 사용하고 싶으면, 다시 스트림 생성
		System.out.println(integerStream.count() + "개");		
		System.out.println();						
		
		integerStream = Arrays.stream(integerArr);				//	다시 사용하고 싶으면, 다시 스트림 생성
		//System.out.println(integerStream.sum());
		//System.out.println(integerStream.average());		
		
		//	**Stream<T> 에는 sum(), average() 없음
		//	IntStream , DoubleStream 에서는 가능
		
		//	IntStream : count() O , sum() O , average() O
		//	기본자료형 배열을 스트림으로 
		int[] intArr = {10,20,30,40,50};
		
		IntStream intStream01 = IntStream.of(10,20,30,40,50);	
		IntStream intStream02 = IntStream.of(intArr);	
		IntStream intStream03 = Arrays.stream(intArr);
		IntStream intStream04 = Arrays.stream(intArr, 2, 5);
		
		//	출력
		intStream01.forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println(intStream02.count());
		System.out.println(intStream03.sum());
		System.out.println(intStream04.average());
		
		
		
	}
}
