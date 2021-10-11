import javax.swing.JOptionPane;
import java.util.*;
public class PaneLoop
{
	public static void main(String args[])
	{
		String input;
		input = JOptionPane.showInputDialog("Input an integer: ");
		int sum, output, counter;
		sum = 0;
		counter = 0;
		while(counter < input.length())
		{
			char ch = input.charAt(counter);
			if(ch>=48&&ch<=57)
			{
				char outputValue = ch;
				output = Integer.parseInt(String.valueOf(ch));
				sum +=output;
				counter++;
			}
			JOptionPane.showMessageDialog(null, ch + " " , "Output Value", JOptionPane.INFORMATION_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, "Sum: " + sum, "Sum", JOptionPane.INFORMATION_MESSAGE);
	}
}