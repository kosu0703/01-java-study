package com.ict.day10;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {

		Ex09 coff = new Ex09();

		// coff. // private 은 저장도 안되고, 가져올 수도 없다.
		// coff.name = "";

		coff.sName("커피음료");
		coff.sPrice(1500);

		Ex09 ion = new Ex09();
		ion.sName("이온음료"); // setter
		ion.sPrice(2300); // 값을 넣어서 세팅해 준다.

		Ex09 cola = new Ex09();
		cola.sName("탄산음료");
		cola.sPrice(2000);

		Ex09 juice = new Ex09();
		juice.sName("과일음료");
		juice.sPrice(1800);

		Ex09[] arr = { coff, ion, cola, juice };

		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >> ");
		int input = scan.nextInt();
		int output = 0;

		// 1. 최소값을 비교해서 넣자
		// 숫자를 직접 입력하지 말고 비교해서 찾자
		// 제일 작은 금액 >> 오름차순 정렬 >> 임시공간

		Ex09[] arr2 = { coff, ion, cola, juice };
		Ex09 tmp = new Ex09();

		for (int i = 0; i < arr2.length - 1; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i].gPrice() > arr2[j].gPrice()) {
					tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = arr2[i];
				}
			}
		}
		int min = arr2[0].gPrice();

		// 풀이
		esc: while (true) {

			System.out.println("남은 돈 : " + input);
			if (input < min) {

				System.out.println("금액이 부족합니다.");
				output = input;
				break esc;

			} else {
				System.out.println("커피\t이온\t탄산\t과일\t반환");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].gPrice() <= input) {
						System.out.print(" O\t");
					} else {
						System.out.print(" X\t");
					}
				}
				System.out.println();
				System.out.print("선택하세요 >> ");
				String drink = scan.next();

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
					output = input;
					break esc;
				} // swich 문

			} // if~else 문

			
			// 2. 살 수 없는 제품을 선택하면 - 계산이 된다.
			// (살 수 없다고 표시하고 다시 메뉴가 나와야 된다.)

			if (output < 0) {		//	**( input - 가격 ) output 이 음수이면 
									//	**올라가서 input 이 그대로 남은 돈으로 되서 다시 시작 
				System.out.println("살 수 없습니다. 메뉴를 다시 선택해주세요.");
			} else {
				input = output; // **잔돈을 남은 돈으로
			}

			
		} // while 문
		System.out.println("잔돈 : " + output);

		
		
		
	}
}
