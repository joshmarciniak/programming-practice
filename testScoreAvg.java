import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class testScoreAvg extends JFrame
{
	private JLabel score1L, weight1L, score2L, weight2L, score3L, weight3L, score4L, weight4L, weightedAvgL;
	private JTextField score1TF, weight1TF, score2TF, weight2TF, score3TF, weight3TF, score4TF, weight4TF, weightedAvgTF;
	private JButton calculateB, exitB;
	CalculateButtonHandler cbHandler;
	ExitButtonHandler ebHandler;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 200;
	
	public testScoreAvg()
	{
		Container p = getContentPane();
		setTitle("Weighted Average");
		setVisible(true);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(5, 4));
		score1L = new JLabel("Test Score 1:", SwingConstants.RIGHT);
		weight1L = new JLabel("Test Score 1 Weight:", SwingConstants.RIGHT);
		score2L = new JLabel("Test Score 2:", SwingConstants.RIGHT);
		weight2L = new JLabel("Test Score 2 Weight:", SwingConstants.RIGHT);
		score3L = new JLabel("Test Score 3:", SwingConstants.RIGHT);
		weight3L = new JLabel("Test Score 3 Weight:", SwingConstants.RIGHT);
		score4L = new JLabel("Test Score 4:", SwingConstants.RIGHT);
		weight4L = new JLabel("Test Score 4 Weight:", SwingConstants.RIGHT);
		weightedAvgL = new JLabel("Weighted Average:", SwingConstants.RIGHT);
		score1TF = new JTextField(5);
		weight1TF = new JTextField(5);
		score2TF = new JTextField(5);
		weight2TF = new JTextField(5);
		score3TF = new JTextField(5);
		weight3TF = new JTextField(5);
		score4TF = new JTextField(5);
		weight4TF = new JTextField(5);
		weightedAvgTF = new JTextField(5);
		weightedAvgTF.setEditable(false);
		
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		p.add(score1L);
		p.add(score1TF);
		p.add(weight1L);
		p.add(weight1TF);
		p.add(score2L);
		p.add(score2TF);
		p.add(weight2L);
		p.add(weight2TF);
		p.add(score3L);
		p.add(score3TF);
		p.add(weight3L);
		p.add(weight3TF);
		p.add(score4L);
		p.add(score4TF);
		p.add(weight4L);
		p.add(weight4TF);
		p.add(calculateB);
		p.add(exitB);
		p.add(weightedAvgL);
		p.add(weightedAvgTF);
	}
	public class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double score1, weight1, score2, weight2, score3, weight3, score4, weight4, totalGrade, totalWeight, average;
			score1 = Double.parseDouble(score1TF.getText());
			weight1 = Double.parseDouble(weight1TF.getText());
			score2 = Double.parseDouble(score2TF.getText());
			weight2 = Double.parseDouble(weight2TF.getText());
			score3 = Double.parseDouble(score3TF.getText());
			weight3 = Double.parseDouble(weight3TF.getText());
			score4 = Double.parseDouble(score4TF.getText());
			weight4 = Double.parseDouble(weight4TF.getText());
			totalGrade = (score1*weight1) + (score2*weight2) + (score3*weight3) + (score4*weight4);
			totalWeight = weight1 + weight2 + weight3 + weight4;
			average = totalGrade/totalWeight;
			weightedAvgTF.setText(String.format("%.2f", average));
		}
	}
	public class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
public static void main(String[] args)
{
	testScoreAvg scoreAvg = new testScoreAvg();
}
}