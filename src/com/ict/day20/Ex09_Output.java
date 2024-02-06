package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//	객체 스트림
 	
	//	ObjectOutputStream : 객체 출력 스트림
	 		
	// 		writeObject() => 객체 직렬화 메서드

	//	보낼 때 객체를 직렬화해서 스트림으로 보낸다.

public class Ex09_Output {
	public static void main(String[] args) {
		
		//	1. VO 를 객체로 만들자
		Ex09_VO vo1 = new Ex09_VO("고길동", 29, 79.6, true);
		Ex09_VO vo2 = new Ex09_VO("이길동", 39, 64.9, false);
		Ex09_VO vo3 = new Ex09_VO("김길동", 59, 53.1, true);
		Ex09_VO vo4 = new Ex09_VO("가길동", 19, 23.2, false);
		Ex09_VO vo5 = new Ex09_VO("나길동", 22, 44.6, true);
		Ex09_VO vo6 = new Ex09_VO("다길동", 55, 88.4, true);
		Ex09_VO vo7 = new Ex09_VO("라길동", 77, 98.7, false);
		Ex09_VO vo8 = new Ex09_VO("마길동", 42, 54.8, true);
		
		//	2. 직렬화 (파일에 저장)
		String pathname = "D:/kosu0703/util/object01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			//	객체 직렬화
			
			//	1) 객체가 하나 일때
//			oos.writeObject(vo1);
//			oos.flush();
			
			//	2) 객체가 여러개 일때는 객체를 컬렉션으로 모으자
			ArrayList<Ex09_VO> list = new ArrayList<Ex09_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			list.add(vo6);
			list.add(vo7);
			list.add(vo8);
			
			//	3) 여러 객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				fos.close();
				bos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
}
