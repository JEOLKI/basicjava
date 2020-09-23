package z_exam;

public class Exam_03 {
	public static void main(String[] args) {
		
		//연습문제 3-1
		byte b = 10;
		char ch = 'A';
		int in = 100;
		long lo = 1000L;
		
		b = (byte) in;     // int -> byte 생략불가
		ch = (char) b;     // byte -> char 생략불가
		short s = (short) ch;  // char -> short 생략불가
		float f =  lo;  // long -> float 생략가능
		in =  ch;       // char -> int 생략가능
		
		
		//연습문제 3-2
		int x = 2;
		int y = 5;
		char c = 'A';  //A의 문자코드는 65
		System.out.println(1 + x <<33);
		// 같은 산술연산자 왼쪽부터 차례대로
		// (1+2)<<33 -> 3<<33 -> 3*2^33 -> int는 32칸이 최대이므로 원래대로 돌아간다 -> 3*2^1 -> 6
		System.out.println(y >= 5 || x < 0 && x >2 );
		// 비교연산자 -> 논리연산자 ( && -> ||)
		// true || false && false -> true || flase -> true
		System.out.println(y += 10 - x++); 
		// 증감연산자 -> 대입연산자 순서  => y += 10-2 -> y = y + 8; -> 13 // x = 3, y = 13
		System.out.println(x+=2); // x = x + 2; -> 3 + 2 = 5  // x = 5
		System.out.println(!('A' <= c && c <= 'Z'));
		// 괄호 -> 비교연산자 -> 논리연산자
		// !(true && true) -> !true -> flase
		System.out.println('C'-c); // char - char -> int - int -> 67 -65 = 2 
		System.out.println('5'-'0'); // char - char -> int - int -> 53 - 48 = 5
		System.out.println(c+1); // char + int -> int + int -> 65 + 1 = 66
		System.out.println(++c); // ++c -> 증감 후 결과 -> B  // c = B
		System.out.println(c++); // c++ -> 결과 후 증감 -> 결과 : B , c = C
		System.out.println(c);   // c = C
		
		
		//연습문제 3-3
		int num = 10;
		String result = num > 0 ? "양수" : num < 0 ? "음수" : "0";
//		String result = num < 0 ? "음수" : num == 0 ? "0" : "양수";
		// num가 음수인가 ? "음수" : ======
		//                      num==0 ? "0" : "양수";
		//결과가 String 이기때문에 String에 저장
		System.out.println(result);
		
		
		
		
		//연습문제 3-4
		int apples = 123;
		int bucket = 10;
		int numOfBucket = apples/bucket + (apples%bucket>0 ? 1 : 0);
		//                                 apples%bucket==0 ? 0 : 1
		// 바구니에 10개의 사과를 담아야 하고 남은것이 1개이상일때에도 바구니 하나가 더 필요하다
		// 사과를 10개를 나눠담을 바구니의 수 + 남은것을 담을 바구니
		// 남은것을 담을 바구니의 경우를 알아야함 apples%bucket가 1개이상 이면 하나추가 아니면 필요없다.
		System.out.println("필요한 바구니의 수 :" + numOfBucket);
		
		
		//연습문제 3-5
		int num1 = 456;
		int result1 = num1 - num1%100;
		// 백의 자리 이하를 버린다 => 백으로 나눈 나머지의 값을 빼준다.
		// num/100 x 100; 
		// 정수있는것에 내가 보고싶은 자리까지만 보고싶다면 
		// 그것의 자릿값인 10의 배수로 나눈 몫을 다시 자리값으로 곱해주면 된다.
		System.out.println(result1);
		
		
		//연습문제 3-6
		byte a3_6 = 10;
		byte b3_6 = 20;
		byte c3_6 = (byte) (a3_6 + b3_6);
		// a 와 b가 둘다 4byte보다 작으므로 4byte인 int형으로 변형되어 계산된다 
		// byte에 저장하기위해 변수변형을 시켜주어야한다
		// byte + byte -> int + int -> (byte)(int+int);
		System.out.println("c3_6 : "+c3_6);
		
		char ch3_6 = 'A';
		ch3_6 += 2;
		// ch3_6 = (char)(ch3_6 + 2);
		// 타입을 그대로하기위해 op=사용
		// A에서 C의 차이 많큼 더해준다. 99-65
		System.out.println("ch3_6 : "+ch3_6);
		
		float f3_6 = (float)3/2;
		// int/int -> int  => float/int -> float/float ->float
		System.out.println("f3_6 : "+f3_6);
		
		long l3_6 = (long)3000* 3000* 3000;
		System.out.println("l3_6 : "+l3_6);

		float f2 = 0.1f;
		double d = 0.1;
		boolean result3_6 = (float)d==f2;
		// double은 소수점이 근사치를 갖기때문에 float이랑다르다
		// 소수점이 0인 형태는 같다. 10.0f == 10.0
		// 소수점이 0.5 인형태는 != 이성립하지 않기때문에 형변환을 해준다
		System.out.println("result3_6 : "+result3_6);
		
		
		
		//연습문제 3-7
		int num3_7 = 24;
		int result3_7 = 10 - num3_7%10;
		System.out.println("result3_7 : "+result3_7);
		// 30 - 24 = 6
		// 20 - 19 = 1
		// 90 - 81 = 9 
		// 결과값은 10을 넘지 않는다.
		// 10에서 num의 나머지를 뺀것이 결과값이다.
		
		// 다른풀이 
		// (num/10+1)-num
		// 10의 자리만 뽑아서 하나를더한다. 10의자리로변경루 -num해준다.
		
		
		
		//연습문제 3-8
		int fahrenheit = 100;
		float formula = (float)5/9*(fahrenheit-32);
		float celcius = (int)(formula*100+0.5)/100F;
		// 소수점 3번째자리를 첫자리로 만들기위해 100을 곱해준다 //*100
		// 반올림을위해 0.5를 더해준다 // + 0.5
		// int로 캐스팅하면 소수점이사라짐 // (int)
		// 다시 소수점으로 바꿔준다 // /100F		
		System.out.println("fahrenheit : " + fahrenheit);		
		System.out.println("Celcius : " + celcius);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
	}
	
}

