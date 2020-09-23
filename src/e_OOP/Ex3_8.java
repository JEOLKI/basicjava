package e_OOP;

public class Ex3_8 {
	public static void main(String[] args) {
		//1. Test01의 객체를 만들어주세요.
		Test01 test1 = new Test01();  // 실제로 없지만 컴파일하면 기본생성자를 만들어주기때문에
		//실제로 인스턴스화 해주는것 new하나 그다음에 test01이라는 생성자를 호출하여야된다.
		
		//2. Test02의 객체를 만들어주세요.
		Test02 test2 = new Test02(3); //기본생성자가 컴파일러가 만들어주지않는다. 
		System.out.println(test2.value);
		//존재하는것은 인트값을 받는것 밖에 없기때문에 int값을 넣어준다.
		
		
	}
}


class Test01{
//	Test01(){  저장하면 자동생성됨
//		
//	}
	int value;
}


class Test02{
	int value;
	
	Test02(int value){
		this.value = value;
	}
}







