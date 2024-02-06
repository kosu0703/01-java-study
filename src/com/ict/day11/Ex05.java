package com.ict.day11;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
	
		//	setter 를 이용해서 멤버필드의 값을 변경했던 것을
		//	**생성자를 이용해서 변경하자
		
		Ex06 coff = new Ex06("커피음료",1500);
		//coff.sName("커피음료");	
		//coff.sPrice(1500);
		
		Ex06 ion = new Ex06("이온음료",2300);	
		//ion.sName("이온음료");		
		//ion.sPrice(2300);		
		
		Ex06 cola = new Ex06("탄산음료",2000);
		//cola.sName("탄산음료");
		//cola.sPrice(2000);
		
		Ex06 juice = new Ex06("과일음료",1800);
		//juice.sName("과일음료");
		//juice.sPrice(1800);
		
		Ex06[] arr = {coff, ion, cola, juice};	
												
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
