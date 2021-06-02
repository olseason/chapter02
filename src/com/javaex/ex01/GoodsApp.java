package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		Goods camera = new Goods();
		camera.name = "니콘"; 
		camera.price = 400000;
		
		System.out.println(camera.name + "," + camera.price);
		

		Goods computer = new Goods();
		computer.name = "그램";
		computer.price = 100000; 
		
		System.out.println(computer.name + "," + computer.price);
		
		
		Goods mug = new Goods();
		mug.name = "머그컵";
		mug.price = 2000;
		
		System.out.println(mug.name + "," + mug.price);
		
	}

}
