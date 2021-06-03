package com.javaex.ex08;

public class TvApp {

public static void main(String[] args) {
		
		Tv tv = new Tv(7, 20, false);
		
		tv.status();
		
		tv.power(true);
		tv.volume(120); 
		tv.status();    //100으로 유지
		
		tv.volume(false); 
		tv.status();	//볼륨 99
		
		tv.channel(0); 
		tv.status(); 	//채널 1번
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status(); 	//채널 4번
		
		tv.power(false);
		tv.status();  	//전원 OFF
	}

	
	
	
}
