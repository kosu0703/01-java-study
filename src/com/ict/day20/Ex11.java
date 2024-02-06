package com.ict.day20;

import java.net.InetAddress;
import java.net.UnknownHostException;

//	InetAddress : 자바에서 IP주소를 표현하는 클래스
//				 생성자는 존재하지만 사용하지 못함
//				 6개의 static 메서드를 이용하여 객체 생성한다.
//				 ** localhost 란 현재 내가 사용하고 있는 컴퓨터를 말한다.

public class Ex11 {
	public static void main(String[] args) {
		
		try {
			//	내 컴퓨터 주소
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println();
			
			//	네이버 주소
			addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println();
			
			//	모바일 네이버 주소
			addr = InetAddress.getByName("m.naver.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println();
			
			//	223.130.195.200
			byte[] b = {(byte)223,(byte)130,(byte)195,(byte)200};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println("========================");
			
			//	네이버의 모든 주소 
			InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress k : arr) {
				System.out.println("이름 : " + k.getHostName());
				System.out.println("주소 : " + k.getHostAddress());
				System.out.println("toString : " + k.toString());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		
	}
}
