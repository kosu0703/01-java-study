package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		Ex12 a = new Ex12();		
		a.play02("가나다", 70, 80, 90);
		
		System.out.println();
		
		Ex13 b = new Ex13();		
		b.play02("abc", 60, 80, 90);
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);			
		System.out.print("이름 : ");
		String n1 = scan.next();
		
		System.out.print("국어 : ");	
		int k1 = scan.nextInt();
		
		System.out.print("영어 : ");	
		int k2 = scan.nextInt();
		
		System.out.print("수학 : ");
		int k3 = scan.nextInt();
		
		b.play02(n1, k1, k2, k3);
		  		
		
		
		
		
	}
}
