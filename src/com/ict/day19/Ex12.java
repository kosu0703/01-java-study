package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {
	public static void main(String[] args) {
		
//	D:/kosu0703/util/image01.png 파일을 D:/kosu0703/image01.png 로 복사하자

		//	**복사하기
		//	원래 있던 것을 읽어들이고, 다른 위치에 쓴다. 
		String inputPath = "D:/kosu0703/util/image01.png";
		String outputPath = "D:/kosu0703/image01.png";
		//	읽어들이는 것
		File in_file = new File(inputPath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		//	쓰는 것
		File out_file = new File(outputPath);		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while ((b = bis.read()) != -1) {	//	**중요
				bos.write(b);					//	읽어서 바로 쓴다.
			}
			bos.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//	이동하기
			//	원본 삭제하면 파일 복사가 아니라 파일 이동
			in_file.delete();
		}
		
		
		
		
		
		
	}
}
