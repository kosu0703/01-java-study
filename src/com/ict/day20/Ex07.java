package com.ict.day20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//	PrintStream 은 모든 데이터 출력할 수 있다.

//	PrintWriter 도 모든 데이터 출력할 수 있다. (OutputStream(바이트출력) , Writer(문자출력) 둘 다 가능)

public class Ex07 {
	public static void main(String[] args) {
		
		//	문자 스트림 가능 
		//	Writer 사용
		String pathname = "D:/kosu0703/util/test07.txt";
		File file = new File(pathname);
	
		FileWriter fw = null;
		PrintWriter pw = null;
		
		//	바이트 스트림도 가능
		//	OutputStream 사용
		String pathname2 = "D:/kosu0703/util/test08.txt";
		File file2 = new File(pathname2);
		
		FileOutputStream fos = null;
		PrintWriter pw2 = null;

		try {
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			
			pw.println(false);
			pw.println("PrintWriter 연습");
			pw.println(123456);
			pw.println(178.33);
			pw.println('A');

			pw.flush();
			
			fos = new FileOutputStream(file2);
			pw2 = new PrintWriter(fos);
			
			pw2.println(false);
			pw2.println("PrintWriter 연습2");
			pw2.println(123456);
			pw2.println(178.33);
			pw2.println('A');
			
			pw2.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw2.close();
				fos.close();
				pw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
