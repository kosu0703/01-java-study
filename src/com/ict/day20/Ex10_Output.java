package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex10_Output {
	public static void main(String[] args) {
		
			//	1. VO 를 객체로 만들자
			Ex10_VO vo1 = new Ex10_VO("고길동", 29, 79.6, true);
			Ex10_VO vo2 = new Ex10_VO("이길동", 39, 64.9, false);
			Ex10_VO vo3 = new Ex10_VO("김길동", 59, 53.1, true);
			Ex10_VO vo4 = new Ex10_VO("가길동", 19, 23.2, false);
			Ex10_VO vo5 = new Ex10_VO("나길동", 22, 44.6, true);
			Ex10_VO vo6 = new Ex10_VO("다길동", 55, 88.4, true);
			Ex10_VO vo7 = new Ex10_VO("라길동", 77, 98.7, false);
			Ex10_VO vo8 = new Ex10_VO("마길동", 42, 54.8, true);
			
			//	2. 직렬화 (파일에 저장)
			String pathname = "D:/kosu0703/util/object02.txt";
			File file = new File(pathname);
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			ObjectOutputStream oos = null;
			
			
			try {
				fos = new FileOutputStream(file);
				bos = new BufferedOutputStream(fos);
				oos = new ObjectOutputStream(bos);
				
				//	객체 직렬화
				
				//	객체가 여러개 일때는 객체를 컬렉션으로 모으자
				ArrayList<Ex10_VO> list = new ArrayList<Ex10_VO>();
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
