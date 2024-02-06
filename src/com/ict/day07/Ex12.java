package com.ict.day07;

import java.util.Iterator;
import java.util.Scanner;

//	Ex10 선생님 풀이
public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//	배열의 초기값 설정하기
		
		String[] name = new String[5];		//	배열의 단점 : 미리 공간을 만들어 줘야한다.
		//String[] name = {"","","","",""};
		int[] kor = {0,0,0,0,0};
		int[] eng = {0,0,0,0,0};
		int[] math = {0,0,0,0,0};
		int[] sum = {0,0,0,0,0};
		double[] avg = {0.0,0.0,0.0,0.0,0.0};
		String[] hak = {"","","","",""};
		int[] rank = {1,1,1,1,1};
		
		//	입력받기
	
		for (int i = 0; i < rank.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			}else if (avg[i] >= 80) {
				hak[i] = "B학점";
			}else if (avg[i] >= 70) {
				hak[i] = "C학점";
			}else {
				hak[i] = "F학점";
			}
		
		}
		
		//	순위 구하기	(총점 배열의 값이 전부 채워진 상태에서 비교할수 있기 때문에)
		//	** 순위나 정렬은 값이 채워진 살태에서
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i]==sum[j]) {
					continue;
				}
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		//	출력하기
		System.out.println("이  름\t총  점\t평  균\t학  점\t순  위");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.print(rank[i] + "\n");
		}
		
		
		
		
		
		
		
	}
}
