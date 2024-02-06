package com.ict.day12;

import java.util.Random;

public class Ex02_Sub extends Random{	//	유연성이 떨어짐
										//	객체 생성 안하고 상속받아서 random 사용 
	int su = 0;							
	
	public void play() {
		su = nextInt(10) + 1;
		System.out.println(su);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
