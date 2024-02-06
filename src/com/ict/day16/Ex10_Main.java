package com.ict.day16;

//	데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//			일반 스레드가 종료되면 데몬 스레드는 강제로 종료된다.

public class Ex10_Main {
	public static void main(String[] args) {
		
		Ex10 test = new Ex10();
		Thread thread = new Thread(test);	
		//	start() 위에 데몬스레드로 설정해야됨 
		thread.setDaemon(true);	//	Ex10에 생성된 스레드가 데몬스레드가 되서 main 이 끝나면 데몬스레드도 강제종료된다.
		thread.start();
		
		//	데몬 스레드가 없으면 main 이 종료되도 계속 일한다.
		Ex11 test2 = new Ex11();
		Thread thread2 = new Thread(test2);
		thread2.start();
		
		//	둘다 데몬을 실행하면 둘다 종료 되는데, 하나만 데몬을 실행하면 둘다 데몬이 풀린다.
		//	**왜그러지?
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);	// 	1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		//	15초 뒤에 끝나지만
		System.out.println("수고하셨습니다.");
		//	데몬 스레드를 안하면 main 스레드가 끝나도 Ex10에 생성된 스레드는 계속 일을 한다.
		
		
		
		
		
		
	}
}
