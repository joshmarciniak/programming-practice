import javax.swing.*;
public class ch4ex6
{
	public static void main(String args[])
	{
		int s1, s2, s3, option1, option2, option3;
		String s1s,s2s,s3s;
		s1s = JOptionPane.showInputDialog("Enter the first side length.");
		s1 = Integer.parseInt(s1s);
		s2s = JOptionPane.showInputDialog("Enter the second side length.");
		s2 = Integer.parseInt(s2s);
		s3s = JOptionPane.showInputDialog("Enter the third side length.");
		s3 = Integer.parseInt(s3s);
		option1 = (s1*s1) + (s2 *s2);
		option2 = (s2*s2) + (s3*s3);
		option3 = (s1*s1) + (s3*s3);

			if (option1 == Math.pow(s3,2))
			{
				JOptionPane.showMessageDialog(null, "This triangle is a right triangle.", "Triangle", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (option2 == Math.pow(s1,2))
			{
				JOptionPane.showMessageDialog(null, "This triangle is a right triangle.", "Triangle", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (option3 == Math.pow(s2,2))
			{
				JOptionPane.showMessageDialog(null, "This triangle is a right triangle.", "Triangle", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Not a right triangle.", "Triangle", JOptionPane.ERROR_MESSAGE);
			}

		System.exit(0);
	}
}
			