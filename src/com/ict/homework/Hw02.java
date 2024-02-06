package com.ict.homework;

import java.util.Random;
import java.util.Scanner;

public class Hw02 {
	public static void main(String[] args) {

		// 	가위 바위 보 게임 ( 전체횟수 , 이긴횟수 , 승률 )
		
		//	1. 필요한 랜덤, 스캐너 호출 , 전체횟수 초기값 , 이긴횟수 초기값
		//	2. while 문 2개 만들고 바깥 while 문에 레이블지정
		//	3. 안쪽 while 문 계속할까요 
		//	4. 바깥 while 문 선택하세요 
		//	5. if 문 가위 바위 보 선택했을때 , (바깥 while 문 전에 ) else 문 다시선택하세요 
		//	6. 선택하면 전체횟수 증가 
		//	7. 컴퓨터 임의의 수 배정
		//	8. 컴퓨터 수에 따른 if else 문 , 안에 나와 컴퓨터 비교 if else 문 
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int all_count = 0;
		int win_count = 0;

		esc: while (true) {
			System.out.print("1.가위  2.바위  3.보  >> ");
			int user = scan.nextInt();
			if (user == 1 || user == 2 || user == 3) {
				all_count++;
				int com = ran.nextInt(3) + 1; // 1 ~ 3
				
				if (com == 1) {
					System.out.println("컴퓨터는 가위");
					if (user == 1) {
						System.out.println("비김");
					}else if (user == 2) {
						win_count++;
						System.out.println("이김");			
					}else if (user == 3) {
						System.out.println("짐");
					}
				} else if (com == 2) {
					System.out.println("컴퓨터는 바위");
					if (user == 1) {
						System.out.println("짐");
					}else if (user == 2) {
						System.out.println("비김");			
					}else if (user == 3) {
						win_count++;
						System.out.println("이김");
					}
				} else if (com == 3) {
					System.out.println("컴퓨터는 보");
					if (user == 1) {
						win_count++;
						System.out.println("이김");
					}else if (user == 2) {
						System.out.println("짐");			
					}else if (user == 3) {
						System.out.println("비김");
					}
				}
				
				while (true) {
					System.out.print("계속할까요(y/n)");
					String str = scan.next();
					if (str.equalsIgnoreCase("y")) {
						continue esc;
					} else if (str.equalsIgnoreCase("n")) {
						break esc;
					} else {
						System.out.println("다시 선택하세요");
						continue;
					}
				} // 안 while
				
			}else {
				System.out.println("다시 선택하세요");
				continue esc;
			}
		} // 밖 while
		System.out.println("전체 횟수 : " + all_count);
		System.out.println("이긴 횟수 : " + win_count);
		System.out.println("승률 : " + ((win_count*1.0/all_count)*100) + "%");
	}
}
