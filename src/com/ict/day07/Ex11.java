package com.ict.day07;

import java.util.Arrays;
import java.util.Scanner;

//	Ex10 다른방식
public class Ex11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int size = 5;	//	배열의 크기 지정

		String[] name = new String[size];
		int[] kor = new int[size];
		int[] eng = new int[size];
		int[] math = new int[size];

		int[] sum = new int[size];
		double[] avg = new double[size];
		String[] hak = new String[size];
		int[] rank = new int[size];
		Arrays.fill(rank, 1);		// rank 배열의 초기값 1로 채우기

		for (int i = 0; i < 5; i++) {
			System.out.print("이름 입력 : ");
			name[i] = scan.next();

			System.out.print("국어 점수 입력 : ");
			kor[i] = scan.nextInt();

			System.out.print("영어 점수 입력 : ");
			eng[i] = scan.nextInt();

			System.out.print("수학 점수 입력 : ");
			math[i] = scan.nextInt();

			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;

			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}

		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] == sum[j])
					continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.print(rank[i] + "\n");
		}

	}
}
