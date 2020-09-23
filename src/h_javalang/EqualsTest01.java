package h_javalang;

public class EqualsTest01 {
	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1 == v2); //주소가 같은지 판단
		System.out.println(v1.equals(v2)); //v1의주소에서 v2의주소 같은지 판단
		//우리가 원하는것은 그안에 있는 값을 비교원함
		
		
		
		
		
		
	}
}


class Value{
	int value;
	
	Value(int value){
		this.value = value;
		
	}
	
	
}





