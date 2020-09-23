package g_exception;

public class Exception_03 {	
	public static void main(String[] args) {
		 
		
		int a = 3;
		int b = 0;
		
		try{
			System.out.println(a);
			System.out.println(a/b); //오류나면 catch로 넘어감 4가 진행되지 않음
			System.out.println(4);
			
		} catch (ArithmeticException e1){
			e1.printStackTrace(); // 현재발생한 예외에대한 모든내용을 프린트해라
		} catch (Exception e) {   // 마지막에는 Exception e 를 사용하여 만족하는 예외가없을때 처리할수 있는녀석 else 느낌
			System.out.println(e.getMessage()); // 예외의 이유만 받아온다 / by zero 만 가져오는녀석
		}
		
		System.out.println(5);
	}
}
