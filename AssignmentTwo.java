//This program is written by Josh Marciniak
//This imports the package javax.swing which contains the JOptionPane
import javax.swing.*;
//This imports the package java.lang which contains the class Math
import java.lang.*;
public class AssignmentTwo{
	public static void main(String args[]){
	//Initializes float variables that will be used in calculations
	float num1, num2, num3, num4, num5;
	//Initializes String variables that will be used with JOptionPane to enter the decimal numbers
	String num1String, num2String, num3String, num4String, num5String;
	//Creates dialog box for user to type in first decimal number
	num1String = JOptionPane.showInputDialog("Please enter first decimal number: ");
	//Takes String value from above input and turns it into a float value
	num1 = Float.parseFloat(num1String);
	num2String = JOptionPane.showInputDialog("Please enter second decimal number: ");
	num2 = Float.parseFloat(num2String);
	num3String = JOptionPane.showInputDialog("Please enter third decimal number: ");
	num3 = Float.parseFloat(num3String);
	num4String = JOptionPane.showInputDialog("Please enter fourth decimal number: ");
	num4 = Float.parseFloat(num4String);
	num5String = JOptionPane.showInputDialog("Please enter fifth decimal number: ");
	num5 = Float.parseFloat (num5String);
		//Initializes double variables sum and avg that will hold the sum and average values
		float sum, avg;
		int convertedSum, convertedAvg;
		/*Adds the values of num1 through num5 to get the sum. Type Casts float value to int
		Calls method round from class Math to round number to integer*/
		sum = (num1+num2+num3+num4+num5);
		convertedSum = (int)Math.round(sum);
		/*Divides the sum by 5 to get the average. Type Casts float value to int.
		Calls method round from class Math to round number to nearest integer*/
		avg = Math.round(sum/5);
		convertedAvg = (int)Math.round(avg);
			//Initializes a String variable that holds the output statement for the output dialog box
			String outputString =("First Number: " + num1 + "\n" +"Second Number: " + num2 + "\n" + 
			"Third Number: " + num3 + "\n" + "Fourth Number: " + num4 + "\n" +
			"Fifth Number: " + num5 + "\n" + "Sum: " + convertedSum + "\n" + "Average: " + convertedAvg);
			//Creates the output dialog box
			JOptionPane.showMessageDialog(null, outputString, "Sum and Average", JOptionPane.INFORMATION_MESSAGE);
			//Exits the system
			System.exit(0);
		}
	}
			
		
		
		
		