import javax.swing.*;
public class ch4ex3
{
	public static void main(String args[])
	{
		int num9;
		char ch = 'A';
		String num9String;
		num9String = JOptionPane.showInputDialog("Enter a number between 0 and 35");
		num9 = Integer.parseInt(num9String);
		
			if(num9 <= 9)
			{
				JOptionPane.showMessageDialog(null, "The number is " + num9 + ".", "Numbers", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (num9 >= 10 && num9 <= 35)
			{
			JOptionPane.showMessageDialog(null, "The character is " + (char)(num9 + 55), "Character", 
			JOptionPane.INFORMATION_MESSAGE);
			}
			else if (num9 > 35)
			{
			JOptionPane.showMessageDialog(null, "INVALID NUMBER!", "ERROR", 
			JOptionPane.ERROR_MESSAGE);	
			System.exit(0);
			}
	}
}
	
				