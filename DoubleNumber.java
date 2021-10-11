import javax.swing.JOptionPane;
public class NumberDouble
{
	public static void main(String args[])
	{
	int originalNumber;
	String originalNumberString;
	int calculatedAnswer;
	originalNumberString = JOptionPane.showInputDialog("Enter number to double or 0 to end:");
	originalNumber = Inter.parseInt(OriginalNumberString);
	while(originalNumber != 0)
		{
		calculatedAnswer = originalNumber * 2;
		System.out.println(originalNumber + " doubled is " + calculatedAnswer);
		originalNumberString = JOptionPane.showInputDialog( "Enter number to double or 0 to end: ");
		originalNumber = Integer.parseInt(originalNumberString);
		{

	}
}
