package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] us = new User[3];
		User us1 = new Customer("jws", "j1234", "정우성", 1000);
		User us2 = new Customer("yjs", "y2345", "이효리", 2000);
		User us3 = new Employee("master", "m7788", "운영자", 5000000);
		
		us[0] = us1;
		us[1] = us2;
		us[2] = us3;
		
		for(int i = 0; i<us.length; i++) {
			us[i].showinfo();
		}
		System.out.println("운영자의 월급은 "+ us3.getSalary()+"원 입니다.");
	}

}
