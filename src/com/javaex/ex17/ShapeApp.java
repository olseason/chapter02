package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		//부모클래스 테스트 
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		s01.draw();
		
		//사각형 테스트 
		/*
		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3);
		System.out.println(r01.toString());
		r01.draw();
		*/
		
		//System.out.println(r01.toString());       //자식 에는 없지만, 부모쪽에 있어서 오류안 남 (한 몸처럼 쓸 수 있음) 
		
		
		//사각형 만들기 
		Rectangle []rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강",  "검정", 3,3);
		Rectangle r02 = new Rectangle("빨강",  "검정", 4,4);
		Rectangle r03 = new Rectangle("빨강",  "검정", 5,5);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i = 0 ; i<rArray.length; i++) {
			rArray[i].draw();
		}
		

	}

}
