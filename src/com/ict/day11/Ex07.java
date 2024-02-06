package com.ict.day11;

public class Ex07 {
	
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 1;
	
	
	//	임시 저장공간을 위해 기본생성자를 만들어야한다.
	public Ex07() {
		// TODO Auto-generated constructor stub
	}
	
	//	생성자를 만들어서 이름, 국어, 영어, 수학의 초기값을 받자
	//	생성자는 다른 메서드를 호출할 수 있다.
	public Ex07(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
		process();	//	메서드에 갔다가 다시 돌아온다. 
	}				//	끝을 만나면 생성자가 끝난다.

	
	public void process() {
		sum = kor + eng + math;
		avg = (int)(sum/3.0*10)/10.0;
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
	
	
	
	
	
}
