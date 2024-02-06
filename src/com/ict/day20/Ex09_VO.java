package com.ict.day20;

import java.io.Serializable;

//	VO : 객체의 정보를 담을 수 있는 멤버 변수로 구성					//	서버 : Input 과 VO 를 가지고 있음
														//	고객 : Output 과 VO 를 가지고 있음
//	1. **Serializable 인터페이스를 구현 (추상메서드가 없다.)
//		멤버필드가 모두 객체 직렬화 대상이 된다.
//		직렬화 대상에서 제외시키려면 멤버 앞에 transient 예약어를 사용한다.
//		(단, transient 를 사용하면 초기값이 나온다.)
//		( 객체나 String => null / int = 0 / double = 0.0 / boolean = false )

public class Ex09_VO implements Serializable{
	private String name;		//	초기값 null
	private int age;
	private double weight;	//	초기값 0.0
	private boolean gender;	//	초기값 false > 여성
	
	public Ex09_VO() {}

	public Ex09_VO(String name, int age, double weight, boolean gender) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
}
