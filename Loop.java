import java.io.*;
import java.util.*;
public class Loop
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		String input;
		System.out.print("Enter an integer: ");
		input = console.next();
		int sum, counter,num;
		counter = 0;
		sum = 0;
		while(counter < input.length())
		{
			char ch = input.charAt(counter);
			if(ch>=48&&ch<=57)
			{
				num = Integer.parseInt(String.valueOf(ch));
				sum += num;
				System.out.print(num + " ");
			}			
			counter++;
		}
		System.out.println();
		System.out.println("Sum: " + sum);
	}
}