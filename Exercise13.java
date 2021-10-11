import java.util.*;
import java.io.*;
import javax.swing.*;

public class Exercise13
{
	public static void main(String args[])
	{
		double originalPrice;
		String originalPriceString;
		originalPriceString = JOptionPane.showInputDialog("Enter the original price of the item.");
		originalPrice = Double.parseDouble(originalPriceString);
		originalPriceString = String.format("Original Price: %.2f%n", originalPrice);
		double markupPercent = .25;
		String markupPercentString;
		markupPercentString = String.format("Markup Percent: %.2f%n", markupPercent);
		double salesTaxRate = 0.07;
		String salesTaxRateString;
		salesTaxRateString = String.format("Sales Tax Rate: %.2f%n", salesTaxRate);
		double salesPrice = originalPrice + (originalPrice * markupPercent);
		String salesPriceString;
		salesPriceString = String.format("Sales Price: %.2f%n", salesPrice);
		double salesTax = salesPrice * salesTaxRate;
		String salesTaxString;
		salesTaxString = String.format("Sales Tax Total: %.2f%n", salesTax);
		double finalPrice = salesPrice + salesTax;
		String finalPriceString;
		finalPriceString = String.format("Final Price: %.2f%n", finalPrice);
		String allInfo = (originalPriceString + "\n" + markupPercentString + "\n" + salesTaxRateString + "\n" + salesPriceString
		+ "\n" + salesTaxString + "\n" + finalPriceString);
		
		JOptionPane.showMessageDialog(null,allInfo , "Final Output", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
		
		