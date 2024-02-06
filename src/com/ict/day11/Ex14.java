package com.ict.day11;

public class Ex14 {
	public static void main(String[] args) {
		
		System.out.println(Ex13.num);		//	**static 은 어디서나 가져다 사용할 수 있다.
		System.out.println(Ex13.play2());	//	즉, 공용으로 사용한다.
		
		//	static 도 private 은 접근 못함
		//System.out.println(Ex13.age);
		
		Ex13 t1 = new Ex13();			//	새로운 객체가 생성된다.
		System.out.println(t1.su);		//	생성되면서 새로운 su 가 만들어지고 1 증가한다. su = 11
		System.out.println(t1.num);		//	생성되면서 원래 있던 num 에 1 증가하여 저장된다.
		System.out.println(Ex13.num);	//	static num = 11
		System.out.println();
		
		Ex13 t2 = new Ex13();			//	새로운 객체가 생성된다.
		System.out.println(t2.su);		//	생성되면서 새로운 su 가 만들어지고 1 증가한다. su = 11
		System.out.println(t2.num);
		System.out.println(Ex13.num);
		System.out.println();
		
		Ex13 t3 = new Ex13();
		System.out.println(t3.su);
		System.out.println(t3.num);
		System.out.println(Ex13.num);
		System.out.println();
		
	}
}
