package f_OOP2;

public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo();
		String result = og.upMethod();
		System.out.println(result); // 자식이 없으면 부모것을 불러온다.
		
		//1. 참조변수 og를 통해 OverUp의 upMethod()를 호출해주세요.
		//메서드가 필요할때에는 메서드를 만들어야한다.
		
		String result1 = og.callParentMethod();
		System.out.println(result1);
		
		
		
	}
}

class OverUp{
	int x = 1;
	int y = 2;
	
	String upMethod(){
		return "OverUp upMethod" +x+y;
	}
}



class OverGo extends OverUp{
	int z = 3;
	
	
	@Override
	String upMethod(){
		return "OverGo upMethod()";
	}
	
//	@Override
//	String upMethod(int a){  // 에러남
//		return "OverGo upMethod()";
//	}
	
	String upMethod(int z){  // 오버로드
		return "Over Go OverLoading";
	}
	
	String callParentMethod(){
		return super.upMethod();
	}
}
