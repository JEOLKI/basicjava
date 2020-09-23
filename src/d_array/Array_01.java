package d_array;

public class Array_01 {
	public static void main(String[] args) {
		/*
		1. 배열(Array)?
		  - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
		  int korScore = 0;
		  int engScore = 0;
		  int mathScore = 0;
		  int socScore = 0;
		  int sciScore = 0;
		
		2. 배열의 선언
		  - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 대괄호[]를 붙여준다.
		  	일반적으로 타입뒤에 붙인다.
		  - 변수타입[] 변수명;  int[] score;
		  - 변수타입 변수명[];  int score[];
		  
		  
		3. 배열의 생성 //초기화는 기본형에서만 쓴다. // 주소를 생성
		  - 배열을 선언한 다음에는 배열을 생성해야 한다.
		  - 배열 생성을 위해서는 연산자 'new'와 함께 배열의 타입과 크기를 지정해주어야 한다.
		  - 구조
		  	변수명 = new 변수타입[크기];
		  	score = new int[5];
		
	
		*/
		int[] score = new int[5];
		
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
//		System.out.println(score[5]); //존재하지 않는다.
		
		
		//시작 : 0 끝 :4 증가량:1
		//반복구문 : syso(score[x])
		
		for(int i = 0; i < score.length; i++){  //length 이용해서 배열의 길이
			System.out.println(score[i]);
		}
		
		//0 10 20 30 40의 값을 넣어라
//		score[0] = 0;
//		score[1] = 10;
//		score[2] = 20;
//		score[3] = 30;
//		score[4] = 40;
		
		for(int i =0; i< score.length; i++){
			score[i] = 10*i;
		}
		
		for(int i = 0; i < score.length; i++){  //length 이용
			System.out.println(score[i]);
		}
		
		int[] score2 = new int[]{0,10,20,30,40};  //int안에 숫자를 쓰면 에러난다 자동으로세줌
		
//		int[] score2; 
//		score2= new int[]{0,10,20,30,40}; 
		
		int[] score3 = {0,10,20,30,40}; //선언 및 생성을 동시에 할때만 사용가능하다.
		
		
		
		//1. int형 값 6개를 저장할수 있는 변수 score4를 선언 및 생성해주세요.
		int[] score4 = new int[6];
		
		//2. score4의 각방을 0~100사이의 임의의 정수값으로 변경해주세요.
//		score4[0] = (int)(Math.random()*101); 
//		score4[1] = (int)(Math.random()*101);
//		score4[2] = (int)(Math.random()*101); 
//		score4[3] = (int)(Math.random()*101);
//		score4[4] = (int)(Math.random()*101);
//		score4[5] = (int)(Math.random()*101);
				
		for(int i = 0 ; i < score4.length ; i++){
			score4[i] = (int)(Math.random()*101);
		}
			 
			 
		//3. score4의 각방의 값을 출력해 주세요.
//		System.out.println(score4[0]);
//		System.out.println(score4[1]);
//		System.out.println(score4[2]);
//		System.out.println(score4[3]);
//		System.out.println(score4[4]);
//		System.out.println(score4[5]);
			
		for(int i =0 ; i < score4.length ;i++){
			System.out.println(score4[i]);
		}
		
		
		//4. score4의 각방의 값의 합계를 구하여라.
//		int sum = 0;
//		sum += score4[0]
//		sum += score4[1]
//		sum += score4[2]
//		sum += score4[3]
//		sum += score4[4]
//		sum += score4[5];
		int sum4 = 0;
		for(int i = 0; i < score4.length; i++){
			sum4 += score4[i];
		}
		System.out.println("sum4 = "+sum4);
		
		
		//5. score4의 각방의 평균을 구하여라
		//단. 소수점 세번째 자리에서 반올림하여 두번째 자리까지 표현하여라.
		float x = (float)sum4/score4.length;
		float avg = (int)(x * 100 + 0.5)/100f;
		System.out.println(avg);
		
		
		//6 score4의 각방의 값중 최대값을 구하여라
		int max = score4[0];
		for ( int i = 1; i < score4.length; i++){
			if( max < score4[i]){
				max = score4[i];
			}
		}
		System.out.println("max : "+ max);
		
		
		//7 score4의 각방의 값중 최소값을 구하여라.
		int min = score[0];
		for ( int i = 1 ; i < score4.length; i++){
			if ( min > score4[i]){
				min = score4[i];
			}
		}
		System.out.println("min : "+min);
		
		
		//1. 사람이름 3개를 저장할 수 있는 변수 names 를 선언하고 주변친구 이름으로 초기화하여라.
//		String[] names = new String[]{"김", "이", "박"};
		String[] names = {"김", "이", "박"};
		
		
		//2. names의 1번 index의 이름과 2번 index의 이름의 위치를 바꾸세요.
		String temp = names[2];   //변수를 저장해놓는다.
		names[2] = names[1];
		names[1] = temp;
		
		for ( int i = 0 ; i < score4.length; i++){
			System.out.println(names[0]);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
