package com.ict.day10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Ex09 coff = new Ex09();
		
		// coff. 			// private 은 저장도 안되고, 가져올 수도 없다.
		// coff.name = "";
		
		//	내부에서는 접근이 가능하다는 부분을 이용해서
		//	메서드를 만들고 접근하여 데이터를 삽입하거나 가져올 수 있다.
		
		coff.sName("커피음료");	
		coff.sPrice(1500);
		
		Ex09 ion = new Ex09();	//	ion 에 새롭게 만들어진 객체의 주소를 저장한다.
		ion.sName("이온음료");		//	setter 
		ion.sPrice(2300);		//	값을 넣어서 설정한다.
		
		Ex09 cola = new Ex09();
		cola.sName("탄산음료");
		cola.sPrice(2000);
		
		Ex09 juice = new Ex09();
		juice.sName("과일음료");
		juice.sPrice(1800);
		
		Ex09[] arr = {coff, ion, cola, juice};	//	자료형이 Ex09 인 객체들의 주소값을 배열에 저장
												//	참조자료형(자료형이 클래스)
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >> ");
		int input = scan.nextInt();
		
		//	

		if (input < 1500) {
			System.out.print("금액이 부족합니다.");
			System.out.println("잔돈 : " + input);
		} else {
			esc : while (true) {
				System.out.println("커피\t이온\t탄산\t과일\t반환");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].gPrice() <= input) {				//	getter
						System.out.print(" O\t");				//	설정된 값을 가져온다
					} else {
						System.out.print(" X\t");
					}
				}
				System.out.println();
				System.out.print("선택하세요 >> ");
				String drink = scan.next();
				int output = 0;

				switch (drink) {
				case "커피":
					output = input - arr[0].gPrice();
					break;
				case "이온":
					output = input - arr[1].gPrice();
					break;
				case "탄산":
					output = input - arr[2].gPrice();
					break;
				case "과일":
					output = input - arr[3].gPrice();
					break;					
				case "반환":
					System.out.println("잔돈 : " + input); ;
					break esc ;	
				}
				System.out.println("잔돈 : " + output);
				if(output < 1500) break esc;
				input = output;		
			}

		}

		
		
		
		
	}
}
