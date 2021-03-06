import java.util.Scanner;
import static java.lang.System.out;

public class PigDice {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int roll,ctot = 0,ptot = 0, turnTotal; 
		String choice = "";
		
		do{
			turnTotal = 0;
			out.println( "You have " + ptot + " points.");
			
			do {
				roll = 1 +(int)(Math.random()*6);
				out.println("\tYou rolled a " + roll + ".");
				if (roll==1){
					out.println("\tThat ends your turn." );
					turnTotal = 0;
				}
				else {
					turnTotal += roll;
					out.println("\tYou have " + turnTotal + " points so far this round.\n\tWoould you like to \"roll\" again or \"hold\"?");
					choice = keyboard.next();
					while (!(choice.equals("roll") || choice.equals("hold"))) {
						out.println("Invalid Input. Please tryagain.");
						choice = keyboard.next();
					}
				}
			} while(roll!=1 && choice.equals("roll"));
			
			ptot+=turnTotal;
			out.println("\tYou end the round with " + ptot + " points.");
			
			if (ptot<100) {
				turnTotal = 0;
				out.println("Computer has "+ ctot + " points.");
				
				do {
					roll = 1 + (int)(Math.random()*6);
					System.out.println( "Computer rolled a " + roll + "." ); 
					if ( roll == 1 ) {
   	         			System.out.println( "\tThat ends its turn." );
						turnTotal = 0; }
					else {
						turnTotal += roll;
						System.out.print( "\tComputer has " + turnTotal ); 
						System.out.print( " points so far this round.\n" ); 
						if(turnTotal<20 && turnTotal+ctot <101){
	       	             System.out.println( "\tComputer will roll again." );
   	        		 	}
					}
				} while ( roll != 1 && turnTotal < 20 && ctot+turnTotal < 101);
				
				ctot += turnTotal;
				out.println("\tComputer ends the round with " + ctot + " points.");
			}
			
		} while ( ptot < 100 && ctot < 100 );
		
		if (ptot > ctot)
			out.println("Humanity wins!");
		else 
			out.println( "The computer wins." );
		
	}
}