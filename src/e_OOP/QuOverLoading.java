package e_OOP;

public class QuOverLoading {
	public static void main(String[] args) {
		
		int add1 = MyAdd.add(10);
		
		System.out.println(add1);
		
		MyAdd over = new MyAdd();  // 인스턴스 메서드 이기때문에 인스턴스화를 먼저해줘야한다.
		
		int add2 = over.add(10, 20);  // 반환타입이 인트형이기 때문에 인트형에 담아준다.
		System.out.println(add2);
		
		long add3 = over.add(10, 20L);   // long인 것을 넣어주기위해 L을 붙여준다.
		System.out.println(add3);
		
		float add4 = over.add('1', 3.14F);  // f를 안붙이면 더블형으로  받는다.
		System.out.println(add4);
		
		long add5 = over.add(10L, 20L);  // long 타입이기때문에 L을 붙여준다.
		                       //반환 값의 타입이 long이기 때문에 long 타입에 저장을 해준다.
		System.out.println(add5);
		
		// L이나 F 붙이는것으 주의하여야한다. 같은것이 있으면 혼동되기 때문에
		
	}
}




class MyAdd {
	static int a = 20;
	int b = 15;
	
	static int add(int x){
		int result = a + x;          // 연관되어있는게 클래스변수만 있으면 .. 
		return result;				 // 클래스메서드로 만드는것이 좋기때문에 static을 붙여준다.
	}
	
	int add(int x, int y){
		int result = x + y;
		return result;
	}
	
	long add(int x, long y){
		long result = x + y;
		return result;
	}
	
	float add(char x, float y){
		float result = x + y;
		return result;
	}
	
	long add(long x, long y){
		long result = x + y;
		return result;
	}
	
	
}









