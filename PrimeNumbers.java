import java.util.*;
public class PrimeNumbers
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.println("This program takes the input of a positive integer"
							+ "\nand determines whether or not the number is prime.");
		System.out.println();
		System.out.print("Please input a positive integer or enter E to exit: ");
		int input = console.nextInt();
		boolean flag = false;
		while(input != 'E' || input != 'e')
		{
			int i;
			for(i=2;i<=input/2;++i)
			{
				if(input % i == 0)
				{
					flag =true;
					break;
				}
			}
		}
		if(!flag)
				System.out.println(input + " is a prime number");
			else 
				System.out.println(input + " is not a prime number");
	}
}
			