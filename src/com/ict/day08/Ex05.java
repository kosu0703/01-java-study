package com.ict.day08;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//	학생 수 받기
	
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		
		double[][] arr = new double[su][8];	//	번호, 국어, 영어, 수학, 총점, 평균, 학점, 순위 8개
		
		//	번호 , 국어 , 영어 , 수학 받기
		//	총점 , 평균 , 학점 구하기
			
		for (int i = 0; i < arr.length; i++) {
			double[] p = new double[8];		//	**new 는 항상 새로운 것을 만든다.(오류 발생 안함)
											 
			System.out.print("번호 : ");		//	바깥에 배열을 만들어 놓고 
			p[0] = scan.nextInt();			//	안에서 만들어서 바깥 배열에 넣는다.
											//	즉, 2차원 배열 생성
			System.out.print("국어 : ");
			p[1] = scan.nextInt();
			
			System.out.print("영어 : ");
			p[2] = scan.nextInt();
			
			System.out.print("수학 : ");
			p[3] = scan.nextInt();
			
			//	총점
			p[4] = p[1] + p[2] + p[3];	
			
			//	평균
			p[5] = (int)(p[4]/3.0*100)/100.0;
			
			//	학점
			if (p[5] >= 90) {
				p[6] = 'A';
			}else if (p[5] >= 80) {
				p[6] = 'B';
			}else if (p[5] >= 70) {
				p[6] = 'C';
			}else {
				p[6] = 'F';
			}
			
			//	순위 (항상 초기값 1 무조건)
			p[7] = 1;
			
			//	** 다차원 배열에 넣기
			arr[i] = p ;
		}
		
		//	순위 구하기 (값이 채워진 이후)  처음부터 끝까지 처음부터 끝까지
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {					//	나와 같을때는 비교 안함
					continue;
				}
				if (arr[i][4] < arr[j][4]) {	//	나보다 남이 크면 내 순위 하나 증가
					arr[i][7]++;
				}
			}
		}
		
		//	정렬 하기	( i 는 마지막 하나 전까지, j 는 항상 i 보다 1 크게 )
		
		double[] tmp = new double[8];					//	빈 배열 하나 만들어두기 (임시저장)
		
		for (int i = 0; i < arr.length-1; i++) {		
			for (int j = i+1; j < arr.length; j++) {	
				if (arr[i][7] > arr[j][7]) {			//	나보다 남이 작으면 나와 남을 바꿈
					tmp = arr[i];						//	내거를 임시에 넣고
					arr[i] = arr[j];					//	내거에 남거를 넣고		
					arr[j] = tmp;						//	남거에 임시에 넣어둔 내거를 넣는다.
				}
			}
		}
		
		//	출력 
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				//	국어, 영어, 수학은 출력에서 제외
				if (j==1 || j==2 || j==3) {
					continue;
				}
				//	평균 이므로 실수 double 그대로
				if (j==5) {	
					System.out.print(arr[i][j] + "\t");
				//	학점 이므로 문자 char 로 형 변환
				} else if (j==6) {
					System.out.print((char)(arr[i][j]) + "\t");
				//	나머지는 정수 int 로 형 변환
				}else {
					System.out.print((int)(arr[i][j]) + "\t");
				}			
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
