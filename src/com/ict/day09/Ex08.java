package com.ict.day09;
//	모두 void
//	기능별로 메서드를 나눈다 > 재활용 가능
public class Ex08 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	//	인자 : 외부에서 데이터를 받는 통로
	//	외부데이터는 메서드의 인자를 통해서 받는다.
	//	메서드이름([인자]){실행내용}
	//	인자 = 자료형 변수 (자료형은 넣을 곳의 자료형과 같게, 변수는 메서드 안에서만 사용하는 지역변수)
	
	
	//	이름 (이름 받아서 이름 넣기)
	public void play01(String k1) {		//	play01 메서드를 실행하면서 String 을 입력받고 k1 에 넣어주세요
		name = k1;						
	}
	
	//	총점 (국어 영어 수학 받아서 총점 구하기)
	public void play02(int k1, int k2, int k3) {		
		sum = k1 + k2 + k3 ;
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
