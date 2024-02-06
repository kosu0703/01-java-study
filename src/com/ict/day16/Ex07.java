package com.ict.day16;

//	Thread 스레드 : 현재 실행중인 프로그램 내에서 실행되는 세부 작업 단위
//			일처리하는 애 (일꾼)

//	싱글스레드 : 스레드가 하나, 일꾼이 하나
//	멀티스레드 : 스레드가 여러개, 일꾼이 여러개, **병행처리(여러가지 일을 동시다발적으로 한다.)

//	자바에서 스레드 생성 : start() => run() 일처리
//	
//		1. Thread 클래스 상속받기 : start() 와 run() 모두 가지고 있다.

//		2. Runnable 인터페이스 상속받기 : run() 만 존재 (추상메서드)
//								start()가 있어야 run()이 실행될 수 있으므로 
//								스레드 클래스의 생성자 인자에 넣어서 사용한다.

//	스레드 생성자 : Thread(), Thread(Runnable 인터페이스를 상속받은 객체)	
//			Thread(스레드이름), Thread(Runnable 인터페이스를 상속받은 객체, 스레드이름)

public class Ex07 {
	
	public void play() {
		System.out.println("2 : " + Thread.currentThread().getName());
	}
	
	public void start() {
		System.out.println("4 : " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		//	현재 사용중인 스레드의 이름 구하기
		System.out.println("1 : " + Thread.currentThread().getName());
		
		Ex07 test = new Ex07();
		test.play();
		System.out.println("3 : " + Thread.currentThread().getName());
		
		test.start();
		System.out.println("5 : " + Thread.currentThread().getName());
		System.out.println("수고하셨씁니다.");
		
		//	싱글 스레드
		//	main 스레드 혼자 모든 일을 다하고 다녔다.
		
	}
}
