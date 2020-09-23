package f_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawShape extends Frame{  // 그림 창을띄워주기 위한 Frame 클래스 에서 상속 지목을해줘야 임포트 됨 //상속
	public static void main(String[] args) {
		DrawShape ds = new DrawShape("제목을 설정할수 있습니다.");
//		ds.paint(g)		//자동호출된다고 생각하고 할것.
		//ds.paint(new Graphic())
		
	}
	
	@Override
	public void paint(Graphics g) {
		//1. 원을 만들어주세요(매개변수가 두개인 생성자 이용)
		Point p = new Point(200,200);
		Circle circle = new Circle(p,50);
		
		// Circle이 포인트하나 인트하나를 원한다.
		// 포인트의 주소를 만들어준다.
		
		
		
		
		//2. g.drawOval()이용하여 원을 그려주세요
		g.drawOval(circle.p.x, circle.p.y, circle.r*2, circle.r*2);
		


		//3. 삼각형을 만들어주세요(매개변수가 하나인 생성자를 이용)
		
		Point[] pArr = new Point[3];
		
		pArr[0] = new Point(250,100);
		pArr[1] = new Point(100,400);
		pArr[2] = new Point(400,400);
		
		Triangle triangle = new Triangle(pArr);
		// Triangle(포인트세개)
		// 포인트 세개를 저장해줄 배열생성
		// 각각의 공간에 점을 대입
		
		
//		Triangle triangle = new Triangle(new Point[3]);
//		
//		Point p1 = new Point(250,100);
//		Point p2 = new Point(100,400);
//		Point p3 = new Point(400,400);
//		
//		triangle.p[0] = p1;
//		triangle.p[1] = p2;
//		triangle.p[2] = p3;
		
		
		
		//4. g.drawLine()이용하여 직선을 그려주세요 ( *3)
		g.drawLine(triangle.p[0].x, triangle.p[0].y, triangle.p[1].x, triangle.p[1].y);
		g.drawLine(triangle.p[1].x, triangle.p[1].y, triangle.p[2].x, triangle.p[2].y);
		g.drawLine(triangle.p[2].x, triangle.p[2].y, triangle.p[0].x, triangle.p[0].y);
	
		
		
		
	}
	
	
	
	DrawShape(){	//기본생성자
		super("자리가 바뀌었어요.");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		setResizable(false);
	}
	
	DrawShape(String title){	// String 타입 매개변수를 받는 생성자
		super(title);
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}



class Point{
	int x;   // 점을 만들기 위한 좌표 필요
	int y;
	
	
	//1. 매개변수가 두개인 생성자를 만들어주세요
	
	Point(int x, int y){                 //점하나 저장하기위한것. 점이필요하면 객체생성하여 점을 저장해야한다.
		this.x = x;
		this.y = y;
	}
		
}


class Circle{
	//1. 점 하나를 저장할수 있는 변수 p를 선언해주세요
	Point p;  // 원이 점을 가지고 있다 포함관계
	
	//2. 반지름(정수)을 저장할 수 있는 변수 r을 선언해주세요
	int r;
	
	//3. 매개변수가 두개인 생성자를 만들어주세요
	Circle(Point p, int r){
		this.p = p;
		this.r = r;
	}
	
	//4. 기본생성자를 만들어주세요
	//   단. 매개변수가 두개인 생성자를 이용하여 좌표(100,100), 반지름은 50
	Circle(){
		this(new Point(100,100), 50);  // 생성자 내부에서 다른생성자 요구 // 참조형타입하나랑 기본형타입하나 요구 
		
		// this ( 점, 반지름 );
		// 점은 주소를 요구하고 반지름은 기본형이라 값을 요구한다.
		// Point는 기본생성자가없다.
		// this는 항상 첫재줄에만 온다 p의 주소 newPoint(100,100)을 this에 직접 넣어준다.
		
	}
}




class Triangle{
	
	//1. 점3개를 저장할 수 있는 변수 p를 선언해주세요
	Point[] p;   //Point를 여러개담아야하기 때문에 Point형 배열이여야 한다.
	
	//2. 매개변수가 하나인 생성자를 만들어주세요
	Triangle(Point[] p){
		this.p = p;   //완성된 Point 형 배열을 만들어서 줄것인데 그것을 넣어주기만 하면 된다.
	}
	
	//3. 매개변수가 세개인 생성자를 만들어주세요
	Triangle(Point p1, Point p2, Point p3) {
		p = new Point[3]; // 아파트를 만들어주고 입주 시킨다.
		this.p[0] = p1;
		this.p[1] = p2;
		this.p[2] = p3;
	}
}




















