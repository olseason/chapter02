package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);
		Rectangle r02 = new Rectangle("노랑", "검정", 5, 5);
		Rectangle r03 = new Rectangle("초록", "검정", 5, 5);
		
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		
		
		for(int i = 0; i<rArray.length; i++) {                      //배열을 이용한 면색 변경                
			rArray[i].setFillColor("파랑");
		}
		
		
		for(int i = 0; i<rArray.length; i++) {                       //결굴 r01.draw()와 같은 값 
			rArray[i].draw();                                        //배열을 이용한 그리기 
		}
		
		
		//원 관리
		Circle cArray[] = new Circle[3];
		
		Circle c01 = new Circle("분홍", "검정", 5);
		Circle c02 = new Circle("주황", "검정", 5);
		Circle c03 = new Circle("초록", "검정", 5);
		
		c01.draw();
		c02.draw();
		c03.draw();
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		
		//변수를 만들지 않고 바로 배열에 저장 
		/*
		  cArray[0] = new Circle("분홍", "검정", 5);
		  cArray[1] = new Circle("주황", "검정", 5);
		  cArray[2] = new Circle("초록", "검정", 5);
		*/
		
		for(int i =0; i<cArray.length; i++) {                       //배열을 이용한 원 그리기 
			cArray[i].draw();
		}
		
		//System.out.println(c01.toString());
		
		
		
		//System.out.println(r01.toString());                          
		/*	
		r01.draw();                                                  //배열을 이용한 사각형 그리기  
		r02.draw();
		r03.draw();
		*/
	}

}
