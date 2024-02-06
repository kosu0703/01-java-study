package com.ict.homework;

public class Ex01 {
	public static void main(String[] args) {
		
		//	1 + (-2) + 3 + (-4) + ... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.
		
		int sum5 = 0 ;
		
		for (int i = 0; sum5 < 100; i++) {
			if (i % 2 == 0) {
				sum5 = sum5 + (-i) ;
			} else {
				sum5 = sum5 + i ;	
			}
			if (sum5 >= 100) {
				if (i / 2 == 0) {
					System.out.println("i는 " + -i);
				}else {
					System.out.println("i는 " + i);
				}
			System.out.println("누적합은 " + sum5);
			}
		}
		
	}
}
