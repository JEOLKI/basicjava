package f_OOP2;

public class PolyTest {
	public static void main(String[] args) {
	
		//1. SmarTv 3대를 저장해주세요. 
		// 저장할 공간을 만들어 주고 해당 tv를 만들어서 공간에 넣어준다
		
		SmartTv[] stArr = new SmartTv[3];
		SmartTv st1 = new SmartTv();
		SmartTv st2 = new SmartTv();
		SmartTv st3 = new SmartTv();
		
		stArr[0] = st1;
		stArr[1] = st2;
		stArr[2] = st3;
		
				
		//2. AfreecaTv 4대를 저장해주세요.
		
		AfreecaTv[] atArr = new AfreecaTv[4];
		AfreecaTv at1 = new AfreecaTv();
		AfreecaTv at2 = new AfreecaTv();
		AfreecaTv at3 = new AfreecaTv();
		AfreecaTv at4 = new AfreecaTv();
		
		atArr[0] = at1;
		atArr[1] = at2;
		atArr[2] = at3;
		atArr[3] = at4;
		
		//3. DMBTv 2대 저장해주세요.
		
		DMBTv[] dtArr = new DMBTv[2];
		DMBTv dt1 = new DMBTv();
		DMBTv dt2 = new DMBTv();
		
		dtArr[0] = dt1;
		dtArr[1] = dt2;
		
		
		//4. 위에서 만든 Tv 9대를 변수 tArr에 저장해주세요.
		Tv[] tArr = new Tv[9];
		
		tArr[0] = (Tv)st1;  // up-casting 자식타입의 인스턴스를 부모타입에 저장 
		tArr[1] = st2;      // 캐스트연산자 생략 가능
		tArr[2] = st3;
		tArr[3] = at1;
		tArr[4] = at2;
		tArr[5] = at3;
		tArr[6] = at4;
		tArr[7] = dt1;
		tArr[8] = dt2;
		
		Tv t1 = tArr[4];  // 부모타입으로 저장하면 자식꺼는 사용할수 없다. 부모것 밖에 사용할수 없다.
		//t1. 
		//원래형태로 자식것을 사용하고 싶으면
		AfreecaTv aft = (AfreecaTv) t1; // down-casting 
		//aft.
		
		// 원래있던 아프리카티비를 티비에 넣엇다가 다시 아프리카로 핀것이기 때문에 오류가없다.
//		AfreecaTv sf = (AfreecaTv)new Tv(); // 저장시 오류가없지만 이것은 안되는것이다 돌리면 터짐
		
		
	}
}



class Tv{
	boolean power;
	int channel;
	
	void power(){
		
		power = !power;
	}
	
	void channelUP(){
		channel++;
	}
			
}


class SmartTv extends Tv{

	void interNet(){

	}
	
}

class AfreecaTv extends Tv{
	
	void starBallon(){
		
	}
	
}

class DMBTv extends Tv{

	void antena(){
		
	}
	
}






