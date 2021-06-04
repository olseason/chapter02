package com.javaex.ex09;

public class GoodsApp {

	//static 관련업무  -->static예제 
	//count 용도로 static 잘 사용하지 않음 --> 배열 --> 리스트 
	public static void main(String[] args) {
		
		
		Goods computer = new Goods("그램", 1000000);
		computer.showInfo();
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		
		
		
	}	
	
}
