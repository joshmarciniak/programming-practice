import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Assignment1 extends JFrame
{
	//Creates 3 variables of the type JLabel that will be used to label each text field.
	private JLabel num1L, num2L, sumL;
	
	//Creates 3 variables of type JTexField that will be used to input and display output.
	private JTextField num1TF, num2TF, sumTF;
	
	//Creates 2 variables of the type JButton that will be used to execute the actions.
	private JButton calculateB, exitB;
	
	//creates variable of the type CalculateButtonHandler
	CalculateButtonHandler cbHandler;
	
	//creates variable of the type ExitButtonHandler
	ExitButtonHandler ebHandler;
	
	//creates the height and width variables that will be used when sizing the JFrame
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	
	//Creates constructor
	public Assignment1()
	{
		//sets the size of the JFrame to the width and height declared previously
		setSize(WIDTH,HEIGHT);
		//sets the default operation of the JFrame to exit on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//sets the title of the JFrame
		setTitle("Assignment 1");
		
		//creates variable p of type Container that uses method getContentPane(instantiates our content pane)
		Container p = getContentPane();
		
		//sets the layout of the content pane to 4 by 2
		p.setLayout(new GridLayout(4,2));
		
		//defines variables num1L, num2L, and sumL
		num1L = new JLabel("Enter First Number: ", SwingConstants.CENTER);
		num2L = new JLabel("Enter Second Number: ", SwingConstants.CENTER);
		sumL = new JLabel("Sum: ", SwingConstants.CENTER);
		
		//defines varaibles num1TF, num2TF, and sumTF
		num1TF = new JTextField(10);
		num2TF = new JTextField(10);
		sumTF = new JTextField(10);
		
		//defines variable calculateB 
		calculateB = new JButton("Calculate");
		
		//method call for the calculate button
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		
		//defines variable exitB
		exitB = new JButton("Exit");
		
		//method call for exit button
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		//makes it so sumTF cannot be edited by the user
		sumTF.setEditable(false);
		
		//adds labels and text fields to content pane
		p.add(num1L);
		p.add(num1TF);
		p.add(num2L);
		p.add(num2TF);
		p.add(sumL);
		p.add(sumTF);
		p.add(calculateB);
		p.add(exitB);
		
		//makes it so the JFrame is visible
		setVisible(true);
	}
	//creates class that will handle the event when the user clicks the calculate button
	private class CalculateButtonHandler implements ActionListener
	{
		//method of class CalculateButtonHandler
		public void actionPerformed(ActionEvent e)
		{
			//creates variables that will be needed to calculate sum
			double num1, num2, sum;
			
			//converts text in num1TF into a variable of type double then retrieves the value and stores in variable num1
			num1 = Double.parseDouble(num1TF.getText());
			//does the same as above but for num2TF
			num2 = Double.parseDouble(num2TF.getText());
			
			//adds values from num1TF and num2TF
			sum = num1+num2;
			
			//sets the values in sumTF to the value from the sum variable
			sumTF.setText(String.format("%.1f", sum));
		}
	}
	//creates class that will handle what happens when the user clicks on the exit button
	public class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	//creates the main method for the program
	public static void main(String [] args)
	{
		Assignment1 assign1 = new Assignment1();
	}
}
