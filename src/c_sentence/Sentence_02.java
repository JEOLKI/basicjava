package c_sentence;

import java.util.Scanner;

public class Sentence_02 {
	public static void main(String[] args) {
		/*
		1. 반복문 ( for, while, do-while )
		  - 어떤 작업이 반복적으로 수행되도록 할때 사용된다.
		  - 반복문은 주어진 조건을 만족하는 동안 주어진 문장을 반복적으로 수행함으로 
		        조건식을 포함한다. 
		  - for문은 주로 반복횟수를 알고 있을때 while문은 반복횟수를 알수없을때 많이 사용한다.
		  
		2. for문
		  - 기본구조
		    for(초기화;조건식;증감식){
		    	조건식이 true일때 수행될 문장
		    }  
		
		*/
				
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);

		// 1. 시작 : 0, 끝 : 10, 증가량 : 1
		// 반복구문 : System.out.println();
		for( int count = 0 ; count < 11 ; count++ ){
			System.out.println(count);
		}
		
		//while로 변형
//		int count = 0
//		while(count < 11){
//			System.out.println(count);
//			count++;
//		}
		
		//1. 4~75까지의 합계를 구하여라
		
		/*
		int sum = 0; //합계를 저장할 sum 선언
		
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		     :
		     :	 
		sum = sum + 75;
		
		시작 : 4, 끝 : 75 , 증가량 : 1 // 초기화 = 4 ; 조건식 ; 증감식
		반복구문 : sum += count
		*/
		
		int sum = 0;
		for( int count = 4 ; count <76 ; count++ ){
			sum += count; 
		}
		System.out.println(sum);
		
		//while로 변형
//		int sum = 0;
//		int count = 4;
//		while(count < 76){
//			sum += count;
//			count++;
//		}
//		System.out.println(sum);
		
		//1. 3 ~ 55까지 홀수의 합계를 구하여라
		/*
		int sum2 = 0; 
		
		if(3%2 == 1;){sum2 += 3;}
		if(4%2 == 1;){sum2 += 4;}
		if(5%2 == 1;){sum2 += 5;}
		if(6%2 == 1;){sum2 += 6;}
		    :
		    :
		if(55%2 == 1;){sum2 += 55;}
		
		시작 : 3, 끝 : 55, 증가량 : 1
		반복구문 : sum2 += count
		count의 조건 : count%2 == 1
		
		//반복구문 : if(count%2 == 1){
				      sum2 += count;
			       }
		
		*/
		int sum2 = 0;
		for( int count = 3 ; count < 56 ; count++ ){
			if(count%2 == 1){
				sum2 += count;
			}
		}
		System.out.println(sum2);
		
		//while변형
//		int sum2 = 0;
//		int count = 3;
//		while(count < 56){
//			if(count%2 == 1){
//				sum2 += count;
//			}
//			count++
//		}
		
		
		
		// 0~100점사이의 임의의 정수값을 5번출력하세요
		
		System.out.println((int)(Math.random()*101));
		System.out.println((int)(Math.random()*101));
		System.out.println((int)(Math.random()*101));
		System.out.println((int)(Math.random()*101));
		System.out.println((int)(Math.random()*101));
	
		//반복구문 : System.out.println((int)(Math.random()*101));
		
		for( int count = 0 ; count < 5 ; count++ ){
			System.out.println((int)(Math.random()*101));
		}
		
		//무작정 5번 수행
//		int ran1 = (int)(Math.random()*101);
//		System.out.println(ran1);
		
		for( int count = 0 ; count < 5 ; count++ ){
			int ran1 = (int)(Math.random()*101);
			System.out.println(ran1);
		}
		
		
		
		// 2 * 1 = 2*1
		// 2 * 2 = 2*2
		// 2 * 3 = 2*3
		// 2 * 4 = 2*4
		// 2 * 5 = 2*5
		// 2 * 6 = 2*6
		// 2 * 7 = 2*7
		// 2 * 8 = 2*8
		// 2 * 9 = 2*9
		
//		System.out.println(2+" * "+1+" = "+2*1);
//		System.out.println(2+" * "+2+" = "+2*2);
//		System.out.println(2+" * "+3+" = "+2*3);
//		System.out.println(2+" * "+4+" = "+2*4);
//		System.out.println(2+" * "+5+" = "+2*5);
//		System.out.println(2+" * "+6+" = "+2*6);
//		System.out.println(2+" * "+7+" = "+2*7);
//		System.out.println(2+" * "+8+" = "+2*8);
//		System.out.println(2+" * "+9+" = "+2*9);
		
		//시작 : 1 , 끝 : 9 , 증가량 : 1
		//반복구문 : System.out.println(2+" * "+ x +" = "+2*x);
		
