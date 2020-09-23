package f_OOP2;

public class InnerEx02 {
	public static void main(String[] args) {
		
			Outer out = new Outer();
			Outer.Inner in = out.new Inner();
			in.method();
		
		
	}
}



class Outer{
	int value = 10;
	
	class Inner{
		int value = 20;
		
		void method(){
			int value = 30;
			System.out.println(value); // 30
			System.out.println(this.value); // 20
			System.out.println(Outer.this.value); // 10
			
		}
		
	}
	
	
}




















