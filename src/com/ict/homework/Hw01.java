package com.ict.homework;

public class Hw01 {
	public static void main(String[] args) {
		
		//	1 + (-2) + 3 + (-4) + ... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.
		
		int sum = 0;
		int count = 0;
		
		for (int i = 1; sum <= 99; i++) {	//	총합이 99 까지 돌고 , 100 일때 빠져나온다.
			if (i%2 == 0) {
				sum = sum - i;
			}else {
				sum = sum + i;
			}
			count = i;
		}
		System.out.println(count);
		
	}
}
