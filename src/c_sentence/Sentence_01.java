package c_sentence;

import java.util.Scanner;

public class Sentence_01 {
	public static void main(String[] args) {
		/*
		1. 조건문 ( if, switch-case )
		  - 조건식과 수행될 문장을 포함하는 블럭{} 으로 구성되어있다.
		  - 조건식의 연산결과에 따라 프로그램의 실행흐름을 변경할 수 있다.
		
		2. if문
		  - 구조 
		    1) 기본
		       if(조건식){
		                  조건식이 true일때 수행될 문장.
		       }
		    
		    2) 변형
		       if(조건식){
		                  조건식이 true일때 수행될 문장.
		       } else {
		                  조건식이 false일때 수행될 문장.
		       }
		    
		    3) 완성형
		       if(조건식1){
		                  조건식1이 true일때 수행될 문장.
		       } else if(조건식2){
		                  조건식1이 false이고 조건식2가 true일때 수행될 문장.         
		       } else {
		                  조건식1과 조건식2가 모두 false일때 수행될 문장.
		       }

		
		
		*/
		
		//1. 변수 power를 선언하고 true의 값으로 초기화 하여라.
		boolean power = true;
		
		//2. power의 값이 true이면 "켜져있습니다."를 출력하여라.
		if(power == true){
			System.out.println("켜져있습니다.");
		}
		// 기본모양잡고 조선식넣고 실행문넣고
		
		//3. power의 값이 true이면 "켜져있습니다."를 출력하여라.
		//   false 이면 "꺼져있습니다."를 출력하여라.
		if(power){
			System.out.println("켜져있습니다.");
		} else {
			System.out.println("꺼져있습니다.");
		}
		// boolean 타입이라 ==true 생략
		// if()이면 수행하고 else아니면 수행하라
		
		//문제 2-14
		boolean power2_14 = true;
		if( power2_14 == true ){
			System.out.println("power2_14 : "+power2_14);
		}
		
		
		//문제  2-15
		Scanner sc = new Scanner(System.in);
		System.out.println("2-15문제 정수 입력해주세요 : ");
		int input2_15 = sc.nextInt();
		if(input2_15 % 2 == 0){
			System.out.println("2의 배수입니다.");
		} else {
			System.out.println("2의 배수가 아닙니다.");
		}
		
		
		
		//문제 2-16
		int score = (int)(Math.random()*101+0);
		System.out.println(score);
		if( 90 <= score ){
			System.out.print("A");
			if( 95 <= score){
				System.out.println("+");
			} else {
				System.out.println("-");
	        }
		} else if ( 80 <= score ){
			System.out.println("B");
			if( 85 <= score ){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if ( 70 <= score ){
	     	System.out.println("C");
	     	if ( 75 <= score ){
	     		System.out.println("+");
			} else {
				System.out.println("-");
			}
	    } else if ( 60 <= score ){
	     	System.out.println("D");
	    } else {
	    	System.out.println("F");
	    }
 		
		// 0포함 ~ 100포함 => 0포함 ~ 101미포함
		
		
		/*
		3. switch-case
		  - 조건의 경우의 수가 많을때는 if문 보다는 switch문을 사용하는 것이 
		        더 간결하고 알아보기 쉽다., 
		  - 조건의 결과로 int형 범위의 정수값을 허용한다.
		  - 구조 
		     switch(조건식){
		     	 case 값1 :
		     	 	 조건식과 값1이 같을때 수행될 문장.
		     	 	 break;
		     	 case 값2 :
		     	 	 조건식과 값2이 같을때 수행될 문장.
		     	 	 break;
		     	 default :
		     	 	 조건식과 만족하는 값이 없을때 수행되는 문장.
		     }
		 
		 
		*/
		
		//문제 2-17
		int random = (int)(Math.random()*(6-1)+1);
		System.out.println("당첨번호 : "+ random);
		switch (random){
		case 1 :
			System.out.println("32평 아파트 당첨");
			break;
		case 2 :
			System.out.println("자동차 당첨");
			break;
		case 3 :
		   	System.out.println("노트북 당첨");
			break;
		case 4 :
		    System.out.println("자전거 당첨");
		    break;
		default :
		    System.out.println("다음 기회에");
		}		
		
		
		// 문제 2-18 
		int score2_18 = (int)(Math.random()*101+0);
		String grade2_18 = "";
		switch (score2_18/10){
		case 10 : case 9 :
			grade2_18 = "A";
			break;
		case 8 :
			grade2_18 = "B";
			break;
		case 7 :
			grade2_18 = "C";
			break;
		case 6 :
			grade2_18 = "D";
			break;
		default :
			grade2_18 = "F";
		}
		System.out.println("grade : "+grade2_18);
		
		
		int score2_18_2 = (int)(Math.random()*101+0);
		switch (score2_18_2/10){
		case 10 : case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}
		
		
		//받을 환경을 조성하는것.
		Scanner sc2 = new Scanner(System.in);  //뭘입력하든 받을준비가 되었다. scanner 참조형
		System.out.println("입력해주세요 : ");
//		String input = sc.next();             //입력한 내용 (문자형)를 next가 받아서 input에 넣어준다
//		System.out.println(input);            //실행하고 입력한후 엔터
		
		int input = sc2.nextInt();// 인트형을 받아주는것  nextInt. 숫자만 받는다 숫자 이외의것을 쓰면 에러남
		System.out.println(input);// 인트범위까지만 받는다.
		
	
		
		
		
		
		
		
		
		
		
	}
	
}
