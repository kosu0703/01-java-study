package com.ict.day18;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex08_Main {
	public static void main(String[] args) {
		
		//	reduce() 가 알아서 하나하나 다 계산 후에 문자수가 가장 긴 문자열 반환	
		
		String[] greetings = {"안녕하세요~~","hello","Good morning","반갑습니다^^"};
		
		//	배열을 스트림으로
		Stream<String> stream = Arrays.stream(greetings);	
		//	글자수의 길이를 계산하고 더 긴 것을 가져옴
		String str = stream.reduce(new Ex08()).get();		
		System.out.println(str);
		
	}
}
