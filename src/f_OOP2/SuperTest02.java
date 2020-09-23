package f_OOP2;

public class SuperTest02 {
	public static void main(String[] args) {
		
		
		
		
		
		
	}
}


class Point2{
	int x;
	int y;
	
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


class Point3D extends Point2{  
	// 컴파일 하게 되면 Point3D의 기본생성자가 생성되고 안에 super()가 생성되는데 super인 Point2에는 기본생성자가 없고
	// 매개변수 2개를 갖는 생성자만 있기 때문에 (컴파일 하더라도 매개변수갖는 생성자가 있기때문에 자동생성되지 않는다)
	// 매개변수 2개를 갖는 super(int,int)를 사용한 생성자를 만들어주면 에러가 나지 않는다.
	
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);    // 부모 Point2의 기본생성자가 없고 매개변수 인트타입2개를 갖는 생성자만있다.
		this.z = z;
	}
	
	
}









