
package zz_task;

class Car2{
	String color;
	String gaerType;
	int door;
	
	Car2(){
		this("black", "stick", 4);
	}
	
	Car2(String color){
		this();
		this.color = color;
	}

	Car2(String color, String gearType, int door){
		this.color = color;
		this.gaerType = gearType;
		this.door = door;
	}
}




public class Ex3_10 {
	public static void main(String[] args) {
		Car2 c = new Car2();
		Car2 c1 = new Car2("red");
		Car2 c2 = new Car2("blue","auto",2);
		
		System.out.println(c.color + c.gaerType + c.door);
		System.out.println(c1.color + c1.gaerType + c1.door);
		System.out.println(c2.color + c2.gaerType + c2.door);
		
		
		
		
		
		
		
	}
}
