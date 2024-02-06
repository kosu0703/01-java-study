package com.ict.day17;

//	두 개의 스레드를 생성하여 첫번째 스레드가 1 ~ 50 까지 출력하고,
//					두번째 스레드는 51 ~ 100까지 출력하고,
//					다시 첫번째 스레드가 101 ~ 150까지 출력하고,
//						두번째 스레드가 151 ~ 200까지 출력한다.

public class Ex05 implements Runnable{
	int x = 0;
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
		//	if (x==50 || x==100) {
			if (x % 50 == 0){		//	50 씩 출력 > 50 씩 끊긴다. > 50 으로 나눈 나머지는 0	
				try {
					System.out.println();
					wait();
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
			}
			notify();
				
		}
		
		
	}
	
}
