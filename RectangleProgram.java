//imports package javax.swing that contains the class JFrame
import javax.swing.*;
//imports package java.awt that contains the class Container
import java.awt.*;
import java.awt.event.*;
//Use extends to build the class RectangleProgram on top of the class JFrame. RectangleProgram inherits the properties of JFrame
public class RectangleProgram extends JFrame
{
	//Creates the variables lengthL, widthL, perimeterL, and areaL of type JLabel
	private JLabel lengthL, widthL, perimeterL, areaL;
	
	//Creates the variables lengthTF, widthTF, perimeterTF, and areaTF of the type JTextField
	private JTextField lengthTF, widthTF, perimeterTF, areaTF;
	
	// Creates the variables calculateB and exitB of the type JButton
	private JButton calculateB, exitB;
	
	//creates variable cbHandler and ebHandler 
	CalculateButtonHandler cbHandler;
	ExitButtonHandler ebHandler;
	
	//Use private to have WIDTH and HEIGHT only appear in the class RectangleProgram
	private static final int WIDTH = 400;
	private static final int HEIGHT  = 300;
	
	public RectangleProgram() //constructor
	{
		//instantiates objects lengthL, widthL, perimeterL, and areaL, sets title, and sets alignment
		lengthL = new JLabel("Enter the length: ", SwingConstants.RIGHT);
		widthL = new JLabel("Enter the width: ", SwingConstants.RIGHT);
		perimeterL = new JLabel("Perimeter: ", SwingConstants.RIGHT);
		areaL = new JLabel("Area: ", SwingConstants.RIGHT);
		
		//instantiates objects lengthTF, widthTF, perimeterTF, and areaTF and sets the size to 10
		lengthTF = new JTextField(10);
		widthTF = new JTextField(10);
		perimeterTF = new JTextField(10);
		perimeterTF.setEditable(false);
		areaTF = new JTextField(10);
		areaTF.setEditable(false);
		
		//instantiates objects calculateB and exitB and inputs their titles
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		//Names the title of the window
		setTitle("Area and Perimeter of a Rectangle");
		
		//Declares pane to be a reference variable of type Container
		//Gets the content pane of the window as a container. Reference variable pane now points to the content pane
		Container pane = getContentPane();
		
		//sets the layout of the content pane to a grid layout with 5 rows and 2 columns
		pane.setLayout(new GridLayout(5, 2));
		
		//adds objects lengthL, widthL, perimeterL, and areaL to the content pane. Panes are added from left to right to the content pane
		pane.add(lengthL);
		pane.add(lengthTF);
		pane.add(widthL);
		pane.add(widthTF);
		pane.add(areaL);
		pane.add(areaTF);
		pane.add(perimeterL);
		pane.add(perimeterTF);
		pane.add(calculateB);
		pane.add(exitB);
		//Sets the size of the window too 400 pixels wide and 300 pixels high
		setSize(WIDTH, HEIGHT);
		
		//Displays the window upon execution
		setVisible(true);
		
		//Makes it so the program will close upon clicking the x in the top right corner
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//Builds the class CalculateButtonHandler on top of the interface class ActionListener using implements reserved word
	private class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//declares the variables width, length, area, and perimeter of type double
			double width, length, area, perimeter;
			
			//converts string variable lengthTF to double by using getText method to retrieve the string from this field
			length = Double.parseDouble(lengthTF.getText());
			width = Double.parseDouble(widthTF.getText());
			area = length * width;
			perimeter = 2 * (length + width);
			
			//uses method setText to set the text of the text field to the specified string
			areaTF.setText("" + area);
			perimeterTF.setText("" + perimeter);
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
		//Creates object rectProg of type RectangleProgram (Creates the window specified in the constructor)
		RectangleProgram rectProg = new RectangleProgram();
	}
}