package com.ict.day20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//	사진, 동영상, 음악이면 바이트 스트림
//	글자로 되어 있으면 문자 스트림 

//	BufferedReader : readLine() (한줄씩 읽는다.) 
//					**더이상 읽을 수 없을떄 null 이 나온다.

public class Ex06 {
	public static void main(String[] args) {
		
		String pathname = "D:/kosu0703/util/test06.txt";
		File file = new File(pathname);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String msg = null;
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
