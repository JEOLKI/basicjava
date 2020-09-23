package h_javalang;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest02 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "가나";
		
		byte[] strCP = str.getBytes("CP949"); //문자에서 얻어온다 해당 문자를 바이트로 바꾼것을 단 그거의 인코딩 방식은 CP949로 했을때
		byte[] strMS = str.getBytes("MS949"); 
		byte[] strUT = str.getBytes("UTF-8"); 
		
		System.out.println(Arrays.toString(strCP));
		System.out.println(Arrays.toString(strMS));
		System.out.println(Arrays.toString(strUT)); 
		
		//영문일때는 인코딩 방식이 전혀 상관이없다.
		//CP949와 MS949 한글이 2byte차지 UTF-8은 3byte 차지한다. 깨지는 이유
		//한글을 사용할것이면 UTF-8로 바꿔서 사용한다.
		
		
		
	}
}
