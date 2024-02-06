package com.ict.day17;

public class Ex05_Main {
	public static void main(String[] args) {
		
		Ex05 ex05 = new Ex05();
		new Thread(ex05 , "첫번째").start();
		new Thread(ex05 , "두번째").start();
		new Thread(ex05 , "세번째").start();
	
		
	}
}
