import java.util.*;
import java.io.*;
public class ch3ex7
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner inFile;
		PrintWriter outFile;
		inFile = new Scanner(new FileReader("Ch3_Ex7Data.txt"));
		outFile = new PrintWriter("Ch3_Ex7Output.dat");
			String lastName, firstName, lastName2, firstName2, lastName3, firstName3;
				lastName = inFile.next();
				firstName = inFile.next();
			double currentSalary, percentSalaryIncrease;
				currentSalary = inFile.nextDouble();
				percentSalaryIncrease = inFile.nextDouble();
				lastName2 = inFile.next();
				firstName2 = inFile.next();
			double currentSalary2, percentSalaryIncrease2;
				currentSalary2 = inFile.nextDouble();
				percentSalaryIncrease2 = inFile.nextDouble();
				lastName3 = inFile.next();
				firstName3 = inFile.next();
			double currentSalary3, percentSalaryIncrease3;
				currentSalary3 = inFile.nextDouble();
				percentSalaryIncrease3 = inFile.nextDouble();
					outFile.println("Employee Name: " + firstName + " " + lastName);
					outFile.printf("Updated Salary: $%.2f%n%n", currentSalary + (currentSalary*(percentSalaryIncrease/100)));
					outFile.println("Employee Name: " + firstName2 + " " + lastName2);
					outFile.printf("Updated Salary: $%.2f%n%n", currentSalary2 + (currentSalary2*(percentSalaryIncrease2/100)));
					outFile.println("Employee Name: " + firstName3 + " " + lastName3);
					outFile.printf("Updated Salary: $%.2f%n%n", currentSalary3 + (currentSalary3*(percentSalaryIncrease3/100)));
		inFile.close();
		outFile.close();
	}
}
					
			