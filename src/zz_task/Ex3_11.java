package zz_task;

class Init{
	static int action;
	int action2 = 5;
	static {
		action = 4;
	}
	
	{
		action2 = 4;
	}
	
	Init(){
		action2 = 7;
	}
	
	Init(int action2){
		this();
		this.action2 = action2;
	}
}


public class Ex3_11 {
	public static void main(String[] args) {
		Init init = new Init(9);
		
	}
}
