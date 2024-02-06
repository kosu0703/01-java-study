package com.ict.day17;

import java.util.ArrayList;
import java.util.List;

//교착상태 방지 예제

public class Ex06_Car {
	//	차를 판매할때 사용하는 리스트
	//	판매할 차를 가지고 있는 공간
	private List<String> carList = null;		//	List 인터페이스를 이용하여 carList 컬렉션 생성
	
	//	객체를 생성하면 carList 컬렉션이 만들어진다.
	public Ex06_Car() {
		carList = new ArrayList<String>();		//	ArrayList 클래스를 이용하여 carList 컬렉션 생성
	}																		
	
	//	차를 생산
	//	getCar() 메서드를 실행하면, carName 을 반환한다.
	public String getCar() {					 
		String carName = null;
		
		switch ((int)(Math.random() * 3)) {		//	0 부터 2 까지 정수 (즉, 0 1 2)
		case 0:
			carName = "SM5";
			break;
		case 1:
			carName = "매그너스";
			break;
		case 2:
			carName = "카렌스";
			break;
		}
		return carName;								
	}
	
	//	차를 판매하고 리스트에서 삭제함
	//	pop()를 실행하면, carName 반환한다.
	//	push()와 교착상태를 방지하기 위해서 동기화시킨다.
	public synchronized String pop() {
		String carName = null;
		
		//	리스트의 크기가 0이면, (즉, 차가 없으면) 차 만들때까지 기다려라
		if (carList.size() == 0) {				
			try {
				System.out.println("차가 없어요 생산할때 까지 기다리세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//	리스트에 차가 있으면, carList 가 가지고 있는 것 중에 맨 마지막에 있는 놈(최신꺼) 삭제
		carName = (String)carList.remove(carList.size() - 1);
		System.out.println("손님이 차를 사갔습니다. 손님이 구입한 차이름은 \"" + carName + "\"");	
		return carName;
	}
	
	//	차를 만들어서 리스트에 넣음
	//	pop()와 교착상태를 방지하기 위해서 동기화시킴
	public synchronized void push(String car) {
		carList.add(car);
		
		System.out.println("차가 만들어 졌습니다. 차이름은 \"" + car + "\"");
		
		if (carList.size() == 5) {				//	리스트의 크기가 5이면, (즉, 차가 5개 만들어지면)
			this.notify();						//	깨워라 (즉, 다시 판매해라)
		}
		
	}
}
