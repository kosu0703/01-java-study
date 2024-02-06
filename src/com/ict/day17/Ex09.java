package com.ict.day17;

@FunctionalInterface	//	추상메서드가 2개 이상이면 오류발생
						//	즉, 함수형 인터페이스로 사용할꺼면 선언하기전에 
						//	@FunctionalInterface 를 꼭 사용하자!

public interface Ex09 {					//	인터페이스
	int getMax(int num1, int num2);		//	추상메서드
	//int getMin(int num1, int num2);
}
