package zz_task;

public class Qu3_3 {
	public static void main(String[] args) {
		MethodTest.add01();
		int a = MethodTest.add02(10);
		System.out.println(a);
		MethodTest oper = new MethodTest();
		int b = oper.add03(10);
		System.out.println(b);
		oper.add04();
		
		
	}
}


class MethodTest{
	static int a = 10;
	static int b = 20;
	int c = 50;
	
	static void add01(){
		int result = a + b;
		System.out.println(result);
	}
	
	static int add02(int c){
		int result = a + b + c;
		return result;
	}
	
	int add03(int c){
		int result = this.c + c;
		return result;
	}
	
	void add04(){
		int x = (int)(Math.random()*6+1);
		int result = c + x;
		System.out.println(result);
	}
	
}