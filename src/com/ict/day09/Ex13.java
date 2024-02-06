package com.ict.day09;

public class Ex13 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	
	//	이름 총점 
	public void play02(String n1, int k1, int k2, int k3) {		
		name = n1;
		sum = k1 + k2 + k3 ;
		play03();	//	03 에 갔다가 돌아옴		
		play04();	//	04 에 갔다가 돌아옴	
		play05();	//	05 에 갔다가 돌아옴		
	}							
	
	//	평균 
	public void play03() {
		avg = (int)(sum/3.0*10)/10.0;
	}						
		
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
	}												
	
	//	출력
	public void play05() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}						
	
	
	
	
}
