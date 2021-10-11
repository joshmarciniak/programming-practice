import java.util.*;

public class Exercise5
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		int width;
		int area;
		int perimeter;
		int length;
			System.out.print("Insert length: ");
			length = console.nextInt();
			System.out.print("Insert width: ");
			width = console.nextInt();
				area = length * width;
				perimeter = 2 * (length + width);
				System.out.print("The area of the rectangle is " + area + "." + "\nThe perimeter of the rectangle is " + perimeter + ".");
	}
}
			
	