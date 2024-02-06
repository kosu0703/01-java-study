package com.ict.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		
		//	바이트 입력 스트림 : InputStream 자식 클래스 FileInputStream 사용
		
		//			FileInputStream : 해당 파일에 내용을 1byte 한글자 읽기 (입력)
		
		//		주요메서드) read() : int 
		//					숫자(아스키코드(0-255), 한글자)
		//					해당 숫자를 문자로 보려면 char 형변환 해야한다.										
		//					**만약에 읽을 수가 없으면 -1 이 나온다.
		//					(즉, 무한루프 돌리면서 파일의 내용을 계속 읽다가 -1 이 나오면 끝난다.)
		
		//				read(byte[] b) : 배열에 존재하는 아스키코드 읽기
		
		
		//	파일 만들 위치 지정
		String pathname = "D:/kosu0703/util/test02.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			//	1byte 한글자 읽기
//			int b = fis.read();
//			System.out.println(b);
//			System.out.println((char)(b));
			
			//	**파일의 모든 글자 읽기 (한글, 한자 안됨)
			//	while 무한루프 이용 , -1 이면 읽을 수 없으므로 탈출
//			int b = 0;
//			while (true) {
//				b = fis.read();
//				if (b == -1) break;
//				System.out.println(b + " : " + (char)(b));
//				
//			}
			
			//	축약 형식
			//	읽어온 b 가 -1 이 아니면 계속 실행해라 
//			int b = 0;
//			while ((b=fis.read()) != -1) {	
//				System.out.println(b + " : " + (char)(b));
//			}
			
			//	바이트 배열로 읽기 
			byte[] b = new byte[(int) file.length()];			//	**형변환한다 : 캐스팅한다.
			//	fis 가 가리키는 파일의 내용을 읽어서 byte[] b 에 모두 넣어준다.
			fis.read(b);
			
			//	for 문 쓰면 한글, 한자 안나옴
//			for (byte k : b) {
//				System.out.println(k + " : " + (char)(k));
//			}
			
			//	String 을 이용하면 한글, 한자 가능
			//	byte[]을 넣어주면 String 으로 바꿔준다.	
			String str = new String(b);
			System.out.println(str);	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}
