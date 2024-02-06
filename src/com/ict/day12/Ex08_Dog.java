package com.ict.day12;

//	**추상클래스 상속

//	1.	일반적인 클래스가 추상클래스를 상속하면,	
//	 	일반적인 클래스는 추상메서드를 오버라이딩해서 반드시 구체화한다.
class Ex08_Dog extends Ex08__Animal{

	@Override							//	부모가 구체화하지 않은 것을 
	public void sound() {				//	자식이 구체화 한다.
		System.out.println("멍~ 멍~");
	}	
}


//	2.	추상클래스가 추상클래스를 상속하면,
//		오버라이딩을 하지 않아된다.
abstract class Ex08_Cat extends Ex08__Animal{	//	부모클래스에 추상메서드가 있어서 
												//	자식클래스도 추상클래스가 될 수 있다.
}


//	1과 같지만 다른 추상메서드를 가져서 
//	추상클래스가 된다.
abstract class Ex08_Cow extends Ex08__Animal{

	@Override
	public void sound() {
		System.out.println("음메~");
	}
	
	public abstract void like();	
}

//	다른 추상메서드를 만들면 추상클래스가 된다.
abstract class Ex08_Chicken extends Ex08__Animal{
	public abstract void sleep();
}


class Ex08_My_Animal extends Ex08_Chicken{		

	@Override						//	위에서 해결못한 sleep() , sound() 
	public void sleep() {			//	둘 다 모두 오버라이딩하여 구체화해야 된다.
	}

	@Override
	public void sound() {	
	}
	
}


class Ex08_My_Animal2 extends Ex08_Cow{

	@Override						//	위에서 sound() 는 해결했으므로
	public void like() {			//	해결못한 like() 만 오버라이딩하여 구체화하면 된다.
	}	
}

