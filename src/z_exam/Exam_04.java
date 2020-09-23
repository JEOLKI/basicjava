package z_exam;

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		
		//연습문제 4-1
		//(1) 10 < x && x <20
		//(2) !(ch =='\u0000' && ch =='\t') ==> 공백을 나타냄
		//(3) ch == 'x' || ch == 'X'
		//(4) '0' <= ch && ch <= '9'
		//(5) 'A'<= ch && ch <= 'Z' || 'a'<= ch && ch <='z'
		//(6) powerOn == false //boolean형은 !(powerOn) 으로 표현가능하다.
		//(7) "yes".equal(str)
		
		
		
		//연습문제 4-2
		// int sum4_2 = 0;
		// 시작 : 1, 끝 : 20, 증가량 : 1
		// 반복구문 : sum4_2 += num4_2
//		int sum4_2 = 0;
//		for(int num4_2 = 1 ; num4_2 < 21 ; num4_2++){
//			sum4_2 += num4_2;
//		}		
		// 조건 2 또는 3의 배수가 아닌 수일때 더해준다 -> if 조건추가
		
		int sum4_2 = 0;			// sum의 기본값지정
		for(int num4_2 = 1 ; num4_2 < 21 ; num4_2++){	// 시작 1 끝 20 증가량 1
			if(!(num4_2%2 == 0 || num4_2%3 ==0)){		// 만약 2또는 3의 배수가 아니라면
				sum4_2 += num4_2;						// 더해줘라
			}	
		}
		System.out.println("sum4_2 : "+sum4_2);

		
		
		//연습문제 4-3   			//변수는 내가 필요할때 맞춰서 선언해준다.
		int dan = 2;          // 2단부터시작한다.
		while(dan < 10){      // 9단까지 반복한다
			int gob=1;          // 2*1부터 시작한다.      
			while(gob < 10){         // 2*9까지 반복한다.
				System.out.println(dan + " * "+gob +" = "+dan*gob);   // 출력한다.
				gob++; // 1증가시킨다.
			}
			dan++; // 단수를 높인다.
		}
		
		
		//연습문제 4-4
		for(int x = 1; x < 7; x++){     //주사위의 경우 시작: 1, 끝 : 6, 증가량 :1
			for(int y = 1; y < 7 ; y++){ // 한주사위가 1일때 다른주사위의 경우 시작:1, 끝:6, 증가량:1
				if(x + y == 6){		   // 두개의 합이 6일때
					System.out.println(x + " + " + y + " = " + (x+y)); //출력하라
				}
			}
			
		}

		
		//연습문제 4-5
		for(int x = 0; x < 11; x++){		// x의 시작 : 0, 끝:11, 증가량:1
			for(int y = 0; y < 11; y++){    // y의 경우 시작:0, 끝:11, 증가량:1
				if(2*x + 4*y == 10){		// 조건식이 맞으면 
					System.out.println("x="+x+" y="+y);		//출력하라
				}
			}
		}
		
		
		
		//연습문제 4-6
		Scanner sc4_6 = new Scanner(System.in); // 스캐너 생성
		System.out.println("startNum : ");			
		int x = sc4_6.nextInt();					
		System.out.println("finishNum : ");			 
		int y = sc4_6.nextInt();
		
		long mul = 1;							// 오버플로우가 발생할수 있으니 long타입으로 준다// 곱을 기본값으로 선언
		for(int startNum = x; startNum < y+1; startNum++){		// 시작 : startNum 끝: finishNum 증가량: startNum++
			mul *= x;							// 반복구문 : mul += startNum 
		}
		System.out.println(mul);				// 출력
		
		

		//연습문제 4-7
		int sum4_7 = 0;							// 문제를 보면 각 합들의 합
		int totalSum4_7 = 0;					// sum과 totalSum을 기본값으로 선언
		
		for(int count = 1; count < 11; count ++){   //10번 반복할것이다. 시작:1 끝:10 증가량:1
			sum4_7 += count;						//반복구문 : sum += x;
			totalSum4_7 += sum4_7;					//		   totalSum += sum;
		}
		System.out.println("totalSum4_7 : "+ totalSum4_7);
		
		//hint) 1. for2개  2.for 1개  3. 수학공식(등차수열) 4. 전체를 읽는방식 3번제외 방식으로 풀어오기
		
		
		
		//연습문제 4-8
		int count4_8 = 1;
		int sum4_8 = 0;
		int num4_8 = 1;
		int convert = 1;
		
		while(true){                        // 1. 반복횟수를 모른다
			sum4_8 += num4_8;				// 2. 어떤수를 계속적으로 더한다
			if(sum4_8 >= 100){				// 3. 만약 더한 총합이 100이상 이면
			   break;						// 4. 나가라
			}								// 5. 그렇지않으면
			count4_8++;						// 6. 수를 올리고	
			convert = -convert;				// 7. 부호를 바꾼다. (부호를 따로 해주지않으면 증가에서 수가 맴돌게된다)
			num4_8 = convert * count4_8;    // 8. 다음수는 수를 1증가시킨것의 부호가 바뀐것이다.
		}
		System.out.println("num4_8 : "+ num4_8);
		
		

		//연습문제 4-9
		Scanner sc4_9 = new Scanner(System.in);
		System.out.println("문제4_9 정수를 입력해주세요 : ");
		String num4_9 = sc4_9.next();
		
		int sum4_9 = 0;
		for ( int count = 0 ; count < num4_9.length(); count++ ){
			sum4_9 += num4_9.charAt(count)-'0';  //문자열에서 index번째의 값에서 '0'을 빼줌으로서 원하는 정수취득
		}
		System.out.println("sum4_9의 값은 : "+sum4_9);
		
		
		//연습문제 4-10
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		for(int count = 1; count < 9; count++){
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		System.out.println(num3);
		
		//1 1 2 3 5 8 13 21
		// 1과 1 이후 8번 증가  // 횟수시작:1  횟수끝: 8 증가량 :1
		// 1
		// 1 
		// 1+1=2
		// 1+2=3
		// 2+3=4
		// 반복구문 : num3 = num1 + num2;
		//          num1 = num2;
		//          num2 = num3;
		
		
		
		//연습문제 4-11
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i =0; i < value.length(); i++){			// 문자열의 시작부터 끝번째 까지
			ch = (value.charAt(i));						// 문자열의 해당 문자를 char
			if(!('0'<= ch && ch <= '9')){				// 문자열중 숫자가 아니면
				isNumber = false;						// isNumber = false이고
				break;									// 나가라
			}
		}
		if (isNumber){
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
		
		
		
		
		
		
		Scanner sc4_1 = new Scanner(System.in);
		while(true){
		//1. 사용자로부터 숫자하나를 받는다.
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		int numx = sc4_1.nextInt();
	
		//2. 사용자로부터 사칙연산자를 받는다.
		System.out.println("사칙 연산자를 입력해주세요 : ");
		String oper = sc4_1.next();  //문자열로 받아야한다.
		
		//3. 사용자로부터 숫자 하나를 받는다.
		System.out.println("두번째 숫자를 입력해주세요 : ");
		int numy = sc4_1.nextInt();
		
		//4. 연산결과를 출력해준다.
//		int result = 0;
//		switch(oper){
//		case "+" :
//			result = numx + numy;
//			System.out.println(numx + " + " + numy + " = "+ result);
//			break;
//		case "-" :
//			result = numx - numy;
//			System.out.println(numx + " - " + numy + " = "+ result);
//			break;
//		case "*" :
//			result = numx * numy;
//			System.out.println(numx + " * " + numy + " = "+ result);
//			break;
//		case "/" :
//			result = numx / numy;
//			System.out.println(numx + " / " + numy + " = "+ result);
//			break;
//		default :
//			System.out.println("연산종료");
//		}
		
		
		
		if("+".equals(oper)){
			System.out.println(numx + numy);
		} else if("-".equals(oper)){
			System.out.println(numx - numy);
		} else if("*".equals(oper)){
			System.out.println(numx * numy);
		} else if("-".equals(oper)){
			System.out.println(numx / numy);
		} else {
			System.out.println("종료합니다.");
			break;
		}
		}
		
		
		//5. 1~4의 내용을 사칙연산이 아닌 다른 문자를 넣었을때 종료하여라.
		
		
		
		//추가문제

		// "기러기" 앞으로해도 꺼구로해도 "기러기" true
		// "기찻길" 앞으로해도 뒤로해도 다르기때문에 false
		
		//6. 펠린드롬 문자열
		
		String str = "abcba";
		String temp = "";
		
//		temp = str.charAt(0) + temp ; // 새로운문자열 뒤에 붙어야한다  "a" + "" => "a"
//		temp = str.charAt(1) + temp ; // 새로운문자열 뒤에 붙어야한다  "b" + "a" => "ba"
//		temp = str.charAt(2) + temp ; // 새로운문자열 뒤에 붙어야한다  "c" + "bc" => "cba"
		
		for( int i = 0 ; i < str.length(); i++){
			temp = str.charAt(i) + temp ;
		}
		if(str.equals(temp)){
			System.out.println("펠린드롬");
		} else {
			System.out.println("팰린드롬이 아닙니다");
		}
		
		
		
		//7. 펠린드롬 정수형
		// 12321 으로도 확인하라. 
		// 뒤에부터 뽑을것이다
		// t = a%10 = 1 
		
		
		
		
		
		
		
		
	}
}
