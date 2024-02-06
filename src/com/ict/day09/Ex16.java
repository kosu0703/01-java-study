package com.ict.day09;

public class Ex16 {
	public static void main(String[] args) {
		
		Ex15 t = new Ex15();
		
		String name = t.play01("둘리");
		System.out.println(name);
		System.out.println(t.name);
		
		int res = t.play02(80, 90, 90);
		System.out.println(res);		//	반환값은 있지만 
		System.out.println(t.sum);		//	total 은 사라지고 sum 은 0
		
		int res2 = t.play03(70, 80, 50);
		System.out.println(res2);		//	반환값도 있고
		System.out.println(t.sum);		//	sum 에도 총점이 찍힘
		
		
	}
}
