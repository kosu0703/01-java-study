package com.ict.day19;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex02_Main {
	public static void main(String[] args) {
		//	반환형 보고 따라가자
		Stream<Ex02> stream = Ex02.visits_list.stream();
		
		//	방문횟수를 수집하고 평균을 구하세요 	
		double avg = stream.collect(Collectors.averagingInt(i -> i.getVisits()));
		System.out.println("전체 방문한 사람 평균횟수 : " + avg);
		System.out.println();
		
		//	다른방법 mapToInt 사용 
		//	sum() , average() 는 이 방법으로 사용하자 
		stream = Ex02.visits_list.stream();
		double avg2 = stream.mapToInt(i -> i.getVisits()).average().getAsDouble();
		System.out.println("전체 방문한 사람 평균횟수 : " + avg2);
		System.out.println();
		
		//	회원이름만 리스트로 만들어서 출력하자
		stream = Ex02.visits_list.stream();
		List<String> names = stream.map(i -> i.getName()).collect(Collectors.toList());
		System.out.println("회원 이름 : " + names);
		System.out.println();
		
		//	타입별로 묶어서 개수를 구한다.	
		stream = Ex02.visits_list.stream();
		Map<Type, Long> cnt = stream.collect(Collectors	// count() : long
				.groupingBy(i -> i.getType(), Collectors.counting())) ;	
		System.out.println("타입별 인원수 : " + cnt);
		
		
		
		
		
		
	}
}
