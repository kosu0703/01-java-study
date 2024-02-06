package com.ict.day06;

public class Ex03 {
	public static void main(String[] args) {
		//	다중 for 문에서 break 와 continue
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	break ;								
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		//	i 가 2 일때 아무것도 실행되지 않는다.
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 3)	break ;
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		//	j 가 3 일때 멈추고 안쪽 for 문을 빠져나간다. 즉, j 는 1, 2 만 찍힌다.
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	continue ;								
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		//	break 와 똑같이
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 3)	continue ;
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		//	j 가 3 일때 빼고 출력
		
		
		
		
		
		
		
	}
}





