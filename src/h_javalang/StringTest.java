package h_javalang;

public class StringTest {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1 == str2); //주소가 같기 때문에  true
		System.out.println(str1.equals(str2)); //주소가 같다 true
		
		String str3 = new String("abc"); //리터럴이 아니다 인자값이다.
		String str4 = new String("abc");
		
		System.out.println(str3 == str4); // 주소비교라서 false
		System.out.println(str3.equals(str4)); // true가 나온다
		// String 클래스는 equals 메서드가 오버라이드 되어있다는것을 인지할수 있다.
		
		System.out.println(str1.equals(str3)); // true가 나온다
		
		
		
		
		
		
	}
}
