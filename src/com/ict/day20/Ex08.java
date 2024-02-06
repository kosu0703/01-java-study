package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//	바이트 스트림 => 문자 스트림

//	OutputStreamWriter : 바이트 출력을 문자 출력으로 변경
//	순서) OutputStream => OutputStreamWriter => BufferedWriter 

//	InputStreamReader : 바이트 입력을 문자 입력으로 변경
//	순서) InputStream => InputStreamWriter => BufferedReader

public class Ex08 {
	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);		//	키보드 System.in
//		1번 - System.out.print("원하는 문자 : ");		//	모니터 System.out
//		2번 - String msg = scan.next();
//		3번 - System.out.println("메시지 : " + msg);

		//	1번
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		//	2번
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			//	 1번 원하는 문자 모니터에 출력
			osw = new OutputStreamWriter(System.out); 	// OutputStream => System.out
			bw = new BufferedWriter(osw);				//		나가는 장치 	모니터(프린터)
			bw.write("원하는 문자 : ");
			bw.flush();	//	**출력 끝나면 무조건 flush() 
			
			//	 2번 문자 입력 받기 
			isr = new InputStreamReader(System.in);		//	InputStream => System.in	
			br = new BufferedReader(isr);				//		들어오는 장치	키보드(바코드)
			String msg = br.readLine();	//	한줄씩 읽기
			
			//	3번 받은 정보 출력
			bw.write("메시지 : " + msg);
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
