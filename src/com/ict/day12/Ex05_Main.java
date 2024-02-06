package com.ict.day12;

import java.util.Scanner;

import com.ict.day10.Animal;

public class Ex05_Main {
	public static void main(String[] args) {
		
		//	다형성 : 하나의 메시지가 각 객체마다 자기의 특성에 맞게 반응하는 것
		
		//		오버로딩 : 한 클래스 안에서 같은 이름의 메서드가 여러 개 존재하는 것
		//				(인자의 자료형이나 갯수가 다르다)
		//		오버라이딩 : 상속관계에서 부모 메서드와 자식 메서드의 이름이 같은 것
		//				이때 자식클래스가 부모클래스의 메서드 내용을 자식클래스에 맞게 변경해서 사용한다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("선택하세요 (1.고양이 , 2.강아지 >> ");
		int su = scan.nextInt();
		
//		if (su == 1) {
//			Ex05_Cat cat = new Ex05_Cat();
//			cat.sound();
//			cat.play();
//			
//		}else if (su == 2) {
//			Ex05_Dog dog = new Ex05_Dog();
//			dog.sound();
//			dog.hobby();
//		}
//		
		//	다른 방법
		
		Ex05_Animal animal = null;		//	같은 부모 클래스를 가지고 있어서 한번에 정의 가능 
										//	부모로 선언하고 자식으로 생성한다.
		if (su == 1) {					//	즉, 생성자에 따라 다른 객체 생성
			animal = new Ex05_Cat();
		} else if(su == 2){
			animal = new Ex05_Dog();
		}
		//	오버라이딩
		animal.sound();
		
		//	부모만 가지고 있는 메서드
		animal.like();
		
		//	자식만 가지고 있는 메서드 (단점)		//	**부모클래스로 선언할 때는 자식만 가지고 있으면 사용 불가
		//animal.hobby();		
		//animal.play();
		
		
		
		
		
		
		
	}
}
