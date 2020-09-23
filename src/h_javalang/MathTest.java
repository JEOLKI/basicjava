package h_javalang;

import static java.lang.Math.*;

public class MathTest {
	public static void main(String[] args) {
		
		//Math클래스의 메서드를 이용하여 편하게 사용해 봅시다.
		
		double d = 3.141592;
		
		//반올림 (정수부분취득)
		
		System.out.println(Math.round(d)); // import static java.lang.Math.*; 사용해서 math껄사용할거다
		
		System.out.println(round(d));
		
		//올림
		System.out.println(ceil(d)); // 4.0 항상메서드를 사용할때는 반환타입생각 double이라 소수점나온다
		
		//버림
		System.out.println(floor(d)); // 3.0
		
		//제곱
		System.out.println(pow(3, 2)); // 9.0
		
		//제곱근 루트
		System.out.println(sqrt(2)); 
		
		
		
		
		 
		Point p1 = new Point(1, 2);
		Point p2 = new Point(2, 7);
		System.out.println(p1.getDistance(p2));
		
		
		
	}
}


class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	 
	float getDistance(Point p){
		// 소수점 두번째 자리에서 반올림하여 첫번째 자리까지 표현해주세요
		return round(sqrt(pow((p.x-x),2) + pow((p.y-y),2))*10)/10f;
		//0.5에서 반올림해주는것을 round가 하게 한다. 자릿수 관리는 직접
	}
	
}







