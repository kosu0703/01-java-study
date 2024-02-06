package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

public class Ex02_Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Ex02_VO> list = Ex02_DAO.getList();
		prn(list);
		System.out.println();
	
		System.out.println("옵션 번호를 선택하세요");
		System.out.println("1. 특정 데이터 보기");
		System.out.println("2. 특정 데이터 삽입");
		System.out.println("3. 특정 데이터 삭제");
		System.out.println("4. 특정 데이터 변경");
		System.out.print(">>>>>>>>>>    ");
		
		int menu = scan.nextInt();
		scan.nextLine();
		
		switch (menu) {
		case 1:
			System.out.print("검색할 번호 : ");
			String idx = scan.nextLine();
			Ex02_VO vo = Ex02_DAO.getOne(idx);
			prn(vo);
			break;
		case 2:
			System.out.print("삽입할 번호 : ");
			idx = scan.nextLine();
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 : ");
			String pw = scan.nextLine();
			System.out.print("이름 : ");
			String name = scan.nextLine();
			System.out.print("나이 : ");
			String age = scan.nextLine();
			System.out.print("가입날짜 : ");
			String regdate = scan.nextLine();
			int res = Ex02_DAO.getIns(new Ex02_VO(idx, id, pw, name, age, regdate));
			if (res > 0) {
				prn(Ex02_DAO.getList());
			}else {
				System.out.println("삽입 실패");
			}
			break;
		case 3:
			System.out.print("삭제할 번호 : ");
			idx = scan.nextLine();
			Ex02_VO vo2 = new Ex02_VO();
			vo2.setIdx(idx);
			res = Ex02_DAO.getDel(vo2);
			if (res > 0) {
				prn(Ex02_DAO.getList());
			}else {
				System.out.println("삭제 실패");
			}
			break;
		case 4:
			System.out.print("변경할 번호 : ");
			idx = scan.nextLine();
			System.out.print("아이디 : ");
			id = scan.nextLine();
			System.out.print("비밀번호 : ");
			pw = scan.nextLine();
			System.out.print("이름 : ");
			name = scan.nextLine();
			System.out.print("나이 : ");
			age = scan.nextLine();
			System.out.print("가입날짜 : ");
			regdate = scan.nextLine();
			res = Ex02_DAO.getUp(new Ex02_VO(idx, id, pw, name, age, regdate));
			if (res > 0) {
				prn(Ex02_DAO.getList());
			}else {
				System.out.println("변경 실패");
			}
			break;
		}
		
		
	}
	
	public static void prn(List<Ex02_VO> list) {
		System.out.println("번호\t아이디\t패스워드\t이름\t나이\t가입날짜");
		for (Ex02_VO k : list) {
			System.out.print(k.getIdx()+"\t");
			System.out.print(k.getId()+"\t");
			System.out.print(k.getPw()+"\t");
			System.out.print(k.getUsername()+"\t");
			System.out.print(k.getAge()+"\t");
			System.out.print(k.getRegdate()+"\n");
		}
	}
	
	public static void prn(Ex02_VO vo) {
		System.out.println("번호\t아이디\t패스워드\t이름\t나이\t가입날짜");
		System.out.print(vo.getIdx()+"\t");
		System.out.print(vo.getId()+"\t");
		System.out.print(vo.getPw()+"\t");
		System.out.print(vo.getUsername()+"\t");
		System.out.print(vo.getAge()+"\t");
		System.out.print(vo.getRegdate()+"\n");
	}
}
