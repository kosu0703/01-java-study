package com.ict.day10;

//	클래스는 저장하는 관점에서 보면 최종단계 : 다양한 자료형을 여러개 저장할 수 있다. 
//	(변수는 한개밖에 저장 못함 , 배열은 여러개를 저장하지만 단점은 같은 자료형이어야 함)

//	**클래스의 정보를 배열에 저장할 수 있다.

public class Ex05 {
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 1;
	
	//	1. 총점(), 평균(), 학점()을 구하는 메서드를 각각 만들어서 각각 호출할 수 있다.
	//	2. 하나의 메서드()에서 총점, 평균, 학점을 구할 수 있다.
	//	3. 총점, 평균, 학점을 구하는 메서드를 각각 만들어서 메서드에서 다른 메서드를 호출할 수 있다. 총점() > 평균() > 학점() 
	
	
	//	한번에 처리하는 하나의 메서드
	public void process(String n, int k1, int k2, int k3) {
		name = n;
		kor = k1;
		eng = k2;
		math = k3;
		sum = k1 + k2 + k3;
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
