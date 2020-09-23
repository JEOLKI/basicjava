package zz_task;


/**
 * Tv의 전원조작 및 채널조작하는 클래스
 * @author Hong
 * @since 2020-06-18
 */

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
	
	void channelDown(){
		channel--;
	}

}



public class Ex3_2 {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 "+ t.channel + "입니다.");

	}

}
