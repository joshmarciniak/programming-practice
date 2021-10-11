import java.util.*;
public class Exercise8
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
			System.out.print("The sum of the numbers to the nearest integer is... " + Math.round((dec1 + dec2 + dec3 + dec4 + dec5)));
	}
}
			