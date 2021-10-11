import javax.swing.*;
public class ch4ex8
{
	public static void main(String args[])
	{
		int num1, num2, answer;
		String operatorString, num1String, num2String;
		char operator;
		num1String = JOptionPane.showInputDialog("Enter first operand: ");
		num1 = Integer.parseInt(num1String);
		operatorString = JOptionPane.showInputDialog("Enter arithmetic operator(+,-,*,/): ");
		operator = operatorString.charAt(0);
		num2String = JOptionPane.showInputDialog("Enter second operand: ");
		num2 = Integer.parseInt(num2String);
			if (operator == '+')
			{
				answer = (num1 + num2);
				JOptionPane.showMessageDialog(null, "Your answer = " + answer, "Calculator", JOptionPane.INFORMATION_MESSAGE);	
			}
			else if (operator == '-')
			{
				answer = (num1 - num2);
				JOptionPane.showMessageDialog(null, "Your answer = " + answer, "Calculator", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (operator == '*')
			{
				answer = (num1 * num2);
				JOptionPane.showMessageDialog(null, "Your answer = " + answer, "Calculator", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (operator == '/')
			{
				answer = (num1 / num2);
				JOptionPane.showMessageDialog(null, "Your answer = " + answer, "Calculator", JOptionPane.INFORMATION_MESSAGE);
			}
				System.exit(0);
	}
}
		
		