package com.javaex.ex05;

public class Depart extends Employee { //코드작성
	
	//필드
	private String department;
	
	//생성자
	public Depart() {
	}	
	public Depart(String name, int salary, String department) {
		super();
		super.setName(name);
		super.setSalary(salary);
		this.department = department;
	}
	
	
	//메소드 g/s
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Depart [department=" + department + "]";
	}
	public void showInformation() {
		System.out.println("이름:"+this.getName()+" 연봉:"+this.getSalary()+" 부서:"+department);
	}
	
	
	
	

	 

}
