package com.ict.day11;

public class Ex06 {
	
	private String name ;	
	private int price ;		
	
	//	생성자를 만들자
	public Ex06(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	public void sName(String k) {	
		name = k ;				
	}								
	
	public void sPrice(int k) {
		price = k ;
	}
	
	public String gName() {			
		return name;				
	}
	
	public int gPrice() {
		return price;
	}


	
	
	
	
}
