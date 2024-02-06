package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex10 {
	public static void main(String[] args) {
		//	reduce 로 sum 구하기
		
		//	1. reduce(수행기능만) : Optional<T>
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		Stream<Integer> stream1 = numbers.stream();
		Optional<Integer> sum = stream1.reduce((i,j) -> Integer.sum(i, j));		
		System.out.println(sum);
		
		//	2. reduce(초기값, 수행기능) : T
		Stream<Integer> stream2 = numbers.stream();
		//Integer sum2 = stream2.reduce(1000, (i,j) -> Integer.sum(i, j));	
		int sum2 = stream2.reduce(1000, (i,j) -> Integer.sum(i, j));	//	Integer > int 오토언박싱
		System.out.println(sum2);	
		
		//	다른방법
		//	IntStream 에서 sum() 이용하기
		int[] num = {10,20,30,40,50};
		IntStream intStream = IntStream.of(num);
		int total = intStream.sum();
		System.out.println(total);
	
		//	1 ~ 10 더하기 (누적합)
		//	두개 더해서 한개 나오고 다시 두개 더해서 한개 나오고
		//	누적합 sum = 이전합 sum + 현재값
		Stream<Integer> numbers2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> total2 = numbers2.reduce((x,y) -> x + y);
		System.out.println(total2);
		
		
		
		
		
		
		
		
	}
}
