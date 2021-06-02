package com.javaex.ex03;

public class Point {

		
		//필드 
		private int x;
		private int y;
		
		
		//메소드 겟터세터 
		public void setX(int x) {
			 this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
	
		
		//메소드 일반 
		public void draw () {                    //여기서 draw는 복작하게 그리는 기능을 구현해야된다고 가정 
			System.out.println("점[x=" + x + ", y=" + y +"]을 그렸습니다.");
		}

}
