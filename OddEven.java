import java.util.*;
import java.io.*;
public class OddEven
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("NumberData.dat"));
		String str;
		int oddNumSum = 0;
		int evenNumSum = 0;
		while (inFile.hasNext())
		{
			str = inFile.next();
			if(str.charAt(str.length()-1) == '1' || str.charAt(str.length()-1) == '3' || 
			str.charAt(str.length()-1) == '5' || str.charAt(str.length()-1) == '7' || str.charAt(str.length()-1) == '9')
			{
				int oddNum = Integer.parseInt(str);
				oddNumSum += oddNum;
			}
			else 
			{
				int evenNum = Integer.parseInt(str);
				evenNumSum += evenNum;
			}
		}
		System.out.println("The sum of the even numbers is " + evenNumSum);
		System.out.println("The sum of the odd numbers is " + oddNumSum);
		inFile.close();
	}
}