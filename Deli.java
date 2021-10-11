//This program was written by Josh Marciniak
import java.util.Scanner;
public class Deli
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		String sandwichType, breadType, condiment, drink, sandwichSize;
		System.out.println("Welcome to the Sandwich Corral");
		System.out.println();
		System.out.println("You will be given choices for building your sandwich.");
		System.out.println("Please enter your selection after each prompt and then press the Enter key.");
		System.out.println();
		System.out.println("Please enter your sandwich choice.");
		System.out.println("Ham, Beef, Reuben, PBJ, Cheese, or Vegetarian: ");
		sandwichType = console.nextLine();
		System.out.println("Please enter your bread selection.");
		System.out.println("Rye, Wheat, White, Sourdough, or Pumpernickel: ");
		breadType = console.nextLine();
		System.out.println("Please enter your choice of condiment (one only).");
		System.out.println("Mayo, Mustard, Ketchup, none: ");
		condiment = console.nextLine();
		System.out.println("Please enter your drink choice.");
		System.out.println("Coke, Diet, Tea, Coffee, or Water: ");
		drink = console.nextLine();
		System.out.println("Please enter 3.99 for a half sandwich or 5.99 for a whole sandwich: ");
		sandwichSize = console.nextLine();
		System.out.println("You have entered the following information:\n"
		+ "\nSandwich:\t" + sandwichType
		+ "\nBread:\t\t" + breadType
		+ "\nCondiment:\t" + condiment
		+ "\nDrink:\t\t" + drink
		+ "\n\nTab:\t\t" + sandwichSize);
	
	}
}