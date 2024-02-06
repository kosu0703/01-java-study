package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//	문자 스트림 (읽기)

//	FileInputStream => 1byte , read() => 아스키코드(숫자) , read(byte[] b) => String 이용
//										(숫자,대소문자만)

//	FileReader => 2byte , read() => 유니코드(숫자) , read(char[] c) => String 이용
//								(전세계문자 표현가능)

public class Ex05 {
	public static void main(String[] args) {
		
		String pathname = "D:/kosu0703/util/test05.txt";
		File file = new File(pathname);
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			//	한글자 읽기
//			int k = fr.read();							//	유니코드 숫자로 나옴 
//			System.out.println(k + " : " + (char)(k));	// 	형변환해야함 char
			
			//	전체 읽기
//			int k = 0 ;
//			while ((k = fr.read()) != -1) {				//	-1 이 나올때까지 돌리기
//				System.out.println(k + " : " + (char)(k));
//			}
			
			//	배열 처리
			char[] arr = new char[(int)(file.length())];
			fr.read(arr);
//			for (char k : arr) {
//				System.out.print(k);	//	이미 char 배열이므로 형변환 필요없다.
//			}
			
			//	String 이용
			String msg = new String(arr).trim();	//	trim() 앞뒤 공백삭제
			System.out.println(msg);	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
