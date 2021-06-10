package com.javaex.ex20;

public class ShapeApp {

public static void main(String[] args) {
		
	
		/*
		Point p01 = new Point(5,5);
		p01.draw();
		
		Drawable dp01 = new Point(10,10);
		dp01.draw();
		*/
	
	
		//도형을 만든다 
		Drawable[]dArray = new Drawable[4]; 
		Drawable r01 = new Rectangle("빨강", "검정", 7,7);
		Drawable c01 = new Circle("주황", "검정", 5);
		Drawable t01 = new Triangle("노랑", "검정", 15,15);
		Drawable p01 = new Point(100,100);
		
		
		//배열 <- 도형 
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		
		//배열을 이용해서 전부 그린다 
		for(int i = 0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 면적 출력 
		/*
		System.out.println(((Rectangle)r01).area());
		System.out.println(((Shape)r01).area());
		*/
		
		
		//배열을 이용해서 면적 출력 
		for(int i = 0; i<dArray.length; i++) {
			
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
				
		}
		
		//테스트 -> Drawable만 점이라고 출력 
		for(int i = 0; i<dArray.length; i++) {
			
			if( !(dArray[i] instanceof Shape) ) {
				System.out.println("점");
			}
				
		}
		
		
		
	}
	
}
