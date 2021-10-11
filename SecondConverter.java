import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SecondConverter extends JFrame
{
	private JLabel secondsL, yearsL, weeksL, daysL, hoursL, minutesL;
	private JTextField secondsTF, yearsTF, weeksTF, daysTF, hoursTF, minutesTF;
	private JButton calculateB, exitB;
	
	CalculateButtonHandler cbHandler;
	ExitButtonHandler ebHandler;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	
	public SecondConverter()
	{
		Container p = getContentPane();
		p.setLayout(new GridLayout(7,2));
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Seconds Converter");
		
		secondsL = new JLabel("Seconds: ", SwingConstants.RIGHT);
		yearsL = new JLabel("Years: ", SwingConstants.RIGHT);
		weeksL = new JLabel("Weeks: ", SwingConstants.RIGHT);
		daysL = new JLabel("Days: ", SwingConstants.RIGHT);
		hoursL = new JLabel("Hours: ", SwingConstants.RIGHT);
		minutesL = new JLabel("Minutes: ", SwingConstants.RIGHT);
		
		secondsTF = new JTextField(7);
		yearsTF = new JTextField(7);
		yearsTF.setEditable(false);
		weeksTF = new JTextField(7);
		weeksTF.setEditable(false);
		daysTF = new JTextField(7);
		daysTF.setEditable(false);
		hoursTF = new JTextField(7);
		hoursTF.setEditable(false);
		minutesTF = new JTextField(7);
		minutesTF.setEditable(false);
		
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		p.add(secondsL);
		p.add(secondsTF);
		p.add(yearsL);
		p.add(yearsTF);
		p.add(weeksL);
		p.add(weeksTF);
		p.add(daysL);
		p.add(daysTF);
		p.add(hoursL);
		p.add(hoursTF);
		p.add(minutesL);
		p.add(minutesTF);
		p.add(calculateB);
		p.add(exitB);
	}
	private class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double seconds, years, weeks, days, hours, minutes;
			seconds = Double.parseDouble(secondsTF.getText());
			years = seconds / 31536000;
			weeks = seconds / 604800;
			days = seconds / 86400;
			hours = seconds / 3600;
			minutes = seconds / 60;
			yearsTF.setText(String.format("%.3f", years));
			weeksTF.setText(String.format("%.3f", weeks));
			daysTF.setText(String.format("%.3f", days));
			hoursTF.setText(String.format("%.3f", hours));
			minutesTF.setText(String.format("%.3f", minutes));
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
		SecondConverter secondConv = new SecondConverter();
	}
}
	