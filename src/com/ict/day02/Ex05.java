package com.ict.day02;

public class Ex05 {
	public static void main(String[] args) {
		//	크기 비교 ( boolean 만 제외 )
		// 	byte < short < char < int < long < float < double
		
		//	큰 자료형은 작은 자료형을 저장할 수 있다. >> 프로모션
		//	작은 자료형은 큰 자료형을 저장할 수 없다.
		
		int s1 = 100 ; // 데이터 100 이 int s1 에 저장된다.
		System.out.println(s1);
		
		long s2 = s1 ; // 변수 s1 안에 있는 데이터가 long s2 에 저장된다. (데이터는 100)
		System.out.println(s2);
	
		double s3 = s1 ; // 변수 s1 안에 있는 데이터가 double s3 에 저장된다.(데이터는 100)
		System.out.println(s3); 
		// 100이 들어가지만 double 자료형에 맞춰서 저장 100.0 이 출력됨 
		
		char s4 = 'a' ;
		System.out.println(s4); // a 출력
		int s5 = s4 ;
		System.out.println(s5); // 97 출력
		double s6 = s4 ;
		System.out.println(s6); // 97.0 출력
		
		
	}
}
