package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
		
		/*
		MyMath myMath = new MyMath();
		
		System.out.println(myMath.plus(100, 100));
		
		System.out.println(myMath.plusDouble(100.5, 100.2));
		
		System.out.println(myMath.plusDouble(100.2, 100));
		
		System.out.println(myMath.plusDouble(99, 34.5));    //오버로딩의 장점  -> 여러 수를 미리만들어 출력할 때 보다 더 자유롭게 값을 넣을 수 있음  
		*/
		
		System.out.println(MyMath.plus(99, 99));
		System.out.println(MyMath.plus(10.4, 99));
		
		
		System.out.println(MyMath.CircleArea(5));
		
		/*
		 MyMath myMath = new myMath();    // 이렇게 쓸 이유가 없음 -> 메모리 낭비 
		 System.out.println(MyMath.plus(100, 100)); 
		 */
		
		
	}
}
