/*	
 * 자바 과제
 * DATE: 2024-01-19
 * 과제02: 숫자야구 ver4
 */
package com.ict.other;

import java.util.Scanner;

public class NumBaseBall_Explain {

	public static void main(String[] args) {
		PlayGame p = new PlayGame();

		p.play();
	}
}

// 정답 설정
class SetComNum {
	public void setC_Num(int c_Num[]) {
		int[] flag = new int[10]; 						//  10개의 방, 초기값은 0
														// 	(0부터 9까지 정수가 10개이므로)
		for (int i = 0; i < c_Num.length; i++) {		
			while (true) {
				c_Num[i] = (int) (Math.random() * 10); 	// 0~9 중 임의의 수를 컴퓨터 배열 c_Num[] 에 저장
				// 숫자가 중복이 아니라면 해당 숫자를 사용함으로 표시
				if (flag[c_Num[i]] == 0) { 				// 빈방이면 즉, 0이면 중복되지 않았다는 것이므로
					flag[c_Num[i]] = 1; 				// 1을 넣어준다.
					break; 								// c_Num[]에는 수가 저장된 채로 while 문 탈출
				} 										// 즉, 1 이면 이미 선택된 숫자라는 것
			}
		}
	}
} // 끝나면 호출한 곳, 클래스 PlayGame 의 play()의 setC.setC_Num(c_Num); 로 돌아감

// 정답 입력
class SetUserNum {
	Scanner sc = new Scanner(System.in);

	public void setP_Num(int[] p_Num) {

		int[] flag = new int[10]; 		// 0~9 이니까 10개의 방(초기값은 0)		

		System.out.println("0~9까지 숫자를 중복되지 않게 하나씩 입력해 주세요.");

		for (int i = 0; i < p_Num.length; i++) {
			// 예외처리
			try {

				System.out.print((i + 1) + "번째 숫자 입력: ");
				String msg = sc.nextLine(); 			// 숫자를 String 으로 받아서 int 로 바꾼다.
				int inputNum = Integer.parseInt(msg); 	// 문자를 입력하면 여기서 예외발생하고 catch 문으로 이동

				// 입력한 숫자의 범위 확인 0~9
				if (inputNum < 0 || inputNum > 9) { // int 로 바뀐 입력된 수가 0보다 작거나 9보다 크면
					System.out.println();
					System.out.println("잘못된 범위의 숫자입니다. 0부터 9까지의 숫자를 입력해주세요.");
					i--; 					// 다시 유저 수 배열의 i 자리를 채워야하므로
					continue; 				// i 를 1 감소시키고 for 문의 증감식으로 가서 i 를 1 증가
				} 							// 즉, 수를 다시 입력 시킴

				// 중복된 숫자 확인 (처음엔 모든방이 0 이니까 통과, 두번째부터 검사)
				if (flag[inputNum] == 1) { 	// 1 이 저장된 방은 이미 앞에서 숫자가 저장된 것이므로
					System.out.println();
					System.out.println("숫자가 중복 입력되었습니다. 다시 입력해 주세요.");
					i--; 					// 위와 같이 수를 다시 입력시킴
					continue; 				// 즉, 다른 수 받기
				}

				// 중복된 숫자가 아니라면 사용한 숫자로 표시
				flag[inputNum] = 1; 	// 처음엔 다 0 인 빈방이므로 숫자를 받은 인덱스를 가진 방은 1 저장
				p_Num[i] = inputNum; 	// 중복이 아니면 i 자리에 입력한 수 저장

			} catch (Exception e) {		//	예외 발생시 수행
				System.out.println();
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("메세지를 확인 후 다시 입력해 주세요. ");
				System.out.println(e.getMessage()); // 잘못입력된 예외객체에서 입력된 메시지 값을 가져옴
				System.out.println();
				i--; // for 문의 증감식으로 가기 때문에 잘못입력시 i 감소
			}
		} // for 문 끝

		// 입력한 숫자 출력 (배열이면 for 문 사용)
		System.out.println();
		System.out.print("입력한 숫자는: ");
		// 일반적인 for 문
		for (int i = 0; i < p_Num.length; i++) {
			System.out.print(p_Num[i] + " ");
		}

//		for (int num : p_Num) {				//	개선된 for 문 사용 
//			System.out.print(num + " ");	//	for ( 자료형 변수 : 배열 ){ }
//		}									//	for ( 제네릭=객체타입=클래스 변수 : 컬렉션 ) { }
		System.out.println();
	}
} // 끝나면 호출한 곳, 클래스 PlayGame 의 play()의 setU.setP_Num(p_Num); 로 돌아감

