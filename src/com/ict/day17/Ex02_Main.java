package com.ict.day17;

public class Ex02_Main {
	public static void main(String[] args) {
		
		Ex02 test = new Ex02();
		new Thread(test, "dog").start();	//	스레드 이름 지정
		new Thread(test, "cat").start();	//	스레드가 같이 사용하는 Ex02 임계영역
		new Thread(test, "tiger").start();	//	임계영역의 단점
		new Thread(test, "lion").start();	//	무작위로 스케줄링 되서 순서가 정해지지 않음
		
		System.out.println("main : " + Thread.currentThread().getName());
		
		
		
		
	}
}
