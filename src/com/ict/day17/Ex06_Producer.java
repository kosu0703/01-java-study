package com.ict.day17;

public class Ex06_Producer implements Runnable{
	private Ex06_Car car;
	public Ex06_Producer(Ex06_Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();		//	Car 클래스의 getCar() 메서드에서 차이름을 가져와서 저장
			car.push(carName);			//	Car 클래스의 push() 메서드를 사용하여 리스트에 차이름 추가
			
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	
	
}
