package com.ict.day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		
		//	나라와 수도를 HashMap 에 저장
		//	나라가 key , 수도가 value
		Map<String, String> map = new HashMap<String, String>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		Scanner scan = new Scanner(System.in);
		
		esc:while (true) {
			//	나라 입력 받기
			System.out.print("나라입력 >> ");
			String country = scan.next();
			//	키 값을 하나씩 꺼내기
			for (String key : map.keySet()) {
				//	만약 키 값이 입력받은 나라 값과 같으면 수도(value 값) 출력
				if(key.equals(country)) {
					System.out.println(key + "의 수도는 " + map.get(key) + "입니다");
					break;
				}
			}
			//	키 값과 입력받은 나라값이 다르면 데이터 없음 출력
			if (map.containsKey(country)) {
				System.out.println("데이터에 없는 나라입니다.");
			}
			//	계속할까요
			while (true) {
				System.out.print("계속할까요 (y/n) >> ");
				String str = scan.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				} else if (str.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시입력하세요");
				}
			}	
		}
		System.out.println("수고하셨습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
