package h_javalang;

/**
 * String클래스 활용예제
 * @author HONG JEONGGI
 *
 */
public class StringClass {
	public static void main(String[] args) {
		
		
		// String(String s)
		// 주어진 문자열(s)을 갖는 String인스턴스를 생성한다.
		String s = new String("Hello");
		System.out.println(s); // Hello
		
		
		//char charAt(int index)
		//지정된 위치(index)에 있는 문자열을 알려준다.
		String s1 = "Hello";
		char c = s1.charAt(0); // H
		System.out.println(c); 
		
		
		//int compareTo(String str)
		//문자열(str)과 사전순서를 비교한다. 같으면 0을 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
		int i = "aaa".compareTo("aaa"); // 0
		int i2 = "aaa".compareTo("aab"); // -1
		int i3 = "c".compareTo("a"); // 2
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3); 
		
		
		//String concat(String str)
		//문자열(str)을 뒤에 덧붙인다.
		String s4 = "Hello";
		String s5 = s4.concat(" Oracle"); // "Hello Oracle"
		System.out.println(s5);
		
		
		//boolean contains(CharSequence s)
		//지정된 문자열(s)이 포함되었는지 검사한다.
		String s6 = "JavaSoEz";
		boolean b = s6.contains("E"); // true
		System.out.println(b);
		
		
		//boolean endsWith(String suffix)
		//지정된 문자열(suffix)로 끝나는지 검사한다.
		String s7 = "qwerasdf";
		boolean b2 = s7.endsWith("f"); // true
		System.out.println(b2);
		
		
		//boolean equals(Object obj)
		//매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다.
		//obh가 String이 아니거나 문자열이 다르면 false를 반환한다.
		String s8 = "java";
		boolean b3 = s8.equals("java"); // true
		System.out.println(b3);
		
		
		//int indexOf(int ch)
		//주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다.
		//못 찾으면 -1을 반환
		String s9 = "Hello";
		int i4 = s9.indexOf("l"); // 2
		int i5 = s9.indexOf("h"); // -1
		System.out.println(i4);
		System.out.println(i5);
		
		
		//int lastIndex(int ch)
		//지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서 위치(index)를 알려준다.
		//못찾으면 -1을 반환한다.
		String s10 = "Hello";
		int i6 = s10.lastIndexOf("l"); // 3
		System.out.println(i6);
		
		
		//int length()
		//문자열의 길이를 알려준다.
		String s11 = "Length";
		int i7 = s11.length(); // 6
		System.out.println(i7);
		
		
		//String replace(CharSequence old, CharSequence new)
		//문자열 중의 문자열(old)을 새로운 문자열(nw)로 모두 바꾼 문자열을 반환한다.
		String s12 = "Hello Oracle";
		String s13 = s12.replace("l", "W"); // HeWWo Oracle
		System.out.println(s13);
		
		
		//String[] split(String regex)
		//문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		String s14 = "dog-cat-snake";
		String[] sArr = s14.split("-");
		System.out.println(sArr[0]); // dog
		System.out.println(sArr[1]); // cat
		System.out.println(sArr[2]); // snake
		
		
		//String substring(int begin, int end)
		//주어진 시작위치(begin)부터 끝 위치(end)범위에 포함된 문자열을 더는다. 이 때, 시작위치뒤 문자는 범위에 포함되지만
		//끝위치의 문자는 포함되지 않는다.
		String s15 = "I am starving";
		String ss = s15.substring(3, 4); // 3번째 포함 4번째 미포함
		System.out.println(ss); // m
		
		
		//String toLowerCase()
		//String인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환한다.
		String ss1 = s15.toLowerCase();
		System.out.println(ss1); // i am starving
		
		
		//String toUpperCase()
		//String인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환한다.
		String ss2 = s15.toUpperCase();
		System.out.println(ss2); // I AM STARVING
		
		
		//String trim()
		//문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
		String ss3 = s15.trim(); // I am starving
		System.out.println(ss3); 
		String s17 = "     Oh My       GOd     ";
		String ss4 = s17.trim();
		System.out.println(ss4); // Oh My       GOd
		
		
		//static String valieOf(boolean b)
		//지정된 값을 문자열로 변환하여 반환한다.
		//참조변수의 경우, toString()을 호출한 결과를 반환한다.
		//(매개변수로 모든 타입이 올 수 있다)
		String s18 = String.valueOf(true);
		String s19 = String.valueOf(123);
		String s20 = String.valueOf('d');
		
		System.out.println(s18);
		System.out.println(s19);
		System.out.println(s20);
		
		
		
		
		
	}
}
