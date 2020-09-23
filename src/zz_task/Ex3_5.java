package zz_task;

public class Ex3_5 {
	public static void main(String[] args) {
		
		Ex.classMethod(5);
		
		Ex e = new Ex();
		
		int re = e.instanceMethod(5, 7);
		
		System.out.println(re);
		
	}
	
}


class Ex {
	static void classMethod(int a) {
		System.out.println("입력된 값은 "+ a + "이다.");
	}
	
	int instanceMethod(int a, int b) {
		int result = a * b;
		return result;
	}
}