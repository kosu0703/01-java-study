package com.ict.day18;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex09_Main {
	public static void main(String[] args) {
		
		//	reduce() 가 알아서 하나하나 다 계산 후에 문자수가 가장 긴 문자열 반환	
		
		String[] greetings = {"안녕하세요~~","hello","Good morning","반갑습니다^^"};
		
		Stream<String> stream = Arrays.stream(greetings);	
		String str = stream.reduce(new Ex09()).get();		
		System.out.println(str);
		
		
	}
}
