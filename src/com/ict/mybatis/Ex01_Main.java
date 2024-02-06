package com.ict.mybatis;

import java.util.List;
import java.util.Scanner;

//	사용자 -> main 메서드 -> DAO -> mapper.xml -> DB -> 결과 리턴 -> mapper.xml -> DAO -> main 메서드 -> 출력

public class Ex01_Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//	전체 테이블 보고 선택하기
		List<Ex01_VO> list = Ex01_DAO.getList();
		prn(list);
		
		System.out.println("선택하세요");
		System.out.println("1. 고객 테이블 특정 데이터 보기");
		System.out.println("2. 고객 테이블 특정 데이터 삽입");
		System.out.println("3. 고객 테이블 특정 데이터 삭제");
		System.out.println("4. 고객 테이블 특정 데이터 수정");
		System.out.print(">>>>>>>>>>>>>>>>>    ");
		
		int menu = scan.nextInt();
		scan.nextLine();
		
		switch (menu) {
		case 1:
			System.out.print("검색할 custid : ");
			//	mapper 에서 파라미터가 String 이므로
			String custid = scan.nextLine();
			Ex01_VO vo = Ex01_DAO.getOne(custid);
			prn(vo);
			break;
		case 2:
			System.out.println("삽입할 정보를 입력하세요");
			System.out.print("번호 : ");
			String custid2 = scan.nextLine();
			System.out.print("이름 : ");
			String name = scan.nextLine();
			System.out.print("주소 : ");
			String address = scan.nextLine();			
			System.out.print("전화번호 : ");
			String phone = scan.nextLine();
			int result = Ex01_DAO.getInsert(new Ex01_VO(custid2, name, address, phone));
			if (result > 0) {
				//List<Ex01_VO> list2 = Ex01_DAO.getList();
				//prn(list2);
				//	위와 동일
				prn(Ex01_DAO.getList());
			}else {
				System.out.println("삽입 실패");
			}
			break;
		case 3:
			System.out.print("삭제할 custid : ");
			String custid3 = scan.nextLine();
			Ex01_VO vo2 = new Ex01_VO();
			//	기본생성자로 만들고 set 으로 custid 넣어주자
			vo2.setCustid(custid3);
			//	** 정보 설정하는 방법 => 1. 생성자 인자 / 2. setter
			int result2 = Ex01_DAO.getDelete(vo2);
			if (result2 > 0) {
				prn(Ex01_DAO.getList());
			}else {
				System.out.println("삭제 실패");
			}
			break;
		case 4:
			System.out.println("수정할 정보를 입력하세요");
			System.out.print("번호 : ");
			String custid4 = scan.nextLine();
			System.out.print("이름 : ");
			String name2 = scan.nextLine();
			System.out.print("주소 : ");
			String address2 = scan.nextLine();			
			System.out.print("전화번호 : ");
			String phone2 = scan.nextLine();
			int result3 = Ex01_DAO.getUpdate(new Ex01_VO(custid4, name2, address2, phone2));
			if (result3 > 0) {
				prn(Ex01_DAO.getList());
			}else {
				System.out.println("수정 실패");
			}
			break;
		}
		
		
	}
	
	//	테이블 전체 보기
	public static void prn(List<Ex01_VO> list) {
		System.out.println("번호\t이름\t주소\t전화번호");
		for (Ex01_VO k : list) {
			System.out.print(k.getCustid()+"\t");
			System.out.print(k.getName()+"\t");
			System.out.print(k.getAddress()+"\t");
			System.out.print(k.getPhone()+"\n");
		}
	}
	
	//	특정 데이터 보기
	public static void prn(Ex01_VO vo) {
		System.out.println("번호\t이름\t주소\t전화번호");
			System.out.print(vo.getCustid()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAddress()+"\t");
			System.out.print(vo.getPhone()+"\n");
		
	}
}
