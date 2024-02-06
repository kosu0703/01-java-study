package com.ict.day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//	BufferedWriter : newLine() (줄바꿈) 

public class Ex04 {
	public static void main(String[] args) {
		
		String pathname = "D:/kosu0703/util/test06.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			//String str = "안녕하세요\n123456\nHello\n";
			bw.write("안녕하세요");
			bw.newLine();	//	줄바꿈
			bw.write("123456");
			bw.newLine();	//	줄바꿈
			bw.write("Hello");
			bw.newLine();	//	줄바꿈
			bw.write("大韓");
			bw.newLine();	//	줄바꿈
			
			//	쓰기 끝
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
