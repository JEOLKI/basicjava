package h_javalang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Javalang_01 {
	public static void main(String[] args) {
		/*
		1. java.lang패키지
		  - java.lang패키지는 자바프로그래밍에 기본이 되는 클래스들을 포함하고 있다.
		    : String, System,....
		    
		    
		2. Object클래스
		  - Object클래스는 멤버면수없이 11개의 메서드만 가지고 있다.
		  
		  - equals(Object obj)
		    : 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값으로 알려준다.
		    : 참조변수에 저장된 주소값이 같은지를 판단할수 밖에 없다.
		 	: 주소값이 아닌 멤버변수의 값을 비교하기 위해서는 equals메서드를 오버라이드 해야된다.
		 	: equals메서드가 오버라이드 되어 있는 클래스들
		 	  ex) String, Date, File, wrapper클래스(기본형 8가지를 객체형태로 바꾼것)...
		 	  
		  - hashCode() - 10진수로 이루어져 있다.
		    : 객체의 주소값을 이용해서 해시코드를 만들어 반환한다.
		    : String클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록
		      hashCode메서드도 오버라이드 되어 있다.
		 
		  - toString()
		    : 알트쉬프트에스에스엔터
		    : 인스턴스에 대한 정보를 문자열로 제공할 목적으로 작성.
		    : 기본적인 toString()
		      return getClass() 클래스의정보를 읽어오는 역할
		      return getClass().getName() + "@" + Integer.toHexString(hashCode()); // 16진수로 변환
		    
		    : toSting메서드도 오버리아디 해서 사용한다.
		 
		 
		  - getClass()
		    : 자신이 속한 클래스의 Class객체를 반환하는 메서드 // 클래스의 정보를 저장하는 클래스 //반환타입 클래스
		    : Class객체를 얻는 방법
		      1) 생성된 객체로부터 얻는 방법
		      	Class obj = new Card().getClass();
		      2) 클래스 리터럴로부터 얻는 방법
		        Class obj = Card.class;
		      3) 클래스의 이름으로 부터 얻는 방법 // 많이 쓰인다.
		        Class obj = Class.forName("Card");
		        // 스트링타입으로 받을때면 오타등의 이유로 그클래스를 못찾는 오류가 생길수 있다.
		        // try catch 사용해야한다.		 
		 
		  - clone()
		    : 얕은복사
		    : 자신을 복제하여 새로운 인스턴스를 생성한다.
		    : 단순히 인스턴스변수의 값만을 복사한다.
		 
		 
		3. String 클래스 
		  - 다른 언어에서는 문자열을 char형의 배열로 다룬다.
		  - 문자열을 합치게 될때 새로운 문자열을 가진 String인스턴스가 생성된다.
		  
		  - 문자열 비교
		    : 문자열 리터럴을 지정하는 방식과 String클래스의 생성자를 이용하는 방법이 있다. //객체생성을해야한다.
		    : 문자열 리터럴은 클래스가 메모리에 로드될대 자동적으로 미리 생성된다. 
		    // 나중에 가져다 쓰는것 문자열이 같으면 한번만 로드하고 가져다쓴다 ==이 안되는이유
		  
		  - 문자 인코딩 변환
		    : 한글 윈도우의 경우 문자 인코딩 CP949 타입
		    : 이클립스의 문자 인코딩 MS949 타입
		 	: 한글이 들어간 경우 UTF-8을 사용햇다
		 	
		  - String.format
		    : 기본값을 String으로 변환.
		    
		    
		    1) 빈 문자열을 더하는 방식
		       int a = 10;
		       String b = a + ""; //메모리를 많이 차지한다.
		       
		       
		    2) valueOf를 이용하는방법
		       int a = 10;
		       String b = String.valueOf(a); // a를 문자열로 바꿔준다..
		 	
		 	: String을 기본형 값으로 반환.
		 	
		 	  1) wrapper클래스를 이용하는 방식 
		 	     String str = "100";
		 	     int a = Integer.parseInt(str); //문자열을 인트값을 변환해주는것.
		 	     int a = Integer.valueOf(str);  //모두사용하기위해 valueOf를 만들었다.
		 	     
		 	     
		 	     String str2 = "200";
		 	     int a = Integer.parseInt(str2,16);  // str2이 16진수입니다.
		 	     
				 String str2 = "10100";
				 int a = Integer.parseInt(str2, 2); //str2가 2진수입니다. 
				 System.out.println(a);     // 진수로 변경해주는것은 없다.
		 
		 
		4. StringBuffer, StringBuilder
		  - String클래스는 인스턴스를 생성할때 지정된 문자열을 변경할 수 없다.
		  - 문자열의 변경을 위해서는 StringBuffer클래스를 이용한다. 
		
		 
		5. Math클래스
		
		6. wrapper클래스
		  - 객체지향 개념은 모든것을 객체로 다루어야 한다.
		  - 8가지 기본형은 객체로 다루지 않는다.
		  - 때로는 기본형 변수도 어쩔수 없이 객체로 다루어야 하는 경우가 있다.
		    : 매개변수로 객체를 요구할때
		    : 기본형이 아닌 객체로 저장되어야 할때.
		    
		    void method(Object obj){
		    	Vector v = new Vector();
		    }
		    
		         기본형          |   wrapper클래스
		    boolean  |   Boolean
 		    char     |   Character ***
		    byte     |   Byte
		    short    |   Short
		    int      |   integer ***
		    long     |   Long
		    float    |   Float
		    double   |   Double
		    
		  - 오토박싱(Auto-Boxing) : 기본형 값을 래퍼클래스의 객체형태로 변환해 주는 기술
		  - 언박싱(unBoxing) : 래퍼클래스의 객체형태를 기본형값으로 변환해 주는 기술
		    
		    
		7. 정규식(Regular Expression) //찾아내서 바꿈 필터같은것
		  - 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을 찾아내기 위해 사용하는 것.
		  - 정규식의 구성
		    : 패턴을 알아야함 << 패턴을 정의 하는것  : Pattern 클래스를 이용해서 정규식을 정의 한다.
		    : 텍스트와 확인작업 << Matcher (매칭해주는 녀석 ) 클래스를 이용해서 Pattern과 데이터를 비교한다.
		
		  - 패턴만드는방법
		    ^ : 문자열의 시작              예) ^a
		    $ : 문자열의 끝                 예) b$
			. : 임의의 한문자 모든문자가능  단. '\'는 넣을수 없다.
			* : 문자가 없을수도 무한정 있을수도 있다.
			+ : 앞 문자가 하나이상     예) [a-z]+
			? : 앞 문자가 없거나 하나
			[] : 문자의 집합이나 범위를 나타낸다. 예) [abd]하나만 있음된다 [a-z] a~z까지 -기호를 이용하여 범위를 나타낸다. 
			     [^] 의 ^은  not의 의미를 가진다.
			{} : 반복횟수 또는 반복범위를 나타낸다. {2,3} {2}
		    () : 소괄호 안의 문자를 하나의 문자로 인지한다.
		    |  : 패턴안에서 or 연산을 수행할때 사용
		    \s : 공백문자                                          예)\\s
			\S : 공백문자를 제외한 모든문자.      예)\\S
			\w : 알파벳이나 숫자  = [A-Za-z0-9] 대문자 소문자 숫자중의 하나
			\W : 알파벳이나 숫자를 제외한 모든 문자
			\d : 숫자를 의미 [0-9]까지를 의미
			\D : 숫자를 제외한 문자
		
		Pattern p = Pattern.compile("[a-z]*"); //영어 소문자만들어온다   *:앞에있는문자가 0개이거나 여러번 반복될수 있다.
		Matcher m = p.matcher("asdfasdf");
		
		System.out.println(m.matches());  //boolean 타입의 결과를 주는 메서드
		
		
		
		*/
		
		
		
		
		
		
		
		
		
	}
}
