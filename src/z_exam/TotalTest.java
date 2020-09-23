package z_exam;

public class TotalTest {    // TotalTest 클래스가 Method Area에 있는지 확인 하고 없으니 Method Area에 Total Test를 로드 시켜줍니다.
							// 클래스 멤버들이 같이 와야하는데 클래스 변수는 없고 클래스메서드인 main()가 있으니 TotalTest 클래스에 메인메서드를 입력시킵니다.

	public static void main(String[] args) {  // 메인메서드가 callstack 영역에 호출이 됩니다.

		TvMaker.color = "Blue"; //      
		
		// 대입연산자는 왼쪽에 있는 공간을 만들어준뒤 오른쪽의 값을 왼쪽공간에 대입해주어야 하기때문에 왼쪽부터 해준다.
		// Method Area 에 TvMaker 클래스가 있는지 확인합니다.
		// TvMaker 클래스가 로드되어있지 않으니 로드시킵니다. 
		// TvMaker의 클래스를 Method Area에 로드 시킬때 클래스 변수와 클래스 메서드가 같이 와야합니다. 클래스 변수만있고 클래스메서드는 없습니다.
		// TvMaker 클래스의 클래스 변수인 color가 오고 초기화되어있지 않으니 기본값인 null값으로 초기화시킵니다.
		// 또 클래스 변수인 inch가 오고 기본값인 0으로 초기화합니다.
		// "Blue"의 값을 클래스변수인 color에 대입하여 줍니다.
		
		
		TvMaker tm = new TvMaker();
		
		// 대입연산자는 왼쪽에 있는 공간을 만들어준뒤 오른쪽의 값을 왼쪽공간에 대입해주어야 하기때문에 왼쪽부터 해준다.
		// TvMaker 라는 클래스가 Method Area에 있는지 확인합니다.
		// 이미 로드가 되어있으니 tm이라는 메인메소드의 참조변수를 callstack안에 호출된 main()의 영역에 선언하여줍니다.
		// new를 만나 인스턴스화를 하게됩니다. Heap 영역에 tm의 주소를 가진 인스턴스가 생성이 되고 인스턴스 멤버들이 같이와줘야합니다
		// 인스턴스변수인 name이 오게되고 ""으로 초기화 해줍니다. 또 인스턴스 변수인 age가 오게되고 기본값인 0으로 초기화 해줍니다
		// 인스턴스 메서드인 TvMaker()와 TvMaker(String, int) 가 오게됩니다.
		// callstack 영역에 기본 생성자 TvMaker()가 호출됩니다.
		// TvMaker()안에  this("man", 25)를 만나 this라는것은 생성자를 불러올때 사용하기때문에 
		// 스트링타입과 인트타입을 가지고 있는 TvMaker(String name, int age) 를 불러오게 되는데 이때 인자값은 "man", 25를 갖게 됩니다
		// TvMaker("man", 25)가 호출되고
		// 2.2 의 과정
		// 2.1 의 과정
		// 2.1 과정에서 나온 값을 tm에 대입하여 준다.
		
		
		
		tm.age = 30; // tm의 주소에 있는 age의 값에 30을 대입하여 줍니다
		
		
		
		
		
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel);   // Method Area에 TvControll이라는 클래스가 있는지 확인한다 없으니 로드시켜준다
												  // 로드시에는 클래스 변수와 클래스 맴버들이 같이 온다.
		// 클래스 변수인 MAX_CHANNEL가 오게되고 50으로 초기화한다.
		// 클래스 변수인 MIN_CHANNEL가 오게되고 1로 초기화한다.
		// 클래스 변수인 channel가 오게되고 15로 초기화된다.
		// 클래스 메서드인 volumeDown()가 오게된다
		
		// TvControll 클래스 안에 있는 클래스변수 channel의 값을 출력하기 때문에 15가 오게된다.
		
		TvControll.volumeDown();
		
		// TvControll 클래스가 Method Area에 있는지 확인한다. 이미 로드 되어있다
		// TvControll 클래스 안에 있는 클래스 메서드인 volumeDown()를 Callstack 영역에 호출한다.
		// 4과정의 volumeDown()을 통하여 MAX_CHANNEL이 channel의 값과 다르기때문에 channel 의 값이 1증가한것을 반환받게된다.
		// channel 에 16을 대입한다.
		
		System.out.println(TvControll.channel);
		// TvControll 클래스 안에있는 channel의 값을 출력한다.
		// 16이 출력된다.
		
		
		

