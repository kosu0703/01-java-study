package com.ict.day04;

public class Ex04 {
	public static void main(String[] args) {
		//	단순 if 문 : 조건이 참일 때만 실행, 거짓일 경우는 무시한다.
		//	형식) if (조건식) {
		//			조건식이 참일때 실행할 문장 ;
		//			조건식이 참일때 실행할 문장 ;
		//			조건식이 참일때 실행할 문장 ;
		//		}
		//	**주의사항 : 실행할 문장이 한 줄이면, {} 블록 생략가능
		//			한 줄 이상이면 {} 블록 써야함. But, 되도록 {} 블록 써라!
		
		
		//	int k1 이 60 이상이면 합격
		
		int k1 = 53 ;
		String res = "불합격" ;
		if (k1 >= 60) { 
			res = "합격";
		}
		System.out.println("결과 : " + res);
		
		
		//	int k2 가 60 이상이면 합격, 60 미만이면 불합격
		
		int k2 = 56 ;
		String res2 = "초기값" ;
		if (k2 >= 60) {
			res2 = "합격";
		}
		if (k2 < 60) {
			res2 = "불합격";
		}
		System.out.println();
		System.out.println("k2 : " + res2);
		
		//	원래는 위처럼 2가지 조건을 다 써놔야 하지만 
		//	개발자들은 여러개 쓰는거 보다 한번에 쓰는거 좋아함
		
		int k3 = 77 ; 
		String res3 = "불합격" ;
		if (k3 >= 60) {
			res3 = "합격" ;
		}
		System.out.println();
		System.out.println("k3 : " + res3);
		
			
		
	}
}









