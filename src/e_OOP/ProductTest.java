package e_OOP;

public class ProductTest {
	public static void main(String[] args) {
		System.out.println(Init.action);  // 명시적초기화 -> 초기화 블럭
		Init it = new Init();
		System.out.println(it.action2); 
		// 명시적초기화 -> 초기화 블럭 -> 생성자를 이용한 초기화  //절대적
		//    11     ->  70     ->     50
		// 초기화블럭은 여러개있을때는 순서대로
		
		
	}
}



class Init{
	static int action;
	int action2 = 11; //명시적 초기화
	
	//static 붙이면 클래스 없으면 인스턴스 멤버
	static {
		action = 20;
	}
	
	{
		action2 = 70;
	}
	
	Init(){
		action2 = 50;
	}
	
}
