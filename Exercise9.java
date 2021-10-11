import java.util.*;
public class Exercise9
{
	public static void main(String args[])
	{
		double dec1;
		double dec2;
		double dec3;
		double dec4;
		double dec5;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter 5 decimal numbers. ");
			dec1 = console.nextDouble();
			dec2 = console.nextDouble();
			dec3 = console.nextDouble();
			dec4 = console.nextDouble();
			dec5 = console.nextDouble();
		System.out.print("Your 5 numbers are " + dec1 +", " + dec2 + ", " + dec3 + ", " + dec4 + ", " + dec5 + ".");
		int ndec1 = (int)(Math.round(dec1));
		int ndec2 = (int)(Math.round(dec2));
		int ndec3 = (int)(Math.round(dec3));
		int ndec4 = (int)(Math.round(dec4));
		int ndec5 = (int)(Math.round(dec5));
		int sum1 = (ndec1 + ndec2 + ndec3 + ndec4 + ndec5);
		int avg1 = ((ndec1 + ndec2 + ndec3 + ndec4 + ndec5)/5);
			System.out.print("\nThe sum of your numbers rounded is " + sum1 + "." + "\nThe average of your numbers rounded is " + avg1 + ".");
	}
}
		