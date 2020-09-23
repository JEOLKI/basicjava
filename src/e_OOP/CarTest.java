package e_OOP;

public class CarTest {
	public static void main(String[] args) {
		
//		for(int i = 0 ; i < 10 ; i++){
//			Car c = new Car();
//			c.color = "yellow";
//			c.gearType = "stick";
//			c.door = 4;
//		}
//		
//		for(int i = 0 ; i < 10 ; i++){
//			Car c = new Car("black","auto",2);  // 생성자를 만들어 원하는 값으로 초기화 한번에 처리할수 있다. 
//		}
		
		//원하는 값으로 인스턴스변수를 초기화할 목적으로 생성자를 사용한다.
		
//		for(int i = 0 ; i < 10 ; i++){
//			Car c = new Car();
//		}
		
		Car c1 = new Car();
		
		// 생성자는 new 뒤에서만 호출이가능하다. 따로 호출하여 사용 못함
		// new에서 인스턴스화할때만 호출이 가능하다.
		
//		c1.color = "blue"; 컬러하나만 바꾸기 위해서 생성자 하나더 생성
		
		
		
		Car c2 = new Car("black","auto",2);
		
		Car c3 = new Car("blue");
		System.out.println(c3.color);
		System.out.println(c3.gearType);   // 초기화 한적이 없기 때문에 null 이 나온다
		System.out.println(c3.door);       // 0 이 나온다 
										   // 생성자를 넣어주어 기본값을 주고 색상만 바꾼다 .
										   // 블루. 스틱 . 4 가 나온다
		
		
	}
}

class Car{
	
	String color;
	String gearType;
	int door;
	
//	Car(){
//		
//	}
	
	Car(){
		color = "yellow";
		gearType = "stick";
		door = 4;
	}
	// 정해진형태로 기본형을써도 변수를 바꿀수있다.
	
	
	
	Car(String color ,String gearType , int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	//매개변수명과 인스턴스명을 똑같이 쓰는것이 컨트롤 스페이스바를 눌러서 봤을대 한눈에 알수 있다.
	
	Car(String color){
		this();                    //생성자 내부에서 다른생성자를 호출할수 있게 해주는것 
		                           // 이 인스턴스 안에있는 생성자를 호출해줘라 this 사용 
								   // this(String, String, String) 넣으면 기본이아닌 불러온다 
								   // 무조건 생성자의 첫줄에만 사용이가능하다.!!!!!!
		
		
		this.color = color;       
		//지역변수와 인스턴스변수의 명칭이 같을때 구분하는 this. <<<<<
	}
	
	
}
















