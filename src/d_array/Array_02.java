package d_array;

import java.util.Arrays;

public class Array_02 {
	public static void main(String[] args) {
		
		/*
		
		1. 정렬
		  - 어떤 데이터를 빠르고 쉽게 찾기 위해 일정한 순서대로 데이터를 가지런히 나열하는 작업
		  - 버블정렬, 선택정렬, 삽입정렬
		  
		2. 버블정렬(bubble sort)
		  - 인접한 데이터 간에 교환이 계속해서 일어나면서 정렬이 이루어 진다.
		  - 한 회전이 끝나면 가장 큰 값을 뒤로 보낸다.
		
		*/
		
		//문제 2-27
		int[] num = {5,2,3,1,4};
		
//		if(num[0] > num[1]){
//			int temp = num[1];
//			num[1] = num[0];
//			num[0] = temp;
//		} 
//		if(num[1] > num[2]){
//			int temp = num[2];
//			num[2] = num[1];
//			num[1] = temp;
//		} 
//		if(num[2] > num[3]){
//			int temp = num[3];
//			num[3] = num[2];
//			num[2] = temp;
//		} 
//		if(num[3] > num[4]){
//			int temp = num[4];
//			num[4] = num[3];
//			num[3] = temp;
//		} 
		
		
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
				for ( int j = 0 ; j < num.length; j++){
					System.out.print(num[j]+" ");
				}
				System.out.println();
			}
		}
		
		// 1회전  -> 3번방
		// 2회전  -> 2번방
		// 3회전  -> 1번방
		// 4회전  -> 0번방
		// 회전에따라 버블의 끝나는 기준이 달라진다 이걸 이용해서
		// for(int i = 0 ; i < num.length-1-count; i++){} 으로 확정개념을 집어넣으면
		// 회전수를 줄일수 있다.
		
		
		/*
		3. 선택정렬(select sort)
		  - 정렬의 대상에서 최소값을 찾아서 맨앞의 내용과 교체하는 방식이다.
		
		
		*/
		
		System.out.println();
		
		//문제 2-28
		int[] selectArr = {5,2,3,1,4};
		
		for(int l=0; l < selectArr.length-1 ; l++){
			int min = selectArr[l];
			
			for(int i = l+1 ;i < selectArr.length; i++){
				if( min > selectArr[i]){
					min = selectArr[i];	
				}
			}
			int k = 0;
			for(int j = 0; j < selectArr.length; j++){
				if(min == selectArr[j]){
					k = j;
					break;
				}
			}
			if(selectArr[l] > selectArr[k]){
				int temp = selectArr[k];
				selectArr[k] = selectArr[l];
				selectArr[l] = temp;	
			}
		}

		System.out.println(Arrays.toString(selectArr));
		
		
//		int[] selectArr = {5,2,3,1,4};
//		
//		for(int j=0; j < selectArr.length-1 ; j++){ //회전수, 기준방
//			int min = selectArr[j];
//			int minBang = j;
//			for(int i = j+1 ;i < selectArr.length; i++){
//				if( min > selectArr[i]){
//					min = selectArr[i];
//					minBang = i;
//				}
//			}
//			int temp = selectArr[j];
//			selectArr[j] = selectArr[minBang];
//			selectArr[minBang] = temp;	
//
//			System.out.println(Arrays.toString(selectArr));
//		}
		
		
		
		
		
		
		
		
		
		
	}
}
