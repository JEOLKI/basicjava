package zz_task;

public class MethodOveroading {
	int count;
	static int staticCount;
	
	void count(){
		System.out.println(count);
	}
	
//	int count(){
//		return count;            ----> 사용불가
//	}
	
	int count(int a) {
		int result = count + a;
		return result;
	}
	
	float count(float a){
		float result = count + a;
		return result;
	}
	
	
	
}
