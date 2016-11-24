import java.util.Scanner;

public class HighLow {

	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in); int secret, guess;
		secret = 1 + (int)( 100*Math.random() );
        
        System.out.print( "I'm thinking of a number between 1-100.\n Try to guess it!\n>" + secret );
        guess = keyboard.nextInt();
        
        
		while ( secret != guess ) { 
			if ( guess < secret ) 
                System.out.print( "Sorry, your guess is too low." );
                
			if ( guess > secret ) 
                System.out.print( "Sorry, your guess is too high.");
                
			System.out.print("Try again.\n>");
			guess = keyboard.nextInt();
		}
        
        System.out.println( "You guessed it! What are the odds?!?" );
    }
}
			
		
		
