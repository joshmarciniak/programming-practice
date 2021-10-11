import javax.swing.JOptionPane;
import java.io.*;
public class ch4ex14
{
	public static void main(String args[]) throws FileNotFoundException
	{
		PrintWriter outFile;
		outFile = new PrintWriter("cellbill.dat");
		int accNumber;
		double regService, premService, regServiceDue, premServiceDue, dayMinutes, nightMinutes, regMinutes;
		char service;
		String serviceString, accNumberString, dayMinutesString, nightMinutesString, regMinutesString;
		regService = 10.00;
		premService = 25.00;
			accNumberString = JOptionPane.showInputDialog("Enter an account number:");
			accNumber = Integer.parseInt(accNumberString);
			outFile.println("Account Number: " + accNumber);
			serviceString = JOptionPane.showInputDialog("Enter R for regular service and P for premium service:");
			service = serviceString.charAt(0);
			if (service == 'R'||service == 'r')
			{
				outFile.println("Service Type: Regular");
				regMinutesString = JOptionPane.showInputDialog("Enter the number of minutes used:");
				regMinutes = Double.parseDouble(regMinutesString);
				outFile.printf("Minutes Used: %.1f%n",regMinutes);
				if (regMinutes <= 50)
				{
					regServiceDue = regService;
					outFile.printf("Amount Due: $%.2f",regServiceDue);
				}
				else
				{
					regServiceDue = regService + ((regMinutes-50) * .20);
					outFile.printf("Amount Due: $%.2f",regServiceDue);
				}
					
			}
			else if (service =='P'||service == 'p')
			{
				outFile.println("Service Type: Premium");
				dayMinutesString = JOptionPane.showInputDialog("Enter number of minutes used from 6:00am to 6:00pm:");
				dayMinutes = Double.parseDouble(dayMinutesString);
				nightMinutesString = JOptionPane.showInputDialog("Enter number of minutes used from 6:00pm to 6:00am:");
				nightMinutes = Double.parseDouble(nightMinutesString);	
				outFile.printf("Day Minutes Used: %.1f	Night Minutes Used: %.1f%n",dayMinutes,nightMinutes);
				if (dayMinutes <= 75 && nightMinutes <= 100)
				{
					premServiceDue = premService;
					outFile.printf("Amount Due: $%.2f",premServiceDue);
				}
				else if (dayMinutes > 75 && nightMinutes <=100)
				{
					premServiceDue = premService + ((dayMinutes-75)*.10);
					outFile.printf("Amount Due: $%.2f",premServiceDue);
				}
				else if (dayMinutes <=50 && nightMinutes > 100)
				{
					premServiceDue = premService + ((nightMinutes-100)*.05);
					outFile.printf("Amount Due: $%.2f",premServiceDue);
				}
				else if (dayMinutes > 75 && nightMinutes > 100)
				{
					premServiceDue = premService + ((dayMinutes-75)*.10) + ((nightMinutes-100)*.05);
					outFile.printf("Amount Due: $%.2f",premServiceDue);
				}
					
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Service Type.", "Service Type Error", JOptionPane.ERROR_MESSAGE);
			}
			outFile.close();
	}
}
			
		
		
		