package com.ict.day03;

public class Ex04 {
	public static void main(String[] args) {
		// 	|| ( OR, 논리합, 합집합)
		//	주어진 조건들 중에서 하나라도 true 이면 결과는 true 이다.
		//	즉, 조건들 중에 true 가 있으면 결과는 true
		// **true 이후에 연산은 하지 않는다.
		
		int su1 = 10 ; 
		int su2 = 7 ;
		boolean res ;
		
		//			true ||	true
		res = (su1 >= 7) || (su2 >= 5); // true > true 
		System.out.println(res);
		
		//			false || true
		res = (su1 <= 7) || (su2 >= 5); // false > true > true 
		System.out.println(res);
		
		//			true ||	false
		res = (su1 >= 7) || (su2 <= 5); // true > true 
		System.out.println(res);
		
		//			false || false
		res = (su1 <= 7) || (su2 <= 5); // false > false > false 
		System.out.println(res);
		
		System.out.println();
		
		su1 = 10 ;
		su2 = 7 ;
		
		res = ((su1 = su1 + 2) > su2) || (su1 == (su2 = su2 + 5));
		//				true > 뒤에 계산 안함 > su2 는 그대로 7
		System.out.println("결과 : " + res);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2); 
		System.out.println();
		
		//	! (NOT, 논리부정)
		//	주어진 논리값을 반대로 출력
		//	true > false, false > true
		
		res = true ;
		System.out.println(res);
		System.out.println(!res);
		System.out.println(!!res);
		System.out.println(!!!res);
		
		
		
	}
}








