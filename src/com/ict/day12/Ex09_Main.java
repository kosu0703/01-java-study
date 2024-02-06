package com.ict.day12;

public class Ex09_Main {
	public static void main(String[] args) {
		
		//Ex09_Cale t = new Ex09_Cale();	// 	추상클래스는 new 예약어를 사용하여 인스턴스 객체생성 불가능 
											//	보통 완성되지 않은 클래스를 객체로 생성하지 않는다.
		
		Ex09_Cale t = new Ex09_Cale() {		//	익명 내부클래스 타입으로는 생성 가능
											//	하지만 잘 쓰지 않는다. (클래스 안에 클래스를 만든 느낌)
			@Override						
			public void plus(double k1, double k2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void multiplication(double k1, double k2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void minus(double k1, double k2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void division(double k1, double k2) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
	}
}
