package com.ict.day17;

public class Ex09_Main {
	public static void main(String[] args) {
		
		//	두 숫자 중 큰 수를 리턴하는 코딩 구현
		
		//	일반적인 방법 (객체 생성 후 오버라이드된 메서드 호출)
		Ex09 t1 = new Ex09() {
			
			@Override
			public int getMax(int num1, int num2) {
				int k ;
				if (num1 > num2) {
					k = num1;
				}else {
					k = num2;
				}
				return k;
			}
		};
		
		Ex09 t2 = new Ex09() {
			
			@Override
			public int getMax(int num1, int num2) {
				if (num1 > num2) {
					return num1;
				}else {
					return num2;
				}
				
			}
		};
		
		System.out.println(t1.getMax(100, 200));
		System.out.println(t2.getMax(200, 100));
		System.out.println();
		
		
		//	**람다식 (함수형 인터페이스) 추상메서드가 1개일때!!	
		//	추상메서드가 2개이상일 때 오류 (@FunctionalInterface 를 사용하자)
		
		//	FM
		Ex09 t3 = (int num1, int num2) -> {
			if (num1 > num2) {
				return num1;
			}else {
				return num2;
			}
		};
		System.out.println(t3.getMax(5000, 1000));
		
		//	축약
		Ex09 t4 = (num1, num2) -> num1 > num2 ? num1 : num2 ;	//	삼항연산자 (조건식) ? 참 : 거짓 ;
		System.out.println(t4.getMax(1000, 5000));
		
		//	Ex09 인터페이스에는 추상메서드가 1개 뿐이기 때문에 호출할 수 있는 메서드는 getMax() 뿐이다.
		
		
		
		
	}

}
