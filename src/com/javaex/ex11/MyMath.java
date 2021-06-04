package com.javaex.ex11;

public class MyMath {

	//필드
	private static double pi = 3.14;
	private int num;
	//생성자
	

	//메소드 g/s
	
	
	//메소드 일반 
	public static int plus(int a, int b) {
		
		int result = a + b;
		return result;
	}
	
	public static double plusDouble(double a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double plusDouble(int a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double plus(double a, int b) {
		double result = a + b;
		return result;
	}
	
	public static double CircleArea(int radius) {
		double result = radius * radius * pi;
		return result;
	}
	
	
}
