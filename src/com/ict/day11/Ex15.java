package com.ict.day11;

public class Ex15 {
	
	//	인스턴스 instance 는 생성자에 의해 객체가 생성될 때 초기화 된다.
	
	//	스태틱 static 
	
	//	static 초기화
	
	//	static {
	//		초기화 내용 ;
	//		}	
	
	int s1 = 100;
	private int p1 = 300;
	static int s2 ;			//	선언만 되있으면 값을 가져온다.
	static int s3 ;			//	0
	
	public static int k2 = 300;
	static int k3 = 300;
	private static int k4 = 5000;
	
	static {
		s2 = 50000;		//	초기화 블록 위에 있으면 초기값 설정	
		k2 = 20000;
		m2 = 6000;
		j2 = 7000;
	}
	
	static int m2 ;			//	선언만 했으면, 초기화 블록이 위든 아래든 상관없이 값을 넣어줌
	
	static int j2 = 400;	//	선언하면서 값을 넣어주면, 초기화 블록 아래 있으면 초기값 설정 안해줌
							
	
}
