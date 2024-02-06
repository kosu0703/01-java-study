package com.ict.day12;

public class Ex07_Cat extends Ex07_Animal{

	int id = 1598753;
	
	public Ex07_Cat() {
		//	**첫줄에 super([인자]); 생략되어있다.		//	자동으로 호출하는 기본생성자가 없기 때문에 오류가 난다.		
												//	인자가 없으면 기본생성자 생략가능, 인자가 있으면 써줘야함
		//	super : 부모클래스의 주소를 참조
		
		//	super([인자]) : 부모클래스의 생성자
		super("짜오", 3);					//	**자식클래스의 생성자에서 부모 생성자에 맞춰 생성자 호출을 해줘야한다 
		
		System.out.println("자식생성자");
	}
	
	public Ex07_Cat(String name) {		//	**모든 자식클래스는 부모클래스의 생성자를 참조해야 된다.
		super(name, 7);
		//this();			//	둘다 첫줄에만 사용 가능하기때문에, 둘 중 하나만 사용 가능
	}						//	super([인자]) 와 this([인자]) 는 같이 사용할 수 없다.
		
	public Ex07_Cat(int age) {	
		this();				//	자신의 생성자로 가면 부모로 가는 생성자가 있기 때문에 오류발생 안함	
	}						//	따라서 자식생성자들 중 하나에는 무조건 부모클래스를 호출하는 생성자가 있어야한다.
	
							
	
	
	
	
}
