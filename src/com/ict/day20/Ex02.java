package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//	바이트 스트림

//	PrintStream 은 모든 데이터를 출력만 할 수 있다. (입력없음)
//	출력이 목적이다.
//	그동안 사용했던 System.out.println(); 이 PrintStream 클래스에 있던 것이다.
//	기본생성자가 없어서 OutputStream 을 이용하자.

public class Ex02 {
	public static void main(String[] args) {
		
		String pathname = "D:/kosu0703/util/test04.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream(file);
			ps = new PrintStream(fos);
			
			//	FileOutputStream 은 파일에 출력		//	System.out.println 은 모니터에 출력
												//	PrintStream 의 객체가 System.out 모니터이다.
			//	기본자료형, String 모두 가능  		
			ps.println('A');
			ps.println(false);
			ps.println(3.14);
			ps.println("Hello World");
			ps.println(92);
			ps.println("자바의 세계에 오신 것을 환영합니다.");
			
			//	출력 끝 (안해도 되지만 하자)
			ps.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
