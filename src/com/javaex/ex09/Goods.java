package com.javaex.ex09;

public class Goods {

	
	//필드 
	private String name;
	private int price;
	private static int count;
	
	
	//생성자 
	public Goods() {
		count = count + 1;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count = count + 1;
	}


	
	//메소드(g/s)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	//메소드(일반) 
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.println("가격:" + price);
		System.out.println("카운트:" + count);
		System.out.println("=========================");
	}
	
}
