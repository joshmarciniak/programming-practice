//This program was written by Josh Marciniak
import java.util.*;
import java.io.*;
public class Assignment3
{
	public static void main(String args[]) throws FileNotFoundException
	//Must throw FileNotFoundException so program will not run if input file does not exist
	{
		//Initializes Scanner and PrintWriter
		Scanner inFile;
		PrintWriter outFile;
		//13 and 14 declare the name of the input file and the name the output file will have
		inFile = new Scanner(new FileReader("Ch3_Ex7Data.txt"));
		outFile = new PrintWriter("Ch3_Ex7Output.dat");
		//16 and 17 initialize the variables for the 3 employees names, salaries, and increase percent
		String firstName1, firstName2, firstName3, lastName1, lastName2, lastName3;
		Double salary1, salary2, salary3, percentIncrease1, percentIncrease2, percentIncrease3;
		//19 through 30 use the scanner to get the input from the data file and assign it to variables
		lastName1 = inFile.next();
		firstName1 = inFile.next();
		salary1 = inFile.nextDouble();
		percentIncrease1 = inFile.nextDouble();
		lastName2 = inFile.next();
		firstName2 = inFile.next();
		salary2 = inFile.nextDouble();
		percentIncrease2 = inFile.nextDouble();
		lastName3 = inFile.next();
		firstName3 = inFile.next();
		salary3 = inFile.nextDouble();
		percentIncrease3 = inFile.nextDouble();
		//32-38 format the ouput and print it to the output file
			outFile.println("Employee Name: " + firstName1 + " " + lastName1);
					outFile.printf("Updated Salary: $%.2f%n%n", salary1 + (salary1*(percentIncrease1/100)));
					outFile.println("Employee Name: " + firstName2 + " " + lastName2);
					outFile.printf("Updated Salary: $%.2f%n%n", salary2 + (salary2*(percentIncrease2/100)));
					outFile.println("Employee Name: " + firstName3 + " " + lastName3);
					outFile.printf("Updated Salary: $%.2f%n%n", salary3 + (salary3*(percentIncrease3/100)));
		//39 and 40 close the input file and the output file
		inFile.close();
		outFile.close();
	}
}
		
	