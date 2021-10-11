import javax.swing.JOptionPane;
public class ch4e2
{
	public static void main(String args[])
	{
		int num1, num2, num3, first, second, third;
		String num1String, num2String, num3String;
		num1String = JOptionPane.showInputDialog("Enter first of three numbers.");
		num1 = Integer.parseInt(num1String);
		num2String = JOptionPane.showInputDialog("Enter third of three numbers.");
		num2 = Integer.parseInt(num1String);
		num3String = JOptionPane.showInputDialog("Enter final number.");
		num3 = Integer.parseInt(num1String);
			if (num1 < num2 && num2 < num3)
				first = num1;
				second = num2;
				third = num3; 
				JOptionPane.showMessageDialog(null, "Number order: " + first + second + third, "Numbers", JOptionPane.INFORMATION_MESSAGE);
			if (num1 > num2 && num2 > num3)
					first = num3;
					second = num2;
					third = num1;
					JOptionPane.showMessageDialog(null, "Number order: " + first + second + third, "Numbers", JOptionPane.INFORMATION_MESSAGE);
			if (num1<num2 && num2>num3 && num1>num3)
						first = num3;
						second = num1;
						third = num2;
						JOptionPane.showMessageDialog(null, "Number order: " + first + second + third, "Numbers", JOptionPane.INFORMATION_MESSAGE);
			if(num1>num2 && num1<num3)
							first = num2;
							second = num1;
							third = num3;
							JOptionPane.showMessageDialog(null, "Number order: " + first + second + third, "Numbers", JOptionPane.INFORMATION_MESSAGE);
						
				
	}			
}				
			