package c_sentence;

import java.util.Scanner;

public class Sentence_99 {
	public static void main(String[] args) {
		
		//예제 2-13
		for(int i = 0; i<3 ; i++ ){
			System.out.println("Hello Java");
		}
				
				
		//문제 2-19
		//1
		for( int count = 0; count < 6; count++ ){
			System.out.print(count);
		}
				
		System.out.println();
				
		//2
		for( int count = 5 ; count > -1 ; count-- ){
			System.out.print(count);
		}
		System.out.println();
				
		//3
		int sum2_19 = 0;
		for( int count = 2; count < 11; count++){
			sum2_19 += count;
		}
		System.out.println("sum2_19 : "+sum2_19);
				
		//4
		long mul2_19 = 1L;
		for( int count = 5; count < 15; count++){
			mul2_19 *= count;
		}
		System.out.println("mul2_19 : "+mul2_19);
				
		//5
		int sum2_19_5 = 0;
		for( int count = 2; count < 4463; count++){
			if(count%2 == 0){
				sum2_19_5 += count;
			}
		}
		System.out.println("sum2_19_5 : "+sum2_19_5);
				
				
		//예제 2-14
		for(int dan = 2; dan < 10; dan++ ){
			for(int gob = 1; gob < 10; gob++){
				System.out.println(dan + " * " + gob + " = "+dan*gob);
			}
		}
				
		//문제2-20
		//1
		for(int dan=2; dan < 10; dan++){
			if(dan%2 == 0){
				for( int x = 1; x < 10; x++ ){
					System.out.println(dan+" * "+ x + " = " + dan*x);
				}
			}
		}
		
		//2
		for(int dan=2; dan < 10; dan++){
			if(dan%2 == 0){
				for( int x = 1; x < 10; x++ ){
					if(x%2 != 0){
						System.out.println(dan+" * "+ x + " = " + dan*x);
					}
				}
			}
		}
		
		//문제2-21
		for(int count = 1 ; count <6; count++){
			for(int star = 1; star < 6 ; star++){
				System.out.print(count >= star? "*" : "");
			}
		System.out.println();
		}
		
		//문제 2-22
	    int count2_22 = 1;
	    int sum2_22 = 0;
	    while (count2_22 < 101){
	    	sum2_22 += count2_22;
	    	count2_22++;;
	    }
	    System.out.println(sum2_22);
		
		
	    //문제 2-23
	    int count2_23 = 1;
	    int sum2_23 = 0;
	    while(true){
	    	sum2_23 += count2_23;
	    	if(sum2_23 > 200){
	    		break;
	    	} count2_23++;
	    }
	    System.out.println(count2_23);
	    System.out.println(sum2_23);
		
	    //예제 2-15
	    String str = "184520";
	    int sum = 0;
	    for(int count = 0; count < str.length(); count++){
	    	sum += str.charAt(count)-'0'; // index값은 char형이라서 아스키코드0을 빼주면 정수값을얻을수잇다.
	    }
	    System.out.println(sum);
		
	    //문제 2-24
	    Scanner sc = new Scanner(System.in);
		System.out.println("문제 2_24 숫자를 입력해주세요");
		String num2_24 = sc.next();
		
		int sum2_24 = 0;
		for( int count = 0; count < num2_24.length(); count++){
			sum2_24 += num2_24.charAt(count)-'0';	
		}
		System.out.println("각 자리의 합계 : "+sum2_24);
		
		
		
		
	}
}
