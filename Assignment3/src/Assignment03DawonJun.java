
public class Assignment03DawonJun {

	public static void main(String[] args) {
		
		int roll = 0;
		int[] diceRolls = new int[16];
		int evenTotalRolls = 0;
		int oddTotalRolls = 0;
		
		// sample the rolls
		for(int count = 0; count < 1000; count++) { 
		    roll = (int)(Math.random() * 16) + 1; 
		    diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}	
		// run a report
		for(int index = 0; index < diceRolls.length; index++) {  // crashes
		    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		    if((index + 1)%2 == 0)
		    	evenTotalRolls += diceRolls[index];
		    else {
		    	oddTotalRolls += diceRolls[index];
		    }
		}
		System.out.println("Total even rolls were: " + evenTotalRolls );
		System.out.println("Total odd rolls were: " + oddTotalRolls );
		System.out.println("Program by Dawon Jun");


	}

}