		// 3.2
		TvControll tc; // TvControll을 타입으로 갖는 참조변수 tc가 선언이 된다 tc는 callstack에 있는 main()영역에 선언이 됩니다.
		tc = new TvControll(); // 참조변수 tc는 new를 통해 인스턴스화를 해주어 Heap영역에 tc의 주소를 갖고있는 인스턴스가 생성이됩니다.
		// 인스턴스가 생성이 될때에는 인스턴스멤버들이 같이 오게됩니다.
		// 인스턴스 변수인  MAX_VOLUME가 오게되고  100의 값으로 초기화됩니다.
		// 인스턴스 변수인  MIN_VOLUME가 오게되고 0의 값으로 초기화 됩니다.
		// 인스턴스 변수인  volume이 오게되고 99의 값으로 초기화됩니다
		// 인스턴스 메서드인 volumeUp()가 오게됩니다.
		
		// TvControll() 이라는 기본생성자를 callstack 영역에 호출해줍니다.
		// TvControll() 라는 기본생성자는 컴파일시 자동으로 생성되는것입니다.
		// TvControll() 퇴근
		// 오른쪽의 값을 왼쪽 tc에 대입하여 줍니다.
		
		
		
		System.out.println(tc.volume);
		
		// tc의 주소에 있는 volume의 값을 출력합니다.
		// 99의 값이 출력됩니다.
		
		tc.volumeUp();
		
		//tc의 주소에 있는 volumup()가 callstack 영역에 호출됩니다.
		// 4의 volump()과정을통하여 volump값과 MAX_VOLUME 값이 같지 않기때문에
		// volump의 값을 1증가시킨뒤 반환하여줍니다
		// volump 값이 100으로 바뀝니다.
		
		
		System.out.println(tc.volume);
		
		//tc의 주소에있는 volume의 값을 출력합니다
		//volume의 값은 100이 출력되게 됩니다.
		
		tc.volumeUp();
		
		//tc의 주소에 있는 volumup()가 callstack 영역에 호출됩니다.
		// 4의 volump()과정을통하여 volump값과 MAX_VOLUME 값이 같기때문에
	    // volump의 값에 MAX_VOLUME의 값을 대입하여 줍니다
		// volump 값이 100으로 바뀝니다.
		
		System.out.println(tc.volume);
		
		//tc의 주소에있는 volume의 값을 출력합니다
		//volume의 값은 100이 출력되게 됩니다.

		//
		Calc cc = new Calc();   // Method Area에 Calc클래스가 있는지 확인합니다 클래스가 없으니 로드시켜줍니다 
								// 로드시에는 클래스 멤버들이 같이 오게된다. 클래스 멤버들이없다.
								// cc라는 참조변수가 main()안에 선언이 된다. 
								// new를 만나 인스턴스화하여 cc의 주소를 가지는 인스턴스가 생성이 됩니다
								// 인스턴스 생성시에는 인스턴스 친구들이 같이 오게됩니다.
								// Calc() 기본생성자가 Callstack 영역에 호출됩니다. 퇴근
								// 오른쪽의 값을 왼쪽에 대입하여 줍니다.
		
		System.out.println(cc.add(Integer.MAX_VALUE, 4));  
		
		// cc 주소에있는 add(int, int)가  호출됩니다.
		// 인자값을 매개변수에 넣어주고 
		// 더해주어 
		// 반환된값을
		// 출력합니다.
		
		System.out.println(cc.add(3L, Integer.MAX_VALUE));
		
		
		

	}
}

class TvMaker {                 
	// 1.
	// 1.1
	static String color;         
	static int inch;
	// 1.2
	String name = "";
	int age;

	// 2.
	// 2.1
	TvMaker() {
		this("man", 25);              // TvMaker("man", 25)가 호출되고
	}

	// 2.2
	TvMaker(String name, int age) {    // 매개변수인 name이선언되고 "man"이 입력됩니다. 또, 매개변수인 age가 선언이되고 25가 입력이됩니다.
		this.name = name;			 // 같은 영역에 있는 name에 man을 대입해주고 
		this.age = age;				// 같은 영역에 있는 age에 25를 대입해줍니다.
	}
}

class TvControll {
	final int MAX_VOLUME = 100;                    
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {
		if (volume == MAX_VOLUME) {       //만약 volume의 값과 MAX_VOLUME의 값이 같지않다면 
			volume = MIN_VOLUME;			// volume의 값에 MIN_VOLUME의 값을 대입하여주고
		} else {							// 그렇지 않다면 
			volume++;						// volume의 값을 1증가시킨다.
		}

		return volume;						//앞에서 나온 volume의 값을 반환시킨다.
	}

	static int volumeDown() {                // 매개변수를 갖지 않는다.
		if (channel == MAX_CHANNEL) {		// 만약 channel의 값과 MAX_CHANNEL의 값이 같으면
			channel = MIN_CHANNEL; 			// channel 값에 MAX_CHANNEL의 값을 대입하고
		} else {							// 그렇지 않으면
			channel++;						// channel의 값을 1증가시킨다
		}
		return channel;						// 앞에서 나온 channel의 값을 반환시킨다.
	}
}

class Calc {
	// 5.
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}