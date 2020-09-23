package a_variable;

public class Variable_02 {
	public static void main(String[] args) {
		/*
		1. 변수의 타입
		  - 변수를 선언할 때는 저장하려는 값의 특성을 고려하여 가장 알맞은 자료형을 선택해야 한다.
		  - 기본형타입(primitive type)   //값을 저장
		    : 실제값을 저장한다.
		    : 8가지 기본형
		  - 참조형타입(reference type)   //주소를 저장 4byte로 이루어 져있다.
		    : 주소를 저장한다.
		    : 8가지 기본형을 제외한 모든 타입
		    
		    
		2. 기본형 타입
		  - boolean, char, byte, short, int, long, float, double //8가지
		
		  - 자료형에 따른 분류
		    : 논리형 -> true 또는 false의 값을 저장할 수 있다. ex) boolean
		    : 문자형 -> 'A' ' ' (싱글쿼트) 문자하나를 저장할 수 있다. ex)char
		    : 정수형 -> 정수형 값을 저장할 수 있다. ex) byte, short, int, long
		           -> 대표 자료형은 int이다.
		    : 실수형 -> 실수형 값을 저장할 수 있다. ex) float, double
		           -> 대표 자료형은 double이다.
		 
		  - 자료형의 크기에 따른 분류
		    : 1byte -> boolean, byte
		    : 2byte -> char, short
			: 4byte -> int, float
			: 8byte -> long, double
		
		3. 논리형 - boolean 기본값 false
		   - boolean형은 true 또는 false의 값을 가질 수 있다.
		   - 조건부의 처리를 위해서 많이 사용한다. //true일때 or false일때
		   - 데이터를 다루는 최소단위가 1byte임으로 1byte의 크기를 가진다.
		
		
		*/
		
		//1. 변수 b1을 선언하고 false의 값으로 초기화 하여라.
		// 변수타입 변수명 = 값; 변수명이 b1이라하고 false로 값을 초기화하는데 필요한 변수타입 boolean
	
		boolean b1 = false; 
		
		/*
		4. 문자형 - char 
		  - char는 한 글자 단위의 문자를 나타내는 타입이며 'A'와 같이 작은 따옴표를 이용하여 나타낸다. 
		    //싱글쿼트 싱글퀘테이션
		  - char형을 표현하는 방식은 여러가지 있다.
		*/
		//1. 변수 alpha에  'B'를 저장해주세요
		// alpha를 'B' 문자를 저장해야하니까 char
		char alpha = 'A';       //; 를 찍어야 끝난다. // 10진수= 65 16진수 =41
		char alpha2 = '\u0041'; //  \뒤에있는것은 특수문자로 인지한다 = 유니코드 16진수 A를 뜻함
	    char alpha3 = 65;  //A가 10진수로 65이기때문에 A를 나타낸다 
		
	    System.out.println(alpha);
		System.out.println(alpha2);
		System.out.println(alpha3);
		
		/*
		5. 정수형 - byte, short, int, long
		  - 정수값을 저장하는데 사용된다.
		  - 대표자료형은 int이다.
		*/
		
		//1. 변수 a1에 120의 값을 저장해주세요
		byte a1 = 120;  //a1 = 120; 을 가지는 것 
		
		//2. 변수 b1에 20000의 값을 저장해주세요
		short b2 = 20000;
		
		//3. 변수 c1에 10억을 저장해주세요
		int c1 = 1000000000;
	
		//4. 변수 d1에 50억을 저장해주세요
		long d1 = 5000000000L;  //java는 기본적으로 4byte로 연산한다. 
		//기본적으로 int타입으로 인식하기 때문에 뒤에 L을 붙여서 long타입임을 인지시킨다
		
		//대표가 더블인경우에도 float으로 인식시키기위해 F를 붙여준다.
		
		
		/*
		6. 실수형
		  - float, double이며 대표 자료형은 double이다.
		  - 실수형 값을 저장하는데 사용된다.
		  - float : 1 + 8 + 23
		  - double : 1 + 11 + 52
		  - 실수형중 사용할 자료형을 선택할때는 값의 범위뿐만아니라 정밀도도 중요한 요소가된다.	
		*/
		
		//1. float형 변수 f2에 3.1415926535를 저장하여라.
		float f2 = 3.1415926535F;    //기본타입을 double로 갖기 때문에 F추가
		
		//2. double형 변수 d2에 3.1415926535를 저장하여라
		double d2 = 3.1415926532222225;
		
		//3. f2에 저장된 값을 출력하여라.
		System.out.println(f2);  //float는 소수점 7째자리 표현
		
		//4. d2에 저장된 값을 출력하여라.
		System.out.println(d2);  //double는 소수점 12번째자리까지 표현
		
		
		/*
		7. overflow : 정수형
		  - 변수자신이 저장할 범위를 넘었을때 최소값부터 다시 표현하는 현상
			
		*/
		
		byte b4 = 126;
		System.out.println(b4);
		b4++; //b4의 값을 하나 증가시킨다.
		System.out.println(b4);		
		b4++; //b4의 값을 하나 증가시킨다.
		System.out.println(b4); //-128이 나온다 
		//byte타입은 127까지 저장할수있다. 최대값보다 커지면 다시 최소값으로 돌아간다.
		//overflow
		
		/*
		8. String //대문자시작, 참조형이긴한데 기본형처럼 사용
		  - 문자열을 관리하기 위한 객체
		*/

		String name = "홍정기";  //무조건 문자열은 더블쿼드 사용
		
		String str = "=========--\n--------------";  
		// \뒤는 특수문자로 인식한다.
		// \n는 newline으로 만들어준다.
		System.out.println(str);
		
		String tap = "=========--\t--------------";  
		// \t tap만큼 띄워라
		System.out.println(tap);
		
		System.out.println("하이"+7); 
		//String과 int가 합쳐졋다. 
		//String이 더 쌔다 //타입이 같아야 더할수 있다.
		//String + int => String + String
		//하이7로 문자열로 바뀐다.
		
		
		//문자열을 합쳐서 "나의 이름은 홍정기 이다."를 만들어라
		System.out.println("나의 이름은 "+name+" 이다."); 
		
		
		int a = 10;
		int b = 20;
		//"a와 b의 값은 xx이다."를 표현하라.
		//10과 20의 값은 30이다.
		
		
		System.out.println(a+"과 "+b+"의 값은"+(a+b)+"이다"); 
		// 문자열이 되었기 때문에 괄호를 사용하면 괄호안의 계산이 먼저 이루어진다.
		// 배열속에서 괄호의 순서를 이용한다.
		
		/*
		9. 캐스팅(casting) : 형태를 바꾸어주는것 
		  - 변수 또는 리터럴의 타입을 다른 타입으로 변화하는 것이다.
		  - 기본형 타입간에 타입을 변경해 줄 수 있다.
		  - 정의방법
		    10.5; double타입에서 소수점을 없애고 싶을때 (int)10.5;로 해준다
		    (변수타입)값 또는 변수;		
		  - 모든 형변환에는 캐스트연산자를 이용한 형변환이 이루어 진다.
		        단. 값의 표현범위가 작은 자료형에서 큰자료형으로의 변환은 
		        값의 손실이 일어나지 않음으로 캐스트연산자를 생략할 수 있다.
		    byte --> short --> int --> long --> float --> double
		                        ^
		             char  ---- ^
		            
		       화살표의 방향으로 변환하는경우 캐스트 연산자를 생략할수 있다.   
		*/
		
		//1. 변수 d3에 59.25122의 값을 저장하여라.
		double d3 = 59.25122; //F가 안붙으면 double타입
		
		//2. 변수 d4에 d3의 정수부분만을 저장하여라.
		int d4 = (int)d3; 
		//double의 범위가 더 크기떄문에 int가 표현할수없다. 값의 손실이 일어날수 있다.
	
		//3. d4의 값을 출력하여라.
		System.out.println("d3의 정수값은 : "+d4);
		
		
		//1. 소문자 'g'를 ch2에 저장해주세요 //변수타입 변수명 값
		char ch2 = 'g'; 
		//char사용시에는 싱글쿼트사용 "" 와 ''에따라 타입이다르다.
		
		//2. int 형 변수 ch4에 ch2의 값을 저장해주세요.
		int ch4 = ch2; 
		//(변수타입)ch2을 안적어도 된다.이유는  char의 범위가 int속에 모두 들어가기때문에
		//char타입을 int타입으로 변형시키는것은 값의 손실이 일어날 일이 없다.
		//굳이 변수타입을 쓰지 않아도 된다.
		//byte->short->int->long->float->double
		//       char---^
		
		//3. ch4의 값을 출력해주세요.
		System.out.println("문자 g의 정수값은 : "+ch4);
		
		
		//1. int형 변수 b5에 888의 값을 저장해주세요
		int b5 = 888;
		
		//2. b5의 값을 byte형 변수 b6에 저장해주세요
		byte b6 = (byte)b5; //내가 바꾸고자 하는 타입을 적어준다. 내가 byte로 바꾸려고한다.
		
		//3. b6의 값을 출력해주세요
		System.out.println(b6); //값의 손실이 온다.
		
		
		//1. '뷁'의 값이 가지는 10진수값을 출력해주세요.
		char qwer = '뷁';
		int qwe = qwer; //(int)를 생략시켜도 된다.
		System.out.println(qwe);
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
