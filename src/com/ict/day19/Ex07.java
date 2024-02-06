package com.ict.day19;

import java.io.File;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		
		//	열고 닫기 >> try ~ catch 무조건
		String pathname = "D:/kosu0703/util/exam01.txt";
		File file = new File(pathname);
		try {
			//	파일 생성
			//	createNewFile : boolean
			boolean b1 = file.createNewFile();
			if (b1) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
			System.out.println();
			
			//	폴더 생성
			File file3 = new File("D:/kosu0703/util/kkk/yyy");
			boolean b2 = file3.mkdir();	//	kkk 가 없기때문에 yyy 를 생성할 수 없다.
			if (b2) {					//	만들고자 하는 yyy 위에 kkk 가 존재하지 않아서
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패");		
			}
			System.out.println();
			
			boolean b3 = file3.mkdirs();	//	kkk 가 없어도 kkk 를 만들고 yyy 를 생성한다.
			if (b3) {						//	만들고자 하는 yyy 위에 kkk 가 존재하지 않아도 생성 가능
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패");		
			}
			System.out.println();
			
			//	파일 삭제
			String pathname2 = "D:/kosu0703/util/exam01.txt";	//	삭제 대상
			File file4 = new File(pathname2);
			boolean b4 = file4.delete();
			if (b4) {
				System.out.println("파일 삭제 성공");
			} else {
				System.out.println("파일 삭제 실패");
			}
			System.out.println();
			
			//	폴더 삭제 
			File file5 = new File("D:/kosu0703/util/kkk");	//	삭제 대상
			boolean b5 = file5.delete();			//	삭제 대상 안에 폴더가 있기때문에 실패 
			if (b5) {								
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}
			System.out.println();
			
			//	폴더 안에 내용이 있으면 삭제 불가
			//	yyy 를 먼저 지우고, kkk 를 지우면 된다.
			File file6 = new File("D:/kosu0703/util/kkk/yyy");	
			if (file6.delete()) {
				System.out.println("yyy 디렉토리 삭제 성공");
			}else {
				System.out.println("실패");
			}

			File file7 = new File("D:/kosu0703/util/kkk");	
			if (file7.delete()) {
				System.out.println("kkk 디렉토리 삭제 성공");
			}else {
				System.out.println("실패");
			}
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
