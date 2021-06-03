package com.javaex.ex08;

public class Tv {

	
	//필드
		private int channel;
		private int volume;
		private boolean power;
		
		//생성자
		public Tv() {
		}
		
		public Tv(int channel, int volume, boolean power) {
			this.channel = channel;
			this.volume = volume;
			this.power = power;
		}

		//메소드 게터/세터
		public int getChannel() {
			return channel;
		}

		public int getVolume() {
			return volume;
		}

		public boolean isPower() {
			return power;
		}
		
		
		//메소드 (일반) 
		
		public void power(boolean power) {
			this.power = power;
		}
		
		public void channel(int channel) {
			
			if(channel>0 && channel<=255) {
				this.channel = channel;
			}else if(channel<1) {
				this.channel = 1;
			}else if(channel>255) {
				this.channel = 255;
			}
		}
		
		public void channel(boolean up) {
			if(up == true) {
				this.channel++;
			}else {
				this.channel--;
			}
		}
		
		public void volume(int volume) {
			
			if(volume>=0 && volume<=100) {
				this.volume = volume;
			}else if(volume<0) {
				this.volume = 0;
			}else if(volume>100) {
				this.volume = 100;
			}
		}
		
		public void volume(boolean up) {
			if(up == true) {
				this.volume++;
			}else {
				this.volume--;
			}
		}
		
		public void status() {
			if(power == true) {
			System.out.println("TV 전원 ON");
			}else {
				System.out.println("TV 전원 OFF");
			}
			System.out.println("TV 볼륨: "+volume);
			System.out.println("TV 채널: "+channel+"번");
			System.out.println("");
		}
	
}
