package d_array;

import java.util.Arrays;

public class Array_99 {
	public static void main(String[] args) {
		
		
		//예제 2_19
		int[] score2_19 = new int[5];
				
		for(int i = 0; i < score2_19.length; i++){
			System.out.println(score2_19[i]);
		}
		
		//예제 2_20
		int sum2_20 = 0;
		
		int[] score2_20 = {40,80,73,84,92};
		for( int i = 0; i <score2_20.length; i++){
			sum2_20 += score2_20[i];
		}
		
		float average = 0f;
		average = (float) sum2_20 / score2_20.length;
		
		System.out.println("총점 : "+ sum2_20);
		System.out.println("평균 : "+ average);
		
		
		
		//문제2_26
		//1
		int[] score2_26 = new int[7];
		//2
		for(int i = 0 ; i < score2_26.length; i++){
			score2_26[i] = (int)(Math.random()*101);
		}
		//3
		int sum2_26 = 0;
		for(int i = 0 ; i < score2_26.length; i++){
			sum2_26 += score2_26[i];
		}
		System.out.println(sum2_26);
				
		//4
		float x2_26 = (float)sum2_26/score2_26.length;
		float avg2_26 = (int)( x2_26*100 + 0.5 )/100f;
		System.out.println(avg2_26);
				
		//5
		int max2_26 = score2_26[0];
		for(int i = 1 ; i < score2_26.length; i++){
			if(max2_26 < score2_26[i]){
			   max2_26 = score2_26[i];
			}
		}
		System.out.println(max2_26);
				
		//6
		int min2_26 = score2_26[0];
		for (int i = 1 ; i < score2_26.length; i++){
			if(min2_26 > score2_26[i]){
				min2_26 = score2_26[i];
			}
		}
		System.out.println(min2_26);
		
		
		//예제 2-21
		String[] names = {"김", "이", "박", "한"};
		System.out.println("변경전 : "+Arrays.toString(names));
		
		String temp2_21 = names[1];
		names[1] = names[2];
		names[2] = temp2_21;
		
		System.out.println("변경후 : "+Arrays.toString(names));
		
		
		
		//문제 2-27
		int[] num = {5,2,3,1,4};
		for(int count = 0 ; count < num.length-1; count++){ //count = 회전수담당
			System.out.println((count+1)+"회전");
															//i = 기준버블
			for(int i = 0 ; i < num.length-1; i++){  //숫자가 5개이면 4번 즉 length보다 하나작게 
//			for(int i = 0 ; i < num.length-1-count; i++) 회전수 줄이는법
				if(num[i] > num[i+1]){
					int temp = num[i+1];
					num[i+1] = num[i];
					num[i] = temp;
				}
				System.out.println(Arrays.toString(num));
			}
			System.out.println();
		}
		

		
		//문제 2-28
		int[] arr = {5,2,3,1,4};
		
		for( int j = 0 ; j < arr.length ; j++){
			int min = arr[j];
			int minBang = j;
			for(int i = 1+j; i < arr.length ; i++){
				if(min > arr[i]){
					min = arr[i];
					minBang = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[minBang];
			arr[minBang] = temp;
		} 
		System.out.println(Arrays.toString(arr));
		
		
		//예제 2-22
		//1.
		int[][] score = new int[][]{
									{100, 70, 30},
									{45, 76, 88},
									{37, 45, 28},
									{47, 89, 100}
									};
		
		//2.
		System.out.println("\t국어\t영어\t수학");
		for(int hang = 0 ; hang < score.length; hang++){
			System.out.print(hang+1);
			for(int yeol =0 ; yeol < score[hang].length; yeol++){
				System.out.print("\t"+score[hang][yeol]);
			}
			System.out.println();
		}
	
		
		// 
		
		
		
		
		
		
	}
}
