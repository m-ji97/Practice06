package com.javaex.ex03;

public class Shape {
	
	//필드
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Shape() {
		
	}
	public Shape(String fillColor,String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 g/s
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println();
	}

	
}
