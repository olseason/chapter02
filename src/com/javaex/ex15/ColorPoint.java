package com.javaex.ex15;

public class ColorPoint extends Point{

	
		
		//필드 
		private String color;
		
		
		//생성자
		public ColorPoint() {
			System.out.println("Color(1)");
		}
		
		public ColorPoint(String color) {
			
		}
		
		public ColorPoint(int x, int y, String color) {
			super(x,y);
			this.color = color;
			System.out.println("color(3)");
		}
		
		
		
		//메소드 g/s
		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}
		
		
		
		//메소드 일반
		public void showInfo() {
			System.out.println("==========================");
			System.out.println("color : " + this.color);
			System.out.println("point x: " + super.x);
			System.out.println("point y: " + super.y);
			System.out.println("==========================");
		}





}
