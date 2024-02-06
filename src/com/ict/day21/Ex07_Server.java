package com.ict.day21;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex07_Server {
	
	ArrayList<ServerClients> list = null;
	ServerSocket ss = null;
	
	
	public Ex07_Server() {
		list = new ArrayList<ServerClients>();
		
		try {
			ss = new ServerSocket(7007);
			System.out.println("서버 시작!!");
			
			play();
			
		} catch (Exception e) {
		}
		
	}
	
	public void play() {
		while (true) {
			
			try {
				//	접속자가 올때까지 기다린다.
				//	접속할때마다 소켓생성
				Socket s = ss.accept();
				
				//	**접속자 정보를 가진 소켓을 생성자 인자에 전달
				//	**list 를 사용하고, 활용하여 sendMsg() 와 removeClients() 를 
				//					사용하기 위해서 서버자신(this)을 생성자 인자에 전달
				
				//	**만들어진 소켓을 가지고 ServerClients 클래스를 자료형으로 하여 객체 생성하고 
				//	객체를 list 에 저장 (객체에는 담당 소켓과 입출력스트림이 들어있다.)
				ServerClients clients = new ServerClients(s, this);	
				
				//	스레드 처리
				new Thread(clients).start();	//	Runnable 에는 run 뿐이다.
												//	Thread 클래스 사용
				//	리스트에 소켓을 가진 clients 객체 넣기
				list.add(clients);
				
				//	접속자 표시
				String msg = "**" + clients.ip + " 님 입장";
				
				//	끝표시 (PrintWriter 는 끝 표시 안함)
				//msg += System.lineSeparator();
				
				//	sendMsg() 에 보내기
				sendMsg(msg);
				
			} catch (Exception e) {
			}
			
		}
	}
	
	//	모든 사람에게 메시지 전달
	public void sendMsg(String msg) {
		//	모든 사람은 리스트 안에 존재
		//	받은 메시지를 한명 한명 다 꺼내서 보내기 
		for (ServerClients k : list) {
			k.out.println(msg);
		}
	}
	
	//	인자로 들어온 객체를 리스트에서 삭제
	public void removeClient(ServerClients sc) {
		list.remove(sc);
	}
	
	public static void main(String[] args) {
		new Ex07_Server();
	}
	
	
}
