package com.ict.day07;

import java.util.Arrays;

public class Ex08 {
	public static void main(String[] args) {
		//	순위 구하기	(정렬 비교와 다름)
		//	1. 모든 사람의 순위를 1등으로 초기값 부여
		//	2. 모든 사람과 비교해야 된다. (단, 자기자신 제외)
		//	3. 나(i)보다 남(j)이 크면 내 순위를 증가시킨다.
		
		int[] su = {90,80,70,95,65,85,75};
		int[] rank = {1,1,1,1,1,1,1};	// 	모두 1등을 주고, 하나씩 다 비교해야함
		
		for (int i = 0; i < su.length; i++) {			
			for (int j = 0; j < su.length; j++) {
				//	자기자신 제외
				if (su[i]==su[j]) continue ;	
				if (su[i] < su[j]) {
					rank[i]++; 
				}				
			}			
		}
		
		for (int j = 0; j < rank.length; j++) {
			System.out.println(su[j] + " : " + rank[j] + "등");
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
