import javax.swing.*;
import java.lang.*;
public class RightTriangle
{
	public static void main(String args[])
	{
		int side1, side2, side3;
		String str1, str2, str3;
		JOptionPane.showMessageDialog(null, "This program takes 3 side lengths and determines if they are a right triangle.", "Right Triangle or Not", JOptionPane.INFORMATION_MESSAGE);
			str1 = JOptionPane.showInputDialog("Enter first side length: ");
			side1 = Integer.parseInt(str1);
			str2 = JOptionPane.showInputDialog("Enter second side length: ");
			side2 = Integer.parseInt(str2);
			str3 = JOptionPane.showInputDialog("Enter first side length: ");
			side3 = Integer.parseInt(str3);
				if((Math.sqrt(side1) + Math.sqrt(side2)) == Math.sqrt(side3))
				JOptionPane.showMessageDialog(null, "This IS a right triangle.", "Right Triangle or Not",JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "This IS NOT a right triangle.", "Right Triangle or Not",JOptionPane.INFORMATION_MESSAGE);
					
		System.exit(0);
	}
	
}	