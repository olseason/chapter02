package com.javaex.ex16;

public class Circle extends Rectangle {

	
	//필드
	private String fillColor;
	private String LineColor;
	private int radius;
	
	
	//생성자 
	public Circle() {
		
	}
	
	public Circle(String fillColor, String LineColor, int radius) {
		this.fillColor = fillColor;
		this.LineColor = LineColor;
		this.radius =  radius;
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
		this.LineColor = lineColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	//메소드 일반 
	//toString()테스트
	
	/*
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", LineColor=" + 
				LineColor + ", radius=" + radius+ "]";
	}
	*/
	
	
	//draw()테스트 
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + LineColor +
				", 둘레:" + radius + "] 원을 그렸습니다." );
	}
	
}
