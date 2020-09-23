package b_operation;

public class Operation_03 {
	public static void main (String[] args)  {
		/*
		1. 비교연산자
		  - 두 개의 변수 또는 리터럴을 비교하는데 사용되는 연산자
		  - 주로 조건문과 반목문의 조건식에 사용되며 연산결과는 true 또는 false이다.
		  - 이항연산자이다.
		  
		  
		2. 대소비교연산자 ( <, >, <=, >= )
		  - 기본형 중에는 boolean을 제외한 나머지 자료형에 사용할 수 있다.
		 
		3. 등가비교연산자 ( ==, != )   // =는 대입연산자로 사용
		  - 모든 자료형에 사용 가능하다.
		  - 기본형의 경우 변수에 저장된 값을 비교, 참조형의 경우 객체의 주소값을 저장하기 때문에
		        두 개의 피연산자가 같은 객체를 가리키고 있는지 확인.
		  
		   수식                   |        연산결과
		  x>y         |    x가 y보다 클때만 true, 그 외에는  false
		  x<y         |    x가 y보다 작을때만 true, 그 외에는 false
		  x>=y        |    x가 y보다 크거나 같을때만 true, 그 외에는 false
		  x<=y        |    x가 y보다 작거나 같을때만 true, 그 외에는 false 
 		  x==y        |    x와 y가 같을때만 true, 그 외에는 false
		  x!=y        |    x와 y가 다를때만 true, 그 외에는 false
		  
		  		  
		*/
		
		//문제 2-10
		float f01 = 0.1F;  
		float f02 = 10.0F;
		double do01 = 0.1;
		double do02 = 10.0;
		String str1 = "화이팅";
		System.out.println(f01 == do01);
		// false -> float는 실수부분만 근사치를 갖는다.  float와 double이 다르다
		
		System.out.println(f02 == do02);
		System.out.println("화이팅".equals(str1));
		// 문자열은 ==으로 비교하지 않는다
		// equals를 이용하여 비교한다. ( null일 가능성이없는것.equals(null일 가능성이있는것) )
		
		/*
		
		
		
		
		
		*/
	}
}
