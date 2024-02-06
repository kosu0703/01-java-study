package com.ict.day19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Ex01_Main {
	public static void main(String[] args) {
		
		Ex01 p1 = new Ex01("이순신", 40, 100);
		Ex01 p2 = new Ex01("김유신", 20, 100);
		Ex01 p3 = new Ex01("홍길동", 13, 50);
		
		//	원래 방법
		List<Ex01> list = new ArrayList<Ex01>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		//	컬렉션으로 처리 (개선된 for 문)
		System.out.println("<컬렉션 처리>");
			//	고객명단
		System.out.println("=== 고객명단 순서대로 출력 ===");
		for (Ex01 k : list) {
			System.out.println(k.getName() + "고객");
		}
		Iterator<Ex01> it = list.iterator();
		while (it.hasNext()) {
			Ex01 k = (Ex01) it.next();
			System.out.println(k.getName() + "님");
		}
		
			//	총 비용
		int total = 0;
		for (Ex01 k : list) {
			total += k.getPrice();
		}
		System.out.println("총 비용은 " + total + " 입니다.");
		int total2 = 0;
		Iterator<Ex01> it2 = list.iterator();
		while (it2.hasNext()) {
			Ex01 k = (Ex01) it2.next();
			total2 += k.getPrice();
		}
		System.out.println("총 비용은 " + total2 + " 입니다.");
			
			//	나이가 20 이상인 고객 
		System.out.println("=== 나이가 20 이상인 고객의 명단 출력 ===");
		for (Ex01 k : list) {
			if (k.getAge() >= 20) {
				System.out.println(k.getName() + "고객");
			}
		}
		Iterator<Ex01> it3 = list.iterator();
		while (it3.hasNext()) {
			Ex01 k = (Ex01) it3.next();
			if (k.getAge() >= 20) {
				System.out.println(k.getName() + "님");
			}
		}
		
			//	나이가 20 이상인 고객 (오름차순)
		System.out.println("=== 나이가 20 이상인 고객의 명단 출력 (오름차순) ===");
		List<String> names = list.stream().filter(i -> i.getAge() >= 20).map(i -> i.getName()).sorted().toList();
		for (String k : names) {
			System.out.println(k + "고객");
		}
		Iterator<String> it4 = names.iterator();
		while (it4.hasNext()) {
			String k = (String) it4.next();
			System.out.println(k + "님");
		}
		System.out.println();
		
		
		//	스트림으로 처리
		System.out.println("<스트림 처리>");
		System.out.println("=== 고객명단 순서대로 출력 ===");
			//	스트림 생성
		Stream<Ex01> stream = list.stream();	
			//	하나씩 뽑아낼 때는 map 
		stream.map(i -> i.getName()).forEach(i -> System.out.println(i + "고객"));	
			//	최종처리하면 스트림이 닫힌다.
			//	다시 스트림 생성
			//	map 으로 만들고 int 를 뽑아내서 IntStream 으로 만든다.
		int sum = list.stream().mapToInt(i -> i.getPrice()).sum();
		System.out.println("총 비용은 " + sum + " 입니다.");
		
		System.out.println("=== 나이가 20 이상인 고객의 명단 출력 ===");
			//	조건이 있으면 filter 로 거르고 map 으로 이름만 뽑아낸다. (중간처리는 여러번 가능하다.)
		list.stream().filter(i -> i.getAge() >= 20).map(i -> i.getName())
		.forEach(i -> System.out.println(i + "님"));
		
		System.out.println("=== 나이가 20 이상인 고객의 명단 출력 (오름차순) ===");
			//	최종처리 전에 sorted 로 오름차순 정렬
		list.stream().filter(i -> i.getAge() >= 20).map(i -> i.getName()).sorted()
		.forEach(i -> System.out.println(i + "님"));
		
		
				
		
		
	}
}
