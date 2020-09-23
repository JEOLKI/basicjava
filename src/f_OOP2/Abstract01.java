package f_OOP2;

public class Abstract01 {
	public static void main(String[] args) {
		

		
		
		
		
		
		
	}
}

abstract class Unit{   // 추상클래스 // 추상클래스 자체는 객체를 만들수가 없다. 구현하라고 나옴
	int x;
	int y;
	
	abstract void move(int x , int y);  // 추상메서드
	
	void stop(){
		
	}
	
}


class Marine extends Unit{  // 추상클래스인 Unit을 상속받는다.
	void stimPack(){
		
	}

	@Override  // 오버라이드를 통해서 추상메서드를 변경해주면 추상클래스도 되지않는다.
	void move(int x, int y) {
		
	}
	
}

class Tank extends Unit{
	void changeMode(){
		
	}
	
	@Override
	void move(int x, int y) {
		
	}
	
}

class DropShip extends Unit{
	void load(){
		
	}
	
	@Override
	void move(int x, int y) {
		
	}
	
}









