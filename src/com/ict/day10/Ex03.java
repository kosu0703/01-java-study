package com.ict.day10;

public class Ex03 {
	
	//	오버로딩(중복정의) : 한 클래스 안에서 같은 이름을 가진 메서드가 여러개 정의되어 있는 것
	//				 (**반드시 인자의 자료형이나 개수가 달라야 한다.)
	
	public double plus(int s1, int s2) {
		double sum = s1 + s2;
		return sum;		
	}
	
	public double plus(double s1, int s2) {
		double sum = s1 + s2;
		return sum;		
	}
	
	public double plus(int s1, double s2) {
		double sum = s1 + s2;
		return sum;		
	}
	
	public double plus(double s1, double s2) {
		double sum = s1 + s2;
		return sum;		
	}
	
	public double plus(String s1, String s2) {
		double sum = Double.parseDouble(s1) + Double.parseDouble(s2);	//	더블더블 메소드를 사용할 수 있다.
		return sum;		
	}
	
	public double plus(String s1, int s2) {
		double sum = Double.parseDouble(s1) + s2;
		return sum;		
	}
	//	다른 방법	(**메서드에서 다른 메서드를 호출할 수 있다.)			//	메소드 안에서 다른 메소드를 활용할 수 있어야 한다.
	public double plus(int s1, String s2) {
		double sum = plus(s1, Double.parseDouble(s2));	//	plus(int s1, double s2) 를 찾아가서
		return sum;										//	계산하고 다시 나한테 돌아온다.
	}
	
	
	
	
	
}
