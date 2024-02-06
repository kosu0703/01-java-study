package com.ict.day07;

import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {		
		//	String 클래스에서 못 배운 내용
		
		//	1.
		//	String.getBytes() : byte []
		//	해당 문자열을 byte[] 로 변환시킨다.
		//	보통 입,출력할 때 사용한다. ( 대소문자, 숫자 가능 / 영어이외에 글자는 안됨 )
		
		String s1 = "java 대한 JAVA";
		byte[] b1 = s1.getBytes();	//	문자를 숫자로 저장해서 보냄 (더 정확하다, 그래서 입출력할 때 사용)
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);	//	32 공백 , 한글은 - 음수 출력
		}
		System.out.println();
		
		
		//	2.
		//	String.toCharArray() : char []
		//	해당 문자열을 char[] 로 변환시킨다.
		//	영어이외에 글자도 가능
		
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		System.out.println();
		
		
		//	3.
		//	split(String regex) : String[]
		//	split(String regex, int limit) : String[]
		
		//	String regex	구분자(나눌기준)
		//	int limit		나눌 배열의 크기 
		
		String s2 = "사과, 딸기 망고, 오렌지, 두리안 용과";
		String[] s3 = s2.split(",");
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		System.out.println();
		
		String[] s4 = s2.split(" ");
		for (int i = 0; i < s4.length; i++) {
			System.out.println(s4[i]);
		}
		System.out.println();
		
		String[] s5 = s2.split(" ", 3);		//	방의 개수를 지정하면, 앞에서부터 채우고 마지막에 나머지 다 채움
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		System.out.println();
		
		String[] s6 = s2.split(" ", 15);		//	모자르면 마지막 배열 공간에 나머지가 모두 들어가지만, 
		for (int i = 0; i < s6.length; i++) {	//	넘치면 최대한 사용하고 남은 공간은 삭제된다.  
			System.out.println(s6[i]);
		}
		
		
		
		
		
		
		
	}
}
