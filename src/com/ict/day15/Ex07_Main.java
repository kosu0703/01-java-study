package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07_Main {
	public static void main(String[] args) {

		HashSet<Ex07> set1 = new HashSet<Ex07>();

		Scanner scan = new Scanner(System.in);

		esc: while (true) {

			System.out.print("이름 : ");
			String name = scan.next();

			System.out.print("국어 점수 :");
			int kor = scan.nextInt();

			System.out.print("영어 점수 :");
			int eng = scan.nextInt();

			System.out.print("수학 점수 :");
			int math = scan.nextInt();
			
			//Ex07 p = new Ex07(name, kor, eng, math);
			//set1.add(p);
			set1.add(new Ex07(name, kor, eng, math));
			
			while (true) {
				System.out.print("계속할까요 (y/n)");
				String str = scan.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				} else if (str.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("다시입력하세요");
			}
		}
		
		//	순위
		for (Ex07 i : set1) {
			for (Ex07 j : set1) {
				if (i.getSum() < j.getSum()) {
					i.setRank(i.getRank()+1);
				}
			}
		}
		
		//	정렬 X
		
		// 	출력
		System.out.println("이름\t총점\t평균\t학점\t순위");		
		
		//	iterator() 와 while 문 두번째 사용
		Iterator<Ex07> it = set1.iterator();	
		while (it.hasNext()) {
			Ex07 k = (Ex07) it.next();
			System.out.print(k.getName()+"\t");
			System.out.print(k.getSum()+"\t");
			System.out.print(k.getAvg()+"\t");
			System.out.print(k.getHak()+"\t");
			System.out.print(k.getRank()+"\n");
		}
		
		System.out.println();
		System.out.println("이름\t총점\t평균\t학점\t순위");	
		
		//	개선된 for 사용(foreach)	
		for (Ex07 k : set1) {
			System.out.print(k.getName()+"\t");
			System.out.print(k.getSum()+"\t");
			System.out.print(k.getAvg()+"\t");
			System.out.print(k.getHak()+"\t");
			System.out.print(k.getRank()+"\n");
		}
		
		
	}
}
