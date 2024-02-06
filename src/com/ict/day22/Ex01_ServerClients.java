package com.ict.day22;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex01_ServerClients implements Runnable{
	
	Socket s;
	Ex01_Server server;
	
	//	직렬화 ( 대상클래스(VO) / ObjectInputStream / ObjectOutputStream )
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;
	
	public Ex01_ServerClients(Socket s, Ex01_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
			
		} catch (Exception e) {
			
		}
	}
	
	//	**클라이언트가 보낸 프로토콜, 메시지 받기
	@Override
	public void run() {
		esc:while (true) {
			try {
				//	프로토콜을 읽음
				//	역직렬화
				Object obj = in.readObject();
				if (obj != null) {
					Ex01_Protocol p = (Ex01_Protocol) obj;
					
					switch (p.getCmd()) {
					case 0:	//	접속해체 (while 문 탈출)
						//	받은 정보는 그대로 자신에게 보낸다.
						out.writeObject(p);				//	자신에게 0번 보내고
						break esc;
						
					case 1:	//	대화명 받기(로그인)
						nickName = p.getMsg();
						//	다른 객체들에게 입장 메시지 전달
						//	대화명 받고 1번에서 2번으로 바뀜
						p.setCmd(2);
						p.setMsg(nickName + "님 입장");
						server.sendMsg(p);
						break;
						
					case 2:
						//	메시지 보내기
						p.setMsg(nickName + " : " + p.getMsg());
						server.sendMsg(p);
						break;
					}
					
				}
			} catch (Exception e) {

			}
		}
		//	cmd => 0 일때 퇴장이므로 아래 코딩 실행
		try {
			out.close();
			in.close();
			s.close();
			
			//	자기 자신을 리스트에서 제외
			server.removeClient(this);
		
			//	자신을 제외한 사람들에게 메시지 전달
			Ex01_Protocol p = new Ex01_Protocol(2, nickName + "님 퇴장");		
			server.sendMsg(p);	
			
		} catch (Exception e) {

		}
		
	}
	
	
}
