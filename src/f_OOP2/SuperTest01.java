package f_OOP2;

public class SuperTest01 {
	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.method(70);
		
		
		
		
		
	}
}


class Parent2{
	int x = 10; // 명시적 초기화
}

class Child2 extends Parent2{
	int x = 30;
	
	void method(int x){
		System.out.println(x); // 인자 값
		System.out.println(this.x); // 30
		System.out.println(super.x); // 10 부모에있는 x
	}
	
	
//	class Child2 extends Parent2{
//		void method(int x){
//			System.out.println(x); // 10
//			System.out.println(this.x); // 10
//			System.out.println(super.x); // 10 부모에있는 x
//		}
//	 모두 10이 인출된다  // 지역변수 -> 인스턴스변수 -> 부모에 있는 상속받은 변수  
//	 없을때 우선순위
//}
	
}