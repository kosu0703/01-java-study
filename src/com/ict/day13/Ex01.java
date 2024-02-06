package com.ict.day13;

//	인터페이스 : 서비스를 제공하는 목록
//			 상수와 추상메서드로만 구성되어있음
//			 생성자가 없음 (객체 생성 불가)
//			**상속과 달리 인터페이스는 하나의 클래스가 둘 이상의 인터페이스를 동시에 구현할 수 있다.
//			 인터페이스가 같다라는 의미는 대체가 가능하다는 의미이다. 즉, 바꿀 수 있다.
//			
//			( 나중에.. java 8 버전부터 지원 : 1)static 메서드 추가 , 2) default 메서드(완전한 메서드) 추가 )		

class Ex01 {
	
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;

}

interface Ex02{	
	//	상수이기 때문에
	//	원래는 변수명을 대문자 사용		//	인터페이스는 상수와 추상메서드만 가진다. 
	int su1 = 10;				//	인스턴스를 만들어도 다 static final 로 만든다.
	static int su2 = 20;		//	**static final 이 생략되어 있다
	final int su3 = 30;
	static final int su4 = 40;
		
	public abstract void sound();	//	추상클래스에서는 추상메서드에 반드시 abstract 를 붙여줘야하지만
	public void play();				//	인터페이스에서는 abstract 생략해도 사용 가능
									
//	public void like() {			// 	일반 메서드는 사용 불가
//		
//	}
	
}
