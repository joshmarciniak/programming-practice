import javax.swing.*;
public class ch4ex2
{
	public static void main(String args[])
	{
		int num1, num2, num3, first, second, third;
		String num1String, num2String, num3String;
		num1String = JOptionPane.showInputDialog("Enter first of three numbers.");
		num1 = Integer.parseInt(num1String);
		num2String = JOptionPane.showInputDialog("Enter seond of three numbers.");
		num2 = Integer.parseInt(num2String);
		num3String = JOptionPane.showInputDialog("Enter final number.");
		num3 = Integer.parseInt(num3String);
			if (num1 > num2)
			{
				first = num2;
				second = num1;
			}
			else 
			{
				first = num1;
				second = num2;
			}
				if (num3 < second && num3 < first && num2 > num1)
				{
					first = num3;
					second = num1;
					third = num2;	
				}
				else if (num3 < second && num3 < first && num2 < num1)
				{
					first = num3;
					second = num2;
					third = num1;
				}
				else if (num3 < second && num3 > first && num1<num3)
				{
					third = num2;
					second = num3;
					first = num1;
				}
				else if (num3 < second && num3 > first && num1>num3)
				{
					first = num2;
					second = num3;
					third = num1;
				}
					else
					{
						third = num3;
					}
		JOptionPane.showMessageDialog(null, "Your numbers in nondescending order are " + first + ", " + second +
		", " + third + ".", "Ordered Numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}			
}				
			