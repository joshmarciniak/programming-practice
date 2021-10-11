import javax.swing.*;
public class AscendingNumbers
{
	public static void main(String args[])
	{
		int num1, num2, num3;
		String str1, str2, str3;
		JOptionPane.showMessageDialog(null, "This program will take 3 numbers as input and sort them in ascending order.",
		"Number Sorter", JOptionPane.INFORMATION_MESSAGE);
		str1 = JOptionPane.showInputDialog("Enter your first number: ");
		num1 = Integer.parseInt(str1);
		str2 = JOptionPane.showInputDialog("Enter your second number: ");
		num2 = Integer.parseInt(str2);
		str3 = JOptionPane.showInputDialog("Enter your third number: ");
		num3 = Integer.parseInt(str3);
			if(num1<=num2&&num1<=num3&&num2<=num3)
				JOptionPane.showMessageDialog(null, "Your numbers in ascending order: " + num1 + num2 + num3, "Number Sorter", 
												JOptionPane.INFORMATION_MESSAGE);
				else if(num1<=num2&&num1<=num3&&num3<=num2)
				JOptionPane.showMessageDialog(null, "Your numbers in ascending order: " + num1 + num3 + num2, "Number Sorter", 
												JOptionPane.INFORMATION_MESSAGE);
					else if(num2<=num1&&num2<=num3&&num3<=num1)
				JOptionPane.showMessageDialog(null, "Your numbers in ascending order: " + num2 + num3 + num1, "Number Sorter", 
												JOptionPane.INFORMATION_MESSAGE);
						else if(num2<=num1&&num2<=num3&&num1<=num3)
					JOptionPane.showMessageDialog(null, "Your numbers in ascending order: " + num2 + num1 + num3, "Number Sorter", 
												JOptionPane.INFORMATION_MESSAGE);
							else if(num3<=num1&&num3<=num2&&num1<=num2)
				JOptionPane.showMessageDialog(null, "Your numbers in ascending order: " + num3 + num1 + num2, "Number Sorter", 
												JOptionPane.INFORMATION_MESSAGE);
								else
									JOptionPane.showMessageDialog(null, "Your numbers in ascending order: " + num3 + num2 + num1, "Number Sorter", 
												JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}