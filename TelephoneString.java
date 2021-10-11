import javax.swing.*;
public class TelephoneString
{
	public static void main(String args[])
	{
		char ch;
		String input;
		int counter;
		input = JOptionPane.showInputDialog("Please input a telephone number.");
		JOptionPane.showMessageDialog(null, input, "InputTest", JOptionPane.PLAIN_MESSAGE);
	}
}
		