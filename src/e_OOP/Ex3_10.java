package e_OOP;

class Car3_10{
	String color;
	String gearType;
	int door;
	
	Car3_10(){
		
//		color = "black";
//		gearType = "stick";
//		door =4;
		
		this("black", "stick", 4);  // this()이 이용하여 위의 3줄을 한줄로 변경 가능 
	}
	
	Car3_10(String color){
		this();
		this.color = color;
	}
	
	Car3_10(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}




public class Ex3_10 {
	public static void main(String[] args) {
		Car3_10 c1 = new Car3_10();
		Car3_10 c2 = new Car3_10("red");
		Car3_10 c3 = new Car3_10("blue", "auto", 2);
		
		System.out.println("기본차량");
		System.out.println("\t차량색상 : " + c1.color + ", 기어타입 : " + c1.gearType + ", 문의개수 : "+ c1.door);
		
		System.out.println("색상변경 차량");
		System.out.println("\t차량색상 : " + c2.color + ", 기어타입 : " + c2.gearType + ", 문의개수 : "+ c2.door);
		
		System.out.println("풀옵션 차량");
		System.out.println("\t차량색상 : " + c3.color + ", 기어타입 : " + c3.gearType + ", 문의개수 : "+ c3.door);
		
		
		
		
		
		
	}
}
