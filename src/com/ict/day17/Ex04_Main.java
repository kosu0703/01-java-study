package com.ict.day17;

public class Ex04_Main {
	public static void main(String[] args) {
		
		Ex04 ex04 = new Ex04();
		new Thread(ex04 , "첫번째 스레드").start();
		new Thread(ex04 , "두번째 스레드").start();
		
		
	}
}
