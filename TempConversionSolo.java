import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TempConversionSolo extends JFrame
{
	private JLabel celsiusLabel, fahrenheitLabel;
	private JTextField celsiusTF, fahrenheitTF;
	
	private static final int WIDTH = 500;
	private static final int HEIGTH = 50;
	
	private CelsHandler celsiusHandler;
	private FahrHandler fahrenheitHandler;
	
	private static final double FTOC = 5.0 / 9.0;
	private static final double CTOF = 9.0 / 5.0;
	private static final int OFFSET = 32;
	
	public TempConversionSolo()
	{
		setTitle("Temperature Conversion");
		Container c = getContentPane();
		setSize(WIDTH, HEIGTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		celsiusLabel = new JLabel("Celsius: ", SwingConstants.RIGHT);
		fahrenheitLabel = new JLabel("Fahrenheit: ", SwingConstants.RIGHT);
		celsiusTF = new JTextField(7);
		fahrenheitTF = new JTextField(7);
		
		c.setLayout(new GridLayout(1,4));
		c.add(celsiusLabel);
		c.add(celsiusTF);
		c.add(fahrenheitLabel);
		c.add(fahrenheitTF);
		
		celsiusHandler = new CelsHandler();
		fahrenheitHandler = new FahrHandler();
		
		celsiusTF.addActionListener(celsiusHandler);
		fahrenheitTF.addActionListener(fahrenheitHandler);
	}
	private class CelsHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double celsius, fahrenheit;
			celsius = Double.parseDouble(celsiusTF.getText());
			fahrenheit = celsius * CTOF + OFFSET;
			fahrenheitTF.setText(String.format("%.2f", fahrenheit));
		}
	}
	private class FahrHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double celsius, fahrenheit;
			fahrenheit = Double.parseDouble(fahrenheitTF.getText());
			celsius = (fahrenheit - OFFSET) * FTOC;
			celsiusTF.setText(String.format("%.2f", celsius));
		}
	}
	public static void main(String[] args)
	{
		TempConversionSolo tempConv = new TempConversionSolo();
	}
}