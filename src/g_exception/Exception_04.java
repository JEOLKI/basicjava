package g_exception;

public class Exception_04 {
	public static void main(String[] args) {
		
		Exception e = new Exception("태경이 때문에 발생함.."); // 이유를 가져올수 있다 예외를 만들어줄떄
		
		
		try { // checked 예외
			throw e;
		} catch (Exception e1) {
			e1.printStackTrace();  // java.lang.Exception
			System.out.println(e1.getMessage()); // 이유가 없으면 null
		}
		
		
		
		try { // unchecked 예외
			
			throw new RuntimeException();  // throw e할때는 에러가 발생햇는데 여기선 발생하지 않음 왜냐 런타임이라서 강제하지않는다
											// 프로그래머가 잘못한것은 알아서 try catch 만들어서 고쳐야한다.
		} catch(RuntimeException r){
			r.printStackTrace();
		}
		
		//컴파일러가 예외처리를 강제하지 않는 경우
		// 1. RuntimeException클래스들 //하위에 있는것까지 
		// 2. Error와 그 자손
		//    이런 것들을 'unchecked예외'라 부른다.
		
		
	}
}
