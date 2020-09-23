package h_javalang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {
	public static void main(String[] args) {
		/*
		
		{}  
		 {2} 2회반복
		 {2,4} 2회이상 4회 이하
		 {2,} 2회이상
		
		*/
		
		//1. 영문자가 2회 또는 3회 반복되는지 확인 
		Pattern p1 = Pattern.compile("[A-Za-z]{2,3}");
		Matcher m1 = p1.matcher("sst");		
		System.out.println(m1.matches());
		
		String regEx1 ="[A-Za-z]{2,3}";
		System.out.println(Pattern.matches(regEx1, "sst"));
		
		
		//2. 영문자 3개가 오고 숫자가 하나 이상 온다.
		Pattern p2 = Pattern.compile("[A-Za-z]{3}[0-9]+");
		Matcher m2 = p2.matcher("aaa12311");
		System.out.println(m2.matches());
		
		
		//3. 핸드폰번호
		//  숫자3개 - 숫자4개 - 숫자4개
		String regEx3 ="[0-9]{3}-[0-9]{4}-[0-9]{4}";
		System.out.println(Pattern.matches(regEx3, "010-4134-1634"));
		
		//4. 핸드폰번호 upgrade
		/*
		01 0, 1, 6, 7, 8, 9 - 숫자가 3~4개 첫자리는 0이 올수없다. - 숫자 4개
		*/
		String regEx4 ="01[016789]-[1-9]\\d{2,3}-\\d{4}";
		System.out.println(Pattern.matches(regEx4, "015-2124-1634"));
		
		//5. 주민등록번호
		/*
		년도           월              일                 -     1~4    숫자6개
		00~99   0 1~9  0  1~9
		        1 0~2  1  0~9
		               2  0~9 
		               3  0~1
		*/
		String regEx5 ="\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-[1-4]\\d{6}";
		System.out.println(Pattern.matches(regEx5, "891031-1234567"));
		
		
		//6. 이메일 정규식
		/*
		 시작은 영문으로 시작해야하고 영문자,숫자,- _ \ . 만사용할수있다. 있을수도있고 없을수도 있다. 여러개 무한정가능
		  		 
		 @ 이후에는 영문자 또는 숫자가 1~7개 오고 
		 . 이후에는 영문자가 2~3회
		 .kr이 하나 있을수도 있고 안올수도 있다. 
		
		*/
		
		String regEx6 ="^[A-Za-z](\\w|[-_.\\\\]?)*@\\w{1,7}[.][A-Za-z]{2,3}([.]kr)?";
		
		System.out.println("aww12...3e\\-_-\\@nar.co.kr");
		System.out.println(Pattern.matches(regEx6, "aw-w\\\\@naver.co.kr"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
