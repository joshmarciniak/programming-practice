import java.util.*;
import java.io.*;
public class ch3ex6
{
	public static void main(String args[]) throws FileNotFoundException
	{
		PrintWriter outFile;
		outFile = new PrintWriter("checkstub.dat");
		Scanner console = new Scanner(System.in);
		String firstName, lastName;
		System.out.println("Enter Employee First Name: ");
		firstName = console.next();
		System.out.println("Enter Employee Last Name: ");
		lastName = console.next();
		double grossAmt;
		System.out.println("Enter Gross Amount: ");
		grossAmt = console.nextDouble();
		double fedIncTax, stateTax, ssTax, medicareTax, pensionPlan, healthInsurance, fedIncDeduction,stateTaxDeduction,
		ssTaxDeduction, medicareTaxDeduction, pensionPlanDeduction;
			fedIncTax = .15;
			fedIncDeduction = grossAmt*fedIncTax;
			stateTax = .035;
			stateTaxDeduction = grossAmt*stateTax;
			ssTax = .0575;
			ssTaxDeduction = grossAmt*ssTax;
			medicareTax = .0275;
			medicareTaxDeduction = grossAmt*medicareTax; 
			pensionPlan = .05;
			pensionPlanDeduction = grossAmt*pensionPlan;
			healthInsurance = 75.00;
				outFile.println(firstName + " " + lastName + "\r\n");
				outFile.printf("Gross Amount:		$%.2f%n%n", grossAmt);
				outFile.printf("Federal Tax:		$%.2f%n%n", fedIncDeduction);
				outFile.printf("State Tax:		$%.2f%n%n", stateTaxDeduction);
				outFile.printf("Social Security Tax:	$%.2f%n%n", ssTaxDeduction);
				outFile.printf("Medicare Tax:		$%.2f%n%n", medicareTaxDeduction);
				outFile.printf("Pension Plan: 		$%.2f%n%n", pensionPlanDeduction);
				outFile.printf("Health Insuranct: 	$%.2f%n%n", healthInsurance);
				outFile.printf("Net Pay:		$%.2f%n%n", grossAmt - (fedIncDeduction + stateTaxDeduction + ssTaxDeduction
				+ medicareTaxDeduction + pensionPlanDeduction + healthInsurance));
			outFile.close();
	}
}
		
		
			