package h_javalang;

public class StringBufferTest {
	public static void main(String[] args) {
		
		/*
		String str = "a";
		
		str += "a";
		
		.
		.
		.
		.
		
		String str = "a";
		str = new StringBuffer(str).append("a").toString();
		
		
		
		
		*/
		
//		String str = "a";
//		long start = System.currentTimeMillis(); // 현재시간을 밀리세컨즈로 표현한것
//		for (int i = 0; i < 300000; i++) {
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end-start);
		
		
//		StringBuffer sb = new StringBuffer("a");
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 300000000 ; i++) {
//			sb.append("a");
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end-start);
		
		
		StringBuilder sb = new StringBuilder("a");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 300000000 ; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		//버퍼는 동기화를 보장한다 빌더는 동기화를 보장하지 않는다.
		//예) pc카톡에서 동기화가 동시에 되지않는것 빌더 
		// 동기화를 보장하지 않는녀석이 빠르다. 사용할대 제약조건이 생긴다 그래서 버퍼를 위주로 사용한다.
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
