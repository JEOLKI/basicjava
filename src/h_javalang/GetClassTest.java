package h_javalang;

import java.io.Serializable;
import java.util.Arrays;

public class GetClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//1. 객체로부터 얻는 방법
		Card c = new Card();
		Class obj = c.getClass();
		System.out.println(obj.getName());
		System.out.println(Arrays.toString(obj.getInterfaces()));
		
		//2. 클래스 리터럴로 부터 얻는 방버버
		Class obj2 = Card.class;
		System.out.println(obj2.getName());
		System.out.println(Arrays.toString(obj2.getInterfaces()));

		
		//3. 클래스명으로부터 얻는 방법
		Class obj3 = Class.forName("h_javalang.Card"); // try catch 해줘야하는데 일단 던져주고 // 패키지명까지 써줘야한다.
		System.out.println(obj3.getName());
		System.out.println(Arrays.toString(obj3.getInterfaces()));
		
		
	}
}



class Card implements Serializable{
	String kind;
	int number;
	
	//1. 매개변수 두개인 생성자
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	//2. 기본생성자 단. 매개변수가 두개인 생성자를 호출하여 SPADE,1로 초기화
	Card() {
		this("SPADE", 1);
	}
	
	//3. toString() 오버라이드 해주세요
	
	@Override
	public String toString() {
		return "문양 : "+ kind + "넘버" +number;
	}
	
	
	
	
}