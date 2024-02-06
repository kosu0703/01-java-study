package com.ict.day10;

public class Ex09 {
	// 	접근 불가
	//	변수는 보통 private 을 사용한다 
	private String name = "";	//	음식 이름
	private int price = 0;		//	음식 가격
	
	
	//	**getter setter
	//	변수의 접근제한자가 private 이므로 외부에서는 접근이 불가하다.
	
	
	public void sName(String k) {	//	s : setter 	값이 설정된다.
		name = k ;				
	}								
	
	public void sPrice(int k) {
		price = k ;
	}
	
	public String gName() {			//	g : getter 	값이 보내진다.
		return name;				
	}
	
	public int gPrice() {
		return price;
	}

//	//	쉬운 방법
//	//	메뉴 탭 > Source > Generate getters and setters 
//	
//	public void setName(String name) {	// 	지역변수	
//		this.name = name;				//	전역변수와 지역변수가 이름이 똑같으면 this 를 써야함
//	}
//	
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public int getPrice() {
//		return price;
//	}
//	
	
	
	
	
	
	
}
