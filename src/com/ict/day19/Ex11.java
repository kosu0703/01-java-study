package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//	스트림은 지연이 될 수 있으므로 Buffer(임시기억) 이용해서 지연 현상을 해결한다.
//	속도향상 효과
//	BufferedInputStream 사용 (단, 혼자서 사용 불가)
//	InputStream 과 함께 사용된다.

public class Ex11 {
	public static void main(String[] args) {
		
		String pathname = "D:/kosu0703/util/test02.txt";
		File file = new File(pathname);
		FileInputStream fis = null;		//	파일 생성
		BufferedInputStream bis = null;	//	버퍼 생성
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();			//	버퍼 닫고
				fis.close();			//	파일 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
