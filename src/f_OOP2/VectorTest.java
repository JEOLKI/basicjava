package f_OOP2;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		Vector v = new Vector<>(); // Object[] obj = new Object[10];
		
		//C
		
		boolean result = v.add("abc"); // add object 객체필요 즉 모든 객체가 올수 있다.
		// 반환타입 블린  항상 true를 돌려준다. 무조건추가가 된다.
		// 비슷한 애들중 추가가 안되는것이 있어서 블린타입으로 해놓은것
		
		// add 매개변수 2개짜리보면 원하는 장소에다가 넣어줄수 있다.
		
		
		if(result){
			System.out.println(result);
		}
		
//		v.add("123");
		
//		v.add(1, "12345");  // abc 12345 123 밀리게된다
		
//		v.add(4, "1234"); // 현재 마련되어있는 인덱스+1 까지만 넣어줄수있다 넘어가면 오류가남 0~3번까지만 가능
		
		
		/* 
		 * 
		Create => insert
		Read => select
		Update => update
		Delete => delete
		
		*/
		
		//R
		
		String str = (String) v.get(0); //업캐스팅 필요
		System.out.println(str);
		
		//U
//		v.get(0) = "bcd"; 오브젝트라서 오류난다. 방법은 add에서 추가를 하면된다.
		v.set(0, "bcd");  // 반환타입은 Object // set은 이전엘리먼트의 값을 돌려준다
		//기존에 있던 abc를 빼주고 bcd를 넣어줫다
		System.out.println(v.set(0, "bcd")); // abc
		
		
		//D
		
//		v.remove(index)
//		v.remove(Object) == > 뒤인덱스부터 삭제해준다.
		
//		System.out.println(v.remove(0));  // 삭제된것을 돌려줌 //bcd
//		boolean result2 = v.remove("bcd"); // 삭제된 요소가 있으면 true를 반환한다 . 
//		System.out.println(result2);
//		boolean result3 = v.remove("bd"); // 삭제된 요소가 없으면 false를 반환한다 . 
//		System.out.println(result3);
		
		
		v.add("1");
		v.add("2");
		v.add("3"); // "bcd", "1", "2", "3"
		
		System.out.println(v.size());  //4개를 가지고 있다.
		
		
		
		
		
	}
}
