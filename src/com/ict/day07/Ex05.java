package com.ict.day07;

import java.util.Arrays;
import java.util.Collections;

public class Ex05 {
	public static void main(String[] args) {
		//	Arrays 클래스
		//	: 배열을 다루기 위한 다양한 메서드가 포함되어 있는 클래스
		
		int[] arr = new int[100];
		
		//	초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		//	1.
		//	binarySearch(배열, 찾을값) : int
		//		해당 배열에서 찾을 값을 검색 한 후에 위치값을 반환
		
		int res = Arrays.binarySearch(arr, 10);	//	10이 있는 방의 위치는 9번방이다
		System.out.println(res);				//	찾은 값은 10 이고 10 이 있는 방의 위치는 9번째 방이다.
		System.out.println();
		
		
		//	2.
		//	copyOf(배열, 새로운 배열의 크기) : 배열
		
		int[] arr2 = {1,2,3,4,5};
		int[] arr3 = Arrays.copyOf(arr2, 3);	//	복사하면서 배열의 길이가 줄어든다.
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println();
		
		int[] arr4 = Arrays.copyOf(arr2, 10);	//	복사하면서 배열의 길이가 커진다.
		for (int i = 0; i < arr4.length; i++) {	
			System.out.println(arr4[i]);		//	초기값이 없는 6~10번 방은 
		}										//	int 형이므로 초기값이 0 으로 채워진다.
		
												//	double 형은 초기값 0.0
												//	boolean 형은 초기값 false
		System.out.println();
		
		
		//	3.
		//	copyOfRange(배열, 시작위치, 끝위치(포함안함)) : 배열
		
		int[] arr5 = Arrays.copyOfRange(arr2, 2, 4);	// 	끝위치 포함 안하므로 2번방, 3번방만 나옴
		for (int i = 0; i < arr5.length; i++) {			
			System.out.println(arr5[i]);
		}
		System.out.println();
		
		
		//	4.
		//	fill(배열, 초기값) : void		//	void 는 따로 저장하지 마세요 라는 의미
		//		해당 배열의 초기값을 지정
		
		int[] arr6 = new int[10];
		Arrays.fill(arr6, 3);
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
		System.out.println();
		
		
		//	5.
		//	sort(배열) : void				//	void 는 따로 저장하지 마세요 라는 의미
		//		해당 배열을 오름차순 정렬 
		
		System.out.println("오름차순");
		int[] arr7 = {7,4,3,1,5,6,2};
		Arrays.sort(arr7);
		for (int i = 0; i < arr7.length; i++) {
			System.out.print(arr7[i]);
		}
		System.out.println();
			
		
		//	int 에 대한 내림차순은 없다.
		//	sort(배열, Collections.reverseOrder())  (단, 배열은 Integer[] 을 사용해야함)
		//	**주의사항 : int 가 아니라 Integer 로 만들어야지만 내림차순이 가능하다.
		
		System.out.println("내림차순");
		Integer[] arr8 = {7,4,3,1,5,6,2};
		Arrays.sort(arr8, Collections.reverseOrder());
		for (int i = 0; i < arr8.length; i++) {
			System.out.print(arr8[i]);
		}
		System.out.println();
		
		//	다른 방법 ( 오름차순에서 반대로 꺼내오기 )
		
		System.out.println("오름차순을 내림차순으로");
		Arrays.sort(arr7);
		for (int i = arr7.length-1; i >= 0 ; i--) {		//	length 는 1부터 index 는 0부터 이므로
			System.out.print(arr7[i]);				//	길이-1 에서 0 까지 하나씩 감소
		}
		System.out.println("\n");
		
		
		//	문자열 정렬 : 숫자 , 키보드특수 , 대문자 , 소문자 , 한글 순으로
		
		String[] arr9 = {"가나다","@","Mango","#","Apple","&","apple","7","mango","라라라","1","8","banana","Banana"};
		Arrays.sort(arr9);
		for (int i = 0; i < arr9.length; i++) {
			System.out.println(arr9[i]);
		}

		
		//	6. 
		//	asList()
		//		배열을 리스트라는 컬렉션으로 변경할때 사용
		//	컬렉션을 배운 후 배운다.
		
		//	7.(6과 반대개념)
		//	List 의 toArray()
		//		리스트를 배열로 만들어서 사용
		
		//	**배열과 리스트는 둘다 호환 가능
		
		
		
		
		
		
		
		
	}
}
