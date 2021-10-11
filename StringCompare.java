import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StringCompare extends JFrame
{
	private JLabel string1L, string2L, largestL;
	private JTextField string1TF, string2TF, largestTF;
	private JButton exitB, compareB;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	
	CompareButtonHandler cbHandler;
	ExitButtonHandler ebHandler;
	
	public StringCompare()
	{
		Container p = getContentPane();
		p.setLayout(new GridLayout(4,2));
		setSize(WIDTH, HEIGHT);
		setTitle("String Comparing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		string1L = new JLabel("First String: ", SwingConstants.RIGHT);
		string1TF = new JTextField(10);
		string2L = new JLabel("Second String: ", SwingConstants.RIGHT);
		string2TF = new JTextField(10);
		largestL = new JLabel("Larger String: ", SwingConstants.RIGHT);
		largestTF = new JTextField(10);
		largestTF.setEditable(false);
		
		compareB = new JButton("Compare");
		cbHandler = new CompareButtonHandler();
		compareB.addActionListener(cbHandler);
		
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		p.add(string1L);
		p.add(string1TF);
		p.add(string2L);
		p.add(string2TF);
		p.add(largestL);
		p.add(largestTF);
		p.add(compareB);
		p.add(exitB);
	}
	private class CompareButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int str1, str2;
			str1 = String.length(string1TF);
			str2 = String.length(string2TF);
			
		}
	}
	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
		
	public static void main(String[] args)
	{
		StringCompare str2 = new StringCompare();
	}
}
		