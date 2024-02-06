package com.ict.day09;

public class Ex05 {
	public static void main(String[] args) {
		
		//	Ex04 클래스를 객체로 만들어야 
		//	Ex04가 가지고 있는 필드와 메서드를 사용할 수 있다. 
		
		//	Ex04 클래스를 객체로 만들기
		Ex04 t = new Ex04();
		
		System.out.println(t.name);
		
		
		System.out.println("가기 전 total = " + t.total);
		System.out.println(1);
		
		//	Ex04 에 있는 play01 메서드를 호출하자
		t.play01();	//	play01 이 void 이기 때문에 데이터를 가져오지 않는다.
					//	즉, 저장할 필요가 없다.
		
		System.out.println(4);
		System.out.println("갔다 온 후 total = " + t.total);
		
		// **실행은 무조건 main 메서드에서
		//	메서드는 실행하면 다시 나한테 오게되어 있다.
		
		
		t.play02();
		//System.out.println(t.sum);	//	메서드 안의 지역변수이기 때문에 메서드가 끝나면 사라진다.
										
		
		
		int k = t.play03();	//	넘어오는 자료형을 알아야 저장할 수 있다.
							//	그래서 반환형이 되돌아오는 값의 자료형이다.
							//	**반환형이 있으면 기본적으로 저장하자
							//	저장안하면 오류는 안나지만 값을 던져줬는데 안받으면 일한 이유가 없다.
		System.out.println(k);
		
		
		
		
		
		
		
	}
}
