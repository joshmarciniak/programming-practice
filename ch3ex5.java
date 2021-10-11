import java.util.*;
import java.io.*;
public class ch3ex5
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner inFile;
		inFile = new Scanner(new FileReader("ticketdata.txt"));
		Double boxPrice, boxSold, sidelinePrice, sidelineSold, premiumPrice, premiumSold, genPrice, genSold;
		boxPrice = inFile.nextDouble();
		boxSold = inFile.nextDouble();
		sidelinePrice = inFile.nextDouble();
		sidelineSold = inFile.nextDouble();
		premiumPrice = inFile.nextDouble();
		premiumSold = inFile.nextDouble();
		genPrice = inFile.nextDouble();
		genSold = inFile.nextDouble();
		System.out.printf("Price of Box Ticket: $%.2f Number of Box Tickets Sold: %.2f%n%n", boxPrice, boxSold);
		System.out.printf("Total of Box Ticket Sales: $%.2f%n%n", boxPrice*boxSold);
		System.out.printf("Price of Sideline Ticket: $%.2f Number of Sideline Tickets Solde: %.2f%n%n", 
		sidelinePrice, sidelineSold);
		System.out.printf("Total of Sideline Ticket Sales: $%.2f%n%n", sidelinePrice*sidelineSold);
		System.out.printf("Price of Premium Ticket: $%.2f Number of Premium Tickets Sold: %.2f%n%n", premiumPrice,
		premiumSold);
		System.out.printf("Total of Premium Ticket Sales: $%.2f%n%n", premiumPrice*premiumSold);
		System.out.printf("Price of General Admission Ticket: $%.2f Number of General Admission Tickets Sold: %.2f%n%n", 
		genPrice, genSold);
		System.out.printf("Total of General Admission Ticket Sales: $%.2f%n%n", genPrice*genSold);
		
		
	}
}
		
		
		
		
		