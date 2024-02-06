package com.ict.day02;

public class Ex06 {
	public static void main(String[] args) {
		//	형 변환 : 자동 형 변환, 강제 형 변환
		
		//	자동 형 변환 = 프로모션 : 작은 자료형이 큰 자료형으로 변환하는 것 (저장하는 것)
		
		int s1 = 10 ;
		long s2 = s1 ; 
		
		long s3 = 10 ; 
		// long형은 원래 L을 붙여야하지만 int형이 long형에 포함되기때문에 오류가 발생하지 않는다.
		// 그래서 숫자뒤에 L이 생략가능하다.
		
		
		// 강제 형 변환 = 디모션 : 큰 자료형이 작은 자료형으로 변환할 때 오류가 발생하여서 
		//					강제로 변경시키는 방법 (데이터가 손실될 가능성이 있다.)
		
		double d1 = 35.14 ;
		System.out.println(d1);

		int d2 = (int) d1 ; // 소수점 이하 버림
		System.out.println(d2);
		
		// float f1 = 5426.143 ; // double 형이 float 형으로 들어가니까 오류가 난다. 때문에 f를 붙여야한다.
		float f1 = (float)(5426.124) ; // 감싸주고 왼쪽 자료형을 가져와 감싼다
		System.out.println(f1); // 데이터 손실은 없지만 오류가 나기때문에 강제 형 변환을 해야한다.
		// 데이터가 손실될 가능성, 확률이 있다.
		
		
		int k1 = 'a'; // 자동 형 변환
		System.out.println(k1); 
		
		char k2 = (char)(k1) ; // 강제 형 변환
		System.out.println(k2); 
		
		int k3 = 105 ;
		System.out.println(k3);
		
		char k4 = (char)(k3) ;
		System.out.println(k4); 
		
		
	}
}
