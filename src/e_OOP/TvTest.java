package e_OOP;

public class TvTest {      // 컴파일 하면 두개로 클리스가 두개로 쪼개져있다. //그래서 불러와서 사용
	public static void main(String[] args) {

		//클래스 변수 (클래스명.변수명)
		System.out.println(Tv.color); // String 의 기본값이 null이 출력된다. //System 클레스 안에있는 println이라는 메서드
		Tv.color = "yellow";
		
		System.out.println(Tv.color); // yellow
		
		//클래스 메서드 부르기
		Tv.changeColor();         	  // black으로 바꿔주는 메서드를 호출해서 바꾼것

		System.out.println(Tv.color); // black
		
		
		//인스턴스화 				        // 인스턴스변수 메서드를 가져오기위함
		//인스턴스 친구 호출 : 참조변수명.변수명
		Tv t = new Tv();			    // 참조형타입  참조형변수 // 기본형 주소값 
		t.channel = 10;					// channel에 10넣어주기
		System.out.println(t.channel);	// 10 
		
		t.channelUp();					// channelup 메서드사용
		System.out.println(t.channel);	// 11
		
		System.out.println(t.power);    // power에 들어있는것 확인 false
		t.power();						// power를 메서드를 통해서 바꿔준다.
		System.out.println(t.power);	// true
		
		
		
		
		
	}
}



class Tv{   //Tv 클래스   //Tv : 참조변수
	
	
	// 1. 색상을 저장할 수 있는 color 변수를 선언하여라.
	static String color;   // 클래스 변수
	
	// 2. 전원을 저장할 수 있는 변수 power 선언하여라.
	boolean power;
	
	// 3. 채널을 저장할 수 있는 변수 channel 선언하여라
	int channel;
	
	//1.2.3맴버변수 --> 전역변수
	//static 붙으면 --> 클래스 변수
	
	static void changeColor(){    //클래스 메서드 
		color = "black";
	}
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
	
	
}




