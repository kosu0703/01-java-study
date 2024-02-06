package com.ict.day18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("딸기","가지","바나나","멜론","수박");
		//	naturalOrder : 기본정렬
		Optional<String> o_min = str.stream().min(Comparator.naturalOrder());
		Optional<String> o_max = str.stream().max(Comparator.naturalOrder());
		Optional<String> o_findAny = str.stream().findAny();		//	아무거나 하나 반환
		Optional<String> o_findFirst = str.stream().findFirst();	//	첫번째거 하나 반환
		//** get() 하면 데이터값만 가져온다.
		System.out.println(o_min.get());
		System.out.println(o_max.get());
		System.out.println(o_findAny.get());
		System.out.println(o_findFirst.get());	
		System.out.println();
		
		
		List<Integer> num = Arrays.asList(4,6,80,3,5,2);
		Optional<Integer> o_min2 = num.stream().min(Comparator.naturalOrder());
		Optional<Integer> o_max2 = num.stream().max(Comparator.naturalOrder());
		Optional<Integer> o_findAny2 = num.stream().findAny();		//	아무거나 하나 반환
		Optional<Integer> o_findFirst2 = num.stream().findFirst();	//	첫번째거 하나 반환
		
		System.out.println(o_min2.get());
		System.out.println(o_max2.get());
		System.out.println(o_findAny2.get());
		System.out.println(o_findFirst2.get());		
		
		
		
		
	}
}
