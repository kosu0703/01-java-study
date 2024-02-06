package com.ict.day16;

public class Ex08_TestA extends Thread{

	@Override	//	부모가 있고 부모꺼를 가져와서 오버라이딩해서 쓴다.
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : " + i + Thread.currentThread().getName());
		}
	}
	
	
//	@Override	
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa : " + i + Thread.currentThread().getName());
//		}
//	}
//		start() 에서 run() 으로 가야 스레드가 생성되고 멀티 스레드가 되는데,
//		start() 에서 start() 로 가면 main 메서드가 일 처리를 다 하는 싱글스레드
	
}
