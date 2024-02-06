package com.ict.day16;

//	Thread 클래스 상속받는 방법 (스타트와 런 모두있다.)
//		다른 클래스를 상속받지 못하는 단점이 있다.

public class Ex08_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());	
		
		Ex08_TestA testA = new Ex08_TestA();
		Ex08_TestB testB = new Ex08_TestB();
		Ex08_TestC testC = new Ex08_TestC();
						
		testA.start();	//	Thread 클래스를 상속받아서 사용가능 
		testB.start();	//	스레드 클래스에는 start() 와 run() 모두 가지고 있다.
		testC.start();	//	start() 에서 run() 으로 간다.
		
		//	멀티스레드 : 병행처리 , 각자 번갈아 가면서 일처리를 한다. 무작위로
		//			스케줄은 운영체제가 알아서 짠다. 우리가 관여 안함
		
		System.out.println("수고하셨습니다.");	//	run()에 일꾼내려주고 바로 돌아와서 자기일한다.
	}										//	main 메서드는 끝난다.				
											//	일꾼 Thread-0 이 일을 한다.
	
}
