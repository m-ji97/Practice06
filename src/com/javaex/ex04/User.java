package com.javaex.ex04;

public class User{
	
	//필드
	String id;
	String password;
	String name;
	
	//생성자
	public User() {
		super();
	}

	public User(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	//메소드 g/s
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//메소드 일반
	public int getSalary() {
		return 0;
	}
	
	public void showinfo() {
		System.out.println("#아이디:" + getId() + ", #패스워드" + getPassword() + ", #이름:" + getName() + ", #포인트:");
	}
	
}
