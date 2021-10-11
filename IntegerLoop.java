import java.io.*;
import java.util.*;
public class IntegerLoop
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		String inputNum;
		int sumNum;
		int sum = 0;
		inputNum = console.next();
		int counter = 0;
		while(counter < inputNum.length())
		{
			char ch = inputNum.charAt(counter);
			if(ch>=48 && ch<=57)
			{
				char outputNum = ch;
				sumNum = Integer.parseInt(String.valueOf(ch));
				sum += sumNum;
				counter++;
				System.out.print(ch + " ");
			}
		}
		System.out.println();
		System.out.println("Sum: " + sum);
	}
}