package zz_task;

import zz_task.Calc;
import zz_task.TvControll;
import zz_task.TvMaker;

/**
 * 6장 TotalTest 정리본
 * @author Hong jeonggi 
 * @since 2020-06-19 
 */


public class TotalTest {    
	// Method Area에 TotalTest 클래스있는지 확인 하고 없으니 Method Area에 Total Test를 로드 시켜줍니다.						
	// 클래스 멤버들이 같이 와야하는데 클래스 변수는 없고 클래스메서드인 main()가 있으니 TotalTest 클래스에 메인메서드를 입력시킵니다.

	public static void main(String[] args) {  // 메인메서드가 callstack 영역에 호출이 됩니다.

		TvMaker.color = "Blue"; 
		
		// 대입연산자는 왼쪽에 있는 공간을 만들어준뒤 오른쪽의 값을 왼쪽공간에 대입해주어야 하기때문에 왼쪽부터 해준다.
		// Method Area 에 TvMaker 클래스가 있는지 확인합니다.		
		// TvMaker 클래스가 로드되어있지 않으니 로드시킵니다. 
		
		// "Blue"의 값을 클래스변수인 color에 대입하여 줍니다.
		
		TvMaker tm = new TvMaker();
		
		// 대입연산자는 왼쪽에 있는 공간을 만들어준뒤 오른쪽의 값을 왼쪽공간에 대입해주어야 하기때문에 왼쪽부터 해준다.
		// TvMaker 라는 클래스가 Method Area에 있는지 확인합니다. 이미 로드가 되어있다.
		// 참조변수 tm을 callstack안에 호출된 main()의 영역에 선언하여줍니다.
		
		// new를 만나 인스턴스화를 하게됩니다. Heap 영역에 tm의 주소를 가진 인스턴스가 생성이 되고 인스턴스 멤버들이 같이 와야합니다.
		
		// callstack 영역에 기본 생성자 TvMaker()가 호출됩니다.

        // tm에 대입하여 준다.
		
		
		tm.age = 30; // tm의 주소에 있는 age의 값에 30을 대입하여 줍니다
		
		
		// 3. 메서드 호출
		// 3.1 클래스 메서드 호출
		System.out.println(TvControll.channel);   
		// Method Area에 TvControll이라는 클래스가 있는지 확인한다. TvControll 없으니  Method Area에 로드시켜준다.
		// TvControll 클래스 안에 있는 클래스변수 channel의 값을 출력하기 때문에 15가 오게된다.
		
		TvControll.volumeDown();
		// TvControll 클래스가 Method Area에 있는지 확인한다. 이미 로드 되어있다
		// TvControll 클래스 안에 있는 클래스 메서드인 volumeDown()를 Callstack 영역에 호출한다.
		
		// if()을 통하여 MAX_CHANNEL이 channel의 값과 다르기때문에 channel의 값이 1증가한 16을 반환받게된다.
				
		System.out.println(TvControll.channel);
		// TvControll 클래스가 Method Area에 있는지 확인한다. 이미 로드 되어있다
		// TvControll 클래스 안에있는 channel의 값을 출력한다.
		// 16이 출력된다.
		
		
		

		// 3.2 인스턴스멤버를 사용하기위한 인스턴스화
		TvControll tc; 
		// TvControll클래스 타입을 갖는 참조변수 tc가 선언이 된다. tc는 callstack에 있는 main()영역에 선언이 됩니다.
		tc = new TvControll(); 
		
		// 참조변수 tc는 new를 통해 인스턴스화를 해주어 Heap영역에 tc의 주소를 갖고있는 인스턴스가 생성이됩니다.
		// TvControll() 이라는 기본생성자를 callstack 영역에 호출해줍니다.
		// TvControll() 라는 기본생성자는 컴파일시 자동으로 생성되는것입니다.

		// 오른쪽의 값을 왼쪽 tc에 대입하여 줍니다.
		
		System.out.println(tc.volume);
		// tc의 주소에 있는 volume의 값을 출력합니다.
		// 99의 값이 출력됩니다.
		
		tc.volumeUp();
		//tc의 주소에 있는 volumup()가 callstack 영역에 호출됩니다.
		
		// if()과정을통하여 volump값과 MAX_VOLUME 값이 같지 않기때문에		
		// volump의 값을 1증가시킨뒤 반환하여줍니다
		// volump 값이 100으로 바뀝니다.
		
		
		System.out.println(tc.volume);
		//tc의 주소에있는 volume의 값을 출력합니다
		//volume의 값은 100이 출력되게 됩니다.
		
		
		tc.volumeUp();
		// tc의 주소에 있는 volumup()가 callstack 영역에 호출됩니다.
		// if()과정을통하여 volump값과 MAX_VOLUME 값이 같기때문에
	    // volump의 값에 MIN_VOLUME의 값을 대입하여 줍니다
		// volump 값이 0으로 바뀝니다.
		
		
		System.out.println(tc.volume);
		// tc의 주소에있는 volume의 값을 출력합니다
		// volume의 값은 0이 출력되게 됩니다.

		
		Calc cc = new Calc();   
		// Method Area에 Calc클래스가 있는지 확인합니다. Calc클래스가 없으니 로드시켜줍니다.
		// Calc 클래스 로드시에는 클래스 멤버들이 같이 오게된다. 클래스 멤버들이없다.
		
		// cc라는 참조변수가 main()안에 선언이 된다. 
		// new를 만나 인스턴스화하여 cc의 주소를 가지는 인스턴스가 생성이 됩니다
		// Calc() 기본생성자가 Callstack 영역에 호출됩니다. 
		
		// 오른쪽의 값을 왼쪽에 대입하여 줍니다.
		
		System.out.println(cc.add(Integer.MAX_VALUE, 4));  
		// cc 주소에있는 add(int, int)가  호출이 됩니다.
		
		// MAX_VALUE는 int의 최대값을 갖는 변수입니다.
		// F2를 눌러서 확인하면 : A constant holding the maximum value an int can have, 2^31-1. 라고 나와있다.
		
		// int형 매개변수 두개를 갖는 메소드를 통하여  두개의 정수를 더한 값을 반환하여 출력하여준다.
		
		System.out.println(cc.add(3L, Integer.MAX_VALUE));
		// cc 주소에 있는 add(long, int)가 호출이 됩니다.
		
		// long형 매개변수 하나와 int형 매개변수 한개를 갖는 메소드를 통해 두 값을 더해준후 반환하여 출력한다.
		
		
		

	}
}

