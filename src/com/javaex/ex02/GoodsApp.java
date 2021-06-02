package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
	
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods mug = new Goods();
		
		//camera.name = "니콘";
		camera.setName("니콘");
		
		//camera.price = 400000; 
		camera.setPrice(400000);
		
		computer.setName("그램");
		computer.setPrice(1000000); 
		
		mug.setName("머그컵");
		mug.setPrice(2000);
		
		
		/*
		//System.out.println("상품명:" + camera.name + "가격:" + camera.price ); 
		System.out.println( "상품명:"+ camera.getName() + "," + camera.getPrice() );
		System.out.println("상품명:"+ computer.getName() + "," + computer.getPrice());
		System.out.println("상품명:"+ mug.getName() + "," + mug.getPrice());
		*/
		
		camera.showInfo();
		computer.showInfo();
		mug.showInfo();
		
		

	}

}
