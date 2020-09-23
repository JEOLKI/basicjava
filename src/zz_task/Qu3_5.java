package zz_task;

import java.util.Scanner;

public class Qu3_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("firstNum을 입력해주세요 : ");
		int firstNum = sc.nextInt();
		
		System.out.println("부호를 입력해주세요 : ");
		String buho = sc.next();
		
		System.out.println("secondNum을 입력해주세요 : ");
		int secondNum = sc.nextInt();
		
		Calc1 oper = new Calc1();
		
		if("+".equals(buho)){
			int a = oper.add(firstNum, secondNum);
			System.out.println(a);
		} else if("-".equals(buho)){
			int a = oper.substract(firstNum, secondNum);
			System.out.println(a);
		} else if("*".equals(buho)){
			long a = oper.multiply(firstNum, secondNum);
			System.out.println(a);
		} else if("/".equals(buho)){
			float a = oper.divide(firstNum, secondNum);
			System.out.println(a);
		} else {
			System.out.println("연산종료");
		}
	}
}


class Calc1 {
	int add(int a, int b){
		int result = a + b;
		return result;
	}
	
	int substract(int a, int b){
		int result = a - b;
		return result;
	}
	
	long multiply(int a, int b){
		long result = (long)a * b;
		return result;
	}
	
	float divide(int a, int b){
		float result = (int)((float)a/b * 10 + 0.5)/10f;
		return result;
	}
	
	
}