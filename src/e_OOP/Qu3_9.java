package e_OOP;

public class Qu3_9 {
	public static void main(String[] args) {
		
		int dice = doubleDice();
		System.out.println(dice);

		
	}
	
	
	static int doubleDice(){                            // return 이없으면 오류
		int firstDice = (int)(Math.random()*6+1);
		System.out.println(firstDice);
		int secondDice = (int)(Math.random()*6+1);
		System.out.println(secondDice);
		int result = firstDice + secondDice;
		if( firstDice == secondDice ){
			result += doubleDice();         // 
		}
		return result;
	}
}
