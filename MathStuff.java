import java.util.Scanner;
public class MathStuff 
{
	public static void main( String[] args ) 
	{
		double a;
		int b, c;
		int ones=0,twos=0,threes=0,fours=0,fives=0,sixes=0;
		
		for (int i = 0; i<1000;i++) 
		{
		
			a = Math.random();
			b=(int)(a*6);
			c=b +1;

		
			switch(c)
			{
				case 1: ones++;		break;
				case 2: twos++;		break;
				case 3: threes++; 	break;
				case 4: fours++; 	break;
				case 5: fives++; 	break;
				case 6: sixes++; 	break;
			}
		
			//System.out.println("math.random()\t" + a + "\t* 6 \t" + b + "\t+ 1\t" + c);
		
		}
	System.out.println(ones+"\t"+twos+"\t"+threes+"\t"+fours+"\t"+fives+"\t"+sixes);
	}
}