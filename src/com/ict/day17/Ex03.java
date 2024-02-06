package com.ict.day17;

public class Ex03 implements Runnable{
	int x = 0;
	
	//	동기화 처리할때 현재 실행 중인 스레드를 강제로 대기상태로 변경시키는 메서드가 wait() 이다.
	//	wait() 는 기절시키고 땡
	
	//	wait() 된 스레드를 풀어주는 예약어가 notify(), notifyAll() 이다.
	//	기절시킨 애를 깨움
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
			if (x == 11) {
				try {			//	x 가 11 이면 멈추고 빠져나가라 (강제로 대기상태로 빼버림)
					wait();		//	11개만 찍고 자고있다. (종료된게 아니다.) 즉, 대기상태에서 준비상태로 못감
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();		//	x 가 12 가 되면 wait() 된 애를 깨운다. 
			}					//	즉, 대기상태에서 준비상태로 간다.
		}
		
	}
	
}
