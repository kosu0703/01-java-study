package com.ict.day07;

public class Ex01 {
	public static void main(String[] args) {		
		//	19.
		//	trim() : String
		//		해당 문자열의 앞, 뒤 공백 제거 (단, 중간 공백은 제거하지 않는다.)
		
		String t1 = "   java 자바 JAVA   ";
		String t2 = t1.trim();	// "java 자바 JAVA"
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t1.length());	// 원래 길이
		System.out.println(t2.length());	// 앞뒤 공백 제거 길이
		
		//	**length 길이는 1부터 , index 인덱스는 0부터
		
		System.out.println();
		
		
		//	20.
		//	startsWith(String prefix) : boolean	
		//		주어진 문자열로 시작하는지 검색 (대소문자 구분 가능)	
		
		//	startsWith(String prefix, int toffset) : boolean
		//								 시작 위치
		
		//	endsWith(String suffix) : boolean
		//		주어진 문자열로 끝나는지 검색 (대소문자 구분 가능)
		
		// "java 자바 JAVA"
		boolean b1 = t2.startsWith("java");
		System.out.println(b1);
		
		boolean b2 = t2.startsWith("JAVA");
		System.out.println(b2);
		
		boolean b3 = t2.startsWith("자바", 5);	// 어디서 부터 시작할지 시작위치 지정
		System.out.println(b3);
		
		boolean b4 = t2.endsWith("VA");
		System.out.println(b4);
		
		System.out.println();
		
		
		//	21.
		//	valueOf(기본자료형) : static String
		//		어떤 기본 자료형이든지 String 으로 변경 시킴 ( 기본자료형 + "" 와 같음)
		
		boolean bo1 = true ;
		char ch1 = 'c' ;
		int num1 = 34 ; 
		long num2 = 37L ;
		float num3 = 3.14f ;
		double num4 = 354.4548 ;
		
		//	자료형 +1 = 실제로 덧셈을 한다.
		//System.out.println(bo1+1); 오류발생
		System.out.println(ch1+1);
		System.out.println((char)(ch1+1));
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println(num4+1);
		System.out.println();
		
		//	문자열으로 바뀌고 나열된다. 옆에 붙는다.
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println(String.valueOf(num4)+1);
		System.out.println();
		
		//	결과는 같지만 메모리를 더 많이 차지한다.
		System.out.println(ch1+"1");
		System.out.println(num1+"1");
		System.out.println(num2+"1");
		System.out.println(num3+"1");
		System.out.println(num4+"1");
		System.out.println();
		
		
		//	22. (21과 반대 개념)
		//	Wrapper 클래스
		//	기본 자료형의 형태를 가진 문자열을 해당 자료형으로 변경 시키는 클래스들
		//	기본 자료형을 객체로 만들 때 사용하는 클래스
		
		//	22-1.
		//	Boolean.parseBoolean(String) : boolean
		//		문자열을 기본 자료형인 boolean 형으로 변경시킴
		//	**주의사항 "true" 를 제외한 모든 문자열이면 false 로 출력된다.
		
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg + 1);						 
		//System.out.println(msg2+1); // 실제 boolean 형으로 변경되서 오류 발생
		System.out.println(msg2);
		
		msg2 = Boolean.parseBoolean(""); 
		System.out.println(msg2); // false 출력 (true 뺀 나머지는 false)
		System.out.println();
		
		
		//	22-2.
		//	Integer.parseInt(String s) : int
		//		문자열을 기본 자료형인 int 형으로 변경시킴
		
		msg = "123";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg+10);	
		System.out.println(msg3+10); // 실제 int 형으로 변경되서 더해짐
		System.out.println();
		
		
		//	22-3. ( 잘 안 쓴 다 )
		//	Long.parseLong() : long
		//		문자열을 기본 자료형인 long 형으로 변경시킴
		//	**주의사항 "숫자" = OK , "숫자L" = err
		//	문자열을 숫자로 바꾸는 것이기 때문에 문자열에는 L 을 붙이는게 의미가 없다.
		
		//msg = "123123123123123L";			// L 을 붙이면			
		//long msg4 = Long.parseLong(msg);	// 런타임 오류 발생
		//System.out.println(msg4);
		
		msg = "123123123123";
		long msg4 = Long.parseLong(msg);
		System.out.println(msg4+1);
		System.out.println();
		
		
		//	22-4. ( 잘 안 쓴 다 )
		//	Float.parseFloat() : float		
		//		문자열을 기본 자료형인 float 형으로 변경시킴
		//		"숫자" , "숫자f" = 모두 OK
		//		되도록 이면 double 쓰자
		
		msg = "123.123456f";
		float msg5 = Float.parseFloat(msg); // f 를 붙여도 오류 안남
		System.out.println(msg5+10);
		System.out.println();
		
		
		//	22-5.
		//	Double.parseDouble() : double
		//		문자열을 기본 자료형인 double 형으로 변경시킴
		
		msg = "3.14568";
		double msg6 = Double.parseDouble(msg);
		System.out.println(msg6+10);
		System.out.println();
		
		
		//	22-6.
		//	Character.parseCharacter() 는 존재하지 않는다.
		//	즉, 문자열을 기본 자료형인 char 형으로 변경하는 것은 없다.
		//	그러나 String 의 charAt() 사용하면 char 로 만들 수 있다.
		
		msg = "A";
		char msg7 = msg.charAt(0);
		System.out.println(msg+1);
		System.out.println(msg7+1);			// char 형으로 바껴서 int 형과 더해져 정수 숫자가 나옴
		System.out.println((char)(msg7+1));	// char 는 항상 강제 형 변환을 생각해야한다.
		System.out.println();
		
		
		//	23.
		//	String.getBytes() : byte []
		//	String.toCharArray() : char []
		//	나중에 배열을 배운 후 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
