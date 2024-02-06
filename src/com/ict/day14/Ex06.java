package com.ict.day14;

interface Ex06 {
	int DATA = 1000;
	public void prinData();	
}

//	인터페이스를 상속해서 오버라이딩하는 일반적인 방법
class Ex06_Test1 implements Ex06{

	@Override
	public void prinData() {
		int data1 = DATA + 100;
		System.out.println("data : " + data1);
	}
}

//	인터페이스를 상속하지 않고 바로 메서드에 넣어서 사용하는 응용 방법  
class Ex06_Test2{
	
	public void prn() {
		// int data2 = Data + 100 ;  상속받지 못해서 사용할 수 없다.
		new Ex06() {
			int data2 = DATA + 100 ;
			@Override
			public void prinData() {
				System.out.println("data2 : " + data2);
			}
		}.prinData();	// **클래스의 끝에서 호출하기
	}
	
	
}