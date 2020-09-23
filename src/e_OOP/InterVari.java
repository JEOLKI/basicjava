package e_OOP;


class Data{
	int x;
	
	
}


public class InterVari {
	public static void main(String[] args) {
		// 1. 책을 손코딩한다.
	
		// 2. eclipse에 옮겨 적는다. (에러수정)
		Data d1 = new Data();
		d1.x = 10;
		System.out.println(d1.x);
		
		InterVari.change(d1.x);
		System.out.println(d1.x);
		
		Data d2 = new Data();
		d2.x = 10;
		System.out.println(d2.x);
		
		InterVari.change(d2);
		System.out.println(d2.x);
		
		// 3. 수행결과 (console) >> 예상결과를 노트에 적는다.
		
		
		// 4. eclipse를 실행하여 실행결과를 본다.
		
			
	}
	
	static void change(int x){
		x = 1000;
		System.out.println("change 기본형 : " + x);
	}
	
	
	static void change(Data d1){
		d1.x = 1000;
		System.out.println("change 참조형 : " + d1.x);
		
	}
	
	

	
}
