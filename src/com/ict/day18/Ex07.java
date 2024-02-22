package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex07 {
	public static void main(String[] args) {
		
		//	map , flatMap , peek
		
		//	map() : Stream 요소들을 변경한 새로운 Stream 을 반환한다.
		//			단일 스트림의 원소를 매핑시킨 후 매핑시킨 값을 다시 스트림으로 변환하는 중간 연산
		//			객체에서 원하는 원소를 추출하는 역할을 한다.
		
		Stream<String> stream = Stream.of("Java","jsp","spring","jqeury");
		stream.map(i -> i.toUpperCase()).forEach(i -> System.out.print(i + " "));
		System.out.println();	//	toUpperCase() 대문자로 바꿔라
		
		List<Ex07_VO> list = Arrays.asList(
				new Ex07_VO("pack", 20),
				new Ex07_VO("kyung", 35),
				new Ex07_VO("seok", 67),
				new Ex07_VO("test man", 10),
				new Ex07_VO("test woman", 45)				
				);
		
		//	이름만 추출하자
		Stream<Ex07_VO> stream2 = list.stream();
		stream2.map(i -> i.getName()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//	다시 사용하려면 스트림 다시 생성
		Stream<Ex07_VO> stream3 = list.stream();
		//	map() 중간처리하고 Stream 으로 받아서 사용할 수 있다.
		Stream<String> nameList = stream3.map(i -> i.getName());
		//	중간처리하고 받은 스트림으로 최종처리
		nameList.forEach(i -> System.out.println(i + " "));
		System.out.println();
		
		
		//	flatMap() : 입력한 원소를 가장 작은 단위의 단일 스트림으로 반환한다.
		
		//	리스트 만들기
		List<String> list2 = Arrays.asList("사과3팩","멜론2팩","딸기3팩");
		//	리스트로 스트림 생성
		Stream<String> stream4 = list2.stream();
		//	flatMap (중간처리)
		List<String> list3 = stream4.flatMap(i -> {
			//	index 0 부터 2까지(2포함x)
			String s = i.substring(0, 2);	
			//	index 2 부터 3까지(3포함x)
			//	String 을 int 로 바꾸기
			int n = Integer.parseInt(i.substring(2, 3));
			//	배열의 크기를 팩수만큼으로 배열을 만들고
			String[] arr = new String[n];
			//	배열 안에 뽑아냈던 과일명을 채움
			Arrays.fill(arr, s);
			//	배열을 스트림으로 만들어서 반환
			return Stream.of(arr);
		}).collect(Collectors.toList());	//	새로운 리스트에 저장(최종처리)
		System.out.println(list3);
		System.out.println();

		
		//	< 2차원배열의 경우 map 과 flatMap 의 차이 >
		String[][] arr2 = new String[][] {
			{"a","b"} , {"c","d"} , {"e","d"} , {"a","h"} , {"i","j"}
		};
		
		//	map 을 이용하여 스트림으로 변환 후 출력 (즉, 2차원배열의 경우 1차원배열 주소값만 가져옴)
		//	[a, b] [c, d] [e, d] [a, h] [i, j]
		Stream<String[]> stream5 = Arrays.stream(arr2);
		//stream5.forEach(i -> System.out.print(i + " "));	//	배열 주소 5개만 보인다.	
		//stream5.map(i -> Arrays.stream(i)).forEach(i -> System.out.print(i + " "));
		//System.out.println();	//	2차원 배열에서 나온 1차원 배열의 주소값이 반환된다.
		stream5.map(i -> Arrays.toString(i)).forEach(i -> System.out.print(i + " "));
		System.out.println();	
		
		//	flatMap 을 이용하여 단일 스트림으로 변환 후 출력
		//	a b c d e d a h i j
		Stream<String[]> stream6 = Arrays.stream(arr2);
		stream6.flatMap(i -> Arrays.stream(i)).forEach(i -> System.out.print(i + " "));
		System.out.println();	//	2차원 배열에서 나온 1차원 배열을 다시 스트림으로 생성
		
		//	flatMap 으로 만든 단일스트림들을 List 로 모아서 출력
		Stream<String[]> stream7 = Arrays.stream(arr2);
		List<String> list4 = stream7.flatMap(i -> Arrays.stream(i)).collect(Collectors.toList());
		System.out.print(list4);
		System.out.println();
		
		
		//	peek() : forEach 처럼 loop 인데 중간처리 (forEach 최종처리)
		//			중간에 확인할 때 주로 사용 
		//			즉, forEach 안써도 중간에 확인 후 중간처리 다하고 최종처리 forEach 하면 된다.
		Stream<String> stream8 = Stream.of("Java","jsp","spring","jqeury");
		stream8.map(i -> i.toUpperCase())
		.peek(i -> System.out.println(i + "배우기"))
		.forEach(i -> System.out.println(i + "~"));
		
		
		
		

		
		
		
		
		
		
	}
}
