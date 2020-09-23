package f_OOP2;

import java.util.Arrays;

public class CardTest {
	public static void main(String[] args) {
//		Card c = new Card();
//		System.out.println(c.toString()); // CLOVER, A
		
		// 객체를 출력할때는 문자열형태로 출력하기위해 붙어있는데 생략되어있는것 toString()
		// c에는 toString()이없으니 상속받은것도없고 Object에서 받아오는것이다.
		// 그래서 카드에 toString()을 생성해준다 자식것을 먼저사용하기때문에
		
//		Card c1 = new Card(2,5);
//		System.out.println(c1.toString()); // HEART, 5
		
//		Deck d = new Deck();
//		System.out.println(Arrays.toString(d.c));  // d.c의 주소를 배열형태로 꺼낸다.
//		d.shuffle();
//		System.out.println(Arrays.toString(d.c));		
		
		
		//9. 카드 한 벌의 객체를 생성
		Deck deck = new Deck();
		
		//10. 0번 index의 카드 한 장을 뽑기
		Card card1 = deck.pick(0);
		System.out.println(card1); // card1.toString() toString이 숨어있다.
		
		//11. 임의의 index번째 카드 한 장을 뽑기
		Card card2 = deck.pick();
		System.out.println(card2);
		
		//12. 카드를 자동 섞기
		deck.shuffle();  // 반환타입이 void 이기때문에 변수에 저장할수 없다.
//		System.out.println(Arrays.toString(deck.c));
		
		//13. 0번 index의 카드 한 장을 뽑기
		Card card3 = deck.pick(0);
		System.out.println(card3);
		
		//14. 카드 1000번 섞기
		deck.shuffle(1000);
//		System.out.println(Arrays.toString(deck.c));
		
		//15. 0번 index의 카드 한 장을 뽑기
		Card card4 = deck.pick(0);
		System.out.println(card4);
		
		
		
	}
}


class Card{
	static final int KIND_MAX = 4; //변경되면 안되는 것들을 상수로
	static final int NUM_MAX = 13; 
	
	static final int SPADE = 4; 
	static final int DIAMOND = 3; 
	static final int HEART = 2; 
	static final int CLOVER = 1; 
	
	int kind;
	int number;
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	Card() {
		this(CLOVER,1);
	}
	
	@Override
	public String toString(){
		String kind = ""; // 지역변수이기떄문에 초기화
		String number = "";
		
		switch (this.kind){
		case 1:
			kind = "CLOVER";
			break;
		case 2:
			kind = "HEART";
			break;
		case 3:
			kind = "DIAMOND";
			break;
		case 4:
			kind = "SPADE";
			break;
		}

		//1.
		switch (this.number){
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
//			number = this.number + "";
			number += this.number;
		} 
		return "문양 : " + kind +" 번호: "+ number ;
	}
}

class Deck{ // 카드 한 벌(52장)을 Deck이라고 한다.
	//2. 카드의 수량을 저장할 수 있는 변수 CARD_NUM을 선언하고 Card클래스의 변수를 사용하여 초기화하여라.
	static final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX;
	//상수는 final이 붙고 어짜피 변하면 안되는 녀석이라 static이 붙는다.
	
	
	//3. 카드 52장을 저장할 수 있는 변수 c를 선언하고 생성하여라.
	Card[] c = new Card[CARD_NUM];           // 인스턴스 변수 c를 Card클래스 타입의 배열로 인스턴스화 한것을 c의 주소를 넣어준다.
	
	
	
	//4. 기본 생성자를 작성하여라.
	//   단, 변수 c의 모든방에 카드 1,1 ~ 4,13 까지 생성하여 저장하여라.
	
	Deck(){
		int deckbang = 0;
		for( int kind = 1 ; kind < Card.KIND_MAX+1 ; kind++){
			for( int number = 1; number < Card.NUM_MAX+1 ; number++ ){
				Card card = new Card(kind, number);     //카드형 배열에서 카드한장을 꺼내면 Card형
				c[deckbang] = card;
				deckbang++;
			}
		}
		
//		for( int kind = 0 ; kind < Card.KIND_MAX ; kind++){
//			for( int number = 0; number < Card.NUM_MAX ; number++ ){
//				c[kind*13 + number] = new Card(kind+1 , number+1);
//			}
//		}
		
//		for( int cardnum = 0 ; cardnum < CARD_NUM ; cardnum++){
//		    c[cardnum] = new Card(cardnum/13+1 , cardnum%13+1);
//		}
		
	}
	

	//5. c에서 index번째 카드 한 장을 반환하는 메서드(pick)를 작성하여라.
	Card pick(int index){
		Card result = c[index];
		return result;
	}
	
	
	//6. index번째 카드 한 장을 반환하는 메서드(pick)를 작성하여라.
	Card pick(){
		int random = (int)(Math.random()*CARD_NUM);
		Card result = pick(random);	
		return result;		
	}
	
	
	//7. c의 카드를 섞는 메서드(shuffle)을 작성하여라 - 자동 섞기   
	
	void shuffle(){
		for(int cardbang = 0 ; cardbang < CARD_NUM ; cardbang++){
			int random = (int)(Math.random()*CARD_NUM);
			Card temp = c[random];
			c[random] = c[cardbang];
			c[cardbang] = temp;
		}
	}
	
	
	//8. 사용자로부터 입력받은 횟수만큼 c의 카드를 섞는 메서드(shuffle)을 작성하여라.
	//   단. 임의의 방 두개를 뽑아 두개의 index번째 요소의 위치를 바꾼다. 이를 사용자로
	//   부터 입력받은 횟수만큼 반복한다.
	
	void shuffle(int count){
		for(int change = 0 ; change < count ; change++){
			int random1 = (int)(Math.random()*CARD_NUM);
			int random2 = (int)(Math.random()*CARD_NUM);
			Card temp = c[random1];
			c[random1] = c[random2];
			c[random2] = temp;
		}
	}
	
}




