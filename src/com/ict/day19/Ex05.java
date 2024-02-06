package com.ict.day19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		
		//	직접처리(순차처리)
		//	main 이 처리하면 순서대로 혼자 일한다.
		List<String> list = Arrays.asList("김","이","박","나","최");
		Stream<String> stream = list.stream();
		stream.forEach(i -> prn(i));
		System.out.println();
		
		//	병렬처리 
		//	스레드처럼 동시에 나눠서 처리한다.
		Stream<String> stream2 = list.stream().parallel();
		stream2.forEach(i -> prn(i));
		System.out.println();
		
	}
	
	public static void prn(String str) {
		try {
			Thread.sleep(1000);
			System.out.println(str + " : " + Thread.currentThread().getName());
		} catch (Exception e) {
			
		}
	}
	
}
