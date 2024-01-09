package com.javaex.ex04;

public class Customer {
	
	//필드
	int point;
	
	//생성자
	public Customer() {
		super();
	}
	
	public Customer(int point) {
		super();
		this.point = point;
	}

	//메소드 g/s
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println();
	}

}
