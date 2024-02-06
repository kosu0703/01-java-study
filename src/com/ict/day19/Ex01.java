package com.ict.day19;
//	모든 클래스는 상속받는다.
//	상속이 없으면 Object 상속 
public class Ex01 {
	//	멤버필드
	private String name;
	private int age;
	private int price;
	
	//	생성자
	public Ex01() {}

	public Ex01(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	//	한번에 내보낼 때 toString ( Object 클래스에 있다 )
	@Override
	public String toString() {
		return "name : " + name + ", age : " + age + ", price : " + price;
	}
	
	//	getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
