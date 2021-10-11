import java.util.*;
import java.io.*;
public class Ch3_Example
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner inFile;
		PrintWriter outFile;
		inFile = new Scanner(new FileReader("inData.txt"));
		outFile = new PrintWriter("outData.dat");
		double length, width, radius, circumference, area, parameter;
		String firstName, lastName;
		int age;
		double begAccBalance, intRate, eomBalance;
		char letter;
		length = inFile.nextDouble();
		width = inFile.nextDouble();
		radius = inFile.nextDouble();
		firstName = inFile.next();
		lastName = inFile.next();
		age = inFile.nextInt();
		begAccBalance = inFile.nextDouble();
		intRate = inFile.nextDouble();
		eomBalance = begAccBalance + (begAccBalance * intRate);
		letter = (inFile.next()).charAt(0);
			outFile.println("Rectangle: ");
			outFile.print("Length =  " + length + "," + " Width = " + width);
			outFile.printf(", area = %.2f, perimeter = %.2f%n%n",length * width, ((2*length)+(2*width)));
			outFile.println("Circle: ");
			outFile.print("Radius = " + radius);
			outFile.printf(", Area = %.2f, Circumferance = %.2f%n%n",Math.pow(radius, 2) * 3.1416, 2 * 3.1416 * radius);
			outFile.println("Name: " + firstName + " " + lastName + ", age: " + age);
			outFile.println("Beginning Balance =$" + begAccBalance + ", interest rate = " + intRate);
			outFile.println("Balance at the end of the month = $" + eomBalance);
			outFile.println("\r\nThe character that comes after " + letter + " in the ASCII set is " + (char)(letter + 1));
		inFile.close();
		outFile.close();
	}
}
			
		
		
		
		
		
		
		
		