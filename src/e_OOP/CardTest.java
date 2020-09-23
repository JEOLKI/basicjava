package e_OOP;

public class CardTest {  // method area에 CardTest의 클래스를 생성
	public static void main(String[] args) { //클래스 변수는 없고 클래스 메서드인 메인메서드만 있어서 입력한다.
											 // main메서드가 callstack에 호출된다.
		
		System.out.println(Card.width);  // Card 클래스의 width 출력 
		// Card가 올라가고 올라가면서 클래스 변수와 클래스메서드를 찾는가 초기화값을 가지면 초기화한다.
		// Card클래스는 메서드가 존재하지않는다 
		// 다올라 가고 Card에 있는 width를 부를수 있다.
		
		System.out.println(Card.height);	// Card 클래스의 height 출력
		// Card가 이미 올라가 있기때문에 더 올리지 않고 height 값을 찾아서 출력한다.
		
		Card cd1 = new Card();  // Card 클래스의 객체 cd1 생성
		// 대입연산자의 왼쪽에 오른쪽의 값을 대입하는것이기 때문에 왼쪽부터 시작한다.
		// Card클래스는 method area에 이미 있다.
		// cd1이라는 참조변수를 선언한다 main메서드 안에서 선언
		// 참조변수 cd1을 선언
		// new 카드 인스턴스화
		// heap 영역에서 인스턴스 생성이되는데 cd1의 주소가 생성이된다.
		// cd1의 주소에 인스턴스변수와 인스턴스메서드가 같이올리가다
		// name과 number의 값이 초기화가 안되있기 때문에 기본값이 초기화된다.
		
		cd1.name = "Daniel";  // 참조변수.인스턴스변수 = 대입할값;
		//cd1를 따라가서 name이라는 값이 있고 그값에 Daniel의 값을 넣어준다.
		
		cd1.number = 19961210;  // 참조변수.인스턴스 변수  = 대입할값;
		
		Card cd2 = new Card();	// Card 클래스의 객체 cd2 생성
		
		cd2.name = "nayeon";  // 참조변수 cd2의 인수턴스 변수 name에 대입할값
		
		cd2.number = 19950922; //  참조변수.인스턴스변수 = 대입할값;
		
		System.out.println("출력1 \n 1번 카드의 이름은 "+cd1.name+", 직원번호 "+ cd1.number+
				           ", \n\t  폭은 "+cd1.width+", 높이는 "+cd1.height+"이다.");
		System.out.println(" 2번 카드의 이름은 "+cd2.name+", 직원번호 "+ cd2.number+
						   ", \n\t  폭은 "+cd2.width+", 높이는 "+cd2.height+"이다."); 
							// width와 height클래스변수라 바꿔도 두개가 동시에 바뀐다 공통된 저장공간
							// cd1에서 width를 찾아야하는데 없으니 공통공간에서 찾아야한다
							// 해당 객체의 클래스인 card에서 width를 찾는다.
		
		Card.width = 70;    // Card클래스의 width 값 변경  
							// 모든녀석들이 동시에 똑같이 변경이 되어야한다면 클래스변수로 만들어주고
							//각각을 독립적인 공간을 가져야한다면 인스턴스 변수로 만들어준다.
		
		Card.height = 100; // Card클래스의 height 값 변경
		
		System.out.println("출력2 \n 1번 카드의 이름은 "+cd1.name+", 직원번호 "+ cd1.number+
				           ", \n\t  폭은 "+cd1.width+", 높이는 "+cd1.height+"이다.");
		System.out.println(" 2번 카드의 이름은 "+cd2.name+", 직원번호 "+ cd2.number+
				           ", \n\t  폭은 "+cd2.width+", 높이는 "+cd2.height+"이다.");
			
	}
}

class Card{
	String name;  // 이름
	int number;   // 직원번호
	static int width = 100; // 폭
	static int height = 200; // 높이
}

	
	

