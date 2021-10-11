import javax.swing.JOptionPane;
public class ch4ex1
{
	public static void main(String args[])
	{
		int num;
		String numString;
		numString = JOptionPane.showInputDialog("Please enter a number.");
		num = Integer.parseInt(numString);
			if (num > 0)
				JOptionPane.showMessageDialog(null, "The number is positive.", "Numbers", JOptionPane.INFORMATION_MESSAGE);
				else if (num < 0) 
					JOptionPane.showMessageDialog(null, "The number is negative.", "Numbers", JOptionPane.INFORMATION_MESSAGE);
						else 
							JOptionPane.showMessageDialog(null, "The number is zero.","Numbers", JOptionPane.INFORMATION_MESSAGE);
	}
}
		
		