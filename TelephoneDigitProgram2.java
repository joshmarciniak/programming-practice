import javax.swing.JOptionPane;
public class TelephoneDigitProgram2
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
				case 'a':
				case 'B':
				case 'b':
				case 'C':
				case 'c':
					outputMessage = outputMessage + "2";
				break;
				case 'D':
				case 'd':
				case 'E':
				case 'e':
				case 'F':
				case 'f':
					outputMessage = outputMessage + "3";
				break;
				case 'G':
				case 'g':
				case 'H':
				case 'h':
				case 'I':
				case 'i':
					outputMessage = outputMessage + "4";
				break;
				case 'J':
				case 'j':
				case 'K':
				case 'k':
				case 'L':
				case 'l':
					outputMessage = outputMessage + "5";
				break;
				case 'M':
				case 'm':
				case 'N':
				case 'n':
				case 'O':
				case 'o':
					outputMessage = outputMessage + "6";
				break;
				case 'P':
				case 'p':
				case 'Q':
				case 'q':
				case 'R':
				case 'r':
				case 'S':
				case 's':
					outputMessage = outputMessage + "7";
				break;
				case 'T':
				case 't':
				case 'U':
				case 'u':
				case 'V':
				case 'v':
					outputMessage = outputMessage + "8";
				break;
				case 'W':
				case 'w':
				case 'X':
				case 'x':
				case 'Y':
				case 'y':
				case 'Z':
				case 'z':
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