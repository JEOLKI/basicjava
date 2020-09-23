package e_OOP;

public class MemberCall {
	int iv = 10;   // 전역변수 맴버변수 //클래스변수
	
	static int cv = 20;   // 전역변수 맴버변수 //클래스변수
	
	static int cv2 = cv;  // 가능
//	static int cv2 = iv; cv2가 로드된시점에 iv는 로드되지않아서 찾을수 없다 
	
	int iv2 = iv; // 가능
//	int iv2 = cv;  // 가능

	static void staticMethod1(){
		// 사용가능  -> cv, staticMethod2()
		// 사용불가  -> iv, instanceMethod1(), instanceMethod2()
//		MemberCall.staticMethod2();  같은클래스 내에있어서 MemberCall 생략가능
	}
	
	static void staticMethod2(){
		
	}
	
	void instanceMethod1(){
//		사용가능  -> cv iv iv2  static.....
		staticMethod1(); //같은고인돌안에 있어서 호출가능
		// 인스턴스화
		// 참조변수명. 인스~~		
		// 같은 클래스내에있기때문에 인스턴스화를 안하고도 부를수 있다 같은고인돌안에있기 때문에
		instanceMethod2();
		
	}
	
	void instanceMethod2(){
		
	}
	
	
	
}
