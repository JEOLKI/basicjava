package g_exception;

public class Exception_02 {
	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		
		// number를 0~5사이 임의의 정수값으로 나눈 결과를 result에 저장해 주세요
		// result를 출력해주세요
		// 위 문장을 10회 반복해주세요
		
//		for(int count = 0 ; count < 10 ; count++){
//			int random = (int)(Math.random()*6);  // 0 이나오면 나누기가안되
//			result = number/random;
//			System.out.println(result);
//		}
		
		
		for(int count = 0 ; count < 10 ; count++){
			try{
				result = number/(int)(Math.random()*6);  
				System.out.println(result);
			} catch (ArithmeticException e){
				System.out.println("0으로 나누지 말것");
			}
		}
		
		
		
		
		
		
	}
}
