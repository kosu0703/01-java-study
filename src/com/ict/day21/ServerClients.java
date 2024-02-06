package com.ict.day21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerClients implements Runnable{
	
	Socket s;
	Ex07_Server server;
	
	BufferedReader in;
	PrintWriter out;
	String ip;
	
	//	**생성자에서 만들어진 지역변수는 전역변수로 빼야한다.	( run() 에서 사용하기 위해서 )
	//	왜냐하면 생성자 안에서는 지역변수여서 사라진다.
	
	//	생성자
	public ServerClients(Socket s, Ex07_Server server) {
		this.s = s;
		this.server = server;
		
		try {
			//	입/출력 스트림 얻어냄
			//	입력 출력 준비 끝
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);	//	true > autoFlush		
			
			//	누가 접속했는지 알아보기
			ip = s.getInetAddress().getHostAddress();
			
		} catch (Exception e) {
		
		}
	}
	
	//	스레드 처리
	//	클라이언트에서 온 메시지 받기
	@Override
	public void run() {
		while (true) {
			try {
				//	메시지 입력
				String msg = in.readLine();
				
				//	끝표시 (PrintWriter 는 끝 표시 안함)
				//msg += System.lineSeparator();
				
				//	채팅 종료하는 경우
				if (msg.equalsIgnoreCase("exit")) {
					//	자기 자신에게 보이는 메시지
					out.println("bye");
					//	while 문 탈출
					break;
				}
				//	받은 메시지 서버로 넘기기 (접속자 ip 추가)
				server.sendMsg(ip + " : " + msg);
				
			} catch (Exception e) {
			}
		
		} // while 문 끝
		
		//	채팅 종료시 리스트에서 객체 삭제 (즉, 자기자신 제외) 
		server.removeClient(this);
		
		//	남아있는 접속자들(객체들)에게 메시지 보내기
		String msg2 = ip + " 님 퇴장";
		
		//	끝표시 (PrintWriter 는 끝 표시 안함)
		//msg2 += System.lineSeparator();
		
		server.sendMsg(msg2);
		
	}
}
