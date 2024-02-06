package com.ict.day09;
//	메서드는 메서드를 호출할 수 있다.
public class Ex12 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	
	//	이름 총점 
	public void play02(String n1, int k1, int k2, int k3) {		
		name = n1;
		sum = k1 + k2 + k3 ;
		play03();			//	1.메서드에서 다른 메서드 호출
	}						//	7.돌아와서 끝남
	
	//	평균 
	public void play03() {
		avg = (int)(sum/3.0*10)/10.0;
		play04();			//	2.메서드에서 다른 메서드 호출
	}						//	6.끝나면 호출한 곳인 02 로 돌아감
		
	//	학점
	public void play04() {
		if (avg >= 90) {
			hak = "A학점";
		}else if (avg >= 80) {
			hak = "B학점";
		}else if (avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		play05();			//	3.메서드에서 다른 메서드 호출
	}						//	5.끝나면 호출한 곳인 03 으로 돌아감						
	
	//	출력
	public void play05() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}						//	4.끝나면 호출한 곳인 04 로 돌아감
	
	
	
	
}
