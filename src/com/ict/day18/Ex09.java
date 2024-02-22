package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex09 {
	public static void main(String[] args) {
		//	reduce 로 sum 구하기
		
		//	1. reduce(수행기능만) : Optional<T>
		//	배열로 리스트 생성
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		//	리스트로 스트림 생성
		Stream<Integer> stream1 = numbers.stream();
		//	reduce 로 sum 계산 
		Optional<Integer> sum = stream1.reduce((i,j) -> Integer.sum(i, j));	
		//	Integer 값만 가져오기 
		System.out.println(sum.get());
		
		//	2. reduce(초기값, 수행기능) : T
		//	스트림 다시 생성
		Stream<Integer> stream2 = numbers.stream();
		//Integer sum2 = stream2.reduce(1000, (i,j) -> Integer.sum(i, j));
		//	Integer > int 오토언박싱
		int sum2 = stream2.reduce(1000, (i,j) -> Integer.sum(i, j));	
		System.out.println(sum2);	
		
		//	다른방법
		//	IntStream 에서 sum() 이용하기
		//	int 배열
		int[] num = {10,20,30,40,50};
		//	기본자료형 int 배열로 IntStream 생성
		IntStream intStream = IntStream.of(num);
		//	sum() 사용
		int total = intStream.sum();
		System.out.println(total);
	
		//	1 ~ 10 더하기 (누적합)
		//	**두개 더해서 한개 나오고 다시 두개 더해서 한개 나오고
		//	누적합 sum = 이전합 sum + 현재값
		
		//	배열로 스트림 생성
		Stream<Integer> numbers2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		//	reduce 로 계산
		Optional<Integer> total2 = numbers2.reduce((x,y) -> x + y);
		//	Integer 값만 가져오기
		System.out.println(total2.get());
		
	}
}
