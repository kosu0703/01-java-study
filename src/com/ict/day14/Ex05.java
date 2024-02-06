package com.ict.day14;

//	Anonymous 내부클래스

//	(기본방법) 추상클래스 
abstract class Ex05 {
	int data = 1000;

	public abstract void printData();

}

class Ex05_Test extends Ex05 {

	@Override
	public void printData() {
		System.out.println("data : " + (data + 100));
	}

}

//(과정1)
class Ex05_Test2 {
	// 상속받지 않고 바로 객체 생성
	Ex05 ex05 = new Ex05() {

		@Override // 자동으로 오버라이딩
		public void printData() {
			System.out.println("data2 :" + (data + 100));
		}
	};
}
//(과정2)
class Ex05_Test3 {
	// 객체생성 안하고 메서드 안에 넣어버림
	public void prn() {
		Ex05 ex05 = new Ex05() {

			@Override // 자동으로 오버라이딩
			public void printData() {
				System.out.println("data3 :" + (data + 100));
			}
		}; // 클래스

		ex05.printData();

	} // 메서드	
}

//	**중요
//	(응용방법)	Anonymous 내부클래스

class Ex05_Test4 {
	// 객체생성 안하고 메서드 안에 넣어버림
	public void prn() {
		new Ex05() {	//	선언하는 이름없이 생성자만 사용하여 만듦
			
			@Override // 자동으로 오버라이딩
			public void printData() {
				System.out.println("data4 :" + (data + 100));
			}
		}.printData(); // 클래스를 생성하고 클래스가 끝나기전에 . 호출한다
		
		
	} // 메서드	
}

