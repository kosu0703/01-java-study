package com.ict.day04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//	형식 ) 자료형 변수 = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장 ;
		
		//	받은 숫자가 홀수인지 짝수인지 판별하자
		
		System.out.print("숫자 입력 : ");
		int k1 = scan.nextInt(); // 키보드에 입력한 것을 정수로 받겠습니다.		
		String res = (k1 % 2 == 0) ? "짝수" : "홀수" ; // 참, 거짓과 변수의 자료형은 모두 같아야한다.
		System.out.println(k1 + " : " + res);
		System.out.println(); 
		
		
		// 점수가 60이상이면 합격 아니면 불합격
		
		System.out.print("점수 입력 : ");
		int k2 = scan.nextInt();
		String res2 = (k2 >= 60) ? "합격" : "불합격" ;
		System.out.println(res2 + "입니다.");
		System.out.println();
		
		
	}
}
