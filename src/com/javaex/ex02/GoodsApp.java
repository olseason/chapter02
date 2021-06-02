package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
	
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods mug = new Goods();
		
		camera.name = "니콘"; 
		camera.price = 400000;
		
		computer.name = "그램";
		computer.price = 100000; 
		
		mug.name = "머그컵";
		mug.price = 2000;
		
		System.out.println( "상품명:"+ camera.name + "," + camera.price);
		System.out.println("상품명:"+ computer.name + "," + computer.price);
		System.out.println("상품명:"+ mug.name + "," + mug.price);
	

	}

}
