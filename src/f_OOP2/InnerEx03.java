package f_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx03 {
	public static void main(String[] args) {
		
		Button b = new Button();
		
		// 구현할 클래스를만들고 그 객체를 인터페이스타입으로 저장하면 인터페이스 객체사용가능
		ActionListener a= new EventHandler();
		// 인터페이스 타입참조변수로 그를 구현한 구현체의 인스턴스를 참조할수 있다.
		
		b.addActionListener(a);
		
		// 버튼이 많아지면 그것만큼 클래스를 생성해야하고 동적으로 생성되지 않아서 비효율이다
		// 돌아가는 도중에 동적생성된 버튼에대해서는 액션을 줄수가 없다
		
		
		
		
	}
}

class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("1번 버튼 눌림");
	}
	
}