import java.util.*;
public class Test2
{
	static Scanner console = new Scanner(System.in);
	public static void main(String args[])
	{
	System.out.print("Input an integer: ");
	String num = console.next();
	System.out.println();
	int i = 0, sum= 0;
	while(i<num.length())
	{
		char ch = num.charAt(i);
		if((ch>=48)&&(ch<=57))
		{
			int digit = Integer.parseInt(String.valueOf(ch));
			sum += digit;
			System.out.print(digit + " ");
		}
		i++;
	}
	System.out.println();
	System.out.println("Sum: " + sum);
	}
}

		