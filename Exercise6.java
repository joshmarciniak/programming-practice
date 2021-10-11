import java.util.*;
public class Exercise6
{
	public static void main(String args[])
		{
			Scanner console = new Scanner(System.in);
			double num1;
			System.out.print("Enter a decimal number to be rounded.");
			num1 = console.nextDouble();
			System.out.print((int)(Math.round(num1)));
		}
}
			