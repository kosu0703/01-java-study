package com.ict.day18;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		
		//	정수 배열을 스트림으로 활용하기
		int[] arr = {1,2,3,4,5};
		int sum = Arrays.stream(arr).sum();				//	sum() 의 반환형은 int
		int count = (int) Arrays.stream(arr).count();	//	count() 의 반환형이 long 이기 때문에
		
		System.out.println("합계 : " + sum);
		System.out.println("갯수 : " + count);
		
		
		
	}
}
