package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex05_Server {
	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			//	1. 서버 소켓 생성
			//	ServerSocket(int port) => port : 서버와 통하는 문
			server = new ServerSocket(7777);
			
			//	2. 청취 accept()
			//	클라이언트가 요청하기 전까지는 블록킹 된다. (즉, 멈춰있다.)
			System.out.println("서버 대기중 ... ");
			socket = server.accept();
			
			//	5. 소켓 생성 / 6. 소켓 리턴
			//		클라이언트 소켓 받아서 서버 소켓 생성 후 리턴
			System.out.println("accept 이후 ");
			
			//	9. 입출력 스트림 얻기
			
			//	11. 입력스트림 (클라에서 온거) 
			 is = socket.getInputStream();
			 isr = new InputStreamReader(is);
			 br = new BufferedReader(isr);
	
			 //	서버에 접속한 ip 주소 얻기
			 String ip = socket.getInetAddress().getHostAddress();
			 
			 //	문자열 받아서 출력
			 String msg = br.readLine();
			 System.out.println(ip + " : " + msg);
			 
			 //	12. 출력스트림 (클라에 보낼거)
			 os = socket.getOutputStream();
			 osw = new OutputStreamWriter(os);
			 bw = new BufferedWriter(osw);
			 //	문자열 보내기
			 bw.write(msg + "\n");
			 bw.flush();
			 
		} catch (IOException e) {
			System.out.println("서버 오류 : " + e);
		} finally {
			try {
				bw.close();
				osw.close();
				os.close();
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
	}
}
