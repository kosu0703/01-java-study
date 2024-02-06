package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


//	URL(Uniform Resource Locator) : 인터넷에서 접근 가능한 자원의 주소(위치)

//	URL 클래스 : 해당 위치의 자원의 결과만 가져온다.
//		**final 클래스이다. (상속할 수 없다. 즉, 자식클래스를 만들 수 없다.)

public class Ex12 {
	public static void main(String[] args) {
		
		//	가서 정보를 읽어서 가져와야 하기 때문에 InputStream
		
		InputStream is = null;			//	컴퓨터로 읽어서
		InputStreamReader isr = null;	//	바이트스트림을 문자스트림으로
		BufferedReader br = null;		//	사람이 읽을 수 있게
		
		//	내 컴퓨터에 저장
		//	파일에 써야한다.
		String pathname = "D:/kosu0703/util/webPage01.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//	인터넷 어디 위치가서 읽어오세요 
			//	java.net.URL 사용
			URL	url = new URL("https://comic.naver.com/index");
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		
			String msg = null;
			
			//	여러 줄의 스트림을 저장하기 위해서는 
			//	즉, String 에 여러번 더하기 + 를 사용하면 메모리에 쓸모없는 공간들이 계속 만들어진다.
			//	그것을 해결하기 위해서 StringBuffer 나 StringBuilder 를 사용하면 하나의 객체에 쌓여간다.
			//	append() 로 추가한다.
			StringBuffer sb = new StringBuffer();
			//StringBuilder sb = new StringBuilder();
			
			while ((msg = br.readLine()) != null) {
				//	화면에 출력
				//System.out.println(msg + "\n");
				sb.append(msg + "\n");
			}
			//	sb 에 쌓여진 객체를 String 으로 바꿔서 출력
			//	**toString => 자료형을 String으로 만들어준다.
//			System.out.println(sb.toString());	
			
			//	파일에 저장
			//	읽어온 정보를 파일에 써주세요
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();	//	출력 끝
		
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		}
		
		
		
	}
}
