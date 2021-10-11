import java.util.*;
import java.io.*;
public class ch4ex11
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner inFile;
		PrintWriter outFile;
		inFile = new Scanner(new FileReader("banking.txt"));
		outFile = new PrintWriter("bankinginfo.dat");
		double currentBalance, newBalance, minBalance;
		int accNumber;
		char accType;
		String accTypeString;
			accNumber = inFile.nextInt();
			accTypeString = inFile.next();
			accType = accTypeString.charAt(0);
			minBalance = inFile.nextDouble();
			currentBalance = inFile.nextDouble();
				outFile.println("Account Number: " + accNumber);
				if (accType == 'c' || accType == 'C' && currentBalance >= minBalance && currentBalance <= (minBalance+5000))
				{
				outFile.println("Account Type: Checking");
				outFile.printf("Current Balance: $%.2f%n%n", currentBalance);
				newBalance = currentBalance + (currentBalance*.03);
				outFile.printf("New Balance: %.2f", newBalance);
				}
				else if (accType == 'c' || accType == 'C' && currentBalance >= minBalance && currentBalance >= (minBalance+5000))
				{
					outFile.println("Account Type: Checking");
					outFile.printf("Current Balance: $%.2f%n%n", currentBalance);
					newBalance = currentBalance + (currentBalance*.05);
					outFile.printf("New Balance: %.2f", newBalance);
				}
				else if (accType == 'c' || accType == 'C' && currentBalance < minBalance)
				{
					outFile.println("Account Type: Checking");
					outFile.printf("Current Balance: $%.2f%n%n", currentBalance);
					newBalance = currentBalance - 25;
					outFile.printf("New Balance: %.2f", newBalance);
				}
					else if (accType == 's' || accType == 'S' && currentBalance >= minBalance)
					{
						outFile.println("Account Type: Savings");
						outFile.printf("Current Balance: $%.2f%n%n", currentBalance);
						newBalance = currentBalance + (currentBalance*.04);
						outFile.printf("New Balance: %.2f", newBalance);
					}
					else if (accType == 's' || accType == 'S' && currentBalance < minBalance)
					{
						outFile.println("Account Type: Savings");
						outFile.printf("Current Balance: $%.2f%n%n", currentBalance);
						newBalance = currentBalance - 10 ;
						outFile.printf("New Balance: %.2f", newBalance);
					}
							else if (accType != 's' && accType != 'S' && accType != 'c' && accType != 'C')
							{
								outFile.println("Account Type: INVALID ACCOUNT TYPE");
							}		
		inFile.close();
		outFile.close();
	}
	
}
			
			