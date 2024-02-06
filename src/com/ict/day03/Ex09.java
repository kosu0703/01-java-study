package com.ict.day03;

public class Ex09 {
	public static void main(String[] args) {
		//	카페모카 6,500원
		//	친구와 둘이서 15,000원을 내고 2잔을 주문했다.
		//	잔돈은 얼마인가? (단, 부가세 10%는 별도이다.)
		
		int c = 6500 ;	// 	카페모카 가격
		int m = 15000 ;	//	모은 돈
		int p = 2 ;		//	사람 수
		int b = (int)(c*p*0.1) ;	// 부가세
		
		
		int res = (int)(m-(c*p)-b) ; // 잔돈
		 
		
		System.out.println("잔돈은 " + res + "원이다.");
		System.out.println();
		
		
		//	카페모카 6,500원
		//	친구와 둘이서 15,000원을 내고 2잔을 주문했다.
		//	잔돈은 얼마인가? (단, 부가세 10%는 별도이다.)

		//	입력정보 ( 받은 정보 다 저장하기 )
		String coff = "카페모카" ;	// 	메뉴 저장
		int input = 15000 ;		//	지불 금액 저장
		int dan = 6500 ;		//	가격 저장
		int su = 2 ;			//	수량 저장
		
		int total = dan * su ;			//	금액
		int vat = total / 10 ;			// 	부가세 구하기
		int vat2 = (int)(total*0.1);	//	부가세 구하기2
		
		int sum = total + vat ;		// 금액 + 부가세
		// 다른 방법
		int sum2 = (int)(total * 1.1);	// 강제 형 변환
		
		int output = input - sum ;	// 잔돈 저장
		
		System.out.println("잔돈 : " + output);
		
		
		
	
		
	}
}
