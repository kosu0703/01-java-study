package com.ict.day17;

public class Ex06_Main {
	public static void main(String[] args) {
										//	Car 클래스 객체 생성
		Ex06_Car car = new Ex06_Car();	//	>> Producer , Customer 생성자 인자에 넣기위해서 
		
		Ex06_Producer producer = new Ex06_Producer(car);
		Thread tProducer = new Thread(producer);		
		
		Ex06_Customer customer = new Ex06_Customer(car);
		Thread tCustomer = new Thread(customer);
		
		tProducer.start();	//	스레드 생성
		tCustomer.start();
		
		
		
		
	}
}
