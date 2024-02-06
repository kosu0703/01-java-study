package com.ict.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex06_Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		//	**중요 keySet() 으로 키 값들이 모인 컬렉션 생성
		Set<String> keys = map.keySet();
		
		esc:while (true) {
			
			System.out.print("나라입력 >> ");
			String str = scan.next();
			
			//	for 문으로 하나씩 안빼고 조건에 맞는 것만 key 호출하면 value 출력 
			if (keys.contains(str)) {
				String res = map.get(str);
				System.out.println(str + "의 수도는 " + res + "입니다.");
			}else {
				System.out.println("데이터가 없는 나라");
			}
			
			while (true) {
				System.out.print("계속할까? (y/n) >> ");
				String msg = scan.next();
				
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if (msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("제대로 입력하요");
					continue;
				}
				
			}
		}
		
		
		
	}
}
