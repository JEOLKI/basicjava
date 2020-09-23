package f_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx04 {
	public static void main(String[] args) {

		Button b = new Button();
		
		b.addActionListener(new ActionListener() {    //이름이 없는 클래스 익명클래스 객체생성 및 클래스 구현까지 동시에함
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼눌림");
				
			}
		});
		
	}
}
