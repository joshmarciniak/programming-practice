import javax.swing.*;
public class Calculator
{
	public static void main(String args[])
	{
		double num1, num2, result;
		String str1, str2, operatorStr;
		char operator;
		JOptionPane.showMessageDialog(null,"This program works as a calculator, taking 2 numbers and an operator and calculating the answer", 
		"Calculator", JOptionPane.INFORMATION_MESSAGE);
		str1 = JOptionPane.showInputDialog("Enter first number: ");
		num1 = Double.parseDouble(str1);
		operatorStr = JOptionPane.showInputDialog("Enter the operator(+,-,*, or /): ");
		operator = operatorStr.charAt(0);
		str2 = JOptionPane.showInputDialog("Enter second number: ");
		num2 = Double.parseDouble(str2);
		if(operator == '+')
		{
			result = (num1 + num2);
			JOptionPane.showMessageDialog(null, "Answer: " + num1 + " + " + num2 + " = " + result, "Calculator", JOptionPane.INFORMATION_MESSAGE);
		}
			else if(operator == '-')
			{
				result = (num1 - num2);
				JOptionPane.showMessageDialog(null, "Answer: " + num1 + " - " + num2 + " = " + result, "Calculator", JOptionPane.INFORMATION_MESSAGE);
			}
				else if(operator == '*')
				{
					result = (num1 * num2);
					JOptionPane.showMessageDialog(null, "Answer: " + num1 + " * " + num2 + " = " + result, "Calculator", JOptionPane.INFORMATION_MESSAGE);
				}
					else if (operator == '/')
					{
						result = (num1/num2);
						JOptionPane.showMessageDialog(null, "Answer: " + num1 + " / " + num2 + " = " + result, "Calculator", JOptionPane.INFORMATION_MESSAGE);
					}
						 else
							JOptionPane.showMessageDialog(null, "Not a valid operator.", "Calculator", JOptionPane.ERROR_MESSAGE);
	System.exit(0);
	}
}