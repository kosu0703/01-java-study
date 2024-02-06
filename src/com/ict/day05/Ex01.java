package com.ict.day05;

public class Ex01 {
	public static void main(String[] args) {
		//	switch ~ case : 다중 if ~ else 문과 같은 조건문
		//	if 문 조건식 boolean 형 (즉, 비교연산, 논리연산, boolean 형일때)
		
		//	switch 문 인자값이 int 이하, char, String 일때 사용
		//					long, 실수일때 사용불가
		
		//	형식)	switch (인자값 = int, char, String) {
		//			case 조건값1 : 인자값과 조건값1 같을 때 수행할 문장 ; break ;
		//			case 조건값2 : 인자값과 조건값2 같을 때 수행할 문장 ; 
		//						 인자값과 조건값2 같을 때 수행할 문장 ; break ;
		//			case 조건값3 : 인자값과 조건값3 같을 때 수행할 문장 ; break ;
		//			default : 조건값1,2,3 모두 같지 않을 때 수행할 문장 ;
		//			}
		
		//	**주의사항 : break 가 없으면 break 를 만날 때까지 모든 실행문을 실행한다,
		//	break 문의 역할은 현재 실행 중인 범위 () 블록을 벗어나는 역할을 한다.
		//	default 는 생략가능
		
		
		//	int k1 이 1 이면 카페모카, 2 이면 카페라떼, 3 이면 아메리카노, 4 이면 과일쥬스
		
		int k1 = 1 ;
		
		if (k1 == 1) {
			System.out.println("카페모카");
		}else if (k1 == 2) {
			System.out.println("카페라떼");
		}else if (k1 == 3) {
			System.out.println("아메리카노");
		}else if (k1 == 4) {
			System.out.println("과일쥬스");
		}
		
		//	switch 문으로 ( sw + ctrl + space bar 두번째 )
		
		switch (k1) {
		case 1 : System.out.println("카페모카"); break;
		case 2 : System.out.println("카페라떼"); break;
		case 3 : System.out.println("아메리카노"); break;
		case 4 : System.out.println("과일쥬스"); break;
		}
		
		//	if 문은 위에서 아래로 계단식으로 내려오면서 조건을 만족하면 저장하는데
		//	switch 문은 변수값과 같은 case 로 바로 찾아들어가서 저장하고 끝내기 때문에 
		//	switch 문이 if 문 보다 처리속도가 빠르다.
		
		switch (k1) {
		case 1 : System.out.println("카페모카"); 
		case 2 : System.out.println("카페라떼"); 
		case 3 : System.out.println("아메리카노");
		case 4 : System.out.println("과일쥬스");
		}
		
		//	break 가 없으면 끝까지 계속 실행된다.
	
		
		//	char k2 가 A 이면 아프리카, B 이면 브라질, C 이면 캐나다 나머지 한국
		
		char k2 = 'A';
		String res = "";
		
		switch (k2) {
		case 'A' : res = "아프리카"; break;
		case 'B' : res = "브라질"; break;
		case 'C' : res = "캐나다"; break;

		default: res = "한국"; break;
		}
		System.out.println();
		System.out.println("국가 : " + res);
		
		
		//	char k3 가 A, a 이면 아프리카, B, b 이면 브라질, C, c 이면 캐나다, 나머지 한국	
		
		char k3 = 'd';
		String res3 = "";
		
		switch (k3) {
		case 'A' : 
			res3 = "아프리카"; 
			break;
			
		case 'B' : 
			res3 = "브라질"; 
			break;
	
		case 'C' : 
			res3 = "캐나다"; 
			break;
		
		case 'a' : 
			res3 = "아프리카"; 
			break;
			
		case 'b' : 
			res3 = "브라질"; 
			break;
			
		case 'c' : 
			res3 = "캐나다"; 
			break;
			
		default: 
			res3 = "한국"; 
			break;
		}
		System.out.println();
		System.out.println("국가3 : " + res3);
		
		
		char k4 = 'B';
		String res4 = "";
		
		switch (k4) {
		case 'A' : 				//	대문자 A 는 break 를 만날때 까지 실행된다.							
		case 'a' : 				//	대문자 A 와 소문자 a 는 or 관계가 된다.
			res4 = "아프리카"; 
			break;
			
		case 'B' : 
		case 'b' : 
			res4 = "브라질"; 
			break;
			
		case 'C' : 
		case 'c' : 
			res4 = "캐나다"; 
			break;
			
		default: 
			res4 = "한국"; 
			break;
		}
		System.out.println();
		System.out.println("국가4 : " + res4);
		
		
		//	String k5 가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄, 미국이면 워싱턴
		
		String k5 = "미국";
		String res5 = "";
		
		switch (k5) {
		case "한국":
			res5 = "서울";
			break;
		case "중국":
			res5 = "베이징";
			break;
		case "일본":
			res5 = "도쿄";
			break;			
		case "미국":
			res5 = "워싱턴";
			break;
		}
		System.out.println();
		System.out.println(k5 + "의 수도 : " + res5);
		
		
		//	switch 문은 범위가 넓어지면 사용하지 말자 ( if 문 사용하자 )
		//	int k6 의 정수가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 나머지 F
		
		int k6 = 73 ;
		String res6 = "";
		
		switch ((int)(k6/10)) {
		case 10:
		case 9:
			res6 = "A";
			break;
		case 8:
			res6 = "B";
			break;
		case 7:
			res6 = "C";
			break;

		default:
			res6 = "F";
			break;
		}
		System.out.println();
		System.out.println("학점 : " + res6);
		
		
		
		
	}
}









