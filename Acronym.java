//This program was written by Josh Marciniak
import java.util.*;
public class Acronym
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.println("This program asks the user for three words."
						+ "\nThe first letter of each word is extracted, and then the "
						+ "\nacronym formed by the three letters is displayed.");
		System.out.println();
		System.out.print("Please enter three words, separated by blanks: ");
		String input1, input2, input3;
		input1 = console.next();
		input2 = console.next();
		input3 = console.next();
		System.out.println("The acronym of these words is " + input1.charAt(0) + input2.charAt(0) + input3.charAt(0));
	}
}
