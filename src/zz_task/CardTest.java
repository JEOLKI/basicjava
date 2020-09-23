package zz_task;

public class CardTest {
	public static void main(String[] args) {
		
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card cd1 = new Card();
		
		cd1.name = "Daniel";
		cd1.number = 19961210;
		
		Card cd2 = new Card();
		
		cd2.name = "nayeon";
		cd2.number = 19950922;
		
		System.out.println("1번카드의 이름은 : "+ cd1.name + " 1번카드의 번호는 : " + cd1.number 
							+ " 1번카드의 폭은 : "+Card.width + " 1번카드의 높이는 : "+Card.height);
		System.out.println("2번카드의 이름은 : "+ cd2.name + " 2번카드의 번호는 : " + cd2.number 
						    + " 2번카드의 폭은 : "+Card.width + " 2번카드의 높이는 : "+Card.height);
		
		
		Card.width = 70;
		Card.height = 100;
		
		System.out.println("1번카드의 이름은 : "+ cd1.name + " 1번카드의 번호는 : " + cd1.number 
							+ " 1번카드의 폭은 : "+Card.width + " 1번카드의 높이는 : "+Card.height);
        System.out.println("2번카드의 이름은 : "+ cd2.name + " 2번카드의 번호는 : " + cd2.number 
			    			+ " 2번카드의 폭은 : "+Card.width + " 2번카드의 높이는 : "+Card.height);
		
		
	}
}



class Card {
	String name;
	int number;
	static int width = 100;
	static int height = 250;
	
	
}