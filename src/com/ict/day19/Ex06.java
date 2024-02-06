package com.ict.day19;

import java.io.File;

/*
	File 클래스 : 특정 위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
	
		- 주요 생성자 
			File(String 경로)
			File(String 상위경로, String 하위경로)
			File(File 상위경로, String 하위경로)
					
		- 주요 메서드 	
			createNewFile() : 파일생성
			mkdir() : 디렉토리 생성 (상위 디렉토리 없으면 생성 안됨)
			mkdirs() : 디렉토리 생성 (상위 디렉토리까지 생성해줌)
			isFile() : 파일이면 true
			isDirectory() : 디렉토리면 true
			exists() : 있으면 true
			getName() : 이름 반환
			length() : 파일의 크기를 byte 로 반환 (**디렉토리는 크기가 없음)
			list() : 특정위치의 내용을 String 배열로 만들어서 저장
			getAbsolutePath() : 절대주소
			getPath() : 상대주소
			
*/
public class Ex06 {
	public static void main(String[] args) {
		//	본인 컴퓨터 환경에 맞게
		//String pathname = "D:\\kosu0703\\javastudy";
		//						변경가능( \\ -> / )
		String pathname = "D:/kosu0703/javastudy";
		File file = new File(pathname);
		String[] arr = file.list();
		//	파일 목록 출력
		for (String k : arr) {
			//System.out.println(k);		//	현재 위치
			File file2 = new File(pathname, k);
			//System.out.println(file2);	//	전체 경로 
			if (file2.isDirectory()) {		//	디렉토리(폴더)니? , 디렉토리는 크기가 없다.
				System.out.println("디렉토리(폴더) : " + k);
			}else {							//	아니면 파일, 파일은 크기를 구할 수 있다.
				System.out.println("파일 : " + k + ", 크기 : " + k.length() + "Byte");
			}								//	Byte < KB < MB < GB < TB 
											//	1024배씩(2의 10제곱)
		}
		
		

		
	}
}