class Compare {
	public boolean compare(int[] c_Num, int[] p_Num) {	//	반환형이 boolean 형이며 
														//	int 배열인 컴퓨터 수와 유저 수를 인자로 받음
		
		int[] flag = new int[10];		//	10개의 빈방을 새로 만들어서 사용 (0부터 9까지 정수가 10개이므로)			
		int s_Cnt = 0;					
		int b_Cnt = 0;					//	스트라이크, 볼, 아웃 카운트 초기값 0
		int o_Cnt = 0;					
		int total = 3;					//	전체 수 3개 설정 (스트라이크, 볼, 아웃 카운트 합치면 3이므로)
		
		// 	정답을 flag에 저장 정답이 아닌 곳에 0 정답인 곳에 1	
		for (int i = 0; i < total; i++) {	//	즉, 컴퓨터 수 배열을 빈방이 있는 flag 에 넣으면 
			flag[c_Num[i]] = 1;				//	정답인 인덱스의 방에 1을 저장
		}
		
		for (int i = 0; i < total; i++) {
			if (c_Num[i] == p_Num[i])		//	자리도 같고 숫자값도 같으면 스트라이크 수 증가
				s_Cnt++;					
			else if (flag[p_Num[i]] == 1)	//	스트라이크가 아니고, 입력한 수의 인덱스 방이 1이면 볼 수 증가
				b_Cnt++;					//	1 이라는 것은 위에 정답이 들어간 방이므로 같은 숫자값이 있다는 것
		}

		// o_cnt는 숫자 갯수 - (스트라이크+볼) 갯수
		o_Cnt = total - (s_Cnt + b_Cnt);	//	총 3개의 숫자만 비교하므로 스트라이크와 볼이 아니면 아웃이다.	

		// 모든 정답을 맞췄다면 true 반환, 정답이 아닐경우 스트라이크, 볼, 아웃 출력
		if (s_Cnt == total) {	//	스트라이크가 3개면 
			return true;		//	true 를 반환한다. (compare 메서드는 반환형이 boolean 이기 때문에)
		} else {
			System.out.println(s_Cnt + "스트라이크 " + b_Cnt + "볼 " + o_Cnt + "아웃");
			return false;		//	스트라이크가 3개가 아니면 위내용을 출력하고 false 를 반환한다.
		}
	}	//	끝나면 호출한 곳, 클래스 PlayGame 의 play()의 res = compare.compare(c_Num, p_Num); 로 돌아감
}

class PlayGame {
	Scanner sc = new Scanner(System.in);

	public void play() {
		String msg = "";
		int size = 3;
		int life = 10;
		int[] c_Num = new int[size];
		int[] p_Num = new int[size];
		System.out.println("========게임 시작========");
		System.out.println("정답 길이 3자리 남은 기회 10회");
		System.out.println();
		// 컴퓨터 정답 설정
		SetComNum setC = new SetComNum(); 	// SetComNum 클래스로 객체생성
		setC.setC_Num(c_Num); 				// 클래스 안에 setC_Num 메서드 실행
											// 실행되면 컴퓨터 수 배열이 정해지고 돌아온다.
		
		// 게임 시작
		while (true) {
			boolean res = true; 					// res 초기값을 true 로 초기화
			SetUserNum setU = new SetUserNum(); 	// SetUserNum 클래스로 객체생성
			setU.setP_Num(p_Num); 					// 클래스 안에 setP_Num 메서드 실행
			
			Compare compare = new Compare();		//	Compare 클래스로 객체생성
			res = compare.compare(c_Num, p_Num);	//	클래스 안에 compare 메서드를 실행하고 res 에 저장
													//	반환형이 boolean 형이므로 true 또는 false 저장됨
			// 승리시 탈출						
			if (res) {		//	res 가 true 이면 									
				System.out.println("정답을 맞추셨습니다.");
				System.out.println();
				break;		//	정답을 맞추면 while 문 탈출
			}

			// 기회 감소
			life--;			//	res 가 false 이면, 기회 감소 후 아래 출력
			System.out.println();
			System.out.println("남은 기회는 " + life + "회 입니다.");
			System.out.println();

			// 패배시 탈출 (기회가 0이 아니면 무시)		 
			if (life == 0) {		//	10번의 기회가 감소하다가 0이 되면 
				System.out.println("기회를 모두 소진하였습니다.");
				System.out.print("정답은 : ");
				//	일반적인 for 문
				for (int i = 0; i < c_Num.length; i++) {
					System.out.print(c_Num[i] + " ");
				}
				
				//	개선된 for 문
				//for (int num : c_Num) {		
				//	System.out.print(num + " ");
				//}
				System.out.println("입니다.");
				System.out.println("=====================");
				break;		//	패배하면 while 문 탈출 
			}
		}
	}
}
