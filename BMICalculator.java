import java.util.Scanner;

public class BMICalculator { 
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, feet, inches, lbs;
		
		System.out.print("Your height (feet only): ");
		feet = keyboard.nextDouble();
		
		System.out.print("Your height (feet only): ");
		inches = feet * 12 + keyboard.nextDouble();
		m = inches * .0254;
		
		System.out.print( " Your weight in pounds: ");
		lbs = keyboard.nextDouble();
		kg = lbs * 0.453592;
		
		bmi = kg / (m*m);
		
		
		System.out.println(" Your BMI is " + bmi);
		
	}
}