class TvMaker {            
	// TvMaker의 클래스를 Method Area에 로드 시킬때 클래스 변수와 클래스 메서드가 같이 와야합니다. 클래스 변수만있고 클래스메서드는 없습니다.     
	
	// 1. 변수
	// 1.1 클래스변수
	static String color;  // TvMaker 클래스의 클래스 변수인 color가 오고 초기화되어있지 않으니 기본값인 null값으로 초기화시킵니다.
	static int inch;  	  // 클래스 변수인 inch가 오고 초기화 되어있지 않으니 기본값인 0으로 초기화합니다.
	
	// 1.2 인스턴스변수
	String name = "";     // 인스턴스 변수인 name이 오게되고 ""으로 초기화 해줍니다. 
	int age;   			  // 인스턴스 변수인 age가 오게되고 기본값인 0으로 초기화 해줍니다.

	// 2. 생성자
	// 2.1  기본생성자
	TvMaker() {						 // 기본생성자인 TvMaker()가 인스턴스에 올라오게 됩니다.
		this("man", 25);             // this("man", 25)를 만나는데 this라는것은 같은 클래스내의 생성자를 불러올때 사용합니다. 
	}								 // String타입과 int타입의 매개변수를 갖는 생성자인 TvMaker(String, int)를 불러오게 됩니다.
	
	// 2.2 String타입과 int타입의 매개변수를 갖는 생성자
	TvMaker(String name, int age) {    // String타입과 int타입의 매개변수를 갖는 생성자인 TvMaker(String, int) 인스턴스에 올라오게됩니다.
		this.name = name;			   // this("man", 25) 은 매개변수로 name = "man" age = 25를 갖게 됩니다
		this.age = age;				   // 같은클래스 내에 있는 변수가 매개변수와 이름이 같을때에는 this.을 사용하여 나타내어 줍니다.
	}
}

class TvControll {     
	// Method Area에 로드시에는 클래스 변수와 클래스 메서드들이 같이 온다.
	// Heap 영역에 인스턴스가 생성이 될때에는 인스턴스멤버들이 같이 오게됩니다.
	
	final int MAX_VOLUME = 100;           // 인스턴스 변수인  MAX_VOLUME가 오게되고  100의 값으로 초기화됩니다.       
	final int MIN_VOLUME = 0;			  // 인스턴스 변수인  MIN_VOLUME가 오게되고 0의 값으로 초기화 됩니다.
	static final int MAX_CHANNEL = 50;    // 클래스 변수인 MAX_CHANNEL가 오게되고 50으로 초기화한다.
	static final int MIN_CHANNEL = 1;     // 클래스 변수인 MIN_CHANNEL가 오게되고 1로 초기화한다.

	static int channel = 15;              // 클래스 변수인 channel가 오게되고 15로 초기화된다.
	int volume = 99;					  // 인스턴스 변수인  volume이 오게되고 99의 값으로 초기화됩니다

	// 4. return문
	int volumeUp() {					  // 인스턴스 메서드인 volumeUp()가 오게됩니다.
		if (volume == MAX_VOLUME) {         
			volume = MIN_VOLUME;				
		} else {							 
			volume++;						
		}

		return volume;						//앞에서 나온 volume의 값을 반환시킨다.
	}

	static int volumeDown() {             // 클래스 메서드인 volumeDown()가 오게된다
		if (channel == MAX_CHANNEL) {	  // channel 과  MAX_CHANNEL 값이 같다면
			channel = MIN_CHANNEL; 		  // channel 에  MIN_CHANNEL 을 대입 하고
		} else {						  // 그렇지 않으면
			channel++;					  // channel을 1증가시켜라
		}
		return channel;					  // channel의 값을 반환하여라
	}
}

class Calc {  // 클래스 멤버들은 없고 인스턴스 멤버인 인스턴스메서드 들만 있다.
			  // 인스턴스 생성시에는 인스턴스 친구들이 같이 오게됩니다.
	
	// 5. 오버로딩     // 이름과 매개변수의 개수는 같으나 매개변수의 타입이 다른 메서드가 있다.
	int add(int a, int b) {     // int형 매개변수 두개를 갖는 메소드 add
		return a + b;		    // a + b 를 반환
	}

	long add(long a, int b) {   // long형 매개변수 한개와 int형 매개변수 한개를 갖는 메소드 add
		return a + b;		 	// a + b 를 반환
	}

	int minus(int a, int b) {	// int형 매개변수 두개를 갖는 메소드 minus
		return a + b;			// a + b 를 반환
	}
}