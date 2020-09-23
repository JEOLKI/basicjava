package f_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		
		TimeVO t1 = new TimeVO();
		t1.setHour(44);
		t1.setMinute(200);
		t1.setSecond(12985);
		
		int hour = t1.getHour();
		int minute = t1.getMinute();
		int second = t1.getSecond();

		System.out.println(t1);
		
	}
}



//VO : Variable Object : 변수의 집합체  
//DTO : Data Table Object : 한테이블에 있는 컬럼을 변수로 만들어놓은것.

class TimeVO{
	
	private int hour;
	private int minute;
	private int second;
	
	void setHour(int hour){  //시간을 셋팅
		this.hour = hour%24;
	}
	
	int getHour(){
		return hour;
	}
	
	void setMinute(int minute){
		setHour(hour + minute/60);
		this.minute = minute%60;
		//this.minute = (minute > 59) ?  minute%60 : minute;
	}
	
	int getMinute(){
		return minute;
	}
	
	void setSecond(int second){
		setMinute(minute + second/60);
		this.second = second%60;
	}
	
	int getSecond(){
		return second;
	}

	@Override
	public String toString() {
		return "TimeVO [hour=" + hour + ", minute=" + minute + ", second="
				+ second + "]";
	}
	
	
	
	
//	void setHour(int hour){  //시간을 셋팅
//		if(hour > 23){
//			this.hour = hour%24;
//		} else {
//			this.hour = hour;
//		}
//	}
//	
//	int getHour(){
//		return hour;
//	}
//	
//	void setMinute(int minute){
//		if(minute > 59){
//			setHour(hour + minute/60);
//			this.minute = minute%60;
//		} else {
//			this.minute = minute;
//		}
//	}
//	
//	int getMinute(){
//		return minute;
//	}
//	
//	void setSecond(int second){
//		if(second > 59){
//			setHour(hour + second/3600);
//			setMinute(minute + (second%3600)/60);
//			this.second = second%60;
//		} else {
//			this.second = second;
//		}
//	}
//	
//	int getSecond(){
//		return second;
//	}
	
}






