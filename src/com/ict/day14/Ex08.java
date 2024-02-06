package com.ict.day14;

//	예외처리 : Exception ( try ~ catch ~ )

//		목적)	비정상적인 종료를 정상적인 종료로 유도하고, 예외 발생시 예외에 대한 처리를 해준다.

//		형식) try {
//				예외 발생 가능한 문장들 ;
//				예외 발생 가능한 문장들 ;<< 만약 예외가 발생하면 아래 문장을 무시하고, 바로 catch 문으로 이동한다.
//				예외 발생 가능한 문장들 ;( 실행 x )
//			} catch ( 예외객체 e ) {
//				예외 발생시 처리하는 문장들;
//			}

public class Ex08 {
	public static void main(String[] args) {
		try {
			int[] var = { 10, 20, 30 };
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]); // var[3] 일 때 오류가 나고 멈춘다
				System.out.println(3);
				System.out.println(4);
				System.out.println();
			}
		} catch (ArrayIndexOutOfBoundsException e) {	//	원래는 이렇게 오류를 잡아서 찍어줘야한다.
			System.out.println("여기는 catch");			//	하지만 잘모르면 Exception e
			System.out.println(e);	//	어떤 오류인지 찍어보자
		}

		System.out.println("수고하셨습니다.");	//	try catch 는 오류 처리를 하지않아도 정상적인 종료를 한다.

	}
}
