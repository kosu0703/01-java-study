package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//	스트림은 지연이 될 수 있으므로 Buffer(임시기억) 이용해서 지연 현상을 해결한다.
//	속도향상 효과
//	BufferedOutputStream 사용 (단, 혼자서 사용 불가)
//	OutputStream 과 함께 사용된다.

public class Ex09 {
	public static void main(String[] args) {
		
		String pathname = "D:/kosu0703/util/test01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		//	new FileOutputStream 하고 try ~ catch 후 
		//	**반드시 finally 하고 close() 후 try ~ catch 기본이다.
		
		try {
			// 스트림 체인 방식								//	true 있으면 이어쓰기
			fos = new FileOutputStream(file, true);		//	없으면 (초기값 false) 덮어쓰기
			bos = new BufferedOutputStream(fos);		
			
			String msg = "한국 ICT 인재 개발원\n5강의장 자바 실습 중";
			byte[] b = msg.getBytes();
			bos.write(b);				//	기존 내용 지우고 덮어쓰기
			bos.write(13);				//	true 때문에 이어쓰기됨
			
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();		//	fos 가 bos 로 들어간 것이기 때문에
				fos.close();		//	밖 bos 먼저 닫고 fos 닫는다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
