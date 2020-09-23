package zz_task;

public class Ex3_6 {
	int iv;
	static int cv;
	
	void instanceMethod(){
		System.out.println(iv);
		System.out.println(cv);
		classMethod();
	}
	
	static void classMethod(){
//		System.out.println(iv);
		System.out.println(cv);
//		instanceMethod();
	}
	
	
	
}
