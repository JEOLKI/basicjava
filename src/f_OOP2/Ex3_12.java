package f_OOP2;

public class Ex3_12 {
	public static void main(String[] args) {
		Children ci = new Children();
		
		ci.volume = 15;
		ci.volumeUp();
		System.out.println(ci.volume);
		
		ci.channel = 3;
		ci.channelUp();
		System.out.println(ci.channel);
	}
}

class Children extends Parents{	int volume;
	void volumeUp(){
		volume++;
	}
}

class Parents{
	int channel;
	void channelUp(){
		channel++;
	}
}