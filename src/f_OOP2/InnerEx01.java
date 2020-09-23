package f_OOP2;

public class InnerEx01 {
	
	class InstanceInner {
		int iv = 100;  //인스턴스변수를 쓸수 있다 밖의 객체가 만들어져야만 접근이 가능해서
//		static int cv = 20; // 클래스 변수를 사용할수 없다  객체가 만들어져야 로드될수있기 때문에
		static final int CON = 50; //상수는 사용할수 있다.
	}
	
	static class StaticInner {
		static int cv = 60;
		int iv = 70;
	}
	
	void method(){
		class LocalClass{  //로컬클래스는 스테틱이 붙을수 없다.
			int iv = 50;  
//		static int cv = 20; // 사용할수 없다. 클래스 메서드안이라도 사용할수 없다.
			static final int CON = 50; //상수는 사용할수 있다.
		}
	}
	
	
	
}
