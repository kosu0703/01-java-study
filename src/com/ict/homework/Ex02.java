package com.ict.homework;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String com = "";
		String user = "";		//	사용자 선택 (가위/바위/보)
		String res = "";	//	결과 (승리,무승부,패배)
		String msg = "";	//	계속할지말지 (예/아니요)
		int com_num = 0;			//	컴퓨터의 수
		int user_num = 0;		//	사용자의 수
		int total = 0;		//	전체 횟수
		int win = 0;		//	이긴 횟수

		esc:while (true) {

			com_num = (int) (Math.random() * 3);
			
			switch (com_num) {
			case 0:
				com = "가위";
				break;
			case 1:
				com = "바위";
				break;
			case 2:
				com = "보";
				break;
			}
			
			System.out.print("입력하시오 (가위/바위/보) >>  ");
			user = scan.next();

			//switch
			switch (user) {
			case "가위":				
				user_num = 0;			
				break;
			case "바위":				
				user_num = 1;			
				break;				
			case "보":
				user_num = 2;
				break;
			default :
				System.out.println("잘못입력했습니다.");
				continue;	
			}

			total++;

			if (com_num == user_num) {
				res = "무승부";
			} else if (com_num - user_num == -1 || com_num - user_num == 2) {
				res = "승리";
				win++;
			} else { 
				res = "패배";
			}
			System.out.println();
			System.out.println("컴퓨터 : " + com + " / " + "사용자 : " + user);
			System.out.println("결과 : " + res);
			
			while (true) {
			System.out.println();	
			System.out.print("계속할까요? (네/아니요) >> ");
			msg = scan.next();

			if (msg.equals("네")) {
				continue esc;
			}
			if (msg.equals("아니요")) {
				break esc;
			}
			System.out.println("다시입력하세요");		
			}
			
		}
		
		double per = ((win*1.0) / total) * 100;
		System.out.println();
		System.out.println("전체횟수 : " + total);
		System.out.println("승률 : " + (int)(per*10)/10.0 + "%");
		System.out.println("수고하셨습니다");

	}

}
