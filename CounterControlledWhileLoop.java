import java.util.*;
public class CounterControlledWhileLoop
{
	static Scanner console = new Scanner(System.in);
	public static void main(String args[])
	{
		int limit, number, sum, counter;
		System.out.print("Line 1: Enter the number of integers in the list");
		limit = console.nextInt();
		System.out.println();
		sum = 0;
		counter = 0;
		System.out.println("Line 6: Enter " + limit + " integers.");
		while (counter < limit)
		{
			number = console.nextInt();
			sum = sum + number;
			counter++;
		}
		System.out.printf("Line 11: The sum of the %d numbers = %d%n", limit, sum);
		if (counter != 0)
		System.out.printf("Line 13: The average = %d%n",(sum/counter));
		else
		System.out.println("Line 15: No input.");
	}
}