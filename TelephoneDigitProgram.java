import javax.swing.JOptionPane;
public class TelephoneDigitProgram
{
	public static void main(String args[])
	{
		char letter;
		String inputMessage, inputString, outputMessage;
		inputMessage = "Program to convert uppercase letters to their corresponding telephone digits.\n"
					+ "To stop the program enter #.\n" + "Enter a letter:";
		inputString = JOptionPane.showInputDialog(inputMessage);
		letter = inputString.charAt(0);
		while (letter != '#')
		{
			outputMessage = "The letter you entered is: " + letter + "\nThe corresponding telephone digit is: ";
			switch (letter)
			{
				case 'A':
				case 'B':
				case 'C':
					outputMessage = outputMessage + "2";
				break;
				case 'D':
				case 'E':
				case 'F':
					outputMessage = outputMessage + "3";
				break;
				case 'G':
				case 'H':
				case 'I':
					outputMessage = outputMessage + "4";
				break;
				case 'J':
				case 'K':
				case 'L':
					outputMessage = outputMessage + "5";
				break;
				case 'M':
				case 'N':
				case 'O':
					outputMessage = outputMessage + "6";
				break;
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
					outputMessage = outputMessage + "7";
				break;
				case 'T':
				case 'U':
				case 'V':
					outputMessage = outputMessage + "8";
				break;
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					outputMessage = outputMessage + "9";
				break;
				default:
					outputMessage = outputMessage + "Invalid input.";
			}
			JOptionPane.showMessageDialog(null, outputMessage, "Telephone Digit", JOptionPane.PLAIN_MESSAGE);
			inputMessage = "Enter another uppercase letter to find its corresponding telephone digit.\n"
						+ "To stop the program enter #.\n" + "Enter a letter:";
			inputString = JOptionPane.showInputDialog(inputMessage);
			letter = inputString.charAt(0);
		}
		System.exit(0);
	}
}