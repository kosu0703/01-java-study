package com.ict.day19;

import java.util.stream.IntStream;

public class Ex04 {
	public static void main(String[] args) {
		
		//	직접처리 > 순서대로
		IntStream.range(0, 10).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//	병렬처리 > 스레드라 생각 > 무작위로 
		IntStream.range(0, 10).parallel().forEach(i -> System.out.print(i + " "));
		System.out.println();
	
		//	직접처리든 병렬처리든 값은 똑같이 나온다.
		//	순서만 다를뿐
		System.out.println("직접처리");
		System.out.println(IntStream.rangeClosed(0, 10).sum());
		System.out.println("병렬처리");
		System.out.println(IntStream.rangeClosed(0, 10).parallel().sum());
		
		
		
		
		
		
		
		
		
	}
}
