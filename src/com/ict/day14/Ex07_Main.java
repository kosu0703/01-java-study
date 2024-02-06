package com.ict.day14;

import java.util.Scanner;

public class Ex07_Main {
	public static void main(String[] args) {
		
		Ex07_Land t1 = new Ex07_Land();
		
		//	인자가 Ex07 이라는 인터페이스를 가지고 있다.
		t1.autoPlay(new Ex07() {
			
			@Override
			public void play() {
				System.out.println("회전목마");
			}
		});
		System.out.println("==================");
		
		//	Ex07 을 상속받은 클래스 Ex07_Car , Ex07_Baseball 중 하나를 생성
		//	즉, 대체가 가능하다 (같은 인터페이스를 상속받았기 때문에)
		t1.autoPlay(new Ex07_Car());					
		t1.autoPlay(new Ex07_Baseball());
		System.out.println("===================");
		
		
		//	int k 가 1 이면 운전하기 , 2 이면 야구하기 출력				// 	있는거 가져와서 사용
		int k = 1;
		
		if (k == 1) {
			t1.autoPlay(new Ex07_Car());
		}else if (k == 2) {
			t1.autoPlay(new Ex07_Baseball());
		}
		System.out.println("===================");
		
		//	더 고급지게											//	내가 만들어서 사용
		if (k == 1) {
			t1.autoPlay(new Ex07() {
				@Override
				public void play() {
					System.out.println("운전하기2");
				}
			});
		}else if (k == 2) {
			t1.autoPlay(new Ex07() {
				@Override
				public void play() {
					System.out.println("야구하기2");
				}
			});
		}
		System.out.println("=====================");
		
		//	더더 고급지게
		//	**대신 같은 인터페이스로 상속받아야 한다
		Ex07 ex07 = null;			//	인터페이스로 선언
		
		if (k == 1) {				//	인터페이스를 자료형으로 하는 참조변수에 조건에 맞게 객체를 생성
			ex07 = new Ex07_Car();
		}else if (k == 2) {
			ex07 = new Ex07_Baseball();
		}
		ex07.play();				//	참조변수로 객체에 오버라이딩 된 메서드를 호출
		
	}
	
}
