package com.ict.day13;

enum Type2{				
	WALK("워킹화",250),
	RUN("런닝화",255),
	TRACK("트래킹화",265),
	HIK("하이킹화",275);	//	다 적었으면 ; 세미클론
	
	private final String name;
	private final int size;
	
	//	enum 은 final 상수만 있기 때문에 setter 사용불가, 가져올때 getter 사용가능
	//	getter 만 생성
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	//	생성자 역할을 하는 놈 (기본적으로 private)
	private Type2(String name, int size) {
		this.name = name ;
		this.size = size ;
	}
}


public class Ex14 {
	public static void main(String[] args) {
		
		Type2[] arr = Type2.values();
		
		//	배열이면 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + " : " + arr[i].getSize());
		}
		
		
	}

}









