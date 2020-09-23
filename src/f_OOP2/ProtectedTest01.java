package f_OOP2;

import e_OOP.ProtectedTest03; // 다른 패키기에 있기때문에 임포트가 되어야한다.

public class ProtectedTest01 extends ProtectedTest03{
	public static void main(String[] args) {
		ProtectedTest02 protest2 = new ProtectedTest02();
	
		ProtectedTest03 protest3 = new ProtectedTest03();
		
		ProtectedTest01 proTest1 = new ProtectedTest01();
		
		
	}
}
