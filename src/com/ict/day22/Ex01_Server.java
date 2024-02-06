package com.ict.day22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex01_Server {
	
	ArrayList<Ex01_ServerClients> list = null;
	ServerSocket ss = null;
	
	
	public Ex01_Server() {
		try {
			list = new ArrayList<Ex01_ServerClients>();
			ss = new ServerSocket(7009);
			System.out.println("서버 시작 ~~~");
			
			play();
			
		} catch (Exception e) {
			
		}
		
	}
	
	public void play() {
		while (true) {
			try {
				//	기다리다가 들어오면 소켓 생성
				Socket s = ss.accept();
				//	소켓 가지고 객체 생성
				Ex01_ServerClients clients = new Ex01_ServerClients(s, this);
				//	스레드 생성
				new Thread(clients).start();
				//	리스트에 객체 넣기
				list.add(clients);
				
			} catch (Exception e) {
			
			}
		}
		
	}
	
	//	리스트를 이용하여 모든 요소에게 객체 보내기
	public void sendMsg(Ex01_Protocol p) {
		for (Ex01_ServerClients k : list) {
			try {
				k.out.writeObject(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//	리스트에서 종료하는 객체 삭제 
	public void removeClient(Ex01_ServerClients sc) {
		list.remove(sc);
	}
	
	public static void main(String[] args) {
		new Ex01_Server();
	}
}
