package com.ict.day08;

import java.util.Arrays;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		//			번호, 총점, 평균, 학점, 순위
		int[] p1 = { 1, 270, 90, 'A', 1 };
		int[] p2 = { 2, 210, 70, 'B', 1 };
		int[] p3 = { 3, 180, 60, 'F', 1 };
		int[] p4 = { 4, 300, 100, 'A', 1 };
		int[] p5 = { 5, 285, 90, 'C', 1 };

		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;

		// 배열 1개에 1명의 정보가 다 들어있다.
		// 순위를 구하고 정렬이 가능하다.
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				//	나랑은 비교 안함
				if (i == j) {	//	원래는 arr[i] == arr[j]
					continue ;
				}
				//	총점 비교
				if (arr[i][1] < arr[j][1]) {
					//	순위 매김
					arr[i][4]++;
				}
			}
		}
		
		//	**정렬하기 위해 임시배열 만들기		
		//	1차원 배열 5개짜리 빈 배열 (임시배열) 을 만들어서 통째로 이동
		int[] tmp = new int[5];
		
		//	순위를 오름차순 정렬	(총점을 내림차순 정렬해도 된다.)
		for (int i = 0; i < arr.length-1; i++) {	
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		//	순위 정렬 후 출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				//	학점 일때는 문자로 아니면 숫자로 (if ~ else)
				if (j == 3) {
					//	학점 형 변환 ( int 를 char 로 )
					System.out.print((char)(arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}	
				
			}
			System.out.println();
		}
	
		
		
	}
}
