package com.ict.day20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//	문자 스트림 (쓰기) 

//	FileOutputStream => 1byte , write(int b) , write(byte[])

//	FileWriter => 2byte , write(int c) , write(char[]) , **write(String str)

public class Ex03 {
	public static void main(String[] args) {
		
		String pathname = "D:/kosu0703/util/test05.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			String str = "안녕하세요\n123456\nHello\n";
			fw.write(str);
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	
	}
}
