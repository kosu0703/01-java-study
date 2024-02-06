package com.ict.day07;

public class Ex07 {
	public static void main(String[] args) {
		// 	배열 정렬하기 (sort 말고 옛날 방식)
		// 	알고리즘 또는 자료구조
		//	1. 자리변경을 위한 임시변수 지정
		//	2. 나(i)는 전체길이에서 하나 전까지
		//	3. 남(j)은 항상 나(i)보다 하나 앞에
		
		int[] su = { 3, 4, 9, 8, 2, 1, 7, 10, 5, 6 };
		
		// 자리 변경을 위한 임시 변수
		int tmp = 0; 
		
		for (int i = 0; i < su.length - 1; i++) { 		// i 는 전체길이 하나 전까지

			for (int j = i + 1; j < su.length; j++) { 	// j 는 i 보다 항상 하나 앞에
				// i > j (오름차순) , i < j (내림차순)
				if (su[i] > su[j]) {	
					// 자리변경
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;			
				}
			}			
		}
		 
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
		
		
		

	}
}
