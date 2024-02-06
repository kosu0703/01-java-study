package com.ict.day15;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		
		//	로또
		
		//	숫자들어가니까 Integer 
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		//	6번 돌려야함
		for (int i = 0; i < 6; i++) {
			int su = (int)(Math.random()*10);
			if(!set1.add(su)) {	//	true > false , false > true 
				i--;
				//	들어가면 true, 안들어가면 false
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
