package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//	서버는 죽으면 안되기 때문에 무한루프를 돌려야 한다.
//	여러 사람과 통신하기위해 스레드 처리해야 한다.

public class Ex06_Server implements Runnable{
	
	//	멤버 필드
	ServerSocket server = null;
	Socket socket = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	//	생성자
	public Ex06_Server() {
		try {
			server = new ServerSocket(7001);
			System.out.println("서버 대기중 ... ");
			
			//	스레드 처리
			//	여러 사람을 받을 수 있는 서버가 된다.
			new Thread(this).start();
			
			
		} catch (Exception e) {
		
		}
	}
	
	//	Runnable 인터페이스 상속 > run() 메서드
	@Override
	public void run() {
		try {
			//	무한루프
			//	접속하면 정보를 받아서 보냄 (단, 소켓은 1개만 있고, 하나의 소켓이 계속 혼자 받아서 보내는 것을 반복) 
			while (true) {
				//	접속하면 소켓 생성
				socket = server.accept();
				
				//	클라이언트가 보낸 정보를 받기 위해 입력 스트림 열기
				isr = new InputStreamReader(socket.getInputStream());
				br = new BufferedReader(isr);

				String msg = br.readLine();
				
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println(ip + " : " + "님 접속");
				
				//	클라이언트에게 정보를 보내기 위해 출력 스트림 열기
				osw = new OutputStreamWriter(socket.getOutputStream());
				bw = new BufferedWriter(osw);
				
				msg += System.lineSeparator();
				bw.write(msg);	//	끝 표시
				bw.flush();
				
			}
		} catch (Exception e) {
			System.out.println(e);
			try {
				socket.close();
			} catch (Exception e2) {
			}
		} 
	
	}
	
	//	main 메서드
	public static void main(String[] args) {
		new Ex06_Server();
		
	}
	
	
	
}
