import java.io.*;
import java.util.*;
public class Assignment3UsingLoop
{
	public static void main(String args[]) throws FileNotFoundException
	{
		String firstname, lastname;
		double currentsalary, percentsalaryincrease, newsalary;
		int count = 0;
		Scanner inFile = new Scanner(new FileReader("Ch3_Ex7Data.txt"));
		PrintWriter outFile = new PrintWriter("Ch3_Ex7Output.dat");
		while (inFile.hasNext())
		{
			firstname = inFile.next();
			lastname = inFile.next();
			currentsalary = inFile.nextDouble();
			percentsalaryincrease = inFile.nextDouble();
			outFile.printf("%-12s %-12s %4.2f %n", firstname, lastname, ((currentsalary*percentsalaryincrease)/100));
		}
	inFile.close();
	outFile.close();
	}
}
		
		
		