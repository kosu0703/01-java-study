package com.ict.day22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex03_Server {

	ArrayList<Ex03_ServerClients> list;
	ServerSocket ss;

	public Ex03_Server() {
		try {
			list = new ArrayList<Ex03_ServerClients>();
			ss = new ServerSocket(7777);

			System.out.println("서버 시작!!!");

			play();

		} catch (Exception e) {

		}
	}

	private void play() {
		while (true) {
			try {
				Socket s = ss.accept();
				Ex03_ServerClients sc = new Ex03_ServerClients(s, this);
				new Thread(sc).start();
				list.add(sc);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	// 메시지 전달
	public void sendMsg(Ex03_Protocal p) {
		for (Ex03_ServerClients k : list) {
			try {
				k.out.writeObject(p);
			} catch (Exception e) {

			}
		}
	}

	// 삭제
	public void removeClients(Ex03_ServerClients sc) {
		list.remove(sc);
	}

	// 그림그리기
	public void picture(Ex03_Protocal p) {
		for (Ex03_ServerClients k : list) {
			try {
				k.out.writeObject(p);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {
		new Ex03_Server();
	}
}
