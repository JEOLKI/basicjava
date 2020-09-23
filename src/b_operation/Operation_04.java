package b_operation;

public class Operation_04 {
	public static void main(String[] args) {
		/*
		1. 비트연산자 ( &, |, ^)
		  - 이진 비트연산을 수행한다.
		  - 실수형을 제외한 모든 자료형에 사용 가능하다.
		  
		  		  
		 | (OR연산자) : 피연산자중 한 쪽의 값이 1이면 1의 결과를 얻는다. 그 외에는 0
		 & (AND연산자): 피연산자 모두 1일때 1의 결과를 얻는다.
		 ^ (XOR연산자): 피연산자의 값이 서로 다를때만 1의 결과를 얻는다.
						
		*/
		int a = 3;
		int b = 5;
		
		System.out.println("3|5 : "+(3|5));
		System.out.println("3&5 : "+(3&5));
		System.out.println("3^5 : "+(3^5));
		
		
		
		/*
		2. 논리연산자 ( &&, || ) //AND결합, OR결합, ^^는없다.
		  - 피연산자로 boolean 값 또는 boolean 형 변수를 필요로 한다.
		  - 조건문과 반복분에서 조건식 간의 결합에 사용한다.
		  - '&&' 이 '||' 보다 연산우선순위가 높다. 같이 있을때
		  
		    || (OR결합) : 피연산자중 어느 한쪽만 true이면 true의 결과를 얻는다.
		    && (AND결합): 피연산자 양쪽 모두 true이면 true의 결과를 얻는다.

		*/
		//1. 변수 b1을 true의 값으로 초기화해주세요
		boolean b1 = true;
		
		//2. 변수 b2를 false의 값으로 초기화해주세요
		boolean b2 = false;
		
		//3. b1 그리고 b2의 결과를 출력해주세요
		System.out.println("b1 그리고 b2의 결과는 : "+(b1 && b2));
		
		//4. 변수 b3를 10의 값으로 초기화해주세요
		int b3 = 10;
		
		//5. b3의 값이 2의 배수일때 true의 결과를 출력하도록 만들어주세요 //2의 배수가아니면 false
		boolean b4 = b3%2==0;  //조건식을만드는것 true또는 false만 나오는 것으로 만드는것
		System.out.println(b4);
		
		//6. b3의 값이 3의 배수일때 true의 결과를 출력하도록 만들어주세요
		boolean b5 = b3%3==0;
		System.out.println(b5);
		
		//7. b3의 값이 2또는 3의 배수일때 true의 결과를 출력하도록 만들어주세요.
		boolean b6 = b3%2==0 || b3%3==0;
		System.out.println(b6);
		
		
		//문제 2-11
		char ch01 = 'A';
		
		boolean ch02 = 'A'<=ch01 && ch01<='Z';
		// 영어대문자의 수학적 범위 부터 지정 'A'<= 영어대문자 <='Z'
		// 코드형식으로 변형 'A'<=영어대문자 && 영어대문자 <='Z'
		// 변수지정
		
		boolean ch03 = 'a'<=ch01 && ch01<='z';
		// 'a' <= 영어소문자 <= 'z'
		
		boolean ch04 = 'A'<=ch01 && ch01<='Z'  ||  'a'<=ch01 && ch01<='z';
		// 영어대문자 또는 영어소문자
		// 'A'<=ch01 && ch01<='Z'  또는  'a'<=ch01 && ch01<='z'
		// 'A'<=ch01 && ch01<='Z'  ||  'a'<=ch01 && ch01<='z'
		
		boolean ch05 = '0' <= ch01 && ch01 <= '9';
		//변수 ch01의 값이 숫자형일때 true인 조건식을 작성하여 출력하여라.
		// char형은 단 한글자만 담을수 있다 
		// 0~9까지 밖에 담지 못한다
		// '0' <= ch01 <= '9' // char형 이니까 숫자형태의 문자로 적어준다.
		// 코드형식으로 변경 '0' <= ch01 && ch01 <= '9'
		
		//한글의 범위 가~힣 까지이다
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
