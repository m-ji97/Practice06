package com.javaex.ex04;

public class Employee {
	
	//필드
	int salary;

	
	
	//생성자
	public Employee() {
		super();
	}
	public Employee(int salary) {
		super();
		this.salary = salary;
	}
	
	//메소드 g/s
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메소드 일반
	public void showinfo() {
		System.out.println();
	}
}
