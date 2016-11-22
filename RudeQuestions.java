import java.util.Scanner;

public class RudeQuestions {
	public static void main(String[] args){
		String name;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello. What is your name? ");
		name = keyboard.next();
				
		System.out.print( "Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old.");
		System.out.print( "How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
 		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		
		/* It doesn't explode when an Int is put instead of a double, 
		* because an int falls into the range of values a double can hold. 
		* it just ads the .0 */
		
		/* It does not blow up when you enter an int or double because strings can hold 
		* plain text which includes numbers*/
		
		/* A Space blows up the first question because we used next and not nextline for 
		* our scanner*/
		
		String jumbo;
		System.out.println("Whats your favorite type of shrimp?");
		jumbo = keyboard.next();
		System.out.println(jumbo + " IS THE BEST TYPE OF SHRIMP!");
		
	}
}
