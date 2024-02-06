package com.ict.day06;

public class Ex02 {
	public static void main(String[] args) {
		//	break 와 continue
		
		//	break : 현재 위치의 블록을 탈출할때 사용하는 예약어
		//			for, while, switch 문에서 사용
		
		//	continue : continue 문 이하 수행문을 포기하고 다음 회차로 진행하는 예약어
		//			for 문인 경우는 증감식으로 이동, while 문인 경우는 조건식으로 이동
		//			주로 for 문에 사용 (while 문은 증감식이 아래있어서 무한루프에 빠질수 있음)
		//			보통 if 문과 함께 사용한다.
		
		//	**이스케이프문자 (제어문자)
		//	\n (줄바꿈) , \t (탭) , \' (') , \" (")
		
		
		//	1 ~ 10 까지 출력
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");		
		}
		System.out.println("\n");
		
		
		//	1 ~ 10 까지 출력 6에서 break 사용
		
		for (int i = 1; i < 11; i++) {		//	실행문 위에 break 가 있으면 실행하기 전에 멈춤
			if (i == 6)	break ;				//	즉, 5까지 찍고 6에서 멈추고 for 문 탈출
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		for (int i = 1; i < 11; i++) {		//	실행문 아래에 break 가 있으면 실행한 후에 멈춤 
			System.out.print(i + " ");		//	즉, 6까지 찍고 난 후 for 문 탈출
			if (i == 6)	break ;
		}
		System.out.println("\n");

		
		//	1 ~ 10 까지 출력 6에서 continue 사용
		
		for (int i = 1; i < 11; i++) {		//	실행문 위에 continue 가 있으면 실행하기전에 다음 회차로 넘김
			if (i == 6)	continue ;			//	즉, 5까지 찍고 6에서 밑에 있는 실행을 무시하고 7부터 다시 찍힘	
			System.out.print(i + " ");		//	continue 에 의해 6 이 찍히지 않는다.
		}
		System.out.println("\n");
		
		for (int i = 1; i < 11; i++) {		//	실행문 아래에 continue 가 있으면 실행한 후에 다음 회차로 넘
			System.out.print(i + " ");		//	즉, 6까지 찍은 후 다음회차로 넘어가 7부터 찍히므로 다 찍힌다
			if (i == 6)	continue ;			//	**밑에 실행할 것이 없기때문에 있으나 없으나 똑같다		
		}
		System.out.println("\n");
		
		//	**continue 는 실행 전에 사용해야 한다.
		
		
		//	1 ~ 10 까지 짝수만 출력 ( continue 사용 ) 
		
		for (int i = 1; i < 11; i++) {		
			if (i % 2 == 1)	continue ;	//	홀수일때 실행 무시		
			System.out.print(i + " ");		
		}
		System.out.println("\n");
		
		
		
		
	}
}






