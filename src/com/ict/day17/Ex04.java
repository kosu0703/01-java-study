package com.ict.day17;

import java.util.Iterator;

//	두 개의 스레드를 생성하여 첫번째 스레드의 출력을 1 ~ 100 까지 출력하고,
//					두번째 스레드가 101 ~ 200 까지 출력하라.

public class Ex04 implements Runnable{
	int x = 0;
	
//	@Override
//	public synchronized void run() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println(++x + " : " + Thread.currentThread().getName());
//		}
//		System.out.println();
//	}
//	
	//	두번째 방법
	//	메서드 안에서 동기화 블록을 만들어서 사용 
	@Override
	public  void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println(++x + " : " + Thread.currentThread().getName());
			}
		}
		System.out.println();
	}
	
}
