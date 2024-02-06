package com.ict.day14;

import java.util.Scanner;

//	throws : 예외전가, 예외양도
//			예외가 발생하면 예외처리를 하지 않고, 자신을 호출한 곳으로 예외객체를 전달
//			**나중에라도 예외처리를 하는 것이 좋다. (계속 안하면 결국 마지막에는 main 메서드로 오기때문에)
//			자기가 있는 메서드에서 예외처리를 안할 때 자신을 호출한 메서드로 예외객체를 던져버린다.
//			즉, 예외발생하는 곳까지 왔다가 호출한 곳으로 돌아간다.

public class Ex11 {
	
	public void setData(String str) throws NumberFormatException{
		//	전가된 예외를 처리한다.
//		try {
			//	str 의 길이가 0 보다 크면 ( 즉, str 은 String 참조자료형이므로 null 이 아니면 )
			if (str.length() >= 1) {		
				//	첫번째 글자 추출
				String res = str.substring(0,1);
				prnData(res);		// 	호출한 곳이 책임을 진다. 
			}			
//		} catch (NumberFormatException e) {		// 	던진 것에 예외가 있기때문에 catch 문으로 들어옴
//			System.out.println("첫글자는 반드시 숫자여야 합니다.");
//		}
	}
								//	NumberFormatException(예외) 발생하면 해당메서드를 호출한 곳으로 예외를 던진다.
	public void prnData(String str) throws NumberFormatException{ 	//	예외전가, 예외양도 throws
		//	예외처리 (try catch)
//		try {
			int dan = Integer.parseInt(str);	//	여기서 예외가 발생하면 멈추고 호출한 메서드로 예외를 던진다.
			System.out.println(dan + "단");		//	아래 수행문은 실행하지 않고 던져진다.
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}			
//		} catch (NumberFormatException e) {					//	예외객체 NumberFormatException
//			System.out.println("첫글자는 반드시 숫자여야 합니다.");
//		}
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//	예외처리
		try {
			System.out.print("정수 입력 : ");
			String msg = scan.next();
			
			Ex11 ex11 = new Ex11();
			ex11.setData(msg);		//	던져진 예외를 받는다.	throws NumberFormatException		
		} catch (NumberFormatException e) {
			System.out.println("제대로 입력하세요.");
		}
		
		
		
		
		
		
		
		
	}
	
}
