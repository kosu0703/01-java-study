package com.ict.day18;

import java.util.stream.IntStream;

public class Ex06 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3};
		//	forEach() : 요소 전체 반복
		IntStream intStream01 = IntStream.of(arr);
		intStream01.forEach(i -> System.out.print(i + " "));
		System.out.println();
		//	최종처리하면 stream 은 닫힌다. 다시 사용하기 위해서는 새로운 stream 생성해야 한다.
		
		//	중간처리 메서드
		
		//	distinct() : 중복제거
		IntStream intStream02 = IntStream.of(arr);
		intStream02.distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//	filter(조건) : 조건에 안 맞으면 제외
		System.out.println("짝수만 출력");
		IntStream intStream03 = IntStream.range(0, 10);			//	range : 끝 포함 안함
		intStream03.filter(i -> i%2==0).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//	limit(갯수) : 갯수만큼 잘라내기
		IntStream intStream04 = IntStream.rangeClosed(0, 10);	//	rangeClosed : 끝 포함
		intStream04.limit(3).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//	skip(갯수) : 갯수만큼 제외
		IntStream intStream05 = IntStream.rangeClosed(0, 10);	//	rangeClosed : 끝 포함
		intStream05.skip(3).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//	map(조건) : 조건에 맞게 요소 변경
		IntStream intStream06 = IntStream.rangeClosed(0, 10);	//	rangeClosed : 끝 포함
		intStream06.map(i -> i*10).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		
		
		
	}
}
