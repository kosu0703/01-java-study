package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_Client {
	public static void main(String[] args) {
		
		Socket socket = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		Scanner scan = new Scanner(System.in);
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
				
		try {
			//	3. 소켓 생성
			//	Socket( String 서버IP주소 , int 서버 포트 번호 ) 
			socket = new Socket("192.168.0.36", 7777);
			//	4. TCP 연결
			//		서버에 클라이언트 소켓보내기
			
			//	7. TCP 프로토콜
			//		서버에서 서버 소켓을 받는다.
			
			//	8. 입출력스트림 얻기
			//		받은 서버 소켓에 OutputStream / InputStream 이 있다.
				
			//	10. 출력스트림 (서버로 가는거)
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			//	문자열 보내기
			//bw.write("안녕하세요");
			System.out.print("데이터 입력 : ");
			String msg = scan.next();
			bw.write(msg + "\n");	//	\n 해줘야 보내진다.
			bw.flush();
			
			//	13. 입력스트림 (서버에서 온거)
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			//	문자열 받기
			String return_msg = br.readLine();
			System.out.println("받은 정보 : " + return_msg);
			
		} catch (IOException e) {
			System.out.println("클라이언트 오류 : " + e);
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				osw.close();
				os.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}
