package com.ict.day10;


import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		
		Ex05[] arr = new Ex05[su];
		//	학생 수 만큼 배열을 만들자.
		//	해당 배열은 클래스가 들어가는 배열이다.
		
		//	Ex05 클래스로 만든 객체를 배열의 자료형으로 사용
		//	즉, 해당 배열 안에는 Ex05 클래스로 만든 객체의 주소만 존재
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");	
			String name = scan.next();
			
			System.out.print("국어 : ");	
			int kor = scan.nextInt();
			
			System.out.print("영어 : ");	
			int eng = scan.nextInt();
			
			System.out.print("수학 : ");	
			int math = scan.nextInt();
			
			Ex05 t = new Ex05();				//	새로운 Ex05 객체의 주소가 t 에 저장
			t.process(name, kor, eng, math);
						
			arr[i] = t;							//	t 가 arr 배열의 방으로 
		}										//	즉, 객체의 주소가 arr 배열의 방에 담겨져 있다.
		
		//	순위	(나를 제외한 모두와 비교)
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i].sum < arr[j].sum) {
					arr[i].rank ++ ;
				}
			}
		}
		
		//	정렬	(임시 클래스 필요) 나와 남을 바꿈 
		
		Ex05 tmp = new Ex05();
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		//	출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name+"\t");		//	arr 배열은 클래스를 가지고 있기때문에 
			System.out.print(arr[i].sum+"\t");		//	호출 방법 : 클래스. ( arr[i]. )
			System.out.print(arr[i].avg+"\t");
			System.out.print(arr[i].hak+"\t");
			System.out.print(arr[i].rank+"\n");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
