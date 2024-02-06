package com.ict.jdbc;

import java.util.Scanner;

public class Ex11_Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//	전체보기 할지 , 하나 검색 할지 받기위해 스캐너
		
		System.out.println("선택하세요");
		System.out.println("1. 고객 테이블 전체 데이터 보기");
		System.out.println("2. 고객 테이블 특정 데이터 보기");
		System.out.println("3. 고객 테이블 특정 데이터 삽입");
		System.out.println("4. 고객 테이블 특정 데이터 삭제");
		System.out.println("5. 고객 테이블 특정 데이터 수정");
		System.out.print(">>>>>>>>>>>>>>>>>    ");
		
		int menu = scan.nextInt();
		scan.nextLine();
		
		switch (menu) {
		case 1:
			Ex11_DAO.getInstance().getSelectAll();	//	**반환형 자체가 static 이라 바로 호출 가능
			break;
		case 2:
			System.out.print("검색할 번호 : ");
			int custid = scan.nextInt();
			scan.nextLine();
			Ex11_DAO.getInstance().getSelectOne(custid);
			break;
		case 3:
			System.out.println("삽입할 정보를 입력하세요");
			System.out.print("번호 : ");
			int custid2 = scan.nextInt();
			scan.nextLine();
			System.out.print("이름 : ");
			String name = scan.nextLine();
			System.out.print("주소 : ");
			String address = scan.nextLine();			
			System.out.print("전화번호 : ");
			String phone = scan.nextLine();
			int result = Ex11_DAO.getInstance().getInsert(custid2, name, address, phone);
			if (result > 0) {
				Ex11_DAO.getInstance().getSelectAll();
			}else {
				System.out.println("삽입 실패");
			}
			break;
		case 4:
			System.out.print("삭제할 번호 : ");
			int custid3 = scan.nextInt();
			scan.nextLine();
			Ex11_DAO.getInstance().getDelete(custid3);
			break;
		case 5:
			System.out.println("수정할 정보를 입력하세요");
			System.out.print("번호 : ");
			int custid4 = scan.nextInt();
			scan.nextLine();
			System.out.print("이름 : ");
			String name2 = scan.nextLine();
			System.out.print("주소 : ");
			String address2 = scan.nextLine();			
			System.out.print("전화번호 : ");
			String phone2 = scan.nextLine();
			Ex11_DAO.getInstance().getUpdate(custid4, name2, address2, phone2);
			break;	
		}
		
		
	}
}