		int a = 2;
		for(int count = 1; count < 10 ; count++){
			System.out.println(a+" * "+count+" = "+a*count);
		}
		
//		System.out.println(3+" * "+1+" = "+3*1);
//		System.out.println(3+" * "+2+" = "+3*2);
//		System.out.println(3+" * "+3+" = "+3*3);
//		System.out.println(3+" * "+4+" = "+3*4);
//		System.out.println(3+" * "+5+" = "+3*5);
//		System.out.println(3+" * "+6+" = "+3*6);
//		System.out.println(3+" * "+7+" = "+3*7);
//		System.out.println(3+" * "+8+" = "+3*8);
//		System.out.println(3+" * "+9+" = "+3*9);
		
		int b = 3;
		for( int count = 1 ; count < 10 ; count++ ){
			System.out.println(b+" * "+count+" = "+b*count);
		}
		
//		System.out.println(4+" * "+1+" = "+4*1);
//		System.out.println(4+" * "+2+" = "+4*2);
//		System.out.println(4+" * "+3+" = "+4*3);
//		System.out.println(4+" * "+4+" = "+4*4);
//		System.out.println(4+" * "+5+" = "+4*5);
//		System.out.println(4+" * "+6+" = "+4*6);
//		System.out.println(4+" * "+7+" = "+4*7);
//		System.out.println(4+" * "+8+" = "+4*8);
//		System.out.println(4+" * "+9+" = "+4*9);

		int c = 4;
		for( int count = 1 ; count < 10 ; count++ ){
			System.out.println(c+" * "+count+" = "+c*count);
		}
		
//		System.out.println(5+" * "+1+" = "+5*1);
//		System.out.println(5+" * "+2+" = "+5*2);
//		System.out.println(5+" * "+3+" = "+5*3);
//		System.out.println(5+" * "+4+" = "+5*4);
//		System.out.println(5+" * "+5+" = "+5*5);
//		System.out.println(5+" * "+6+" = "+5*6);
//		System.out.println(5+" * "+7+" = "+5*7);
//		System.out.println(5+" * "+8+" = "+5*8);
//		System.out.println(5+" * "+9+" = "+5*9);
		
		int d = 5;
		for( int count = 1 ; count < 10 ; count++ ){
			System.out.println(d+" * "+count+" = "+d*count);
		}
		
//		System.out.println(6+" * "+1+" = "+6*1);
//		System.out.println(6+" * "+2+" = "+6*2);
//		System.out.println(6+" * "+3+" = "+6*3);
//		System.out.println(6+" * "+4+" = "+6*4);
//		System.out.println(6+" * "+5+" = "+6*5);
//		System.out.println(6+" * "+6+" = "+6*6);
//		System.out.println(6+" * "+7+" = "+6*7);
//		System.out.println(6+" * "+8+" = "+6*8);
//		System.out.println(6+" * "+9+" = "+6*9);
		
		int e = 6;
		for( int count = 1 ; count < 10 ; count++ ){
			System.out.println(e+" * "+count+" = "+e*count);
		}
		
//		System.out.println(7+" * "+1+" = "+7*1);
//		System.out.println(7+" * "+2+" = "+7*2);
//		System.out.println(7+" * "+3+" = "+7*3);
//		System.out.println(7+" * "+4+" = "+7*4);
//		System.out.println(7+" * "+5+" = "+7*5);
//		System.out.println(7+" * "+6+" = "+7*6);
//		System.out.println(7+" * "+7+" = "+7*7);
//		System.out.println(7+" * "+8+" = "+7*8);
//		System.out.println(7+" * "+9+" = "+7*9);
		
		int f = 7;
		for( int count = 1 ; count < 10 ; count++ ){
			System.out.println(f+" * "+count+" = "+f*count);
		}
		
//		System.out.println(8+" * "+1+" = "+8*1);
//		System.out.println(8+" * "+2+" = "+8*2);
//		System.out.println(8+" * "+3+" = "+8*3);
//		System.out.println(8+" * "+4+" = "+8*4);
//		System.out.println(8+" * "+5+" = "+8*5);
//		System.out.println(8+" * "+6+" = "+8*6);
//		System.out.println(8+" * "+7+" = "+8*7);
//		System.out.println(8+" * "+8+" = "+8*8);
//		System.out.println(8+" * "+9+" = "+8*9);
		
		int g = 8;
		for( int count = 1 ; count < 10 ; count++ ){
			System.out.println(g+" * "+count+" = "+g*count);
		}
		
//		System.out.println(9+" * "+1+" = "+9*1);
//		System.out.println(9+" * "+2+" = "+9*2);
//		System.out.println(9+" * "+3+" = "+9*3);
//		System.out.println(9+" * "+4+" = "+9*4);
//		System.out.println(9+" * "+5+" = "+9*5);
//		System.out.println(9+" * "+6+" = "+9*6);
//		System.out.println(9+" * "+7+" = "+9*7);
//		System.out.println(9+" * "+8+" = "+9*8);
//		System.out.println(9+" * "+9+" = "+9*9);
		
