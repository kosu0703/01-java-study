package com.ict.day05;

public class Ex05 {
	public static void main(String[] args) {
		//	while 문 : for 문과 같은 반복문
		
		//	형식2)
		//		초기식 또는 현재변수
		//		while ( true ) {
		//			if(빠져나갈 조건)	break ;
		//			실행할 내용 ;
		//			증감식 ;
		//		}
		
		
		//	0 ~ 10 까지 출력
		
		int k1 = 0 ;
		while (true) {					//	while 조건식과 if 조건식의 부호는 반대이다
										//	while 은 실행하기 위한 조건이고 		k1 < 11
										//	if 는 빠져나가기 위한 조건이기 때문에 	k1 >= 11
			
			if(k1 >= 11)	break ;		//	11 일때 빠져나가면 되므로
			System.out.println(k1);
			k1++;
		}
			
		System.out.println();
		
		//	10 ~ 20 까지 짝수만 출력
		
		int k2 = 10 ;
		while (true) {
			if(k2 >= 21)	break ;
			if (k2 % 2 == 0) {
				System.out.println(k2);
			}
			k2++;
		}
		
		System.out.println();
		
		//	a ~ h 까지 출력
		
		char k3 = 'a' ;
		while (true) {
			if(k3 > 'h')	break ;
			System.out.println(k3);			
			k3++;
		}
		
		System.out.println();
		
		char k4 = 'a' ;
		while (k4 < 'h'+1) {
			System.out.println(k4);
			k4++;
		}
		
		
		
		
		
		
	}
}





