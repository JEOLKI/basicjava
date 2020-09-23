package f_OOP2;

public class InterfaceTest01 {
	public static void main(String[] args) {
		Fight f = new Fight();
		
		System.out.println(f instanceof Unit2);  // Fight객체(f)안 Unit2 안에 Object
		
		if(f instanceof Fightable){
			System.out.println("f는 Fightable인터페이스의 구현체이다");
			Fightable ff = new Fight();  //검사한 타입으로 변형이가능하다 // 인터페이스의 다형성
			//인터페이스타입의 참소변수로 그를 구현한 구현체에 인스턴스를 참조할수 있다.
		}
		
		
	}
}

class Unit2{
	int x;
	int y;
	int currentHp; // current 라는것은 현재의 뭔가를 알아내고 싶음
}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit2 u);
}

interface Fightable extends Movable, Attackable{  // 클래스는 아예 상속되지못하게 뜨지도 않음
	
}

class Fight extends Unit2 implements Fightable{  // 어떤유닛이 공격을 할것이니까

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit2 u) {
		
	}  
	
}


