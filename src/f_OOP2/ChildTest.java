package f_OOP2;

public class ChildTest {
	public static void main(String[] args) {

		Child child = new Child(); // 부모가 먼저 올라간다.

		
		//자식
		child.volume = 15;
		child.volumUP();
		System.out.println(child.volume);
	
		child.channel = 5;
		child.channelUP();
		System.out.println(child.channel);   // channel 이 5가 나온다.
		

		

		
		
		
		
	}
}


class Parent{
	Parent(){
		
	}
	int channel;
	void channelUP(){
		channel++;
	}
}


class Child extends Parent{ // 부모가없이 자식만들어질수 없다 
	Child() {
		super(); //자식의생성자 안에는 항상 부모의 기본생성자가 있다 super()로 표현
	}
	int volume;
	int channel;
	void volumUP(){
		volume++;
	}
}