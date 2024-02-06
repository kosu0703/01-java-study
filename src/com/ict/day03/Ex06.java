package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		//	이름이 홍길동인 사람의 점수가
		//	국어 90, 영어 80, 수학 80 이다.
		//	총점과 평균을 구하자
		//	출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 첫째자리 까지 구하자)
		
		int su1 = 90 ;	// 	su1 국어
		int su2 = 80 ;	// 	su2 영어
		int su3 = 80 ;	//	su3 수학
		
		int su4 = su1 + su2 + su3 ;		// su4 	총점
		double su5 = su4 / 3 ; 			// su5	평균
		
		System.out.println("이름 : 홍길동");
		System.out.println("총점 : " + su4);
		System.out.println("평균 : " + su5);
		System.out.println();
		
		//	이름이 홍길동인 사람의 점수가
		//	국어 90, 영어 80, 수학 80 이다.
		//	총점과 평균을 구하자
		//	출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 첫째자리 까지 구하자)
		
		// 	**입력정보는 변수에 저장해서 사용하자!! (값이 변할 수 있기 때문이다.)
		String name = "홍길동" ;	//	이름 저장
		int kor = 90 ; 			//	국어 저장
		int eng = 80 ;			//	영어 저장
		int math = 80 ; 		//	수학 저장
		
		//	**요구사항 ( 처리 = 비지니스로직 )
		//	총점과 평균을 구하자
		int sum = kor + eng + math ;
		double avg = (int)( sum / 3.0  * 10 ) / 10.0 ;		
		// 소수점 첫째자리 만들기 > 곱하기 10 > 정수로 만든다 > 10.0 으로 나눈다. (실수로 바꿔야 하기 때문에)  
		
		
		// 	출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg ); 	
		
		//	소수점 둘째자리까지
		double avg2 = (int)( sum / 3.0  * 100 ) / 100.0 ;
		System.out.println("평균 : " + avg2 ); 	
		System.out.println();
		
		//	은행 예제
		int k1 = 198745 ; // 198,745원 에서 끝에 5원을 버리고자한다.
		//	정수와 정수를 계산하면 정수 > 즉, 소수점 아래가 없어진다.
		int k2 = ( k1 / 10 ) * 10 ;		// 	10원단위
		int k3 = ( k1 / 100 ) * 100 ;	//	100원 단위
		System.out.println(k2);
		System.out.println(k3);
		
	
		
	}
}
