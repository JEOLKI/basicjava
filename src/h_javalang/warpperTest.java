package h_javalang;

public class warpperTest {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);  //false
		System.out.println(i1.equals(i2)); //true  
		//Integer클래스에 equals()를 오버라이드 되어있다.
		
		System.out.println(i1); //100 값이 나온걸 봐서는
		//Integer클래스에 toString()를 오버라이드 되어있다.
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE); // bit수를 의미
		
//		System.out.println(Integer.BYTES);  //1.8 버전에서 4바이트가 나옴
		
		
		//1. Integer값을 3개 저장할 수 있는 변수 iArr을 선언 및 생성 해주세요
		Integer[] iArr = new Integer[3];
		
		
		//2. iArr의 각 방을 20, 40 , 80의 값으로 변경해 주세요
		iArr[0] = new Integer(20);
		iArr[1] = 40; // 인티져라 참조형인데 기본값을 바로 넣어줄수 있다 자동적으로 이루어진다.
		//자동으로 박스를 만들어준다 오토박싱 이라함
		iArr[2] = new Integer(80);
		
		
		int a = new Integer(20); //언박싱 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
