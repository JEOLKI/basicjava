package b_operation;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class Operation_05 {
	public static void main(String[] args) {
		/*
		1. 삼항연산자
		  - 세 개의 피연산자를 필요로 하기 때문에 삼항연산자로 이름 지어졌다.
		  - 삼항연산자의 조건식에는 연산결과가 true 또는 false인 식이 사용되어야 한다.
		  - 기본구조
		    (조건식) ? true일때 수행될 문장 : false일때 수행될문장;
		
		
		*/
		int x = -10;
		
		int absx = x >= 0 ? x : -x;   // true일때와 false일때의 타입이 동일해야한다. 
		// 절대값을 구하는 삼항연산자.
		System.out.println(absx);
		
		//문제 2-12
		char x2 ='z';
		String result = 'A' <= x2 && x2 <= 'Z' ? "대문자" : 'a'<=x2 && x2<='z' ? "소문자" : "영문자아님";
		// x2의 경우의 수가 3개이기때문에 삼항연산자를 2번 써야한다.
		// x2 => 영어대문자, 영어소문자, 영문자아님
		// 영어대문자 ? "대문자" : ========
		//                     영어소문자 ? "소문자" : "영문자아님"
		System.out.println(result);
		
		/*
		2. 대입연산자 ( =, op= )
		  - 변수에 값 또는 수식의 결과값을 저장하는데 사용한다.
		  - 연산우선순위는 가장 낮다.
		  
		*/
		
		int a = 10;
		
		//1. a에 20을 더한 값을 a에 저장해주세요
		a = a + 20;
		
		a += 20; //+ 에 op연산자 다들어갈수있다.
		
		char c = 'A';
		
		int c1 = c + 10; // int형으로 변한다
		
		c += 10; // op=를 사용하면 자신의 타입을 그대로 유지한다.
		
		
		/*
		3. 반올림 
		
		*/
		
		//1. 변수 f1을 3.7로 초기화 해주세요
		float f1 = 3.7F;
		
		//2. f1의 반올림 값을 변수에 저장해주세요
		float f2 = (int)(f1+0.5);
		// 0.5를 더한다음에 정수부분만 취득하면 반올림된다.
		// f1 + 0.5 하면 double이라 소수점이나온다 int값으로 정수로 변경
		
		//3. 2의 결과를 출력해주세요
		System.out.println("f2 : "+f2);
		
		
		//1. 변수 f3에 3.141592로 초기화 해주세요
		float f3 = 3.141592f;
		
		//2. f3의 값을 소수점 4번째 자리에서 반올림하여 세번째 자리까지 표현해주세요.
		//   결과 : 3.142
		// 정수부분을 4번째자리로 만든후 소수점을 반올림해주고 다시 소수점이 나올수있도로 나눠준다.
		float f4 = (int)(f3 * 1000 + 0.5)/1000f;
		// int라는 변수변환을 통해서 소수점 첫자리를 반올림할수있다.
		// 결과값이 소수점 4번째자리에서 반올림을 한값이기때문에 
		// 소수점 4번째자리를 첫자리로 만들기위해 1000을 곱해준다 //*1000
		// 반올림을위해 0.5를 더해준다 // + 0.5
		// int로 캐스팅하면 소수점이사라짐 // (int)
		// 다시 소수점으로 보낸다 // /1000F
		System.out.println(f4);
		
		
		int random = (int)(Math.random()*6+1);
		System.out.println(random);
		
		// 1 (포함) ~ 45 (포함)
		int lotto = (int)(Math.random()*45+1);
		System.out.println(lotto);
		
		// 27 (포함) ~ 69 (미포함)
		//  포함 미포함 -> 69-27=42 중간에 들어가는 수는 42개이다 
		int num = (int)(Math.random()*(69-27)+27);
		System.out.println(num);
		
		
		//문제 2-13
		int x2_13 = (int)(Math.random()*100);
		System.out.println(x2_13);
		int x2_2_13 = (int)(Math.random()*(375-44)+44);
		System.out.println(x2_2_13);
		
		
		
		//사용자한테 숫자받고 자리받고 반올림하는 프로그램 만들어보기.
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
