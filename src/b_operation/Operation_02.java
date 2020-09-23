package b_operation;

public class Operation_02 {
	public static void main(String[] args) {
		
		/*
		1. 증감연산자 (++, --)
		  - 증가연산자 (++) : 피연산자의 값을 1증가시킨다.
		  - 감소연산자 (--) : 피연산자의 값을 1감소시킨다.
		*/
		
		//1. 변수에 4를 저장해주세요
		int num = 4;
		
		num++;
		System.out.println(num); //num : 5
		
		++num;
		System.out.println(num); //num : 6
		
		// 앞에붙든 뒤에붙는 하나 증가시킨다. 
		
		int num2 = ++num + 5;  // num : 7         num2: 12
		//            7  + 5
		System.out.println(num2);
		// ++은 단항 +는 이항 단항인 ++부터 시작 num부터 1증가
		// ++이 num 앞에 붙었다.
		
		
		int num3 = num++ + 7; // num : 8       num3 : 14
		//           7
		// 뒤에 ++가 붙었을경우에는 먼저 증가하지않는다.
		// 먼저  num의 값을 넣어놓고 그 후에 ++이 적용하여 num의값이 증가한다.
		System.out.println(num3);
		
		int n1 = 23;
		int n2 = 30;
		
		
		//                  n2=31  n1=25
		int resulta = n1++ + ++n2 + ++n1;  
		//            23  +  31  +  25   = 79  // n1 : 25 , n2 :31
		//           n1=24
		// n1이 23으로 들어가고 n++에의해 24가 된다 이후 ++n1에의해 25가 된값이 들어간다.
		// ++n2는 1증가 값이 들어간다.
		// 연산이 진행된기준
		System.out.println(resulta);
		
		
		char ch1 = 'A';
		ch1++;
		System.out.println(ch1);
		
		
		//문제2-6
		int number = 30;
		char ch = 'C';
		int resultb = number++ + 3 + ++ch + ++number;
		System.out.println(number);
		System.out.println(ch);
		System.out.println(resultb);
				
		/*
		3. 비트전환연산자 ( ~ )  //비트 무조건 2진수이다.
		  - 정수형과 char형에만 사용이 가능하다.
		  - 피연산자를 2진수로 표현하였을때 0은 1로 1은 0으로 바꾼다.	
		  	
		*/
		
		byte b1 = 10;
		
		//byte타입의 변수 b2에 b1의 비트전환값을 저장하여라. => 1의 보수
		byte b2 = (byte)~b1; 
		//변수 b1를 비트전환을 수행하였을 때 int타입이 되기 때문에 변환해주어야한다. 
		
		//b2의 값을 출역하여라
		System.out.println(b2);
		
		/*
		4. 논리부정연산자 ( ! )
		  - boolean형 변수나 값에만 사용 가능하다.
		  - true -> false, false -> true
		  - Tv전원 버튼과 같은 토글버튼을 논리적으로 구현할수 있다.
		 		
		*/
		
		//문제 2-7
		//1. 변수 power를 false의 값으로 초기화 하여라.
		boolean power = false;
		
		//2. power의 값을 출력하여라.
		System.out.println(power);
		
		//3. power의 값을 논리부정하여 power값을 다시 저장하여라
		power = !power;
		System.out.println(power);
		
		
		/*
		5. 산술연산자
		  - 사칙연산자(+,-,*,/), 나머지연산자(%), 쉬프트 연산자 (<<, >>, >>>)
		  - 두 개의 피연산자를 취하는 이항 연산자 이다.
		
		6. 사칙연산자 (+,-,*,/)
		  - 두개의 자료형중 큰 쪽의 자료형에 맞춰서 형변환 후에 연산을 수행한다.
		    ex) char + long => long + long => long
		  - 피연산자 두개 모두 4byte보다 작은경우 피연산자 모두 4byte 형인 int형으로
		        변환후에 연산을 수행한다.
		    ex) char + char => int + int
		
		*/
		
		//1. byte타입의 변수 b5에 50을 저장해주세요
		byte b5 = 50;
		
		//2. char타입의 변수 c5에 'a'를 저장해주세요
		char c5 = 'a';
		
		//3. long타입의 변수 l5에 50억을 저장해주세요
		long l5 = 5000000000L;
		
		//4. float타입의 변수 f5에 3.141592를 저장해주세요
		float f5 = 3.141592F;
		
		//5. b5와 l5의 합을 변수 result1에 저장해주세요
		long result1 = b5 + l5; //큰범위에 맞춰서 long 타입에 맞춰준다. 
		//byte + long => long + long => long 
		
		//6. b5와 c5의 합을 변수 result2에 저장해주세요
		int result2 = b5 + c5; //둘다 4byte 보다 작기때문에 int형으로 변형된다.
		
		//7. l5와 f5의 합을 result3에 저장해주세요
		float result3 = l5 + f5; // long + float => float + float => float
		//큰 범위인 float로 맞춰준다.
		
		//8. 10을 8로 나눈 결과를 result4에 저장해주세요. 단, 소숫점이 모두 출력되어야함
		float result4 = (float)10/8; 
		// int/int나누면 int이기때문에 소수점이 생략된다. 
		// 10또는 8 둘중하나를 float 타입으로 변형시켜줘야한다. 결과값이 float이 된다.
		// (float)10/8 or 10/(float)8 을 해준다.
		//일반적으로 double을 사용하지 않는 이유는 doubled은 근사치를 나타내준다 
		// float형을 사용하는것이 가장 좋다.
		System.out.println(result4);
		
		
		//문제 2-8
		byte bb1 = 80;
		byte bb2 = 100;
		long lo1 = 642L;
		long resultb1 = lo1 + bb1;
		System.out.println(resultb1);
		int resultb2 = bb1 + bb2; 
		//더한값이 byte의 값을 넘어가므로 int형으로 한다.
		System.out.println(resultb2);
		byte resultb3 = (byte)(bb1 + bb2);
		//계산값이 byte가 넘어가는데 byte로 저장하고 싶으면 변형한다.
		System.out.println(resultb3);
		long lo2 = (long)60000 * 80000;
		//범위가 long이 적절하다. 끝에 L을 붙이면 long이 된다.
		// long타입으로 변형시켜도 된다.
		System.out.println(lo2);
		
		
		/*
		7. 나머지 연산자 ( % )
		  - 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 돌려준다.
		  - boolean형에는 사용할 수 없다.
		  - 짝수, 홀수, 배수를 사용할 때 많이 사용한다.
		*/
		
		int firstNum = 10;
		int secondNum = 8;
		
		//1. firstNum을 secondNum으로 나눈 몫을 share변수에 저장해주세요
		int share = firstNum/secondNum; // int/int => int
		
		//2. firstNum을 secondNum으로 나눈 나머지를 remain변수에 저장해주세요
		int remain = firstNum%secondNum;// int%int => int
		
		//3. 아래와 같이 출력해주세요
		//   10을 8로 나눈 몫은 1이고 나머지는 2이다.
		System.out.println(firstNum + "을 " + secondNum + "로 나눈 몫은 "
	                        + share + "이고 나머지는 " + remain + "이다.");
		
		
		/*
		8. 쉬프트 연산자 ( <<, >>, >>> ) // 그래픽적인요소에 사용하는것 >>>
		  // <<, >> 은행권에서 많이 사용 : 연산속도가 매우 빠름
		  - 정수형 변수에만 사용이 가능하다.
		  - 피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다.
		  // 쉬프트 연산자를 하려면 2진수로 바꿔주어야한다. 
		  - 곱셈과 나눗셈을 할때 연산속도가 좋음으로 사용한다.
		  - << : x << n은 x*2^n의 결과와 같다.
		  - >> : x >> n은 x/2^n의 결과와 같다.
     	*/
		
		//1. byte타입의 변수 b7에 10을 저장해주세요
		byte b7 =10;
		
		//2. b7을 <<3 의 결과를 변수 result5에 저장해주세요. 출력
		int result5 = b7 << 3; // byte << int => int >> int => int
		System.out.println(result5);
		
		//3. b7을 >>3 의 결과를 변수 result6에 저장해주세요. 출력
		int result6 = b7 >> 3; // byte >> int => int >> int => int
		System.out.println(result6);
		
		
		
	}
}
