import java.util.*;
public class ch3ex4
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		double cost;
		double area;
		System.out.println("Enter the amount of fertilizer, in pounds, in one bag: ");
		double bagsize;
		bagsize = console.nextDouble();
		System.out.println();
		System.out.println("Enter the cost of the " + bagsize + " pound fertilizer bag: ");
		cost = console.nextDouble();
		System.out.println();
		System.out.println("Enter the area, in square feet, that can be fertilized by one bag: ");
		area = console.nextDouble();
		System.out.println();
		System.out.printf("The cost of the fertilizer per pound is:$%.2f%n%n",cost/bagsize);
		System.out.printf("The cost of fertilizing per square foot is $%.2f",cost/area);
		
	}
}