package zz_task;

public class Qu3_9 {
	public static void main(String[] args) {
		int result = doubleDice();
		
		System.out.println(result);
				
	}
	
	static int doubleDice(){
		int firstDice = (int)(Math.random()*6+1);
		int secondDice = (int)(Math.random()*6+1);
		int result = firstDice + secondDice;
		
		if(firstDice == secondDice){
			result += doubleDice();
		}
		
		return result;
	}
}
