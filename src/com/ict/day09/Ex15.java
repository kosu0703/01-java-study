package com.ict.day09;
//	반환형이 있는 메서드
public class Ex15 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	//	반환형 존재
	public String play01(String k1) {
		name = k1;
		return name;
	}
	
	public int play02(int kor, int eng, int math) {
		int total = kor + eng + math ;
		return total;		//	반환은 되지만 저장을 안하면 사라진다.
	}
	
	public int play03(int kor, int eng, int math) {
		sum = kor + eng + math ;
		return sum;			//	반환되고 전역변수 sum 에 저장된다.
	}
	
	
	
	
	
	
}
