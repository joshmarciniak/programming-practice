import java.util.*;
public class Exercise10
{
	public static void main(String args[])
		{
			double cap;
			double mpg;
			Scanner console = new Scanner(System.in);
				System.out.print("Enter the capacity of your fuel tank in gallons: ");
					cap = console.nextDouble();
				System.out.print("\nEnter the your average miles per gallon: " );
					mpg = console.nextDouble();
			double miles = (mpg * cap);
			System.out.print("\nThe total number of miles you can drive is " + miles + ".");
		}	
}			
	
		