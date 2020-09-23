package d_array;

public class Array_03 {
	public static void main(String[] args) {
		
		/*
		1. 다차원 배열
		  - 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열도 혀용한다.
		  - 2차원 배열의 선언
		  	변수타입[][] 변수명;  int[][] score;
		  	변수타입  변수명[][];  int score[][];
		  	변수타입[] 변수명[];  int[] score[];
		  	
		  - 2차원 배열의 생성
		  	변수명 = new 변수타입[3][]; // 큰배열 안에 작은배열들이 크기가 모두 다름. // 각각 하나씩 배열해줘야함
		  
		*/
		
		int[][] stuArr = new int[3][];
//		{
//			null,
//			null,
//			null
//		}
		
		stuArr[0] = new int[3];
//		{
//			{0,0,0},
//			null,
//			null
//		}
		
		System.out.println(stuArr[0][0]);		// 0
		System.out.println(stuArr.length);      // 3 // 큰배열의 길이
		System.out.println(stuArr[0].length);   // 3 // 큰배열속 [0]작은배열의 길이
		
		
		
		//3. 6명의 이름을 저장할수 있는 변수 names를 선언하고
		// 주변친구 6명의 이름으로 초기화 하여라. =>  출력
		String[] names = {"홍정기" , "한상진", "최민준", "이은지", "이명호", "박다미"};
		

		//4. 7과목의 이름을 저장할 수 있는 변수 subjects를 선언하고
		// 국어, 영어, 수학, 사회, 과학, Oracle, java로 초기화 하여라 => 출력
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "java"};
		
		
		
		//1. 6명의 7과목의 점수를 저장할 수 있는 변수 score를 선언 및 생성하여라.
		int[][] score = new int[names.length][subjects.length];
		
//		{
//			{0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0}
//		}
		
		//2. 모든 index(42)에 0~100점 사이의 임의의 값을 저장하여라.
		
//		score[0][0]=(int)(Math.random()*101);
//		score[0][1]=(int)(Math.random()*101);
//		score[0][2]=(int)(Math.random()*101);
//					:
//		score[0][6]=(int)(Math.random()*101);				
		
//		for(int i = 0; i < score[0].length; i++){
//			score[0][i]=(int)(Math.random()*101);
//		}
		
		for(int student = 0 ; student < score.length; student++){		  
			for(int subject = 0; subject < score[student].length; subject++){  
				score[student][subject]=(int)(Math.random()*101);
			}	
		}
		
		
		//5. 사람별 합계를 저장하고 옆에 한줄에 추가하시오.
		int[] sum = new int[names.length];
		
		for(int student = 0 ; student < score.length; student++){
			for(int subjectScore = 0 ; subjectScore < score[student].length; subjectScore++){
				sum[student] += score[student][subjectScore];
			}
		}
		
		
		//6. 사람별 평균를 저장하고 옆에 한줄에 추가하시오.
		float[] average = new float[names.length];
		for(int student = 0 ; student < score.length ; student++){
			average[student] = (int)(((float)sum[student]/score[student].length)*100 + 0.5)/100f;
		}
		
		
		
		//7. 과목별 합계를 저장하고 아랫줄에 추가하시오.
		int[] subjectSum = new int[subjects.length];
		
		for(int subject = 0 ; subject < subjects.length; subject++){
			for(int studentScore = 0 ; studentScore < score.length; studentScore++){
				subjectSum[subject] += score[studentScore][subject];
			}
		}
		
		//8. 과목별 평균을 저장하고 아랫줄에 추가하시오
		float[] subjectAverage = new float[subjects.length];
		for(int subject = 0 ; subject < subjects.length ; subject++){
			subjectAverage[subject] = (int)(((float)subjectSum[subject]/score.length)*100 + 0.5)/100f;
		}
		
		//9. 사람별 석차를 옆에 추가할것
		int[] rank = new int[names.length];
		
		for(int count = 0; count < score.length; count++){
			rank[count]++;
			for(int i = 0 ; i < score.length; i++){
				if( average[count] < average[i] ){					
					rank[count]++;
				} 	
			}
		}
		
		
		//0. 출력문장 (\t)
		
		for(int subject = 0 ; subject < subjects.length; subject++){
			System.out.print("\t"+subjects[subject]);
		}
		System.out.print("\t합계");
		System.out.print("\t평균");
		System.out.print("\t석차");
		System.out.println();
		
		for(int student = 0 ; student < score.length; student++){
			System.out.print(names[student]+"\t");
			for(int subject = 0; subject < score[student].length; subject++){
				System.out.print(score[student][subject]+"\t");
			}
			System.out.print(sum[student]);
			System.out.print("\t"+average[student]);
			System.out.print("\t"+rank[student]);
			System.out.println();
		}
		
		System.out.print("과목합계");
		for(int subject = 0 ; subject < subjects.length; subject++){
			System.out.print("\t"+subjectSum[subject]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int subject = 0 ; subject < subjects.length; subject++){
			System.out.print("\t"+subjectAverage[subject]);
		}
		System.out.println();
		
		
		
		for(int j = 0; j < score.length-1; j++){
			for(int i = 0 ; i < score.length-1; i++){
				if(sum[i] < sum[i+1]){
					int temp = sum[i];
					sum[i] = sum[i+1];
					sum[i+1] = temp;
				
					float temp2 = average[i];
					average[i] = average[i+1];
					average[i+1] = temp2;

					int temp3 = rank[i];
					rank[i] = rank[i+1];
					rank[i+1] = temp3;
					
					String temp4 = names[i];
					names[i] = names[i+1];
					names[i+1] = temp4;
					
					for(int k = 0 ; k < score[i].length; k++){
						int temp5 = score[i][k];
						score[i][k] =score[i+1][k];
						score[i+1][k] = temp5;
					}
				}
			}
		}
		
		
		
		
		System.out.println("=======================================sort후==============================================");
		for(int subject = 0 ; subject < subjects.length; subject++){
			System.out.print("\t"+subjects[subject]);
		}
		System.out.print("\t합계");
		System.out.print("\t평균");
		System.out.print("\t석차");
		System.out.println();
		
		for(int student = 0 ; student < score.length; student++){
			System.out.print(names[student]+"\t");
			for(int subject = 0; subject < score[student].length; subject++){
				System.out.print(score[student][subject]+"\t");
			}
			System.out.print(sum[student]);
			System.out.print("\t"+average[student]);
			System.out.print("\t"+rank[student]);
			System.out.println();
		}
		
		System.out.print("과목합계");
		for(int subject = 0 ; subject < subjects.length; subject++){
			System.out.print("\t"+subjectSum[subject]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int subject = 0 ; subject < subjects.length; subject++){
			System.out.print("\t"+subjectAverage[subject]);
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}
}
