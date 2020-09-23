package h_javalang;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class EqualsTest02 {
	public static void main(String[] args) {
		
		Person p1 = new Person(9403051400984L);
		Person p2 = new Person(9403051400984L);
		
		
		System.out.println(p1); //h_javalang.Person@7f39ebdb 16진수
		System.out.println(p1.hashCode()); //10진수로 바꿔준다. 해시코드가 같으면 주소가같다
		System.out.println(p1.getClass().getName() + "@" );
		
		
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		
		
		
		
		
		
		
	}
}



class Person{
	long regNo;
	
	Person(long regNo) {
		this.regNo = regNo;
	}

	//기존에 있던것이 오버라이드되어있구나도 유추가능해야한다.
	
	@Override // 주소값이 아닌 멤버변수의 값을 비교하기 위해서는 equals메서드를 오버라이드 해야된다.
	public boolean equals(Object obj) { 
		//1. obj가 person의 객체인가?
		//2. obj가 null인지
		
		//p1 == p2
		boolean result = false;
		if(obj instanceof Person && obj != null){
			result = regNo == ((Person)obj).regNo; //캐스트연산자보다 .이 우선순위가 높다
		}
		return result;
	}
	
	
	
	
}



