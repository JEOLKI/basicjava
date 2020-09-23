package z_exam;

public class Exam_05 {
	public static void main(String[] args) {
		
		
		//연습문제 5-1
//		int[] arr[];
//		int[] arr = {1,2,3,};  //,있어도 뒤에 요소가 없으면 가능하다. arr.length = 3
//		int[] arr = new int[5];
//		int[] arr = new int[]{1,2,3,4,5};
//		int arr[];
//		int[] arr[] = new int[3][];
		
		
		//연습문제 5-2
		int[][] arr5_2 = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10 },
				{ 20, 20, 20, 20},
				{ 30, 30}
				};
		
		System.out.println(arr5_2[3].length); //4행의 배열의 길이 // 2 
		System.out.println(arr5_2.length);  // 2차원배열의 길이 // 4
//		System.out.println(arr5_2[4][1]);
		
		//연습문제 5-3
		int[] arr5_3 = {10, 20, 30, 40, 50};
		int sum5_3 = 0;  //배열의 합의 기본값 선언
		for(int i = 0 ; i < arr5_3.length; i++){   
			sum5_3 += arr5_3[i];
		}
		System.out.println("Sum = "+ sum5_3);
		
		//연습문제 5-4
		int[][] arr5_4 = {
							{ 5, 8, 13, 5, 2},
							{22, 13, 28},
							{ 2, 18, 23, 62}
						};
		
		int total5_4 = 0;
		float average5_4 = 0;
		
		for(int hang = 0 ; hang < arr5_4.length; hang++){
			for(int yeol = 0 ; yeol < arr5_4[hang].length; yeol++){
				total5_4 += arr5_4[hang][yeol];
			}	
		}
		
		int count5_4 = 0;  //배열의 갯수를 넣어줄 값 선언 
		for(int hang = 0 ; hang < arr5_4.length; hang++){
			count5_4 += arr5_4[hang].length;
		}
		average5_4 = (float)total5_4/count5_4;
		
		System.out.println("total5_4 : " + total5_4 );
		System.out.println("average5_4 : " + average5_4 );
		
		
		//연습문제 5-5
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2790;
		
		for(int i = 0 ; i < coinUnit.length; i++){
			int x = money/coinUnit[i]; // 각 동전의 갯수 x를 선언 하고 해당 금액으로 나누어 몫을 넣어준다.
			money = money%coinUnit[i]; //남은 돈을 다시 money에 넣어준다.
			System.out.println(coinUnit[i]+"원 : "+x+"개");
		}
		
		
		//연습문제 5-6
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		// ballArr의 index순서대로 index의 요소와 임의의 요소를 골라서 값을 바꾼다.
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);  // 임의의 요소
			int temp = 0;
		
			temp = ballArr[i];
			ballArr[i] = ballArr[j]; // index의 요소와 임의의 요소 변경
			ballArr[j] = temp;
		}
		
		//ballArr의 앞에서 3개의 ball3로 복사한다.
		for(int i = 0; i < ball3.length; i++){
			ball3[i] = ballArr[i];
		}
		
		
		//ball3의 값을 출력한다.
		for(int i = 0; i < ball3.length; i++){
			System.out.println(ball3[i]);
		}
		
		
		
		//연습문제 5-7
		int[] answer5_7 = { 1, 4, 3, 2, 1, 2, 3, 2, 1, 4};
		int[] counter5_7 = new int[4];
		
		for(int i = 0; i < answer5_7.length; i++){
			if( answer5_7[i] == 1){
				counter5_7[0]+=1;
			} else if(answer5_7[i] == 2){
				counter5_7[1]+=1;
			} else if(answer5_7[i] == 3){
				counter5_7[2]+=1;
			} else if(answer5_7[i] == 4){
				counter5_7[3]+=1;
			} else {	
			}			
		}
		// 코드 3줄로도 가능하다. 찾아보기!
		
		
		
		for(int k = 0 ; k < counter5_7.length; k++){
			System.out.print((k+1)+" : "+counter5_7[k]+"개 ");
			for(int j = 0 ; j < counter5_7[k] ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		// hide 
//		int max = answer5_7[0];
//		for(int i = 0 ; i < answer5_7.length ; i++){
//			max = answer5_7[i];
//		}
//		
//		int min = answer5_7[0];
//		for(int i = 0; i < answer5_7.length; i++){
//			min = answer5_7[i];
//		}
//		
//		int[] counter5_7_1 = new int[max-min];
		
		
		
		//연습문제 5-8
		if(args.length!=1){
			System.out.println("한개의 숫자만 입력해 주세요");
			System.exit(0);
		}
		int money5_8 = Integer.parseInt(args[0]);     // run -> run configurations에서 실행시켜야한다.  //try catch 시켜야한다.
		System.out.println("money5_8="+money5_8);
		int[] coinUnit5_8 = { 500, 100, 50, 10 };
		int[] coin = {5, 5, 5, 5};
		
		for(int i =0; i <coinUnit5_8.length; i++){
			int coinNum = 0;						//동전의 갯수 기본값
			coinNum += money5_8/coinUnit5_8[i];		//단위로 돈을나누어 동전의 갯수구함
			coin[i] -= coinNum;						//동전의 원래갯수 - 사용한 동전의 갯수
			money5_8 -= coinUnit[i]*coinNum;		//원래 돈에서 사용한돈을 빼준다.
			System.out.println(coinUnit[i]+"원: "+coinNum);
		}
		if(money5_8 > 0){
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		System.out.println("= 남은 동전의 개수 ="); 
		for(int i =0; i < coinUnit.length; i++){
			System.out.println(coinUnit[i]+"원 :"+coin[i]);
		}
		
		
		//연습문제 5-9
		char[][] star = {
							{'*', '*', ' ', ' ', ' '},
							{'*', '*', ' ', ' ', ' '},
							{'*', '*', '*', '*', '*'},
							{'*', '*', '*', '*', '*'}
						};
		char[][] result = new char[star[0].length][star.length];
		
		for(int i =0; i < star.length; i++){
			for(int j=0; j < star[i].length; j++){
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < star.length; i++){
			for(int j=0; j < star[i].length; j++){
				int x = j;
				int y = star.length-1-i;
				result[x][y] = star[i][j];
			}	
		}
		
		
		for(int i =0; i < result.length; i++){
			for(int j=0; j < result[i].length; j++){
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
}
