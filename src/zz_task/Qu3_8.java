package zz_task;

public class Qu3_8 {
	public static void main(String[] args) {
		int a = MyAdd.add(10);
		
		MyAdd ma = new MyAdd();
		int b = ma.add(10, 10);
		
		long c = ma.add(10, 20L);
		
		float d = ma.add('A', 3.14f);
		
	}
}



class MyAdd{
	static int a = 20;
	int b = 15;
	static int add(int c){
		int result = a + c;
		return result;
	}
	
	int add(int a, int b){
		int result = a + b;
		return result;
	}
	
	long add(int a, long b){
		long result = a + b;
		return result;
	}
	
	float add(char a, float b){
		float result = a + b;
		return result;
	}
	
	
}