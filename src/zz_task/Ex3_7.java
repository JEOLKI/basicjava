package zz_task;

public class Ex3_7 {
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
		
		
		
	}
	
	static int factorial(int n){
		int result = 0;
		if(n==1){
			result =1;
		} else {
			result = n * factorial(n-1);
		}
		return result;
	}
}