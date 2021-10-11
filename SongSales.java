//This program was written by Josh Marciniak
import java.util.Scanner;
public class SongSales
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		String songName;
		double price, revenue, agentCommission, internetCommission;
		int copiesSold;
		System.out.println("This program calculates the revenue earned and commission paid for a " +
		"\nsong sold over the Internet.");
		System.out.println("Please enter the name of the song: ");
		songName = console.nextLine();
		System.out.println("Please enter the selling price in dollars and cents: ");
		price = console.nextDouble();
		System.out.println("Please enter the number of copies sold: ");
		copiesSold = console.nextInt();
		revenue = price * copiesSold;
		agentCommission = (revenue * .12);
		internetCommission = (revenue * .03);
		System.out.println(copiesSold + " copies of the song " + '"' + songName + '"' + " were sold at $" + price
		+ "\nper copy, for a total revenue of $" + revenue);
		System.out.println();
		System.out.println("The commission received by your agent is $" + agentCommission
		+ "\nThe commission received by the Internet site is $" + internetCommission);
	}
}
		