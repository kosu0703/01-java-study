package com.ict.day17;

public class Ex01_Main{
	public static void main(String[] args) {
		
		System.out.println("main : " + Thread.currentThread().getName());

		Ex01 test = new Ex01();
		Thread thread = new Thread(test);
		thread.start();
		
		//	join() : 현재 스레드는 join 메서드를 호출한 스레드가 끝날 때까지 대기상태로 빠진다.
		//			join()를 호출한 스레드가 끝나면 다시 현재 스레드를 실행한다.
		//			즉, 현재 스레드는 join 메서드를 호출한 스레드가 끝나야 실행할 수 있다. 
		
		try {
			thread.join();	//	join 메서드를 호출한 곳은 Ex01 클래스이다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("수고하셨습니다. : " + Thread.currentThread().getName());
		
		
	}
}
