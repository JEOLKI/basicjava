package e_OOP;

import java.util.Scanner;

public class Qu3_5 {        // Method Area에 Qu3_5클래스를 로드시킨다. 클래스변수와 클래스메소드가 따라와야하는데 클래스 변수는 없다.
	public static void main(String[] args) {	//클래스 메소드인 main메소드가 입력되고 callstack 영역으로 main메소드를 쌓아줍니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해주세요");
		float firstNum = sc.nextInt();
		
		
		while (true){
			float a = 0;
			
			
			System.out.println("부호를 입력해주세요");
			String buho = sc.next();
			
			if("C".equals(buho)){
				int b = 0;
				a = 0;
				System.out.println("첫번째 정수를 입력해주세요");
				int firstNum1 = sc.nextInt();
				b += firstNum1;
				firstNum = b;
				continue;
			} 
			
			System.out.println("두번째 정수를 입력해주세요");
			int secondNum = sc.nextInt();
		
			Calc method = new Calc();		
			
						
			if("+".equals(buho)){
				a = method.add(firstNum, secondNum);
				System.out.println(firstNum +"+"+ secondNum +"\n"+a);
			} else if("-".equals(buho)){
				a = method.substract(firstNum, secondNum);
				System.out.println(firstNum +"-"+ secondNum +"\n"+a);
			} else if("*".equals(buho)){
				a = method.multiply(firstNum, secondNum);
				System.out.println(firstNum +"*"+ secondNum +"\n"+a);
			} else if("/".equals(buho)){
				a = method.divide(firstNum, secondNum);
				System.out.println(firstNum +"/"+ secondNum +"\n"+a);
			} else {	
				System.out.println("사칙연산 이외의 것을 입력하여 종료합니다.");
				break;	
			}
			
			firstNum = a;
			
		}
		

		
		

//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력해주세요");
//		int firstNum = sc.nextInt();	// main메서드의 지역변수인 firstNum이 main메서드안에 선언되고 입력받아 대입한다.
//			
//		System.out.println("부호를 입력해주세요");
//		String buho = sc.next();		// main메서드의 지역변수인 buho를 main메서드 안에 선언하고 입력받아 대입한다.
//		System.out.println("두번째 정수를 입력해주세요");
//		int secondNum = sc.nextInt();	// main메서드의 지역변수인 secondNum을 main메서드 안에 선언하고 입력받아 대입한다.
//		
//		Calc method = new Calc();	// 대입연산자의 왼쪽부터 공간을만들어 오른쪽의값을 왼쪽에 대입하여야 하기때문에 왼쪽부터해준다.
												// Method Area에 Calc 클래스를 입력합니다. 
												// main 메서드의 참조변수인 method를 main메서드에 선언한다
												// new 인스턴스화한다
												// Calc에 있는 인스턴스 변수와 인스턴스 메서드
		// 인스턴스 메소드를 사용하기 위해 인스턴스화시킨다.
//			
//	    // equals 사용시 확정적인것을 앞으로 있을수있고 없는것은 뒤에쓴다
//		if("+".equals(buho)){
//			int a = method.add(firstNum, secondNum);
//			System.out.println(a);
//		} else if("-".equals(buho)){
//			int a = method.substract(firstNum, secondNum);
//			System.out.println(a);
//		} else if("*".equals(buho)){
//			long a = method.multiply(firstNum, secondNum);
//			System.out.println(a);
//		} else if("/".equals(buho)){
//			float a = method.divide(firstNum, secondNum);
//			System.out.println(a);
//		} else {
//			System.out.println("사칙연산 이외의 값을 입력하여 종료합니다.");
//		}
//		
		// 메소드에 f2눌러주면 메소드가 돌려주는 타입이 나온다. 
		// 메소드가 돌려주는 타입이 인트이기때문에 인트로 저장한다.
		// multiply 메서드의 반환타입이 long이기때문에 long으로 저장한다.
		
		
		
	}
}





class Calc{

	float add ( float a, float b){
		float result = a + b;
		return result;
	}
	
	float substract (float a, float b){
		float result = a - b;
		return result;
	}
	
	float multiply (float a, float b){
		float result = (float)a*b;
		return result;
	}
	
	float divide (float a, float b){
		float result = (int)((float)a/b*10 +0.5)/10f;
		return result;
	}
	
	
//	class Calc{
//
//		int add (int a, int b){
//			int result = a + b;
//			return result;
//		}
//		
//		int substract (int a, int b){
//			int result = a - b;
//			return result;
//		}
//		
//		long multiply (int a, int b){
//			long result = (long)a*b;
//			return result;
//		}
//		
//		float divide (int a, int b){
//			float result = (int)((float)a/b*10 +0.5)/10f;
//			return result;
//		}	
	
	
	
	
}