		int h = 9;
		for( int count = 1 ; count < 10 ; count++ ){
			System.out.println(h+" * "+count+" = "+h*count);
		}
		
		
		// 시작 : 2, 끝 :9, 증가량 : 1
		// 반복구문 : for( int count = 1 ; count < 10 ; count++ ){
//						System.out.println(x+" * "+count+" = "+x*count);
//						}
		
		for(int dan = 2 ; dan < 10 ; dan++ ){
			for( int count = 1 ; count < 10 ; count++ ){
				System.out.println(dan+" * "+count+" = "+dan*count);
				}
		}
		
		//while로변형
		int dan = 2;
		while(dan < 10){
			int count = 1;
			while(count < 10){
				System.out.println(dan+" * "+count+" = "+dan*count);
				count++;
			}
			dan++;
;		}
		
		
		
		/*
		3. while
		  - 조건식과 수행해야할 블럭{}으로 구성되어 있다.
		  - 기본구조
		    while(조건식){
		    	조건식이 true일때 수행될 문장
		    }
		*/
		for(int count=0 ; count<10 ; count++){
			System.out.println(count);
		}
		int count = 0;
		while(count < 10){
			System.out.println(count);
			count++;
		}

		//while은 변수를 계속 유지하기 때문에 필요한경우에만 사용하는게 좋다.
		
		// 4 ~ 15 까지의 합계를 구해주세요
		// int sum3 = 0
		// sum3 += 5
		// sum3 += 6
		// ... sum3 += 15
		
		// 시작 : 4, 끝 15 증가량 1
		// 반복구문 sum3 += count2;
		
		int count2 = 4;
		int sum3 = 0;
		while(count2 < 16){
			sum3 += count2;
			count2++;
		}
		System.out.println(sum3);
		
		// 앞에서한것 while로 바꿔보기 복습
		
		// 1~?까지의 합을 구할때 합이 100이상이 되는?의 값은 몇일까요?
		
		// 1 2 3 4 5 6 ----?
		
		// sum4 += 1
		// sum4 += 2
		//... sum4 += ?
		// 시작 : 1 끝 : ? sum4 > 99  증가량 : 1
		// 조건은 문제에서 주어진 합이 100이상이되는것을 생각.
		// 반복구문 : sum4 += count4
		
	
//		int count3 = 0;
//		int sum4 = 0;  // ctrl + shift + b  디버깅모드 
//		
//		while(sum4 < 100){
//			count3++;
//			sum4 += count3;
//		}
//		
		
		// 직관적으로 변경
		// 반복횟수를 모를때 사용하는 while 
		int count3 = 1;
		int sum4 = 0;
		
		while(true){
			sum4 += count3;
			if(sum4 >= 100){
				break;//나가라
			}
			count3++; //그렇지 않은경우 증가
		}
		System.out.println(count3);
		// 무한으로 도니까 중간에 나갈수있는 구멍을 만들어줘야한다 
		// sum4가 100이상이되면 나가도록 
		
		
		
		String str = "bdf";  // 순서대로 b->0 d->1 f->2
		char c1 = str.charAt(0); // 인덱스
		System.out.println(c1);
		int c2 = str.length(); // str 문자열의 길이 측정
		System.out.println(c2);
		
		
		
		
		/*
		4. do-while문
		  - while문의 변형으로 기본구조는 while 문과 같으나 블럭{}을 먼저 수행하고
		  	조건식을 판단한다. => 최소 1회는 블럭{}을 수행해야 한다.
		  
		  - 기본구조
		    do{
		    	수행될 문장...
		    } while();
		  
		  
		*/
		
		//1. 사용자로부터 문자열을 입력받는다.
		//   사용자로부터 받은 문자열을 출력한다.
		//   단. 사용자가 exit를 입력하면 반복문을 나간다.
		
		Scanner sc = new Scanner(System.in);
		String strDo = "";
		do{
			System.out.println("문자열을 입력해주세요. exit를 입력시 종료됩니다.");
			strDo = sc.next();					//받는문장이 밖에있으면 받는것이 반복이 안된다.
			System.out.println(str);
		} while(!"exit".equals(strDo));  		//문자열을 비교하기위해서는 equals을 사용한다.
		//기본연산자보다 .으로 연결된것이 우선순위가 높다.
		//str이 밖에 선언이 되어있어야 {}안에만 있으면 인지하지 못한다.
		//exit가 아니면 반복하라//조건식
		
		
//		for(int i = 4; i < 24; i++){
//			if(i%2==0){
//				System.out.println(i);
//			}
//		}
	
		for(int i = 4; i < 24 ; i++){
			if(i%2==1){						// 2 의배수가 아닌가
				continue;  					// (조건에 맞으면) 다시 위로이동
			}
			System.out.println(i); 			// 2의 배수이면 출력하라.
		}
		

		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}
}
