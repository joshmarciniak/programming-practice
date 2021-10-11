//This program was written by Josh Marciniak
import java.util.Scanner;
public class Swap
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		String firstName, secondName;
		System.out.println("You will be asked to enter two names." +
		"\nThe program will display te names you entered, swap "
		+ "\nthe names, and then display them after they are swapped.");
		System.out.println();
		System.out.println("Please enter the first name: ");
		firstName = console.nextLine();
		System.out.println("Please enter the second name: ");
		secondName = console.nextLine();
		System.out.println("You entered " + firstName + " as your first name and " + secondName + " as your second name.");
		System.out.println();
		System.out.println("After swapping the names, " 
		+ "\nthe first name is " + secondName
		+ "\nand the second name is " + firstName + ".");
	}
}
		