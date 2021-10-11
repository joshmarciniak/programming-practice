//This program was written by Josh Marciniak
import java.util.*;
public class Power1
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.println("This program asks the user for two value."
							+ "\nThe first value will be used as a base number; the second value"
							+ "\nwill be used as an exponent.");
		System.out.println();
		System.out.println("The program calculates the value of the base number raised "
							+ "\nto the exponent number.");
		System.out.println();
		double exponentNumber, baseNumber;
		System.out.print("Please enter the base value: ");
		baseNumber = console.nextDouble();
		System.out.print("Please enter the exponent value: ");
		exponentNumber = console.nextDouble();
		System.out.println();
		System.out.println("The value of " + baseNumber + " raised to the exponent " + exponentNumber + " is " + 
		Math.pow(baseNumber,exponentNumber));
	}
}