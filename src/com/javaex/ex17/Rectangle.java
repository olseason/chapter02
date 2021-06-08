package com.javaex.ex17;

public class Rectangle extends Shape{

	//필드 
	private int width;
	private int height;
	
	
	//생성자 
	public Rectangle() {
		//super();          //shape()  -> 표기는 super()
	}
	
	public Rectangle(String fillColor, String LineColor, int width, int height) {
		super(fillColor, LineColor);
		this.width = width;
		this.height = height;
		System.out.println("Rectangle(4)");
		
		//super.setFillColor(fillColor);
		//super.setLineColor(LineColor);
	}


	
	//메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 일반 
	public String toString() {
		return "Rectangle [width=" + width+ ", height=" + height +"]";
	}
	
	
	
}
