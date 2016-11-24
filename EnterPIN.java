import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int pin, entry;
		String passwd, pwentry;
		
		pin = 12345;
		passwd = "Gandalf";
		
		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.println("ENTER YOUR PIN: ");	
		entry = keys.nextInt();
		
		while (entry != pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.println("ENTER YOUR PIN: ");
			entry = keys.nextInt();
			
		}
		
		System.out.println("ENTER YOUR PASSWORD: ");	
		pwentry = keys.next();
		int tries = 1;
		
		while (!( passwd.equals(pwentry)) && tries<3){
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.println("ENTER YOUR PASSWORD: ");
			pwentry = keys.next();
			tries++;
			if (tries == 2)
				System.out.println("LAST ATTEMPT.");
		}
	}
			
}

		
			
		
		
