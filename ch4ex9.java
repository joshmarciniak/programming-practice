import javax.swing.*;
public class ch4ex9
{
	public static void main(String args[])
	{
		double num1, num2, answer;
		String num1String, num2String, operatorString;
		char operator;
		num1String = JOptionPane.showInputDialog("Enter first operand: ");
		num1 = Double.parseDouble(num1String);
		operatorString = JOptionPane.showInputDialog("Enter arithmetic operator(+,-,*, or /)");
		operator = operatorString.charAt(0);
		num2String = JOptionPane.showInputDialog("Enter second operand: ");
		num2 = Double.parseDouble(num2String);
			if (operator == '+')
			{
				answer = (num1 + num2);
				JOptionPane.showMessageDialog(null,(String.format("Your answer = %.2f",answer)), "Calculator", JOptionPane.INFORMATION_MESSAGE);	
			}
			else if (operator == '-')
			{
				answer = (num1 - num2);
				JOptionPane.showMessageDialog(null,(String.format("Your answer = %.2f",answer)), "Calculator", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (operator == '*')
			{
				answer = (num1 * num2);
				JOptionPane.showMessageDialog(null,(String.format("Your answer = %.2f", answer)), "Calculator", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (operator == '/')
			{
				answer = (num1 / num2);
			JOptionPane.showMessageDialog(null, (String.format("Your answer = %.2f", answer)), "Calculator", JOptionPane.INFORMATION_MESSAGE);
			}
				System.exit(0);
	}
}