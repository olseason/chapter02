package com.javaex.ex17;

public class Shape {

	//필드
	protected String fillColor;
	protected String LineColor;
	
	
	
	//생성자
	public Shape() {
		
	}

	public Shape(String fillColor, String LineColor) {
		this.fillColor = fillColor;
		this.LineColor =  LineColor;
		System.out.println("shape(2)");
	}
	
	
	
	
	//메소드 g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return LineColor;
	}

	public void setLineColor(String lineColor) {
		LineColor = lineColor;
	}
	
	
	//메소드 일반 
	public String toString() {
		return "Rectangle [fillColor=" + fillColor + ", LineColor=" + 
				LineColor + "]";
	}
	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + LineColor + "] 사각형을 그렸습니다.");
	}
	
	
}
