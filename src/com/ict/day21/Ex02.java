package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex02 {
	public static void main(String[] args) {
		
		//	기상철 날씨 정보
		
		//	정보 가져오기 : InputStream / 읽어오기 Reader 
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//	파일 만들기 : File(경로) 생성
		String pathname = "D:/kosu0703/util/webPage_weather.txt";
		File file = new File(pathname);
		
		//	파일에 저장하기 : FileWriter 파일에 쓰기 
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//	가져올 사이트
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");			
			URLConnection conn = url.openConnection();
		
			//	헤더 정보 가져오기
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			//	헤더 정보 출력
			String msg = null;
			StringBuffer sb = new StringBuffer();
			
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			System.out.println(sb.toString());
			
			//	파일에 저장하기 
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb.toString());
			bw.flush();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
