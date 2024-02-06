package com.ict.day17;

public class Ex07_ATM implements Runnable{
	private long depositeMoney = 10000;
	
	@Override
	public void run() {			
		synchronized (this) {	//	임계영역(synchronized 동기화하고 wait 와 notify 를 이용하여 순서바꾸기)
			for (int i = 0; i < 10; i++) {
				if (getDepositeMoney() <= 0) break;
					//	1000원씩 출금 
					withDraw(1000);
					//	2000원 출금될 때마다 wait() 되서 바뀜
					if (getDepositeMoney() % 2000 == 0 ) {
						try {
							this.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}else {
						this.notify();
					}				
			}
		}
	}
	
	public long getDepositeMoney() {
		return depositeMoney;
	}
	
	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;	//	depositeMoney = depositeMoney - howMuch
			System.out.print(Thread.currentThread().getName() + ",");
			System.out.println("잔액 : " + getDepositeMoney() + "원");
			
		}else {
			System.out.print(Thread.currentThread().getName() + ",");
			System.out.println("잔액이 부족합니다.");
		}
	}
	
}
