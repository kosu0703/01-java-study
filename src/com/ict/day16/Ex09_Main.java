package com.ict.day16;

//	Runnable 인터페이스를 상속하는 방법 (런만 있다.)
//		다중 상속이 가능하다.

public class Ex09_Main {
	public static void main(String[] args) {
		
		//testA.start(); 	//	Runnable 인터페이스는 run()만 있다. 
							//	start() 는 Thread 클래스에 있다.
		
		//	1. 첫번째 방법
		Ex09_TestA testA = new Ex09_TestA();
		Thread t1 = new Thread(testA);	//	Runnable 을 상속받은 클래스를 인자에 넣어주세요.
		
		t1.start();		//	Runnable 을 상속받고 있는 클래스의 run()을 찾아간다.
		
		//	2. 두번째 방법
		//	익명(일회성)
		Ex09_TestB testB = new Ex09_TestB();
		new Thread(testB).start();
		
		//	3. 세번째 방법
		//	익명(안드로이드식)
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("111 : " + i + Thread.currentThread().getName());
				}
			}
		}).start();		//	객체가 생성되고 start()를 호출해줘야 run()이 실행된다.
						//	**스레드 생성의 기본은 start() > run() 무조건 해야한다.
		
		System.out.println("수고하셨습니다");
		
	}
}
