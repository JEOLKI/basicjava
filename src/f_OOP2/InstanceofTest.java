package f_OOP2;

public class InstanceofTest {
	public static void main(String[] args) {

		FireCar fc = new FireCar();
		
		Car c = new Car();
		
		if(fc instanceof FireCar){
			System.out.println("fc는 FireCar의 인스턴스이다.");
			FireCar dd = fc;  // 검사한 타입으로 형변환이 가능하다.
		}
		
		if(fc instanceof Car){
			System.out.println("fc는 Car의 인스턴스이다.");
			Car c2 = fc; // 캐스트연산자 생략 upcasting 된것
		}
		
		if(fc instanceof Object){
			System.out.println("fc는 Object의 인스턴스이다.");
			Object ob = fc;
		}
		
		
		System.out.println(fc.a);
		System.out.println(fc.b);
		fc.method1();
		fc.method2();
		
		Car cc = fc;
		System.out.println(cc.a); //부모것 참조변수의타입
		System.out.println(cc.b);
		cc.method1(); // 부모것
		cc.method2(); // 자식꺼 가져간다. //참조변수의 타입이 아닌 실제 객체타입에 영향을 받는다.
		//오버라이드된 "인스턴스 메서드"만 참조변수타입이아닌 자식것을 찾아간다.
		
	}
}


class Car{
	static int a = 10;
	int b = 20;
	
	static void method1(){
		System.out.println("Car의 method1");
	}
	
	void method2(){
		System.out.println("Car의 method2");
	}
	
}


class FireCar extends Car{
	static int a = 30;
	int b = 40;
	
	static void method1(){
		System.out.println("FireCar의 method1");
	}
	
	void method2(){
		System.out.println("FireCar의 method2");
	}
	
}




